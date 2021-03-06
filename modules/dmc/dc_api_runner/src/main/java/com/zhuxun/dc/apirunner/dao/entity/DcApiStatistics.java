package com.zhuxun.dc.apirunner.dao.entity;

import java.util.Date;

public class DcApiStatistics {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_statistics.id
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_statistics.api_id
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    private String apiId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_statistics.user_id
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_statistics.api_path
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    private String apiPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_statistics.proxy_path
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    private String proxyPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_statistics.proxy_method
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    private String proxyMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_statistics.consume_time
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    private Integer consumeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_statistics.status_code
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    private Integer statusCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_statistics.access_time
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    private Date accessTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_statistics.id
     *
     * @return the value of dc_api_statistics.id
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_statistics.id
     *
     * @param id the value for dc_api_statistics.id
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_statistics.api_id
     *
     * @return the value of dc_api_statistics.api_id
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_statistics.api_id
     *
     * @param apiId the value for dc_api_statistics.api_id
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public void setApiId(String apiId) {
        this.apiId = apiId == null ? null : apiId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_statistics.user_id
     *
     * @return the value of dc_api_statistics.user_id
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_statistics.user_id
     *
     * @param userId the value for dc_api_statistics.user_id
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_statistics.api_path
     *
     * @return the value of dc_api_statistics.api_path
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public String getApiPath() {
        return apiPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_statistics.api_path
     *
     * @param apiPath the value for dc_api_statistics.api_path
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public void setApiPath(String apiPath) {
        this.apiPath = apiPath == null ? null : apiPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_statistics.proxy_path
     *
     * @return the value of dc_api_statistics.proxy_path
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public String getProxyPath() {
        return proxyPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_statistics.proxy_path
     *
     * @param proxyPath the value for dc_api_statistics.proxy_path
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public void setProxyPath(String proxyPath) {
        this.proxyPath = proxyPath == null ? null : proxyPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_statistics.proxy_method
     *
     * @return the value of dc_api_statistics.proxy_method
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public String getProxyMethod() {
        return proxyMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_statistics.proxy_method
     *
     * @param proxyMethod the value for dc_api_statistics.proxy_method
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public void setProxyMethod(String proxyMethod) {
        this.proxyMethod = proxyMethod == null ? null : proxyMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_statistics.consume_time
     *
     * @return the value of dc_api_statistics.consume_time
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public Integer getConsumeTime() {
        return consumeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_statistics.consume_time
     *
     * @param consumeTime the value for dc_api_statistics.consume_time
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public void setConsumeTime(Integer consumeTime) {
        this.consumeTime = consumeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_statistics.status_code
     *
     * @return the value of dc_api_statistics.status_code
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_statistics.status_code
     *
     * @param statusCode the value for dc_api_statistics.status_code
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_statistics.access_time
     *
     * @return the value of dc_api_statistics.access_time
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public Date getAccessTime() {
        return accessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_statistics.access_time
     *
     * @param accessTime the value for dc_api_statistics.access_time
     *
     * @mbg.generated Fri Jun 15 15:25:27 CST 2018
     */
    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }
}