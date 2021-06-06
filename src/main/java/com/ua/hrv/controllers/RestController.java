package com.ua.hrv.controllers;

import com.ua.hrv.dao.PersonDAO;
import com.ua.hrv.dao.UserDAO;
import com.ua.hrv.models.Person;
import com.ua.hrv.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private UserDAO userDAO;

    @PutMapping("/saveU")
    public List<User> save(@RequestBody User user) {
        userDAO.save(user);
        userDAO.findAll();
        return userDAO.findAll();
    }
}
