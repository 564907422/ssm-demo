package com.paas.demo.controller;

import com.paas.demo.service.IUserService;
import com.paas.demo.vo.RespVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/test")
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @Resource
    IUserService userService;

    @ResponseBody
    @RequestMapping(value = "/mvc", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public RespVo test() {
        LOGGER.debug("mvc ok");
        return RespVo.success(userService.selectUsersByName("x"));
    }
}
