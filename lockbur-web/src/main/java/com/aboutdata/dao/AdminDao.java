package com.aboutdata.dao;

import com.aboutdata.domain.Admin;
import com.aboutdata.rest.Page;
import com.aboutdata.rest.Pageable;

/**
 * Dao - 管理员
 */
public interface AdminDao {
    /**
     * 判断用户名是否存在
     *
     * @param username 用户名(忽略大小写)
     * @return 用户名是否存在
     */
    public int usernameExists(String username);

    /**
     * 根据用户名查找管理员
     *
     * @param username 用户名(忽略大小写)
     * @return 管理员，若不存在则返回null
     */
    public Admin findByUsername(String username);

    /**
     * usrname  %username%
     *
     * @param username
     * @param pageable
     * @return
     */
    public Page<Admin> findByUsernameLike(String username, Pageable pageable);

}
