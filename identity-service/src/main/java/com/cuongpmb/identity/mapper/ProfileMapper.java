package com.cuongpmb.identity.mapper;

import com.cuongpmb.identity.dto.request.ProfileCreationRequest;
import com.cuongpmb.identity.dto.request.UserCreationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);
}
