package calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import calculator.model.Calculator;
import calculator.service.CalculatorService;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("view/index.jsp");
        return modelAndView;
    }

    @PostMapping("/result")
    public ModelAndView showList(@ModelAttribute Calculator calculator){
        ModelAndView modelAndView = new ModelAndView("/view/index.jsp");
        Double result = calculatorService.calculate(calculator);
        modelAndView.addObject("result",result);
        return modelAndView;
    }
}

