package com.myblog.createtestdata;

import com.myblog.mapper.ArticleMapper;
import com.myblog.model.Article;
import com.myblog.show.myblogshow.MyblogshowApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Random;

@SpringBootTest(classes = MyblogshowApplication.class)
public class CreateTestData {
    int[] classes={1,2,9,10,11,12,13,14,15};
    private String text="有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~有小伙伴表示还不知道如何找到视频，那么今天给到大家更简单的教程！分享几个高清免费的视频网站建议大家收藏~";
    private String title="test";
    @Autowired
    private ArticleMapper articleMapper;
    @Test
    public void test(){
        Random random=new Random();
        for(int i=0;i<100;i++){

            Article article=new Article();
            article.setId(i);
            article.setArticle(text);
            article.setArticler("测试");
            article.setClassification(classes[random.nextInt(9)]);
            article.setDescr("test");
            article.setKeyword("测试");
            article.setOrd(i);
            article.setTime(LocalDateTime.now());
            article.setZan(i);
            article.setWatchnum(i);
            articleMapper.insert(article);
        }
    }
}
