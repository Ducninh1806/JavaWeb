package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConvertCurrency {
    @GetMapping("/convert")
    public String convert(){
        return "index";
    }


}
