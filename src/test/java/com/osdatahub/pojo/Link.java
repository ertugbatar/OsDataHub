package com.osdatahub.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Link {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("rel")
    @Expose
    private String rel;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;

    /**
     * No args constructor for use in serialization
     *
     */
    public Link() {
    }

    /**
     *
     * @param rel
     * @param description
     * @param href
     * @param type
     * @param title
     */


    /*
    It has instance variables for href, rel, type, title, and description.
    It also has getters and setters for each of these variables.
    The purpose of this class is to represent a link in the API response for the DownloadsApi class.
     */
    public Link(String href, String rel, String type, String title, String description) {
        super();
        this.href = href;
        this.rel = rel;
        this.type = type;
        this.title = title;
        this.description = description;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}