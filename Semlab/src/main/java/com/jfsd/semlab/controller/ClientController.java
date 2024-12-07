package com.jfsd.semlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("home");
    }

    @GetMapping("/demo1")
    public ModelAndView demo1() {
        return new ModelAndView("admin");
    }

    @GetMapping("/demo2")
    public ModelAndView demo2() {
        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("name", "klu");
        return modelAndView;
    }

    @GetMapping("/demo3")
    public ModelAndView demo3() {
        ModelAndView modelAndView = new ModelAndView("about");
        modelAndView.addObject("msg", "Hello World");
        return modelAndView;
    }

    @GetMapping("/demo4")
    @ResponseBody
    public String demo4() {
        return "JFSD";
    }

    @GetMapping("/demo5")
    @ResponseBody
    public String demo5(@RequestParam("a") int a, @RequestParam("b") int b) {
        int sum = a + b;
        return String.valueOf(sum);
    }

    @GetMapping("/demo6/{fname}/{lname}")
    public ModelAndView demo6(@PathVariable("fname") String fname, @PathVariable("lname") String lname) {
        ModelAndView modelAndView = new ModelAndView("demo");
        modelAndView.addObject("name", fname + " " + lname);
        return modelAndView;
    }
}
