package com.dao;

import com.entity.NovelContent;

public interface NovelContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NovelContent record);

    int insertSelective(NovelContent record);

    NovelContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NovelContent record);

    int updateByPrimaryKeyWithBLOBs(NovelContent record);
}