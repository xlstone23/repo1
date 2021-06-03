package com.lagou.service.impl;

import com.lagou.dao.ArticleDao;
import com.lagou.domain.Article;
import com.lagou.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    @Override
    public void insertALL(Article article) {
        articleDao.insertALL(article);
    }
}
