package com.open.free.service.mybatis.mapper;

import com.open.free.service.mybatis.domain.City;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by lcssx on 6/23/2017.
 */
@Mapper
public interface CityMapper {
    public City selectCityById(long id);
}
