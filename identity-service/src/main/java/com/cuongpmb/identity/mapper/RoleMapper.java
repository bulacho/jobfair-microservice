package com.cuongpmb.identity.mapper;

import com.cuongpmb.identity.dto.request.RoleRequest;
import com.cuongpmb.identity.dto.response.RoleResponse;
import com.cuongpmb.identity.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}