package com.imooc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 14:43
 */
@Component
@ConfigurationProperties(prefix = "propertyEntity")
public class ApplicationProperties {
    private String author;
    private Float version;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getVersion() {
        return version;
    }

    public void setVersion(Float version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ApplicationProperties{" +
                "author='" + author + '\'' +
                ", version=" + version +
                '}';
    }
}
