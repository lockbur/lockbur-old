package com.aboutdata.dao;

import java.util.List;
import com.aboutdata.domain.Photo;

/**
 *
 * @author youyou
 */
public interface PhotoDao{

    /**
     * 查询出所有id 用于随机序列
     *
     * @return
     */
    public List<String> findAllIds();

    /**
     * 根据id 列表查询
     *
     * @param ids
     * @return
     */
    public List<Photo> findByIds(List<String> ids);

}
