package com.clibchina.explorer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by changlifeng on 16/11/25.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "test")
    @ResponseBody
    public Map<String, Object> test() {
        System.out.println("lalalala");
        Map<String, Object> result = new HashMap<>();
        result.put("status", "ok");
        return result;
    }

    @RequestMapping(value = "/")
    @ResponseBody
    public ModelAndView index() {
        return new ModelAndView("main");
    }

}
