package edu.pxu.demohello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    // @RequestMapping("/")
    // public String index(){
    //     return "index";
    // }
    // @RequestMapping("/hello")
    // @ResponseBody
    // public String hello(){
    //     return "hello";
    // }
    @RequestMapping("/home")
	public String home() {
		return "home";
	}
}
