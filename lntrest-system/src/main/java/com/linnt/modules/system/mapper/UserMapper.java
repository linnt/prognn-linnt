package com.linnt.modules.system.mapper;

import com.linnt.mapper.EntityMapper;
import com.linnt.modules.system.dto.UserDTO;
import com.linnt.modules.system.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @Author: linnt
 * @Date: 2019/4/3 4:32 PM
 * @Version 1.0
 */
@Mapper(componentModel = "spring",uses = {RoleMapper.class},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper extends EntityMapper<UserDTO, User> {

}
