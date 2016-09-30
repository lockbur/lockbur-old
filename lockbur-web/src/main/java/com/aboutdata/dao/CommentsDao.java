package com.aboutdata.dao;

import com.aboutdata.commons.enums.CommentsType;
import com.aboutdata.domain.Comments;
import com.aboutdata.rest.Page;
import com.aboutdata.rest.Pageable;

import java.util.List;

/**
 * @author Administrator
 * @date 2016-1-6 12:01:59
 * @version V1.0
 */
public interface CommentsDao{

    /**
     * 多状态查询
     *
     * @param type
     * @param entityId
     * @return
     */

    public List<Comments> findByTypeAndEntityId(CommentsType type,String entityId);

    /**
     * 分页
     *
     * @param type
     * @param entityId
     * @param pageable
     * @return
     */
    public Page<Comments> findByTypeAndEntityId(CommentsType type,String entityId, Pageable pageable);

    /**
     * 分页
     *
     * @param type
     * @param pageable
     * @return
     */
    public Page<Comments> findByType(CommentsType type, Pageable pageable);

}
