package org.maciek.galaxuschecker.controller;

import org.maciek.galaxuschecker.entity.ItemEntity;
import org.maciek.galaxuschecker.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/signup")
    public String showSignUpForm(ItemEntity user) {
        return "add-user";
    }
    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("items", itemRepository.findAll());
        return "index";
    }

    @PostMapping("/adduser")
    public String addUser(ItemEntity user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }

        itemRepository.save(user);
        return "redirect:/index";
    }

    // additional CRUD methods
}
