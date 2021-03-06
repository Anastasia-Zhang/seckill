package com.miaoshaProject.dao;

import com.miaoshaProject.dataobject.UserAddressDO;

import java.util.List;

public interface UserAddressDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Tue Apr 23 18:26:14 CST 2019
     */
    int deleteByPrimaryKey(Integer addressId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Tue Apr 23 18:26:14 CST 2019
     */
    int insert(UserAddressDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Tue Apr 23 18:26:14 CST 2019
     */
    int insertSelective(UserAddressDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Tue Apr 23 18:26:14 CST 2019
     */
    UserAddressDO selectByPrimaryKey(Integer addressId);
    List<UserAddressDO> selectByUserId(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Tue Apr 23 18:26:14 CST 2019
     */
    int updateByPrimaryKeySelective(UserAddressDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Tue Apr 23 18:26:14 CST 2019
     */
    int updateByPrimaryKey(UserAddressDO record);
}