package com.aboutdata.domain;

import com.aboutdata.commons.enums.Oauth2Type;
/**
 * 存储第三方登录的账号信息
 *
 * @author Administrator
 */
public class OpenAuth2 extends BaseEntity {

    private String oauthId;

    private Oauth2Type type;

    private String memberId;


    public String getOauthId() {
        return oauthId;
    }

    public void setOauthId(String oauthId) {
        this.oauthId = oauthId;
    }

    public Oauth2Type getType() {
        return type;
    }

    public void setType(Oauth2Type type) {
        this.type = type;
    }

    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
