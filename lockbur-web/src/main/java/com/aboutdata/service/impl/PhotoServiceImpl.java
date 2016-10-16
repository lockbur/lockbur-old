package com.aboutdata.service.impl;

import com.aboutdata.commons.application.ApplicationBean;
import com.aboutdata.commons.enums.PhotoStatus;
import com.aboutdata.dao.PhotoDao;
import com.aboutdata.domain.Photo;
import com.aboutdata.model.PhotoModel;
import com.aboutdata.model.dto.PhotosDTO;
import com.aboutdata.rest.Page;
import com.aboutdata.rest.Pageable;
import com.aboutdata.service.ImageGraphicsService;
import com.aboutdata.service.PhotoService;
import com.aboutdata.service.SearchService;
import com.aboutdata.service.StorageService;
import java.util.Collections;
import java.util.List;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 图片壁纸操作
 *
 * @author youyou
 */
@Service("photosServiceImpl")
public class PhotoServiceImpl implements PhotoService {

    Logger logger = LoggerFactory.getLogger(PhotoServiceImpl.class);

    @Resource
    private ApplicationBean appBean;

    @Resource
    private PhotoDao photoDao;

    @Resource
    private ImageGraphicsService imageGraphicsService;

    @Resource
    private StorageService storageService;

    @Resource
    private SearchService searchService;

    @Override
    @Transactional
    public Photo get(String id) {
        //Photos photo = photosDao.findOne(id);

        //return photo;
        return null;
    }

    @Override
    public Page<PhotoModel> findByStatus(PhotoStatus status, Pageable pageable) {

        //Page<Photos> page = photosDao.findByStatus(status, pageable);

        //List<Photos> photos = page.getContent();

        //List<PhotoModel> models = PhotosDTO.getPhotosModeslDTO(photos);
       // Page<PhotoModel> result = new PageImpl<PhotoModel>(models, pageable, page.getTotalElements());

        //return result;
        return null;
    }

    @Override
    public Page<PhotoModel> findByStatusList(List<PhotoStatus> statusList, Pageable pageable) {
        //Page<Photos> page = photosDao.findByStatusIn(statusList, pageable);

        //List<Photos> photos = page.getContent();

        //List<PhotoModel> models = PhotosDTO.getPhotosModeslDTO(photos);
        //Page<PhotoModel> result = new PageImpl<PhotoModel>(models, pageable, page.getTotalElements());

        //return result;
        return null;
    }

    @Override
    public Page<PhotoModel> find(Pageable pageable) {
        //Page<Photos> page = photosDao.findAll(pageable);
        //List<Photos> photos = page.getContent();

        //List<PhotoModel> models = PhotosDTO.getPhotosModeslDTO(photos);
        //Page<PhotoModel> result = new PageImpl<PhotoModel>(models, pageable, page.getTotalElements());

        //return result;

        return null;
    }

    @Override
    public List<Photo> findPhotoAndTags() {
        return null;
    }

    @Override
    @Transactional
    public void addTags(String id, String tagString) {
//        Set<Tag> tags = tagService.getTagsFromString(tagString);
//        Photos photos = photosDao.findOne(id);
//        logger.info("top10  tags {}", tags.size());
//        photos.getTags().addAll(tags);
//        photosDao.save(photos);
    }

    @Override
    @Transactional
    public void removeTags(String id, String tagId) {
//        Photos photos = photosDao.findOne(id);
//        Set<Tag> tags = photos.getTags();
//
//        //移除
//        for (Tag tag : tags) {
//             logger.info("{} remove tag id## {}", tag.getId(),tagId);
//            if (tag.getId().equals(tagId)) {
//                logger.info("remove tag id {}", tag.getId());
//                tags.remove(tag);
//                break;
//            }
//        }
//        //重新保存
//        photos.setTags(tags);
//        logger.info("remove tag id {}", tags.size());
//        photos.setStatus(PhotoStatus.APPROVED);
//        photosDao.save(photos);

    }

    @Override
    public List<Photo> findByAlbumId(String albumId) {
       // return photosDao.findByAlbumId(albumId);
        return null;
    }

    @Override
    public PhotoModel findById(String id) {
       // Photos photos = photosDao.findOne(id);
       // return PhotosDTO.getPhotosModelDTO(photos);
        return null;
    }

    @Override
    @Transactional
    public Photo create(Photo photos) {

        //return photosDao.save(photos);

        return null;
    }

    /**
     * 如果fasdfs或者solr服务删除失败但是数据任然会删除 待解决
     *
     * @param id
     */
    @Override
    @Transactional
    public void delete(String id) {
//        Photos photos = photosDao.findOne(id);
//
//        /**
//         * @ 删除fastdfs上的文件,目前图片只保留了原图和缩略
//         * @ 1 删除缩略图
//         * @ 2 删除原图
//         */
//        storageService.remove(photos.getThumbnail());
//        storageService.remove(photos.getSource());
//        //@2 删除solr上的索引
//        searchService.delete(id);
//        //@3 删出mysql数据
//        photosColorsService.deleteByPhotosId(id);
//
//        photosDao.delete(photos);
    }

    /**
     * @ 批准通过
     * @ 批准通过 定时任务会马上创建索引 需要再批准通过后创建缩略图 并上传到fastdfs
     * @param id
     * @param claim
     */
    @Override
    @Transactional
    public void approve(String id, String claim) {

//        PhotosRequest request = photosRequestDao.findOne(id);
//        // photos.setStatus(PhotoStatus.APPROVED);
//        if (StringUtils.isEmpty(request.getSource())) {
//            logger.error("PhotosRequest source not exists {}", request);
//            return;
//        }
//        File source = new File(request.getSource());
//        //1 生成缩略图
//        File thumbnailImage = imageGraphicsService.thumbnail(source);
//
//        logger.error("thumbnailImage {}", thumbnailImage);
//        //2 上传原图
//        String fastdfsSourceId = storageService.upload(source);
//        //3 上传缩略图  fastdfsId 也是存储路劲
//        String fastdfsThumbnailId = storageService.upload(thumbnailImage);
//
//        Photos photos = new Photos();
//        PhotosAlbum album = new PhotosAlbum();
//
//        album.setId("ff8081814f7e13d8014f7e18a95a0000");
//        photos.setAlbum(album);
//
//        photos.setTitle(request.getTitle());
//        photos.setWidth(request.getWidth());
//        photos.setHeight(request.getHeight());
//        photos.setSize(request.getSize());
//        photos.setOrder(request.getOrder());
//        photos.setThumbnail(fastdfsThumbnailId);
//        photos.setMedium(fastdfsSourceId);
//        photos.setLarge(fastdfsSourceId);
//        photos.setSource(fastdfsSourceId);
//        photos.setStorageHost(appBean.getSystemConfig().getDefaultStorageHost());
//        photos.setStatus(PhotoStatus.APPROVED);
//        photos.setDescription(request.getDescription());
//        photos.setMember(request.getMember());
//        photosDao.save(photos);
//        //再批准通过 同时截取图片颜色
//        photosColorsService.generateColors(photos, source);
//
//        //修改PhotosRequest
//        request.setClaim(claim);
//        request.setStatus(PhotosRequestStatus.APPROVED);
//        request.setDescription(photos.getId());
//        photosRequestDao.saveAndFlush(request);
//
//        //删除本地暂存原文件和缩略图
//        source.delete();
//        thumbnailImage.delete();
    }

    @Override
    @Transactional
    public int makrStatus(String id, PhotoStatus status) {
        //return photosDao.makrStatus(id, status);
        return 0;
    }

    @Override
    public List<PhotoModel> random() {

        List<String> ids = photoDao.findAllIds();
        /**
         * *
         * 1 打乱顺序 造成随机效果 也要分页 2 分頁每次不是同一個隨機序列 每次分頁都是已給新的隨機隊列
         *
         */
        Collections.shuffle(ids);
        //取出24条记录
        List<Photo> photos = photoDao.findByIds(ids.subList(0, 24));

        List<PhotoModel> result = PhotosDTO.getPhotosModeslDTO(photos);

        return result;
    }

    /**
     * 查看详情 并且把查看次数+1
     *
     * @param id
     * @return
     */
    @Override
    @Transactional
    public PhotoModel views(String id) {
       // Photos photos = photosDao.findOne(id);
        //如果访问一次 就把该访问次数加1
        //photos.setOrder(photos.getOrder() + 1);
        //return PhotosDTO.getPhotosModelDTO(photos);

        return null;
    }

    @Override
    public long count() {
       // return photosDao.count();
        return 1l;
    }

}
