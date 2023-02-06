package com.bootdo.gongyong.dao;

import com.bootdo.gongyong.domain.GyBannerDO;

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
public interface GyBannerDao {

	GyBannerDO get(Integer id);

	List<GyBannerDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(GyBannerDO gyBanner);

	int update(GyBannerDO gyBanner);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
