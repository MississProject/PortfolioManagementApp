package com.conygre.spring.boot.rest;

import com.conygre.spring.boot.entities.User;
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

    @RequestMapping(method = RequestMethod.POST, path="/deposit")
    public void setUserBalanceByEmail(@RequestBody User user) {
        User target = service.getUserByEmail(user.getEmailAddress());
        if (target == null) {
            // print error message
        }
        service.setUserBalanceByEmail(user.getFunds(), user.getEmailAddress());
    }
}
