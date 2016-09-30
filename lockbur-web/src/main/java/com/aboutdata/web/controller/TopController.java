package com.aboutdata.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.aboutdata.rest.Page;
import com.aboutdata.rest.Pageable;
import com.aboutdata.rest.Sort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aboutdata.model.PhotosModel;
import com.aboutdata.service.PhotosService;

/**
 * 排行榜 初步使用查看最多来排名
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/top")
public class TopController {

    Logger logger = LoggerFactory.getLogger(TopController.class);

    @Resource
    private PhotosService photosService;

    /**
     * 每次加载24张图片
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping
    public String list(HttpServletRequest request, Model model) {

        Pageable pageable = new Pageable(0, 24);
        Page<PhotosModel> pages = photosService.find(pageable);

        model.addAttribute("pages", pages);
        return "/portal/top";
    }

    /**
     * 查看更多 无限加载
     *
     * @param page
     * @param model
     * @return
     */
    @ResponseBody//作用是将返回的对象作为响应，发送给页面
    @RequestMapping("/next")
    public ModelAndView infinitescroll(int page, ModelAndView model) {
        logger.info("page now {}", page);
        if (page <= 0) {
            page = 0;
        } else {
            //消除data spring 默认从0开始问题
            page = page - 1;
        }

        Pageable pageable = new Pageable(page, 24);
        Page<PhotosModel> pages = photosService.find(pageable);

        logger.info("page size {}", pages.getContent().size());

        model.setViewName("/portal/common/next");

        model.addObject("pages", pages);

        model.addObject("page", page);
        return model;
    }

}
