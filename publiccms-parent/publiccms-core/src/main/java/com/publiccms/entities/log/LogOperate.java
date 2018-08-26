package com.publiccms.entities.log;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.publiccms.common.database.CmsUpgrader;
import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * LogOperate generated by hbm2java
 */
@Entity
@Table(name = "log_operate")
@DynamicUpdate
public class LogOperate implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Long id;
    @GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private short siteId;
    @GeneratorColumn(title = "用户", condition = true)
    private Long userId;
    @GeneratorColumn(title = "渠道", condition = true)
    private String channel;
    @GeneratorColumn(title = "操作", condition = true)
    private String operate;
    @GeneratorColumn(title = "IP", condition = true)
    private String ip;
    @GeneratorColumn(title = "操作日期", condition = true, order = true)
    private Date createDate;
    @GeneratorColumn(title = "内容", condition = true, like = true)
    private String content;

    public LogOperate() {
    }

    public LogOperate(short siteId, String channel, String operate, Date createDate, String content) {
        this.siteId = siteId;
        this.channel = channel;
        this.operate = operate;
        this.createDate = createDate;
        this.content = content;
    }

    public LogOperate(short siteId, Long userId, String channel, String operate, String ip, Date createDate, String content) {
        this.siteId = siteId;
        this.userId = userId;
        this.channel = channel;
        this.operate = operate;
        this.ip = ip;
        this.createDate = createDate;
        this.content = content;
    }

    @Id
    @GeneratedValue(generator = "cmsGenerator")
    @GenericGenerator(name = "cmsGenerator", strategy = CmsUpgrader.IDENTIFIER_GENERATOR)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public short getSiteId() {
        return this.siteId;
    }

    public void setSiteId(short siteId) {
        this.siteId = siteId;
    }

    @Column(name = "user_id")
    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "channel", nullable = false, length = 50)
    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Column(name = "operate", nullable = false, length = 40)
    public String getOperate() {
        return this.operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    @Column(name = "ip", length = 64)
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "content", nullable = false)
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
