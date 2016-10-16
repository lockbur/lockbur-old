package com.aboutdata.service.impl;


import com.aboutdata.service.CaptchaService;

import java.awt.Color;

import com.github.bingoohuang.patchca.Patchca;
import com.github.bingoohuang.patchca.color.SingleColorFactory;
import com.github.bingoohuang.patchca.custom.ConfigurableCaptchaService;
import com.github.bingoohuang.patchca.filter.predefined.CurvesRippleFilterFactory;
import com.github.bingoohuang.patchca.service.Captcha;
import com.github.bingoohuang.patchca.utils.encoder.EncoderHelper;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Service - 验证码
 */
@Service("captchaServiceImpl")
public class CaptchaServiceImpl implements CaptchaService {

    private static String captchaId = "Patchca";

    @Override
    public BufferedImage buildImage(HttpServletSession session) {
        Captcha captcha = Patchca.next();
        session.setAttribute(captchaId, captcha.getChallenge());
        return captcha.getImage();
    }

    @Override
    public boolean isValid(HttpServletSession session, String captcha) {
        String captchaWord = session.getAttribute(captchaId).toString();
        if (StringUtils.isNotEmpty(captcha)) {
            return captcha.equalsIgnoreCase(captchaWord);
        } else {
            return false;
        }
    }

}
