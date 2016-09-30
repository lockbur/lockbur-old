package com.aboutdata.web.controller.member;

import com.aboutdata.domain.Member;
import com.aboutdata.service.AreaService;
import com.aboutdata.service.MemberService;
import javax.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.aboutdata.security.utils.SecurityPasswordUtils;
import com.aboutdata.service.ImageGraphicsService;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author youyou
 */
@Controller("shopMemberSettingsController")
@RequestMapping("/member/settings")
public class SettingsController {

    Logger logger = LoggerFactory.getLogger(SettingsController.class);

    @Resource(name = "memberServiceImpl")
    private MemberService memberService;

    @Resource(name = "areaServiceImpl")
    private AreaService areaService;

    @Resource
    private ImageGraphicsService imageGraphicsService;

    /**
     * 个人资料修改该页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String displayEditProfile(ModelMap model) {
        Member member = memberService.getCurrent();
        model.addAttribute("member", member);

        return "/member/settings/profile";
    }

    /**
     * 个人资料 保存
     *
     * @param description
     * @param backgroundId
     * @param model
     * @return
     */
    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String updateProfile(String description, String backgroundId, ModelMap model) {
        Member member = memberService.getCurrent();

        model.addAttribute("member", member);

        return "redirect:/member/settings/profile";
    }

    /**
     * 账户修改该页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String displayEditAccount(ModelMap model) {
        Member member = memberService.getCurrent();
        model.addAttribute("member", member);
        return "/member/settings/account";
    }

    /**
     * post 保存修改
     *
     * @param email
     * @param password
     * @param confirmPassword
     * @param model
     * @return
     */
    @RequestMapping(value = "/account", method = RequestMethod.POST)
    public String updateAccount(String email, String password, String confirmPassword, ModelMap model) {
        Member member = memberService.getCurrent();
        if (!StringUtils.isEmpty(email)) {
            member.setEmail(email);
        }
        if (!StringUtils.isEmpty(password) && StringUtils.endsWith(password, confirmPassword)) {
            member.setPassword(SecurityPasswordUtils.getPassphrase(member.getSalt(), password));
        } else {
            logger.debug("update password({}) not equals comfirmPassword({}) ", password, confirmPassword);
        }
        memberService.update(member);
        model.addAttribute("member", member);

        return "redirect:/member/settings/account";
    }

    /**
     * 账户修改该页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/avatar", method = RequestMethod.GET)
    public String displaEditAvatar(ModelMap model) {
        Member member = memberService.getCurrent();

        model.addAttribute("member", member);
        return "/member/settings/avatar";
    }

    /**
     * @1 上传新头像
     * @2 把头裁剪成40x40 60x60 200x200
     * @3 这里虽然有Avatar 字段但只是保留上传的文件名 真正获取头像是跟会员id和s(大小)来确定
     * @param multipartFile
     * @param model
     * @return
     */
    @RequestMapping(value = "/avatar", method = RequestMethod.POST)
    public String updateAvatar(MultipartFile multipartFile, ModelMap model) {
        if (!multipartFile.isEmpty()) {
            Member member = memberService.getCurrent();
            //生成不同尺寸的头像头像
            imageGraphicsService.buildAvatar(member.getId(), multipartFile);
            
            String type = multipartFile.getContentType().split("/")[1];
            member.setAvatar(multipartFile.getOriginalFilename());
            member.setAvatarType(type);
            memberService.update(member);
        }
        return "redirect:/member/settings/avatar";
    }

    /**
     * 账户修改该页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/browsing", method = RequestMethod.GET)
    public String displaEditBrowsing(ModelMap model) {
        Member member = memberService.getCurrent();

        model.addAttribute("member", member);
        return "/member/settings/browsing";
    }

}
