package com.api.modules.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;

/**
 * @ClassName CommandInfo
 * @Description
 * @Author
 * @Date 2021/4/7 18:01
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
public class User implements Serializable {

    private Map<String,String> mapPamater;
    private String Name;
    private String Password;

    public Map<String, String> getMapPamater() {
        return mapPamater;
    }

    public void setMapPamater(Map<String, String> mapPamater) {
        this.mapPamater = mapPamater;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}