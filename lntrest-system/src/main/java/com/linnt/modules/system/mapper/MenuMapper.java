package com.linnt.modules.system.mapper;

import com.linnt.mapper.EntityMapper;
import com.linnt.modules.system.dto.MenuDTO;
import com.linnt.modules.system.model.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @Author: linnt
 * @Date: 2019/4/3 4:02 PM
 * @Version 1.0
 */
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuMapper extends EntityMapper<MenuDTO, Menu> {

}
