package com.aboutdata.domain;

import com.aboutdata.commons.enums.Gender;
import com.aboutdata.web.interceptor.MemberInterceptor;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
/**
 * Entity - 会员
 */
public class Member extends BaseEntity {

    private static final long serialVersionUID = 1L;
    /**
     * "身份信息"参数名称
     */
    public static final String PRINCIPAL_ATTRIBUTE_NAME = MemberInterceptor.class.getName() + ".PRINCIPAL";

    /**
     * 用户名
     */
    @NotEmpty
    @Pattern(regexp = "^[0-9a-z_A-Z\\u4e00-\\u9fa5]+$")
    private String username;
    /**
     * 姓名
     */
    @Length(max = 200)
    private String name;
    /**
     * 性别
     */
    private Gender gender;
    /**
     * 密码
     */
    @NotEmpty
    @Pattern(regexp = "^[^\\s&\"<>]+$")
    private String password;
    /**
     * 安全密匙
     */
    private String salt;
    /**
     * @ 会员头像文件名
     * @ 这里虽然有Avatar 字段但只是保留上传的文件名 真正获取头像是跟会员id和s(大小)来确定
     */
    @Length(max = 120)
    private String avatar;
    /**
     * 会员头像文件名
     */
    @Length(max = 10)
    private String avatarType;
    /**
     * E-mail
     */
    @NotEmpty
    @Email
    @Length(max = 200)
    private String email;
    /**
     * 是否启用
     */
    @NotNull
    private Boolean isEnabled;
    /**
     * 是否锁定
     */
    private Boolean isLocked;
    /**
     * 连续登录失败次数
     */
    private Integer loginFailureCount;
    /**
     * 锁定日期
     */
    private Date lockedDate;
    /**
     * 最后登录IP
     */
    private String loginIp;
    /**
     * 最后登录日期
     */
    private Date loginDate;

    /**
     * 手机
     */
    @Length(max = 200)
    private String mobile;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatarType() {
        return avatarType;
    }

    public void setAvatarType(String avatarType) {
        this.avatarType = avatarType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }


    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Length(max = 200)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

}
