
package com.yc.shoesMall.bean;

import java.util.Date;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.uid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.pid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.level
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private String level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.content
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.create_time
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.id
     *
     * @return the value of comment.id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.id
     *
     * @param id the value for comment.id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.uid
     *
     * @return the value of comment.uid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.uid
     *
     * @param uid the value for comment.uid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.pid
     *
     * @return the value of comment.pid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.pid
     *
     * @param pid the value for comment.pid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.level
     *
     * @return the value of comment.level
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.level
     *
     * @param level the value for comment.level
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.content
     *
     * @return the value of comment.content
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.content
     *
     * @param content the value for comment.content
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.create_time
     *
     * @return the value of comment.create_time
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.create_time
     *
     * @param createTime the value for comment.create_time
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}