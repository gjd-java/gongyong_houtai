package com.bootdo.gongyong.api.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.gongyong.domain.GyBannerDO;
import com.bootdo.gongyong.service.GyBannerService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
@RequestMapping("/api/gongyong/gyBanner")
public class GyBannerApiController {
	@Autowired
	private GyBannerService gyBannerService;

	@ResponseBody
	@GetMapping("/list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
		List<GyBannerDO> gyBannerList = gyBannerService.list(params);
		Map<String, Object> map = new HashMap();
		map.put("gyBannerList",gyBannerList);
		return R.ok(map);
	}
}
