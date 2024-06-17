package com.cuongpmb.profile.mapper;

import com.cuongpmb.profile.dto.request.ProfileCreationRequest;
import com.cuongpmb.profile.dto.response.UserProfileResponse;
import com.cuongpmb.profile.entity.UserProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(ProfileCreationRequest request);

    UserProfileResponse toUserProfileResponse(UserProfile entity);
}
