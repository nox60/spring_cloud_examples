package com.nox.scloud.eurekapolice.controllers;

import com.nox.scloud.eurekapolice.vos.Police;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiuLi on 2018/5/17.
 */

@RestController
public class SimpleController {

    @RequestMapping(value = "/a", method= RequestMethod.GET)
    public @ResponseBody Police getPolice() {
        Police police = new Police();
        police.setId(111);
        police.setName("Name");
        return police;
    }
}
