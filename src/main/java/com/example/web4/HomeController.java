package com.example.web4;

import com.example.web4.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @ModelAttribute("course")
    public String courseName()
    {
        return "java";
    }
    @RequestMapping("/")
    public String home(ModelMap model)
    {
        List<String> courses = new ArrayList<String>();
        courses.add("java");
        courses.add("hibernate");
        courses.add("springboot");
        System.out.println(courses);
        int bhanu=5;
        model.addAttribute("bhanu", bhanu);

        System.out.println("HOME PAGE IS CALLED");

        return "Progressreport";
    }
    @RequestMapping("/add")
    public ModelAndView add(int num1, int num2 ,String first,String last, ModelAndView mv)
    {

        int result=num1+num2;
        System.out.println(result);
        mv.addObject("result",result);
        mv.addObject("first",first);
        mv.addObject("last",last);
        mv.setViewName("result");
        System.out.println("add is called");
        return mv;
    }
    @RequestMapping("/addAlien")
    public String addAlien(Alien alien)
    {




        return "result";
    }
    @RequestMapping("/progressreport")
    public String progressreport(Progress progress)
    {
        System.out.println("progress method is called");
        return "progressResult";
    }



}
