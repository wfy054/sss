package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("travel-service")
public interface TravelService extends TravelServiceApi{
}
