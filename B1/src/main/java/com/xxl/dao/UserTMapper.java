package com.xxl.dao;

import com.xxl.model.UserT;

public interface UserTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Thu Sep 08 19:29:49 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Thu Sep 08 19:29:49 CST 2016
     */
    int insert(UserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Thu Sep 08 19:29:49 CST 2016
     */
    int insertSelective(UserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Thu Sep 08 19:29:49 CST 2016
     */
    UserT selectByPrimaryKey(int id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Thu Sep 08 19:29:49 CST 2016
     */
    int updateByPrimaryKeySelective(UserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Thu Sep 08 19:29:49 CST 2016
     */
    int updateByPrimaryKey(UserT record);
    
    UserT selectById(int id);
    
    
    
}