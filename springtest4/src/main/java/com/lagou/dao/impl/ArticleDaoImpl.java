package com.lagou.dao.impl;
import com.lagou.dao.ArticleDao;
import com.lagou.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDaoImpl implements ArticleDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertALL(Article article) {
        String sql="insert into t_article values(null,?,?)";
        jdbcTemplate.update(sql,article.getTitle(),article.getContent());
    }
}
