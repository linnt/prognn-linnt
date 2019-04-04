package com.linnt.modules.system.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

/**
 * @Author: linnt
 * @Date: 2019/4/3 3:21 PM
 * @Version 1.0
 */
@Data
public class RoleDTO implements Serializable {

    private Long id;

    private String name;

    private String remark;

    private Set<PermissionDTO> permissions;

    private Set<MenuDTO> menus;

    private Timestamp createTime;
}