package com.linnt.modules.system.mapper;

import com.linnt.mapper.EntityMapper;
import com.linnt.modules.system.dto.RoleDTO;
import com.linnt.modules.system.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @Author: linnt
 * @Date: 2019/4/3 4:12 PM
 * @Version 1.0
 */
@Mapper(componentModel = "spring", uses = {PermissionMapper.class, MenuMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper extends EntityMapper<RoleDTO, Role> {

}
