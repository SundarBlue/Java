package com.web.Learning.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService us;

    @GetMapping("getByEmail/{email}")
    private ResponseEntity<?> getByEmail(@PathVariable String email){
    try{
        User user = us.getByEmail(email);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    catch (Exception e){
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
    }
    }
//Sample CURL


//    curl -X POST http://localhost:8080/user/register \
//            -H "Content-Type: application/json" \
//            -d '{
//            "name": "John Doe",
//            "email": "johndoe@example.com"
//}'
    @PostMapping("register")
    public User createUser(@RequestBody User newUser){
    try{
        User registerdUser = us.createUser(newUser);
        return registerdUser;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
    }


}
