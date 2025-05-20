package com.urlShortner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("title", "UrlShortner - tymleaf");
        return  "index";
    }


    @RequestMapping("/about")
    public String about(){
        return "about";
    }
}
