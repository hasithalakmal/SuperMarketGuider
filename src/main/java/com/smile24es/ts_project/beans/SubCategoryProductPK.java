/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smile24es.ts_project.beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author hasithagamage
 */
@Embeddable
public class SubCategoryProductPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SUB_CATEGORY_ID", nullable = false)
    private int subCategoryId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID", nullable = false)
    private int productId;

    public SubCategoryProductPK() {
    }

    public SubCategoryProductPK(int subCategoryId, int productId) {
        this.subCategoryId = subCategoryId;
        this.productId = productId;
    }

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) subCategoryId;
        hash += (int) productId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubCategoryProductPK)) {
            return false;
        }
        SubCategoryProductPK other = (SubCategoryProductPK) object;
        if (this.subCategoryId != other.subCategoryId) {
            return false;
        }
        if (this.productId != other.productId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smile24es.ts_project.beans.SubCategoryProductPK[ subCategoryId=" + subCategoryId + ", productId=" + productId + " ]";
    }
    
}
