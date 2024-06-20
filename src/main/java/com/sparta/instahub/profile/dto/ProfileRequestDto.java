package com.sparta.instahub.profile.dto;

import lombok.Getter;

@Getter
public class ProfileRequestDto {
    private String userId;
    private String email;
    private String address;
    private String introduction;
}
