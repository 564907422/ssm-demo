package com.paas.demo.controller;

import com.paas.demo.model.User;
import com.paas.demo.service.IUserService;
import com.paas.demo.vo.RespVo;
import com.paas.demo.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public RespVo getUser(@RequestParam String name) {
        List<User> list = userService.selectUsersByName(name);
        return RespVo.success(list);
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public RespVo add(@RequestBody UserVo vo) {
        if (StringUtils.isEmpty(vo.getMobile())) {
            return RespVo.error("10003", "参数错误");
        }

        User user = new User();
//        user.setMobile(vo.getMobile());
//        user.setName(vo.getName());
        BeanUtils.copyProperties(vo, user);
        user.setIsDel(0);

        int result = userService.insert(user);
        return RespVo.success("success");
    }
}
