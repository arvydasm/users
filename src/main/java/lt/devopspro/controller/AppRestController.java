package lt.devopspro.controller;


import lt.devopspro.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppRestController {

    public static List<User> usersList = new ArrayList<>();

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public void signup(User user) {
        usersList.forEach();
    }



}
