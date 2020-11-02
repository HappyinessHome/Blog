package com.myblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myblog.model.ClassiFica;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
@Mapper
public interface ClassMapper extends BaseMapper<ClassiFica> {
    @Select("select * from classifica")
    public List<ClassiFica> getAll();
}
