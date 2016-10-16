package com.aboutdata.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * Entity - 基类
 */
public abstract class BaseEntity implements Serializable {

    private String id;
    // 创建日期
    private Date createdTime;
     //修改日期
    private Date modifiedTime;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
