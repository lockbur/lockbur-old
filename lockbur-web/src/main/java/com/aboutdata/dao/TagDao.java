package com.aboutdata.dao;

import com.aboutdata.domain.Tag;

import java.util.List;


/**
 * 标签tag
 *
 * @author Administrator
 */

public interface TagDao {

    public Tag getByName(String name);

    public List<Tag> findTagStringByName(String name);

}
