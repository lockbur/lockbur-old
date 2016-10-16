package com.aboutdata.service.impl;


import com.aboutdata.service.CaptchaService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import java.awt.image.BufferedImage;
import javax.annotation.Resource;

/**
 * Service - 验证码
 *
 *
 *
 */
@Service("captchaServiceImpl")
public class CaptchaServiceImpl implements CaptchaService {

    @Override
    public BufferedImage buildImage(String captchaId) {

        return null;
    }

    @Override
    public boolean isValid(String captchaId, String captcha) {
        if (StringUtils.isNotEmpty(captchaId) && StringUtils.isNotEmpty(captcha)) {
            try {
//                return imageCaptchaService.validateResponseForID(captchaId, captcha.toUpperCase());
                return true;
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }

}
