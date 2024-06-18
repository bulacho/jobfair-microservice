package com.cuongpmb.profile.controller;

import com.cuongpmb.profile.dto.ApiResponse;
import com.cuongpmb.profile.dto.request.ProfileCreationRequest;
import com.cuongpmb.profile.dto.response.UserProfileResponse;
import com.cuongpmb.profile.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class InternalUserProfileController {

    UserProfileService userProfileService;

    @PostMapping("/internal/users")
    ApiResponse<UserProfileResponse> createProfile(@RequestBody ProfileCreationRequest request){
        return  ApiResponse.<UserProfileResponse>builder()
                .result(userProfileService.createProfile(request))
                .build();
    }

}
