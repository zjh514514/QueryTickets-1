package com.saltyfish.querytickets.dao;

import java.util.List;

/**
 * 视图查询
 *
 * @author zjh514514
 */
public interface NormalQueryDao {

    /**
     * 根据车站查询
     *
     * @param station
     * @return
     */
    List queryByStation(String station);
}