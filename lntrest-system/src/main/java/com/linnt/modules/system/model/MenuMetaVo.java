package com.linnt.modules.system.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: linnt
 * @Date: 2019/4/3 9:01 PM
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class MenuMetaVo implements Serializable {

    private String title;

    private String icon;
}

