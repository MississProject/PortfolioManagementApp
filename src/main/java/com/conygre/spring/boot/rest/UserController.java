package com.conygre.spring.boot.rest;

import com.conygre.spring.boot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/portfolio")
@CrossOrigin // allows requests from all domains
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET, value="/{email}")
    public double getUserBalanceByEmail(@PathVariable("email") String email) {
        return service.getUserBalanceByEmail(email);
    }
}
