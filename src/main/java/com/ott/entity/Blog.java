package com.ott.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "blog")
public class Blog  implements Serializable {
    @Id
    @JsonProperty(value = "blogId")
    @Column(name="blog_id")
    private String blog_id;
    @Column(name="content")
    private String content;
    @Column(name="creation_date")
    @JsonProperty(value = "creationDate")
    private Date creation_date;
    @Column(name="posted_by")
    @JsonProperty(value = "postedBy")
    private String posted_by;
    @Column(name="category")
    private String category;
    @Column(name="tags")
    private String tags;

    public String getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(String blog_id) {
        this.blog_id = blog_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public String getPosted_by() {
        return posted_by;
    }

    public void setPosted_by(String posted_by) {
        this.posted_by = posted_by;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public String toString(){
        return "[blog_id="+this.blog_id+"]";
    }
}
