package org.aplas.latihanretrofit.models;

import com.google.gson.annotations.SerializedName;

public class Repo {
    @SerializedName("id")
    private Integer id;

    @SerializedName("html_url")
    private String htmlUrl;

    @SerializedName("description")
    private String description;

    public Integer getId() {
        return id;
    }


    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getDescription() {
        return description;
    }


}
