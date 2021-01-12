package com.springweb.springweb.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Controller
public class helloWordController {

    Logger logger=LoggerFactory.getLogger(helloWordController.class);

    @RequestMapping("/index")
    public String index(){
        System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjj");
        return "index";
    }

    @PostMapping(value = "/editor", produces = "application/json;charset=UTF-8",consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public String getjson(@RequestBody Map<String,Object> map1){

         logger.error("testeditor");
         Map<String,String> map=new HashMap<String,String>();
         map.put("buidl","ssssddasd");

        return JSON.toJSONString(map);
    }
}
