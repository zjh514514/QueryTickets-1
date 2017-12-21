package com.saltyfish.querytickets.controller;

import com.saltyfish.querytickets.service.NormalQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class NormalQueryController {

    @Autowired
    private NormalQueryService normalQueryService;

    @RequestMapping("stationQuery")
    @ResponseBody
    public Map stationQuery(@RequestParam("startStation") String startStation, @RequestParam("endStation") String endStation) {
        System.out.println(startStation + "," + endStation);
        Map map = new HashMap();
        map.put("date", normalQueryService.queryByStation(startStation, endStation));
        if (map.isEmpty()) {
            map.put("status", 201);
        } else {
            map.put("status", 200);
        }
        return map;
    }
}
