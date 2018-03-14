package lt.devopspro.controller;


import lt.devopspro.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppRestController {

    static User user1 = new User(1, "Tom1", "test123", "Tom1", "Don1", "tom@1don.com");
    static User user2 = new User(2, "Tom2", "test123", "Tom2", "Don2", "tom@2don.com");
    static User user3 = new User(3, "Tom3", "test123", "Tom3", "Don3", "tom@3don.com");
    static User user4 = new User(4, "Tom4", "test123", "Tom4", "Don4", "tom@4don.com");

    public static List<User> usersList = new ArrayList<User>(){{
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
    }};

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public void signup(User user) {
        usersList.forEach();
    }



}
