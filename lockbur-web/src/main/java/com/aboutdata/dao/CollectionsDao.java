package com.aboutdata.dao;

import com.aboutdata.domain.Collections;

import java.util.List;

/**
 * 收藏夹 DAO
 *
 * @author Administrator
 */
public interface CollectionsDao {

    public List<Collections> findByMember(String memberId);

    public Collections findByMemberAndDefault(String memberId);
}
