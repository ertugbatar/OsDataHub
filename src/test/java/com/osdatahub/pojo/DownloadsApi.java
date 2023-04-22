package com.osdatahub.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DownloadsApi {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("links")
    @Expose
    private List<Link> links;

    //Defines the properties of a class in the Java. These properties represent data in a JSON file.
    //For example, the "title" property holds a String value and the "description" property holds a String value.


    /**
     * No args constructor for use in serialization
     *
     */
    public DownloadsApi() {
    }

    /**
     *
     * @param description
     * @param links
     * @param title
     */



    /*
     POJO class called DownloadsApi.
     It has three private fields named "title", "description", and "links", which are annotated with
     the @SerializedName and @Expose annotations from the Gson library. These annotations are used to
     specify the names of the fields in the JSON data that will be used to populate the fields in this class.
     */
    public DownloadsApi(String title, String description, List<Link> links) {
        super();
        this.title = title;
        this.description = description;
        this.links = links;
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

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

}