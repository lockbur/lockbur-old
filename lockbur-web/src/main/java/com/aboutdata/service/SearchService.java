package com.aboutdata.service;

import com.aboutdata.domain.Photos;
import com.aboutdata.model.PhotosModel;
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
    public void build(Photos photo);

    /**
     * 搜索
     *
     * @param keyword
     * @param pageable
     * @return
     */
    public Page<PhotosModel> search(String keyword, Pageable pageable);

    /**
     * 删除索引
     *
     * @param id
     */
    public void delete(String id);

}
