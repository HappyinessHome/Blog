package com.myblog.utils;

import com.myblog.model.ClassiFica;

import java.util.List;
import java.util.stream.Collectors;

public class MyBlUtil {
    public static void listclass(List<ClassiFica> list){
        list.parallelStream().forEach(classiFica->{
            Integer id=classiFica.getId();
            list.parallelStream().forEach(childclassiFica -> {
               if(childclassiFica.getParentId().equals(id)){
                   classiFica.getListchild().add(childclassiFica);
               }
            });
        });
    }
}
