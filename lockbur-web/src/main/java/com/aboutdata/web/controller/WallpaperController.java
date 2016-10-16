package com.aboutdata.web.controller;

import com.aboutdata.model.PhotoModel;
import com.aboutdata.model.TagModel;
import com.aboutdata.service.PhotoService;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Administrator
 */
@Controller("wallpaperController")
@RequestMapping("/wallpaper")
public class WallpaperController {

    Logger logger = LoggerFactory.getLogger(WallpaperController.class);

    @Resource
    private PhotoService photoService;

    @RequestMapping(value = "/{photosId}", method = RequestMethod.GET)
    public String wallpaper(@PathVariable("photosId") String photosId, ModelMap model) {
        PhotoModel photos = photoService.views(photosId);
        String tagString = "";
        if (photos.getTags() != null) {
            for (TagModel tag : photos.getTags()) {
                tagString += tag.getName() + ",";
            }
            tagString = tagString.substring(0, tagString.length());
        }
        //壁纸的主要颜色
        //List<PhotosColors> colors = photosColorsService.findByPhotosId(photosId);
        
        model.addAttribute("photos", photos);
        model.addAttribute("tagString", tagString);
        //model.addAttribute("colors", colors);

        return "/portal/wallpaper";

    }
}
