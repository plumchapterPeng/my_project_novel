package com.entity;

public class Novel {
    private Integer id;

    private String title;

    private String desc;

    private String author;

    private String noveltype;

    private String tags;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNoveltype() {
        return noveltype;
    }

    public void setNoveltype(String noveltype) {
        this.noveltype = noveltype;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}