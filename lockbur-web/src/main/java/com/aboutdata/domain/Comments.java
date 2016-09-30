/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aboutdata.domain;

import com.aboutdata.commons.enums.CommentsType;
import org.hibernate.validator.constraints.Length;

/**
 * 主要记录评论信息
 *
 * @author Administrator
 */
public class Comments extends BaseEntity {
    /**
     *
     * 被评论的主体
     */
    private String entityId;

    @Length(max = 500)
    private String comment;

    private CommentsType type;

    private String memberId;

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CommentsType getType() {
        return type;
    }

    public void setType(CommentsType type) {
        this.type = type;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
