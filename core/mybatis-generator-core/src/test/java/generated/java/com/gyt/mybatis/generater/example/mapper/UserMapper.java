package com.gyt.mybatis.generater.example.mapper;

import com.gyt.mybatis.generater.example.model.User;
import com.gyt.mybatis.generater.example.model.UserWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jan 14 16:49:12 CST 2021
     */
    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jan 14 16:49:12 CST 2021
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jan 14 16:49:12 CST 2021
     */
    UserWithBLOBs selectByPrimaryKey(@Param("host") String host, @Param("user") String user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jan 14 16:49:12 CST 2021
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jan 14 16:49:12 CST 2021
     */
    int updateByPrimaryKey(User record);
}