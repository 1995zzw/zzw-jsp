package com.zzw.pro.crossdomain;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/cross-domain")
public class CrossDomainController {

    @RequestMapping("/test1")
    public String test1(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");
        return "test1";
    }


    @RequestMapping(value = "/test2", method = RequestMethod.POST)
    public String test2(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");
        return "test2";
    }

    @RequestMapping(value = "/test3", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:8080")
    public String test3(HttpServletResponse response) {
        return "test3";
    }

    @RequestMapping(value = "/jsonpReq", method = RequestMethod.GET)
    public String jsonpReq(HttpServletResponse response) {
        return "test3";
    }

}
