package com.bootdo.gongyong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.gongyong.dao.GyBannerDao;
import com.bootdo.gongyong.domain.GyBannerDO;
import com.bootdo.gongyong.service.GyBannerService;



@Service
public class GyBannerServiceImpl implements GyBannerService {
	@Autowired
	private GyBannerDao gyBannerDao;
	
	@Override
	public GyBannerDO get(Integer id){
		return gyBannerDao.get(id);
	}
	
	@Override
	public List<GyBannerDO> list(Map<String, Object> map){
		return gyBannerDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return gyBannerDao.count(map);
	}
	
	@Override
	public int save(GyBannerDO gyBanner){
		return gyBannerDao.save(gyBanner);
	}
	
	@Override
	public int update(GyBannerDO gyBanner){
		return gyBannerDao.update(gyBanner);
	}
	
	@Override
	public int remove(Integer id){
		return gyBannerDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return gyBannerDao.batchRemove(ids);
	}
	
}
