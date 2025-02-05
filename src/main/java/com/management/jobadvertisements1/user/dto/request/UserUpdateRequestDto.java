package com.management.jobadvertisements1.user.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequestDto {

    Long id;

    String fullName;

    String userName;

    String email;

    String password;

    String birthDate;

    String phoneNumber;

    String address;

    Boolean isActive;

    String aboutMe;

    String university;

    String photo;

    String myWorkplaces;

    String hobbies;

    String region;
}
