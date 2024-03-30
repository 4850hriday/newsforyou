package com.nt.newforyou.dto;

import lombok.Data;
import java.util.Date;

@Data
public class UserDetailsDto {

    private Long id;
    private String userName;
    private String email;
    private Date createdAt;
}
