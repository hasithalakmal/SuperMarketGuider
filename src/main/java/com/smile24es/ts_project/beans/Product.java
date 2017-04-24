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
@Table(catalog = "SMG", name="PRODUCT", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"PRODUCT_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByProductId", query = "SELECT p FROM Product p WHERE p.productId = :productId")
    , @NamedQuery(name = "Product.findByProductName", query = "SELECT p FROM Product p WHERE p.productName = :productName")
    , @NamedQuery(name = "Product.findByProductDescription", query = "SELECT p FROM Product p WHERE p.productDescription = :productDescription")
    , @NamedQuery(name = "Product.findByProductPrice", query = "SELECT p FROM Product p WHERE p.productPrice = :productPrice")
    , @NamedQuery(name = "Product.findByProductAvailability", query = "SELECT p FROM Product p WHERE p.productAvailability = :productAvailability")
    , @NamedQuery(name = "Product.findByProductImageUrl", query = "SELECT p FROM Product p WHERE p.productImageUrl = :productImageUrl")
    , @NamedQuery(name = "Product.findByProductLocation", query = "SELECT p FROM Product p WHERE p.productLocation = :productLocation")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID", nullable = false)
    private Integer productId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_NAME", nullable = false, length = 250)
    private String productName;
    @Column(name = "PRODUCT_DESCRIPTION", length = 250)
    private String productDescription;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRODUCT_PRICE", precision = 22)
    private Double productPrice;
    @Column(name = "PRODUCT_AVAILABILITY")
    private Boolean productAvailability;
    @Basic(optional = false)
    @Column(name = "PRODUCT_IMAGE_URL", nullable = false, length = 250)
    private String productImageUrl;
    @Column(name = "PRODUCT_LOCATION", length = 250)
    private String productLocation;
    @JoinColumn(name = "PRODUCT_MAP_ID", referencedColumnName = "MAP_ID", nullable = false)
    @ManyToOne(optional = false)
    private Map productMapId;

    public Product() {
    }

    public Product(Integer productId) {
        this.productId = productId;
    }

    public Product(Integer productId, String productName, String productImageUrl) {
        this.productId = productId;
        this.productName = productName;
        this.productImageUrl = productImageUrl;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Boolean getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(Boolean productAvailability) {
        this.productAvailability = productAvailability;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getProductLocation() {
        return productLocation;
    }

    public void setProductLocation(String productLocation) {
        this.productLocation = productLocation;
    }

    public Map getProductMapId() {
        return productMapId;
    }

    public void setProductMapId(Map productMapId) {
        this.productMapId = productMapId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smile24es.ts_project.beans.Product[ productId=" + productId + " ]";
    }
    
}
