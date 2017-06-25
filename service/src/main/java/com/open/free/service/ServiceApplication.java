package com.open.free.service;

import com.open.free.service.mybatis.domain.HotelExample;
import com.open.free.service.mybatis.mapper.CityMapper;
import com.open.free.service.mybatis.mapper.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuchsh on 2017/6/15.
 */

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceApplication {
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private HotelMapper hotelMapper;

    @GetMapping("/service")
    public String service(){
        return "service:" + cityMapper.selectCityById(1)
                + "|" + hotelMapper.selectByExample(new HotelExample());
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
