package com.urlShortner;
import com.urlShortner.domain.entities.ShortUrl;
import com.urlShortner.domain.repositories.ShortUrlRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeControler {
    private final ShortUrlRepository shortUrlRepository;

    public HomeControler(ShortUrlRepository shortUrlRepository){
        this.shortUrlRepository = shortUrlRepository;
    }

    @RequestMapping("/")
    public String home(Model model){
        List<ShortUrl> shortUrls = shortUrlRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
        model.addAttribute("title", shortUrls);
        return  "index";
    }
}
