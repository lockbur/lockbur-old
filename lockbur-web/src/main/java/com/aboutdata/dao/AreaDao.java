package com.aboutdata.dao;

import com.aboutdata.domain.Area;

import java.util.List;

/**
 * Dao - 地区
 */
public interface AreaDao {

    /**
     * 查找顶级地区
     *
     * @return 顶级地区
     */
    public List<Area> findRoots();

}
