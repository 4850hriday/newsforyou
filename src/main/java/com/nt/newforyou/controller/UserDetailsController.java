package com.nt.newforyou.controller;

import lombok.extern.log4j.Log4j2;
import com.nt.newforyou.model.user.UserDetails;
import com.nt.newforyou.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Log4j2
public class UserDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/save")
    @ResponseBody
    public UserDetails saveTargetWebsite(UserDetails userDetails){
        System.out.println("here we are in user controller");
        log.info("going to save value {} ",userDetails);
        return  userDetailsService.save(userDetails);
    }

    @GetMapping("/find/{emailId}")
    @ResponseBody
    public Boolean findUserByEmailId(@PathVariable String emailId){
        return userDetailsService.findByEmailId(emailId);

    }



}
