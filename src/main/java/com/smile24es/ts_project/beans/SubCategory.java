/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smile24es.ts_project.beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hasithagamage
 */
@Entity
@Table(name = "SUB_CATEGORY", catalog = "SMG", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"SUB_CATEGORY_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubCategory.findAll", query = "SELECT s FROM SubCategory s")
    , @NamedQuery(name = "SubCategory.findBySubCategoryId", query = "SELECT s FROM SubCategory s WHERE s.subCategoryId = :subCategoryId")
    , @NamedQuery(name = "SubCategory.findBySubCategoryName", query = "SELECT s FROM SubCategory s WHERE s.subCategoryName = :subCategoryName")
    , @NamedQuery(name = "SubCategory.findBySubCategoryDescription", query = "SELECT s FROM SubCategory s WHERE s.subCategoryDescription = :subCategoryDescription")
    , @NamedQuery(name = "SubCategory.findBySubCategoryImageUrl", query = "SELECT s FROM SubCategory s WHERE s.subCategoryImageUrl = :subCategoryImageUrl")})
public class SubCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SUB_CATEGORY_ID", nullable = false)
    private Integer subCategoryId;
    @Basic(optional = false)
    @Column(name = "SUB_CATEGORY_NAME", nullable = false, length = 250)
    private String subCategoryName;
    @Column(name = "SUB_CATEGORY_DESCRIPTION", length = 250)
    private String subCategoryDescription;
    @Basic(optional = false)
    @Column(name = "SUB_CATEGORY_IMAGE_URL", nullable = false, length = 250)
    private String subCategoryImageUrl;
    @JoinColumn(name = "MAIN_CATEGORY_ID", referencedColumnName = "MAIN_CATEGORY_ID", nullable = false)
    @ManyToOne(optional = false)
    private MainCategory mainCategoryId;
    @JoinColumn(name = "SUB_CATEGORY_MAP_ID", referencedColumnName = "MAP_ID", nullable = false)
    @ManyToOne(optional = false)
    private Map subCategoryMapId;

    public SubCategory() {
    }

    public SubCategory(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public SubCategory(Integer subCategoryId, String subCategoryName, String subCategoryImageUrl) {
        this.subCategoryId = subCategoryId;
        this.subCategoryName = subCategoryName;
        this.subCategoryImageUrl = subCategoryImageUrl;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getSubCategoryDescription() {
        return subCategoryDescription;
    }

    public void setSubCategoryDescription(String subCategoryDescription) {
        this.subCategoryDescription = subCategoryDescription;
    }

    public String getSubCategoryImageUrl() {
        return subCategoryImageUrl;
    }

    public void setSubCategoryImageUrl(String subCategoryImageUrl) {
        this.subCategoryImageUrl = subCategoryImageUrl;
    }

    public MainCategory getMainCategoryId() {
        return mainCategoryId;
    }

    public void setMainCategoryId(MainCategory mainCategoryId) {
        this.mainCategoryId = mainCategoryId;
    }

    public Map getSubCategoryMapId() {
        return subCategoryMapId;
    }

    public void setSubCategoryMapId(Map subCategoryMapId) {
        this.subCategoryMapId = subCategoryMapId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subCategoryId != null ? subCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubCategory)) {
            return false;
        }
        SubCategory other = (SubCategory) object;
        if ((this.subCategoryId == null && other.subCategoryId != null) || (this.subCategoryId != null && !this.subCategoryId.equals(other.subCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SubCategory{" + "subCategoryId:" + subCategoryId + ", subCategoryName:" + subCategoryName + ", subCategoryDescription:" + subCategoryDescription + ", subCategoryImageUrl:" + subCategoryImageUrl + ", mainCategoryId:" + mainCategoryId + ", subCategoryMapId:" + subCategoryMapId + '}';
    }

    
    
}
