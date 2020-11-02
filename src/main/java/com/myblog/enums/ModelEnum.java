package com.myblog.enums;

public enum ModelEnum {
    OK(0),ERROR(1);
    private int code;
     ModelEnum(int code){
        this.code=code;
    }
    public int getCode(){
         return this.code;
    }
}
