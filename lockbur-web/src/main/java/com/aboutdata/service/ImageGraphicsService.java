package com.aboutdata.service;

import com.aboutdata.domain.Photo;
import java.io.File;
import org.springframework.web.multipart.MultipartFile;

/**
 * 处理图片 如缩放、裁剪等
 *
 * @author Administrator
 */
public interface ImageGraphicsService {

    /**
     *
     * @param photo
     * @param file
     */
    @Deprecated
    public void build(Photo photo, MultipartFile file);

    public File thumbnail(File sourceImage);

    /**
     * 头像不同尺寸裁剪
     *
     * @param memberID
     * @param Imagefile
     */
    public void buildAvatar(String memberID, MultipartFile Imagefile);

    public byte[] scale(byte[] input, int height, int width);
}
