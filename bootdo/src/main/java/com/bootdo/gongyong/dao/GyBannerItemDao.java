package com.bootdo.gongyong.dao;

import com.bootdo.gongyong.domain.GyBannerItemDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author gjd
 * @email java_develop@aliyun.com
 * @date 2023-02-01 16:51:41
 */
@Mapper
public interface GyBannerItemDao {

	GyBannerItemDO get(Integer id);

	List<GyBannerItemDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(GyBannerItemDO gyBannerItem);

	int update(GyBannerItemDO gyBannerItem);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
