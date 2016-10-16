package com.aboutdata.service;


import org.apache.shiro.web.session.HttpServletSession;

import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
/**
 * Service - 验证码
 *
 *
 *
 */
public interface CaptchaService {

    /**
     * 生成验证码图片
     *
     * @param session 验证ID
     * @return 验证码图片
     */
    BufferedImage buildImage(HttpServletSession session);

    /**
     * 验证码验证
     *
     * @param session 验证ID
     * @param captcha 验证码(忽略大小写)
     * @return 验证码验证是否通过
     */
    boolean isValid(HttpServletSession session, String captcha);

}
