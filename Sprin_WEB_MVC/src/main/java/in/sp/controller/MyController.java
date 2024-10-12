package in.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{
    @PostMapping("/addPage")
    public ModelAndView openAddPage(@RequestParam("n1") int num1, @RequestParam("n2") int num2)
    {
        int result=num1+num2;
        ModelAndView mav=new ModelAndView();
        mav.addObject("resultAttribute", result);
        mav.setViewName("result");
        return mav;
    }

}
