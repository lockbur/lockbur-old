package com.aboutdata.service;

import com.aboutdata.commons.enums.CommentsType;
import com.aboutdata.domain.Comments;
import com.aboutdata.rest.Page;
import com.aboutdata.rest.Pageable;

import java.util.List;

/**
 * @author Administrator
 * @date 2016-1-6 13:16:12
 * @version V1.0
 */
public interface CommentsService {

    public List<Comments> findByUserId(String userId);

    public List<Comments> findByTypeAndEntityId(CommentsType type, String entityId);
    
    public Page<Comments> findByTypeAndEntityId(CommentsType type, String entityId,Pageable pageable);
    
    public void save(Comments comments);

}
