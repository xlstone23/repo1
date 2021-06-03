package com.lagou.test;

import com.lagou.domain.Article;
import com.lagou.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class XlTest {
    @Autowired
    private ArticleService articleService;

    @Test
    public void test1(){
        Article article=new Article();
        article.setTitle("123456");
        article.setContent("54564341");
            articleService.insertALL(article);
    }
}
