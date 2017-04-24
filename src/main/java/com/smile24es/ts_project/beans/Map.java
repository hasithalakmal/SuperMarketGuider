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
@Table(catalog = "SMG", name="MAP", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"MAP_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Map.findAll", query = "SELECT m FROM Map m")
    , @NamedQuery(name = "Map.findByMapId", query = "SELECT m FROM Map m WHERE m.mapId = :mapId")
    , @NamedQuery(name = "Map.findByMapName", query = "SELECT m FROM Map m WHERE m.mapName = :mapName")
    , @NamedQuery(name = "Map.findByMapUrl", query = "SELECT m FROM Map m WHERE m.mapUrl = :mapUrl")})
public class Map implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MAP_ID", nullable = false)
    private Integer mapId;
    @Basic(optional = false)
    @Column(name = "MAP_NAME", nullable = false, length = 250)
    private String mapName;
    @Basic(optional = false)
    @Column(name = "MAP_URL", nullable = false, length = 250)
    private String mapUrl;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productMapId")
//    private Collection<Product> productCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subCategoryMapId")
//    private Collection<SubCategory> subCategoryCollection;

    public Map() {
    }

    public Map(Integer mapId) {
        this.mapId = mapId;
    }

    public Map(Integer mapId, String mapName, String mapUrl) {
        this.mapId = mapId;
        this.mapName = mapName;
        this.mapUrl = mapUrl;
    }

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

//    @XmlTransient
//    public Collection<Product> getProductCollection() {
//        return productCollection;
//    }
//
//    public void setProductCollection(Collection<Product> productCollection) {
//        this.productCollection = productCollection;
//    }
//
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
        hash += (mapId != null ? mapId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Map)) {
            return false;
        }
        Map other = (Map) object;
        if ((this.mapId == null && other.mapId != null) || (this.mapId != null && !this.mapId.equals(other.mapId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smile24es.ts_project.beans.Map[ mapId=" + mapId + " ]";
    }
    
}
