package com.dao;

import com.entity.NovelChapter;

public interface NovelChapterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NovelChapter record);

    int insertSelective(NovelChapter record);

    NovelChapter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NovelChapter record);

    int updateByPrimaryKey(NovelChapter record);
}