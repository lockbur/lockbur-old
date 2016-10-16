package com.aboutdata.service;

import com.aboutdata.commons.enums.PhotoStatus;
import com.aboutdata.domain.Photo;
import com.aboutdata.model.PhotoModel;
import com.aboutdata.rest.Page;
import com.aboutdata.rest.Pageable;

import java.util.List;
/**
 *
 * @author youyou
 */
public interface PhotoService {

    public Photo get(String id);

    public Page<PhotoModel> find(Pageable pageable);

    public List<Photo> findPhotoAndTags();

    public void addTags(String id, String tagString);

    public void removeTags(String id, String tagId);

    public List<Photo> findByAlbumId(String albumId);

    public PhotoModel findById(String id);

    public Photo create(Photo Photo);

    public void delete(String id);

    public void approve(String id, String description);

    public int makrStatus(String id, PhotoStatus status);

    public Page<PhotoModel> findByStatus(PhotoStatus status, Pageable pageable);

    public Page<PhotoModel> findByStatusList(List<PhotoStatus> statusList, Pageable pageable);

    public List<PhotoModel> random();

    /**
     * 查看壁纸 详情
     *
     * @param id
     * @return
     */
    public PhotoModel views(String id);

    /**
     * 统计所有 壁纸数量
     *
     * @return
     */
    public long count();

}
