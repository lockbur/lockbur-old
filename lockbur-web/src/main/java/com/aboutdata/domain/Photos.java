package com.aboutdata.domain;

import com.aboutdata.commons.enums.PhotoStatus;
import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author Administrator
 */
public class Photos extends BaseEntity {

    /**
     * 标题
     */
    @Length(max = 200)
    private String title;

    /**
     * 壁纸原图的宽高
     */
    private int width = 0;

    private int height = 0;

    /**
     * 图片大小
     */
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
     * 排序 暂时用orders用来存储访问次数
     */
    @Min(0)
    private Integer order;

    /**
     * @ 壁纸的描述信息
     * @ 主要为更好的说明图片内容和搜索引擎收录
     */
    @Length(max = 500)
    private String description;
    /**
     * PhotoStatus 状态信息
     */
    private PhotoStatus status = PhotoStatus.ASSIGNED;

    private String memberId;


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

    public Integer getOrder() {
        return order;
    }

    public String getStorageHost() {
        return storageHost;
    }

    public void setStorageHost(String storageHost) {
        this.storageHost = storageHost;
    }

    public PhotoStatus getStatus() {
        return status;
    }

    public void setStatus(PhotoStatus status) {
        this.status = status;
    }

    /**
     * 设置排序
     *
     * @param order 排序
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getWallhaven() {
        return wallhaven;
    }

    public void setWallhaven(String wallhaven) {
        this.wallhaven = wallhaven;
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

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
