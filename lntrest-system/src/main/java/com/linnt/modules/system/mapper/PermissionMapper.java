package com.linnt.modules.system.mapper;

import com.linnt.mapper.EntityMapper;
import com.linnt.modules.system.dto.PermissionDTO;
import com.linnt.modules.system.model.Permission;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @Author: linnt
 * @Date: 2019/4/3 4:06 PM
 * @Version 1.0
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PermissionMapper extends EntityMapper<PermissionDTO, Permission> {

}
