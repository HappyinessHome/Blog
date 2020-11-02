package com.myblog.serviceimpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.myblog.mapper.ArticleMapper;
import com.myblog.mapper.ClassMapper;
import com.myblog.model.Article;
import com.myblog.model.ClassiFica;
import com.myblog.model.Model;
import com.myblog.service.ClassfiService;
import com.myblog.utils.MyBlUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
@Transactional
public class ClassService implements ClassfiService {
    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public Model getAll() {
        Model model=null;
        try {
            List<ClassiFica> classAll = classMapper.getAll();
            MyBlUtil.listclass(classAll);
            model=Model.builder().OK().message("分类信息").data(classAll);
        }catch (Exception e){
            e.printStackTrace();
            model=Model.builder().ERROR().message("后台classervice报错");
            log.info("classervice错误报错为:[{}]",e.getMessage());
        }
        return model;
    }

    @Override
    public Model getArtByClass(Integer id, Integer limit) {
        try {
            List<Article> byClassLimit = articleMapper.getByClassLimit(id, limit);
            System.out.println(byClassLimit);
            return Model.builder().OK().message("根据分类ID获取文章信息且只获取指定的数目").data(byClassLimit);
        }catch (Exception e){
            e.printStackTrace();
            log.info("根据分类id获取文章报错误信息为:[{}]",e.getMessage());
            return Model.builder().ERROR().message("后台报错请联系管理员");
        }

    }

    @Override
    public Model getWonderTop(Integer code) {
        try {
            List<Article> articles = articleMapper.getByCode(code);
            return Model.builder().OK().message("精彩专题数据").data(articles);
        }catch (Exception e){
            e.printStackTrace();
            log.info("获得精彩专题后台出错,出错原因为:[{}]",e.getMessage());
            return Model.builder().ERROR().message("精彩专题后台报错");
        }

    }

    @Override
    public Model getNewArticle() {
        try {
            List<Article> articles = articleMapper.getByOrderTime();
            return Model.builder().OK().message("最新文章数据").data(articles);
        }catch (Exception e){
            e.printStackTrace();
            log.info("获得最新文章后台出错,出错原因为:[{}]",e.getMessage());
            return Model.builder().ERROR().message("获得最新文章后台出错");
        }
    }

    @Override
    public Model getPageArticle(Integer classid, Integer currentPage, Integer size) {
        try{
            int start=(currentPage-1)*size;
            List<Article> articles = articleMapper.getPage(classid, start, size);
            return Model.builder().OK().message("分页文章数据").data(articles);
        }catch (Exception e){
            e.printStackTrace();
            log.info("分页文章后台出错,出错原因为:[{}]",e.getMessage());
            return Model.builder().ERROR().message("获得分页文章后台出错");
        }

    }
    @Override
    public Model getCount(Integer classid) {
        try{

            Long count = articleMapper.getCountWithClassid(classid);
            return Model.builder().OK().message("根据分类获取文章总数").data(count);
        }catch (Exception e){
            e.printStackTrace();
            log.info("根据分类获取文章总数,出错原因为:[{}]",e.getMessage());
            return Model.builder().ERROR().message("根据分类获取文章总数出错");
        }

    }
    @Override
    public Model getByArticleId(Integer id) {
        try{

            Article article = articleMapper.getByArticleId(id);
            ClassiFica classiFica = classMapper.selectById(article.getClassification());
            JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(article));
            jsonObject.put("class",classiFica);
            return Model.builder().OK().message("文章数据").data(jsonObject);
        }catch (Exception e){
            e.printStackTrace();
            log.info("文章数据,出错原因为:[{}]",e.getMessage());
            return Model.builder().ERROR().message("文章数据后台报错");
        }
    }
}
