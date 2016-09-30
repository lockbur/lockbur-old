package com.aboutdata.model;

import com.aboutdata.commons.enums.PhotoStatus;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class PhotosModel extends BaseModel {

    private String title;

    private int width;

    private int height;

    private long size;

    /**
     * 原图片
     */
    private String source;

    /**
     * 大图片
     */
    private String large;

    /**
     * 中图片
     */
    private String medium;

    /**
     * 缩略图
     */
    private String thumbnail;

    /**
     * 是否来自wallhaven
     */
    private String wallhaven;

    /**
     * 图片服务器地址
     */
    private String storageHost;

    /**
     * 排序
     */
    private Integer order;

    private String description;

    /**
     * PhotoStatus 状态信息
     */
    private PhotoStatus status;


    private MemberModel member;

    private List<TagModel> tags;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getWallhaven() {
        return wallhaven;
    }

    public void setWallhaven(String wallhaven) {
        this.wallhaven = wallhaven;
    }

    public String getStorageHost() {
        return storageHost;
    }

    public void setStorageHost(String storageHost) {
        this.storageHost = storageHost;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public PhotoStatus getStatus() {
        return status;
    }

    public void setStatus(PhotoStatus status) {
        this.status = status;
    }


    public MemberModel getMember() {
        return member;
    }

    public void setMember(MemberModel member) {
        this.member = member;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public void setTags(List<TagModel> tags) {
        this.tags = tags;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

}
