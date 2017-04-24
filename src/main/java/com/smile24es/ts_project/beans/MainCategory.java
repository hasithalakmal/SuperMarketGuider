/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smile24es.ts_project.beans;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hasithagamage
 */
@Entity
@Table(name = "MAIN_CATEGORY", catalog = "SMG", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"MAIN_CATEGORY_NAME"})
    , @UniqueConstraint(columnNames = {"MAIN_CATEGORY_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MainCategory.findAll", query = "SELECT m FROM MainCategory m")
    , @NamedQuery(name = "MainCategory.findByMainCategoryId", query = "SELECT m FROM MainCategory m WHERE m.mainCategoryId = :mainCategoryId")
    , @NamedQuery(name = "MainCategory.findByMainCategoryName", query = "SELECT m FROM MainCategory m WHERE m.mainCategoryName = :mainCategoryName")
    , @NamedQuery(name = "MainCategory.findByMainCategoryDescription", query = "SELECT m FROM MainCategory m WHERE m.mainCategoryDescription = :mainCategoryDescription")
    , @NamedQuery(name = "MainCategory.findByMainCategoryImageUrl", query = "SELECT m FROM MainCategory m WHERE m.mainCategoryImageUrl = :mainCategoryImageUrl")})
public class MainCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MAIN_CATEGORY_ID", nullable = false)
    private Integer mainCategoryId;
    @Basic(optional = false)
    @Column(name = "MAIN_CATEGORY_NAME", nullable = false, length = 250)
    private String mainCategoryName;
    @Column(name = "MAIN_CATEGORY_DESCRIPTION", length = 250)
    private String mainCategoryDescription;
    @Column(name = "MAIN_CATEGORY_IMAGE_URL", length = 250)
    private String mainCategoryImageUrl;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mainCategoryId")
//    private Collection<SubCategory> subCategoryCollection;

    public MainCategory() {
    }

    public MainCategory(Integer mainCategoryId) {
        this.mainCategoryId = mainCategoryId;
    }

    public MainCategory(Integer mainCategoryId, String mainCategoryName) {
        this.mainCategoryId = mainCategoryId;
        this.mainCategoryName = mainCategoryName;
    }

    public Integer getMainCategoryId() {
        return mainCategoryId;
    }

    public void setMainCategoryId(Integer mainCategoryId) {
        this.mainCategoryId = mainCategoryId;
    }

    public String getMainCategoryName() {
        return mainCategoryName;
    }

    public void setMainCategoryName(String mainCategoryName) {
        this.mainCategoryName = mainCategoryName;
    }

    public String getMainCategoryDescription() {
        return mainCategoryDescription;
    }

    public void setMainCategoryDescription(String mainCategoryDescription) {
        this.mainCategoryDescription = mainCategoryDescription;
    }

    public String getMainCategoryImageUrl() {
        return mainCategoryImageUrl;
    }

    public void setMainCategoryImageUrl(String mainCategoryImageUrl) {
        this.mainCategoryImageUrl = mainCategoryImageUrl;
    }

//    @XmlTransient
//    public Collection<SubCategory> getSubCategoryCollection() {
//        return subCategoryCollection;
//    }
//
//    public void setSubCategoryCollection(Collection<SubCategory> subCategoryCollection) {
//        this.subCategoryCollection = subCategoryCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mainCategoryId != null ? mainCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MainCategory)) {
            return false;
        }
        MainCategory other = (MainCategory) object;
        if ((this.mainCategoryId == null && other.mainCategoryId != null) || (this.mainCategoryId != null && !this.mainCategoryId.equals(other.mainCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smile24es.ts_project.beans.MainCategory[ mainCategoryId=" + mainCategoryId + " ]";
    }
    
}
