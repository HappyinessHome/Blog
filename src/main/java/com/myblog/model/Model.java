package com.myblog.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.myblog.enums.ModelEnum;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Collection;

@Data
public class Model {
    private int code;
    private String message;
    private Object data;
    public static Model builder(){
        return new Model();
    }
    public Model OK(){
        this.code=ModelEnum.OK.getCode();
        return this;
    }
    public Model ERROR(){
        this.code=ModelEnum.ERROR.getCode();
        return this;
    }
    public Model data(Object data){
       this.data=data;
        return this;
    }
    public Model message(String message){
        this.message=message;
        return this;
    }
    public Model build(){
        return this;
    }
}
