package com.ltp.workbook;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorkbookController {
    
    /**
     * @return
     */
    @GetMapping("/")
    public ModelAndView getShows(Model model) {
        Map<String, Show> showsMap = new HashMap<>();
        showsMap.put("first", new Show("Breaking Bad", "Ozymandias", 10.0));
        showsMap.put("second", new Show("Attack on Titan", "Hero", 9.9));
        showsMap.put("third", new Show("Attack on Titan", "Perfect Game", 9.9));
        showsMap.put("fourth", new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));
        showsMap.put("fifth", new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9));

        model.addAllAttributes(showsMap);

        return new ModelAndView("shows", showsMap);
    }


    @GetMapping("/shows")
    public String getShows2(Model model) {
        
        model.addAttribute("first", new Show("Breaking Bad", "Ozymandias", 10.0));
        model.addAttribute("second", new Show("Attack on Titan", "Hero", 9.9));
        model.addAttribute("third", new Show("Attack on Titan", "Perfect Game", 9.9));
        model.addAttribute("fourth", new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));
        model.addAttribute("fifth", new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9));

        return "shows2";
    }
}
