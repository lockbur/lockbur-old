package com.aboutdata.domain;

import com.aboutdata.commons.OrderEntity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity - 地区
 */
public class Area extends OrderEntity {

    /**
     * 名称
     */
    @NotEmpty
    @Length(max = 100)
    private String name;

    /**
     * 全称
     */
    private String fullName;

    /**
     * 树路径
     */
    private String treePath;

    /**
     * 上级地区
     */
    private String parentId;

    /**
     * 下级地区
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTreePath() {
        return treePath;
    }

    public void setTreePath(String treePath) {
        this.treePath = treePath;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
