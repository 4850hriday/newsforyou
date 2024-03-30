package com.nt.newforyou.service;

import com.nt.newforyou.repository.UserDetailsRepository;
import com.nt.newforyou.model.user.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public UserDetails save(UserDetails userDetails){
        return userDetailsRepository.save(userDetails);
    }

    public Boolean findByEmailId(String emailId){
        if(!userDetailsRepository.findByEmail(emailId).equals(null)){
            return true;
        }
        return false;
    }
}
