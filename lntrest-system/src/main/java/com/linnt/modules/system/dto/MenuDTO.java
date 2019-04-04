package com.linnt.modules.system.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Author: linnt
 * @Date: 2019/4/3 3:19 PM
 * @Version 1.0
 */
@Data
public class MenuDTO {

    private Long id;

    private String name;

    private Long sort;

    private String path;

    private String component;

    private Long pid;

    private Boolean iFrame;

    private String icon;

    private List<MenuDTO> children;

    private Timestamp createTime;
}