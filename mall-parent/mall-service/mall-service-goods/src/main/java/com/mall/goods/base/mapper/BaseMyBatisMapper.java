package com.mall.goods.base.mapper;

import com.mall.goods.pojo.Brand;
import org.apache.ibatis.annotations.Mapper;


/**
 * <p>
 * 描述: 自定义通用Mapper
 * </p>
 * <p>
 * 创建时间: 2019-11-21 16:53
 * </p>
 * <p>
 * // * @param <T> 通用对象
 *
 * @author yanglin // * @param <T>
 */
@Mapper
public interface BaseMyBatisMapper extends MyBatisMapper<Brand> {
}
