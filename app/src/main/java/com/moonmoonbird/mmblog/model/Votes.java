package com.moonmoonbird.mmblog.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Votes {

    @SerializedName("youzhong")
    @Expose
    private Integer youzhong;
    @SerializedName("youqu")
    @Expose
    private Integer youqu;
    @SerializedName("youliao")
    @Expose
    private Integer youliao;
    @SerializedName("youqing")
    @Expose
    private Integer youqing;
    @SerializedName("youcai")
    @Expose
    private Integer youcai;

    public Integer getYouzhong() {
        return youzhong;
    }

    public void setYouzhong(Integer youzhong) {
        this.youzhong = youzhong;
    }

    public Integer getYouqu() {
        return youqu;
    }

    public void setYouqu(Integer youqu) {
        this.youqu = youqu;
    }

    public Integer getYouliao() {
        return youliao;
    }

    public void setYouliao(Integer youliao) {
        this.youliao = youliao;
    }

    public Integer getYouqing() {
        return youqing;
    }

    public void setYouqing(Integer youqing) {
        this.youqing = youqing;
    }

    public Integer getYoucai() {
        return youcai;
    }

    public void setYoucai(Integer youcai) {
        this.youcai = youcai;
    }

}