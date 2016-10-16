package com.aboutdata.domain;

/**
 *
 * @author Administrator
 */
public class Photo extends BaseEntity {

    private String title;//标题
    private int width = 0;//壁纸原图的宽高
    private int height = 0;
    private long size;//图片大小
    private String source;//原图片
    private String thumbnail;//缩略图
    private String wallhavenId;//是否来自wallhaven
    private String storageHost;//图片服务器地址
    private Integer orders;//排序 暂时用orders用来存储访问次数
    /**
     * @ 壁纸的描述信息
     * @ 主要为更好的说明图片内容和搜索引擎收录
     */
    private String description;
    private int status;//状态信息 0:未处理 1:已审核通过 9:已删除
    private String memberId;//上传者的id


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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getStorageHost() {
        return storageHost;
    }

    public void setStorageHost(String storageHost) {
        this.storageHost = storageHost;
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

    public String getWallhavenId() {
        return wallhavenId;
    }

    public void setWallhavenId(String wallhavenId) {
        this.wallhavenId = wallhavenId;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
