package com.api.modules.dto;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName ReqUser
 * @Description
 * @Author
 * @Date 2021/4/8 14:09
 * @Version 1.0
 **/
public class ReqUser {
    public String transCode;
    public String name;
    public String password;

    @NotBlank(message = "transCode is not null")
    public String getTransCode() {
        return transCode;
    }

    @NotBlank(message = "name is not null")
    public String getName() {
        return name;
    }

    @NotBlank(message = "password is not null")
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ReqUser{" +
                "transCode='" + transCode + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
