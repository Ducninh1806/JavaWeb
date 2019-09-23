package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertCurrency {
    @GetMapping("/convert")
    public String convertCurrency(@RequestParam int USD, Model model){
        model.addAttribute("USD",USD*23000);
        return "index";
    }
}
