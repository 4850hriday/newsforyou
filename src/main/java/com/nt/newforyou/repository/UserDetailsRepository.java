package com.nt.newforyou.repository;

import com.nt.newforyou.model.user.UserDetails;
import org.springframework.data.repository.CrudRepository;

public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {
    public UserDetails findByEmail(String emailId);
}
