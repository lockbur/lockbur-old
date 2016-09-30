package com.aboutdata.dao;

import com.aboutdata.domain.Member;

/**
 * Dao - 会员
 */
public interface MemberDao {
    /**
     * 判断用户名是否存在
     *
     * @param username 用户名(忽略大小写)
     * @return 用户名是否存在
     */
    public int usernameExists(String username);

    /**
     * 判断E-mail是否存在
     *
     * @param email E-mail(忽略大小写)
     * @return E-mail是否存在
     */
    public int emailExists(String email);

    /**
     * 根据用户名查找会员
     *
     * @param username 用户名(忽略大小写)
     * @return 会员，若不存在则返回null
     */
    public Member findByUsername(String username);

    /**
     * 根据E-mail查找会员
     *
     * @param email E-mail(忽略大小写)
     * @return 会员，若不存在则返回null
     */
    public Member findByEmail(String email);
}
