package com.myblog.ctl;

import com.myblog.model.Model;
import com.myblog.service.ClassfiService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/class")
@RestController
@Api("分类接口相关操作")
@CrossOrigin
public class ClassfiCtl {
    @Autowired
    private ClassfiService classfiService;
    @GetMapping("/getAll")
    @ApiOperation("拿到所有分类")
    public Model getAll(){

        return classfiService.getAll();
    }
    @GetMapping("/getLimitArtByClaId/{id}/{limit}")
    @ApiOperation("根据id和limit拿到对应数量的文章")
    public Model getArtByClass(@PathVariable Integer id,@PathVariable Integer limit){
        return classfiService.getArtByClass(id,limit);
    }
    @GetMapping("/Wonderfultopic/{code}")
    @ApiOperation("获得精彩专题相关数据")
    public Model getWonderfulTopic(@PathVariable Integer code){
        return classfiService.getWonderTop(code);
    }
    @GetMapping("/getNewArticle")
    @ApiOperation("获取最新的文章列表")
    public Model getNewArticle(){
        return classfiService.getNewArticle();
    }
    @GetMapping("/getPageArticle/{classid}/{currentPage}/{size}")
    @ApiOperation("根据分类获取对应的分页文章数据")
    public Model getPageArticle(@PathVariable Integer classid,@PathVariable Integer currentPage,@PathVariable Integer size){
        return classfiService.getPageArticle(classid,currentPage,size);
    }
    @GetMapping("/getByArticleId/{id}")
    @ApiOperation("根据id获取文章数据")
    public Model getByArticleId(@PathVariable Integer id){
        return classfiService.getByArticleId(id);
    }
    @GetMapping("/getCount/{id}")
    @ApiOperation("根据分类id获取文章总数据")
    public Model getCount(@PathVariable Integer id){
        return classfiService.getCount(id);
    }
}
