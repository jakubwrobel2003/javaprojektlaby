package com.example.sklep.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.sklep.model.Item;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    static  List<Item> items = new ArrayList<>();
    static{
        items.add( new Item("Bombardiro Crocodillo",new BigDecimal("100.50"),
                "https://static.wikia.nocookie.net/miscrablan/images/c/c3/Crocodilo.jpg"));
        items.add( new Item("tralalero tralala",new BigDecimal("100.50"),
                        "https://i.namu.wiki/i/4qYJxF_kmNsanj1OMBL36_jLlYj0P6xHn9LZQnr4JtPlO8I18UA3F7kiF-x5-nGBZuss_Vr3lI6tyuGlGel8V5R4VRWyU0N-fHWF7hd1_trnNcrRmRO_k1A1ZhY84Cri_IUU2F_d0eZc6rxPbXjl2w.webp"));

        items.add( new Item("Brr brr Patapim",new BigDecimal("100.50"),
                "https://static.wikia.nocookie.net/brainrotnew/images/f/f7/Brr_Brr_Patapim.png"));
        items.add(new Item("Chimpanzini Bananini",new BigDecimal("100.50"),
                "https://static.wikia.nocookie.net/brainrotnew/images/5/5c/ChimpanziniBananini.jpg"));
    }


    @GetMapping("/")
    //@ResponseBody
    public String  home(Model model) {
    model.addAttribute("items",  items);
    return "home";
    }
}
