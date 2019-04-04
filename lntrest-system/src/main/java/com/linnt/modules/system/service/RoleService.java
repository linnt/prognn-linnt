package com.linnt.modules.system.service;

import com.linnt.modules.system.dto.RoleDTO;
import com.linnt.modules.system.model.Role;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.Set;

/**
 * @Author: linnt
 * @Date: 2019/4/3 3:23 PM
 * @Version 1.0
 */
public interface RoleService {

    /**
     * get
     * @param id
     * @return
     */
    @Cacheable(key = "#p0")
    RoleDTO findById(long id);

    /**
     * create
     * @param resources
     * @return
     */
    @CacheEvict(allEntries = true)
    RoleDTO create(Role resources);

    /**
     * update
     * @param resources
     */
    @CacheEvict(allEntries = true)
    void update(Role resources);

    /**
     * delete
     * @param id
     */
    @CacheEvict(allEntries = true)
    void delete(Long id);

    /**
     * role tree
     * @return
     */
    @Cacheable(key = "'tree'")
    Object getRoleTree();

    /**
     * findByUsers_Id
     * @param id
     * @return
     */
    Set<Role> findByUsers_Id(Long id);

    /**
     * updatePermission
     * @param resources
     * @param roleDTO
     */
    @CacheEvict(allEntries = true)
    void updatePermission(Role resources, RoleDTO roleDTO);

    /**
     * updateMenu
     * @param resources
     * @param roleDTO
     */
    @CacheEvict(allEntries = true)
    void updateMenu(Role resources, RoleDTO roleDTO);
}

