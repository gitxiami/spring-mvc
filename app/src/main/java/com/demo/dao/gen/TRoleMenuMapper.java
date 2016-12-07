package com.demo.dao.gen;

import com.demo.dao.gen.entity.TRoleMenu;
import com.demo.dao.gen.entity.TRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    long countByExample(TRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    int deleteByExample(TRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    int insert(TRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    int insertSelective(TRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    List<TRoleMenu> selectByExample(TRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    TRoleMenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    int updateByExampleSelective(@Param("record") TRoleMenu record, @Param("example") TRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    int updateByExample(@Param("record") TRoleMenu record, @Param("example") TRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    int updateByPrimaryKeySelective(TRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    int updateByPrimaryKey(TRoleMenu record);
}