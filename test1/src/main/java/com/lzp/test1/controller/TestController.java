package com.lzp.test1.controller;

import com.lzp.test1.pojo.Message;
import com.lzp.test1.pojo.User;
import com.lzp.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class TestController {
    @Autowired
    private UserService us;

    @GetMapping("tologin")
    public String tologin(HttpServletRequest request){
        System.out.println("1");
        String type = request.getParameter("type");
        if (type != null){
            System.out.println(type+" type,请您先登录");
        }
        return "login";
    }

    @GetMapping("login")
    public ModelAndView login(User uu, HttpServletRequest request){
        Message m = us.login(uu);
        if (m.getErrText()==null){
            HttpSession s = request.getSession();
            s.setAttribute("USER",uu);
            return new ModelAndView("index");
        }else {
            return new ModelAndView("login",
                    "message",m);
        }
    }

    @GetMapping("totest")
    public String totest(){
        System.out.println("test");
        return "test";
    }

    @GetMapping("toindex")
    public String toindex(){
        System.out.println("index");
        return "index";
    }
}
