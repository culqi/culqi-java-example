package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by culqi on 12/26/16.
 */

@Controller
public class Index {

    @RequestMapping(value={"/","/index"})
    public String index(Model model) {
        model.addAttribute("test","test");
        return "index";
    }

}
