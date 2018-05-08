package com.example.administrator.myapplication.bean;


public class News {
    private String title;
    private String content;
    private String newsImageUrl;

    public News(String title, String content, String newsImageUrl) {
        this.title = title;
        this.content = content;
        this.newsImageUrl = newsImageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getNewsImageUrl() {
        return newsImageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setNewsImageUrl(String newsImageUrl) {
        this.newsImageUrl = newsImageUrl;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", newsImageUrl='" + newsImageUrl + '\'' +
                '}';
    }
}
