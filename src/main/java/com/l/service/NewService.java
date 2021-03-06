package com.l.service;

import com.l.pojo.New;

import java.util.List;

public interface NewService {
    /**
     * 根据主键查询一条个信息
     *
     * @param id
     * @return
     */
    New selectByPrimaryKey(Integer id);

    /**
     * 查询所有新闻包括了 类别信息 发布用户的信息
     *
     * @return
     */
    List<New> selectAll();

    /**
     * 插入一条新闻信息 返回主键给实体类
     *
     * @param t title&content&categoryId&userId为必填
     * @return
     */
    int insertOne(New t);

    /**
     * 动态条件删除数据
     * 主键、title、categoryId、userId
     *
     * @param t
     * @return
     */
    int deleteBySelective(New t);

    /**
     * 根据主键动态更新数据
     *
     * @param t
     * @return
     */
    int updateByPrimaryKeySelective(New t);

    /**
     * 根据主键增加访问次数
     *
     * @param id
     * @return
     */
    int updateByPrimaryKeyAddClicks(Integer id);

    /**
     * 分页动态查询 title 查询为 like 条件
     *
     * @param n
     * @param index
     * @param number
     * @return
     */
    List<New> selectLimitBySelective(New n, Integer index, Integer number);

    /**
     * 获取动态条件查询的数量
     *
     * @param n
     * @return
     */
    long selectSelectiveCount(New n);

    /**
     * 获取某一页
     *
     * @param page
     * @param n
     * @return
     */
    List<New> getPage(New n, int page);

    /**
     * 设置每页数量
     *
     * @param number
     */
    default void setPageShowNumber(int number) {

    }

    //    返回每页显示数量
    default int getPageShowNumber() {
        return 10;
    }
}
