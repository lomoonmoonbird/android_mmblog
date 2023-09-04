package com.moonmoonbird.mmblog.model;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;


public class ThreadList extends Base{

    @SerializedName("data")
    @Expose
    private Data data;

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public static class Data {
        @SerializedName("result")
        @Expose
        private ArrayList<Article> result = new ArrayList<>();
        @SerializedName("extra")
        @Expose
        private Extra extra;

        public void setExtra(Extra extra) {
            this.extra = extra;
        }

        public Extra getExtra() {
            return extra;
        }

        public ArrayList<Article> getResult() {
            return result;
        }

        public void setResult(ArrayList result) {
            this.result = result;
        }
    }

    public static class Article extends Result{
        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("desc")
        @Expose
        private String desc;
        @SerializedName("html_content")
        @Expose
        private String htmlContent;
        @SerializedName("tags")
        @Expose
        private List<String> tags = null;
        @SerializedName("thumbnail")
        @Expose
        private String thumbnail;
        @SerializedName("category")
        @Expose
        private String category;
        @SerializedName("hash_url")
        @Expose
        private String hashUrl;
        @SerializedName("likes")
        @Expose
        private Integer likes;
        @SerializedName("hates")
        @Expose
        private Integer hates;
        @SerializedName("scanned")
        @Expose
        private Integer scanned;
        @SerializedName("uv")
        @Expose
        private Integer uv;
        @SerializedName("pv")
        @Expose
        private Integer pv;
        @SerializedName("create_time")
        @Expose
        private Double createTime;
        @SerializedName("update_time")
        @Expose
        private Double updateTime;
        @SerializedName("status")
        @Expose
        private Double status;
        @SerializedName("votes")
        @Expose
        private Votes votes;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getHtmlContent() {
            return htmlContent;
        }

        public void setHtmlContent(String htmlContent) {
            this.htmlContent = htmlContent;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getHashUrl() {
            return hashUrl;
        }

        public void setHashUrl(String hashUrl) {
            this.hashUrl = hashUrl;
        }

        public Integer getLikes() {
            return likes;
        }

        public void setLikes(Integer likes) {
            this.likes = likes;
        }

        public Integer getHates() {
            return hates;
        }

        public void setHates(Integer hates) {
            this.hates = hates;
        }

        public Integer getScanned() {
            return scanned;
        }

        public void setScanned(Integer scanned) {
            this.scanned = scanned;
        }

        public Integer getUv() {
            return uv;
        }

        public void setUv(Integer uv) {
            this.uv = uv;
        }

        public Integer getPv() {
            return pv;
        }

        public void setPv(Integer pv) {
            this.pv = pv;
        }

        public Double getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Double createTime) {
            this.createTime = createTime;
        }

        public Double getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Double updateTime) {
            this.updateTime = updateTime;
        }

        public Double getStatus() {
            return status;
        }

        public void setStatus(Double status) {
            this.status = status;
        }

        public Votes getVotes() {
            return votes;
        }

        public void setVotes(Votes votes) {
            this.votes = votes;
        }
    }
}
