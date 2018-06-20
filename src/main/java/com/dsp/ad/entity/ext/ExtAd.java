package com.dsp.ad.entity.ext;

import com.dsp.ad.entity.Advertisement;
import com.dsp.ad.entity.subentity.AdParam;
import com.dsp.ad.enums.AdEnum;
import org.springframework.web.multipart.MultipartFile;

import java.util.Objects;

public class ExtAd {

    private int id;
    private int userId;
    private int planId;
    private String name;
    private int type;
    private String url;
    private AdParam param = new AdParam();
    private int status;

    /**
     * 显示需要
     */
    private String planName;
    private String typeName;

    /**
     * 传参需要
     */
    private MultipartFile imageFile;

    public ExtAd() {
    }

    public ExtAd(Advertisement ad) {
        this.id = ad.getId();
        this.userId = ad.getUserId();
        this.planId = ad.getPlanId();
        this.name = ad.getName();
        this.type = ad.getType();
        this.url = ad.getUrl();
        this.param = AdParam.fromJson(ad.getParam());
        this.status = ad.getStatus();
        this.typeName = Objects.requireNonNull(AdEnum.Type.valueOf(type)).text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AdParam getParam() {
        return param;
    }

    public void setParam(AdParam param) {
        this.param = param;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }
}