package com.aboutdata.web.controller.member;

import com.aboutdata.commons.ResponseMessage;
import com.aboutdata.domain.Member;
import com.aboutdata.model.PhotoModel;
import com.aboutdata.model.TagModel;
import com.aboutdata.service.*;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author youyou
 */
@Controller("photosController")
@RequestMapping("/member/photos")
public class PhotosController {

    Logger logger = LoggerFactory.getLogger(PhotosController.class);

    @Resource
    private PhotoService photoService;

    @Resource
    private ImageGraphicsService imageGraphicsService;

    @Resource
    private SearchService searchService;

    @Resource(name = "memberServiceImpl")
    private MemberService memberService;

    @RequestMapping(method = RequestMethod.GET)

    public String index(Integer pageNumber, ModelMap model) {

       //List<PhotosAlbum> albums = photosAlbumService.findRoots();
        //model.addAttribute("albums", albums);
        return "/member/photos/album";
    }

    @RequestMapping(value = "/wallpaper/{photosId}", method = RequestMethod.GET)
    public String wallpaper(@PathVariable("photosId") String photosId, ModelMap model) {
        PhotoModel photos = photoService.findById(photosId);
        String tagString = "";
        if (photos != null) {
            for (TagModel tag : photos.getTags()) {
                tagString += tag.getName() + ",";
            }
            tagString = tagString.substring(0, tagString.length());
        }
        model.addAttribute("photos", photos);
        model.addAttribute("tagString", tagString);

        return "/member/photos/wallpaper";
    }

    /**
     * 移除标签
     *
     * @param id
     * @param tagId
     * @param model
     * @param rattr
     * @return
     */
    @RequestMapping(value = "/removeTags", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage removeTags(String id, String tagId, ModelMap model, RedirectAttributes rattr) {
        Member member = memberService.getCurrent();
        photoService.removeTags(id, tagId);
        return ResponseMessage.success("添加标签成功");
    }

}
