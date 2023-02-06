package com.bootdo.gongyong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.gongyong.dao.GyBannerItemDao;
import com.bootdo.gongyong.domain.GyBannerItemDO;
import com.bootdo.gongyong.service.GyBannerItemService;



@Service
public class GyBannerItemServiceImpl implements GyBannerItemService {
	@Autowired
	private GyBannerItemDao gyBannerItemDao;
	
	@Override
	public GyBannerItemDO get(Integer id){
		return gyBannerItemDao.get(id);
	}
	
	@Override
	public List<GyBannerItemDO> list(Map<String, Object> map){
		return gyBannerItemDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return gyBannerItemDao.count(map);
	}
	
	@Override
	public int save(GyBannerItemDO gyBannerItem){
		return gyBannerItemDao.save(gyBannerItem);
	}
	
	@Override
	public int update(GyBannerItemDO gyBannerItem){
		return gyBannerItemDao.update(gyBannerItem);
	}
	
	@Override
	public int remove(Integer id){
		return gyBannerItemDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return gyBannerItemDao.batchRemove(ids);
	}
	
}
