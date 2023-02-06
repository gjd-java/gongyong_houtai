package com.bootdo.gongyong.api.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.gongyong.domain.GyBannerItemDO;
import com.bootdo.gongyong.service.GyBannerItemService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author gjd
 * @email java_develop@aliyun.com
 * @date 2023-02-01 16:51:41
 */

@Controller
@RequestMapping("/gongyong/gyBannerItem")
public class GyBannerItemApiController {
	@Autowired
	private GyBannerItemService gyBannerItemService;

	@GetMapping()
	@RequiresPermissions("gongyong:gyBannerItem:gyBannerItem")
	String GyBannerItem(){
	    return "gongyong/gyBannerItem/gyBannerItem";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("gongyong:gyBannerItem:gyBannerItem")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GyBannerItemDO> gyBannerItemList = gyBannerItemService.list(query);
		int total = gyBannerItemService.count(query);
		PageUtils pageUtils = new PageUtils(gyBannerItemList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("gongyong:gyBannerItem:add")
	String add(){
	    return "gongyong/gyBannerItem/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("gongyong:gyBannerItem:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		GyBannerItemDO gyBannerItem = gyBannerItemService.get(id);
		model.addAttribute("gyBannerItem", gyBannerItem);
	    return "gongyong/gyBannerItem/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("gongyong:gyBannerItem:add")
	public R save( GyBannerItemDO gyBannerItem){
		if(gyBannerItemService.save(gyBannerItem)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("gongyong:gyBannerItem:edit")
	public R update( GyBannerItemDO gyBannerItem){
		gyBannerItemService.update(gyBannerItem);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("gongyong:gyBannerItem:remove")
	public R remove( Integer id){
		if(gyBannerItemService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("gongyong:gyBannerItem:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		gyBannerItemService.batchRemove(ids);
		return R.ok();
	}

}
