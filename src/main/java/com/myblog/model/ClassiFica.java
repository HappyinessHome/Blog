package com.myblog.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Data
@TableName("classifica")
public class ClassiFica {
    private Integer id;
    private String name;
    @TableField("parentid")
    private Integer parentId;
    private String sname;
    private String descr;
    private String keywords;
    @TableField(exist = false)
    private List<ClassiFica> listchild=new LinkedList<>();
}
