package in.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{
    @GetMapping("/helloPage")
    public ModelAndView openHelloPage()
    {
        ModelAndView mav=new ModelAndView("hello");
        return mav;
    }

    @GetMapping("/byePage")
    public String openByePage()
    {
        return "bye";
    }


    @PostMapping("/addPage")
    public ModelAndView openResultPage(@RequestParam("n1") int num1, @RequestParam("n2") int num2) {
        ModelAndView mav = new ModelAndView();
        int resultValue = num1 + num2;
        mav.addObject("resultAttribute",resultValue);
        mav.setViewName("result");
        return mav;
    }
}
