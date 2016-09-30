package com.aboutdata.dao;

import com.aboutdata.commons.enums.Oauth2Type;
import com.aboutdata.domain.OpenAuth2;
/**
 * 第三方开放平台登录
 *
 * @author Administrator
 */

public interface OpenAuth2Dao {

    public OpenAuth2 findByOauthIdAndType(String oauthId, Oauth2Type type);
}
