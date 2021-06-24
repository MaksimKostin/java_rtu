package com.spring.practice_14;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class Service {
    List<AllFunc> a = new ArrayList<AllFunc>();

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getTestPage() {
        return "test.html";
    }

    @RequestMapping(value = "/home/createitem", method = RequestMethod.POST)
    @ResponseBody
    public void createitem(@RequestBody Card w) {
        a.add(w);
    }

    @RequestMapping(value = "/home/createorder", method = RequestMethod.POST)
    @ResponseBody
    public void createorder(@RequestBody Bank w) {
        a.add(w);
    }

    @RequestMapping(value = "/home/delete", method = RequestMethod.GET)
    public void del() {
        a = new ArrayList<AllFunc>();
    }

    @RequestMapping(value = "/home/out", method = RequestMethod.GET)
    @ResponseBody
    public List<AllFunc> out() {
        return a;
    }

}