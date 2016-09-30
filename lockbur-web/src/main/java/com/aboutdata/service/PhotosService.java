package com.aboutdata.service;

import com.aboutdata.commons.enums.PhotoStatus;
import com.aboutdata.domain.Photos;
import com.aboutdata.model.PhotosModel;
import com.aboutdata.rest.Page;
import com.aboutdata.rest.Pageable;

import java.util.List;
/**
 *
 * @author youyou
 */
public interface PhotosService {

    public Photos get(String id);

    public Page<PhotosModel> find(Pageable pageable);

    public List<Photos> findPhotosAndTags();

    public void addTags(String id, String tagString);

    public void removeTags(String id, String tagId);

    public List<Photos> findByAlbumId(String albumId);

    public PhotosModel findById(String id);

    public Photos create(Photos photos);

    public void delete(String id);

    public void approve(String id, String description);

    public int makrStatus(String id, PhotoStatus status);

    public Page<PhotosModel> findByStatus(PhotoStatus status, Pageable pageable);

    public Page<PhotosModel> findByStatusList(List<PhotoStatus> statusList, Pageable pageable);

    public List<PhotosModel> random();

    /**
     * 查看壁纸 详情
     *
     * @param id
     * @return
     */
    public PhotosModel views(String id);

    /**
     * 统计所有 壁纸数量
     *
     * @return
     */
    public long count();

}
