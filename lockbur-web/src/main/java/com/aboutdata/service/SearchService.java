package com.aboutdata.service;

import com.aboutdata.domain.Photo;
import com.aboutdata.model.PhotoModel;
import com.aboutdata.rest.Page;
import com.aboutdata.rest.Pageable;

/**
 *
 * @author Administrator
 */
public interface SearchService {

    /**
     * 创建索引
     *
     * @param photo
     */
    public void build(Photo photo);

    /**
     * 搜索
     *
     * @param keyword
     * @param pageable
     * @return
     */
    public Page<PhotoModel> search(String keyword, Pageable pageable);

    /**
     * 删除索引
     *
     * @param id
     */
    public void delete(String id);

}
