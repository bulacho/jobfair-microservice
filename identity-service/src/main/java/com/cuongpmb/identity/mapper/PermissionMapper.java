package com.cuongpmb.identity.mapper;

import org.mapstruct.Mapper;

import com.cuongpmb.identity.dto.request.PermissionRequest;
import com.cuongpmb.identity.dto.response.PermissionResponse;
import com.cuongpmb.identity.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
