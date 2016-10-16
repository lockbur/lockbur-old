package com.aboutdata.model.dto;

import com.aboutdata.domain.Photo;
import com.aboutdata.model.PhotoModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Photosistrator
 */
public class PhotosDTO {
    
    public static PhotoModel getPhotosModelDTO(Photo photos) {
        PhotoModel result = null;
        if (photos != null) {
            result = new PhotoModel();
            
            result.setId(photos.getId());
            result.setThumbnail(photos.getThumbnail());
            result.setSource(photos.getSource());
            result.setTitle(photos.getTitle());
            result.setWidth(photos.getWidth());
            result.setHeight(photos.getHeight());
            result.setSize(photos.getSize());
//              model.setAlbum(album);
            //result.setMember(MemberDTO.getMemberModelDTO(photos.getMember()));
            //tags

            //result.setTags(TagDTO.getTagModelsDTO(photos.getTags()));
            
           // result.setStatus("1");
           // result.setOrder(photos.getOrder());
            result.setDescription(photos.getDescription());
            result.setStorageHost(photos.getStorageHost());
          //  result.setWallhaven(photos.getWallhaven());
          //   result.setCreateDate(photos.getCreateDate());
          //   result.setModifyDate(photos.getModifyDate());
        }
        return result;
    }

    /**
     * Photos转换成PhotosModel根据list转换
     *
     * @param photos
     * @return
     */
    public static List<PhotoModel> getPhotosModeslDTO(List<Photo> photos) {
        List<PhotoModel> result = new ArrayList<PhotoModel>(photos.size());
        if (photos.size() > 0) {
            result = new ArrayList(photos.size());
            for (Photo photo : photos) {
                //DTO转换
                PhotoModel model = new PhotoModel();

                //photos.setMember(m);
                model.setId(photo.getId());
                model.setThumbnail(photo.getThumbnail());
                
                model.setTitle(photo.getTitle());
                model.setWidth(photo.getWidth());
                model.setHeight(photo.getHeight());

//              model.setAlbum(album);
                //model.setStatus(photo.getStatus());
               // model.setOrder(photo.getOrder());
                model.setDescription(photo.getDescription());
                
                model.setStorageHost(photo.getStorageHost());
                //model.setWallhaven(photo.getWallhaven());
               // model.setCreateDate(photo.getCreateDate());
               // model.setModifyDate(photo.getModifyDate());
                
                result.add(model);
            }
        }
        return result;
    }
}
