package com.demo.dao.gen.entity;

import java.util.Date;

public class TRoleMenu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.role_id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.menu_id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private Integer menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.create_time
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.create_user
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    private String createUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.id
     *
     * @return the value of t_role_menu.id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.id
     *
     * @param id the value for t_role_menu.id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.role_id
     *
     * @return the value of t_role_menu.role_id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.role_id
     *
     * @param roleId the value for t_role_menu.role_id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.menu_id
     *
     * @return the value of t_role_menu.menu_id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.menu_id
     *
     * @param menuId the value for t_role_menu.menu_id
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.create_time
     *
     * @return the value of t_role_menu.create_time
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.create_time
     *
     * @param createTime the value for t_role_menu.create_time
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.create_user
     *
     * @return the value of t_role_menu.create_user
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.create_user
     *
     * @param createUser the value for t_role_menu.create_user
     *
     * @mbg.generated Wed Nov 09 16:32:43 CST 2016
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }
}