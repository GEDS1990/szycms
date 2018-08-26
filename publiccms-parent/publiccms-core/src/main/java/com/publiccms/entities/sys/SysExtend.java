package com.publiccms.entities.sys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import com.publiccms.common.database.CmsUpgrader;
import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysExtend generated by hbm2java
 */
@Entity
@Table(name = "sys_extend")
@DynamicUpdate
public class SysExtend implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Integer id;
    @GeneratorColumn(title = "扩展类型")
    private String itemType;
    @GeneratorColumn(title = "扩展项目ID")
    private int itemId;

    public SysExtend() {
    }

    public SysExtend(String itemType, int itemId) {
        this.itemType = itemType;
        this.itemId = itemId;
    }

    @Id
    @GeneratedValue(generator = "cmsGenerator")
    @GenericGenerator(name = "cmsGenerator", strategy = CmsUpgrader.IDENTIFIER_GENERATOR)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "item_type", nullable = false, length = 20)
    public String getItemType() {
        return this.itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Column(name = "item_id", nullable = false)
    public int getItemId() {
        return this.itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

}
