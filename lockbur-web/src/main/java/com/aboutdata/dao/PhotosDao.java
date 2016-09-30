package com.aboutdata.dao;

import com.aboutdata.commons.enums.PhotoStatus;
import java.util.List;
import com.aboutdata.domain.Photos;
/**
 *
 * @author youyou
 */
public interface PhotosDao{

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
    public List<Photos> findByIds(List<String> ids);

}
