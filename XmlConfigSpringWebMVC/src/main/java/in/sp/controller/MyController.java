package in.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{
    @GetMapping("/helloPage")
    public ModelAndView openHelloPage()
    {
        ModelAndView mav=new ModelAndView("hello");
        //mav.setViewName("hello");
        return mav;
    }

    @GetMapping("/byePage")
    public String openByeMethod()
    {
        return "bye";
    }
}
