package com.ua.hrv.controllers;

import com.ua.hrv.dao.PersonDAO;
import com.ua.hrv.dao.UserDAO;
import com.ua.hrv.models.Person;
import com.ua.hrv.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private PersonDAO personDAO;

    @GetMapping("/")
    public String home(Model model) {
        List<Person> persons = personDAO.findAll();
        model.addAttribute("persons", persons);
        return "home";
    }

    @PostMapping("/saveP")
    public String save(User user, Person person) {
        userDAO.save(user);
        personDAO.save(person);
        return "redirect:/";
    }
}
