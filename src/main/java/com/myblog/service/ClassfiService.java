package com.myblog.service;

import com.myblog.model.Model;

public interface ClassfiService {
    Model getAll();

    Model getArtByClass(Integer id, Integer limit);

    Model getWonderTop(Integer code);

    Model getNewArticle();

    Model getPageArticle(Integer classid, Integer currentPage, Integer size);

    Model getCount(Integer classid);

    Model getByArticleId(Integer id);

}
