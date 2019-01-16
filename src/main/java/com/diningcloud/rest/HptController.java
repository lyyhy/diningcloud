package com.diningcloud.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leo_tron on 2019/1/14.
 */
@RestController
@RequestMapping(value="hpt/v1")
public class HptController {

    @RequestMapping(value = "CurrentTime", method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    public Map CurrentTime(){

        SimpleDateFormat format = new SimpleDateFormat("YYYYMMDDHHmmss");
        String date = format.format(new Date());

        Map map = new HashMap();
        map.put("Status","100");
        map.put("Msg","");
        map.put("Time",date);
        return map;
    }
}
