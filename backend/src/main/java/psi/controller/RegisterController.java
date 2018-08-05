package psi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import psi.model.User;
import psi.service.UserService;

import java.security.Principal;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegisterController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseEntity<User> createChapter(@RequestBody User user) {
        userService.saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

//    @RequestMapping(value = "/login", method =  RequestMethod.GET)
//    public Principal user(Principal principal) {
//        System.out.println("get userrrssss");
//        return principal;
//    }

    @RequestMapping("/users")
    public List<User> user() {
        return userService.getAllUsers();
    }
}
