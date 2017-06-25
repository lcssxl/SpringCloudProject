package com.open.free.service.mybatis.mapper;

import com.open.free.service.mybatis.domain.Hotel;
import com.open.free.service.mybatis.domain.HotelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelMapper {
    long countByExample(HotelExample example);

    int deleteByExample(HotelExample example);

    int insert(Hotel record);

    int insertSelective(Hotel record);

    List<Hotel> selectByExample(HotelExample example);

    int updateByExampleSelective(@Param("record") Hotel record, @Param("example") HotelExample example);

    int updateByExample(@Param("record") Hotel record, @Param("example") HotelExample example);
}