package com.bootdo.gongyong.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.gongyong.domain.GyBannerDO;
import com.bootdo.gongyong.service.GyBannerService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author gjd
 * @email java_develop@aliyun.com
 * @date 2023-02-01 16:51:41
 */
 
@Controller
@RequestMapping("/gongyong/gyBanner")
public class GyBannerController {
	@Autowired
	private GyBannerService gyBannerService;
	
	@GetMapping()
	@RequiresPermissions("gongyong:gyBanner:gyBanner")
	String GyBanner(){
	    return "gongyong/gyBanner/gyBanner";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("gongyong:gyBanner:gyBanner")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GyBannerDO> gyBannerList = gyBannerService.list(query);
		int total = gyBannerService.count(query);
		PageUtils pageUtils = new PageUtils(gyBannerList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("gongyong:gyBanner:add")
	String add(){
	    return "gongyong/gyBanner/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("gongyong:gyBanner:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		GyBannerDO gyBanner = gyBannerService.get(id);
		model.addAttribute("gyBanner", gyBanner);
	    return "gongyong/gyBanner/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("gongyong:gyBanner:add")
	public R save( GyBannerDO gyBanner){
		if(gyBannerService.save(gyBanner)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("gongyong:gyBanner:edit")
	public R update( GyBannerDO gyBanner){
		gyBannerService.update(gyBanner);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("gongyong:gyBanner:remove")
	public R remove( Integer id){
		if(gyBannerService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("gongyong:gyBanner:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		gyBannerService.batchRemove(ids);
		return R.ok();
	}
	
}
