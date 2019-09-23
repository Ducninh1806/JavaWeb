package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class convertmoney {
    @GetMapping("/convert")
    public String convert(@RequestParam int usd, Model model){
        model.addAttribute("USD",usd*23000);
        return "index";
    }
}
