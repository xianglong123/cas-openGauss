package com.cas.bean;

import java.time.LocalDateTime;

/**
 * @description:
 * @author: xianglong
 * @create: 2024-10-21 11:43
 **/
public class CasUserDO {

    private String id;
    private String username;
    private Integer age;
    private LocalDateTime createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
