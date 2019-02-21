package com.itcast.ssm.controller;

import com.itcast.ssm.pojo.Items;
import com.itcast.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/showItem")
    public String showItem(int id, Model model){
        Items items = itemsService.findById(id);
        model.addAttribute("item", items);
        return "viewItem";
    }
}
