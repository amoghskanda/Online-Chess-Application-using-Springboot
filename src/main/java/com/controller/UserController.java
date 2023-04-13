package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.users;
import com.services.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new users());
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") users user) {
        userService.register(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new users());
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute("user") users user) {
        if (userService.authenticate(user)) {
            return "redirect:/dashboard";
        } else {
            return "login";
        }
    }
}





