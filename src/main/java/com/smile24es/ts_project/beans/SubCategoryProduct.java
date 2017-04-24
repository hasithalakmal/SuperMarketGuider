/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smile24es.ts_project.beans;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hasithagamage
 */
@Entity
@Table(name = "SUB_CATEGORY_PRODUCT", catalog = "SMG", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubCategoryProduct.findAll", query = "SELECT s FROM SubCategoryProduct s")
    , @NamedQuery(name = "SubCategoryProduct.findBySubCategoryId", query = "SELECT s FROM SubCategoryProduct s WHERE s.subCategoryProductPK.subCategoryId = :subCategoryId")
    , @NamedQuery(name = "SubCategoryProduct.findByProductId", query = "SELECT s FROM SubCategoryProduct s WHERE s.subCategoryProductPK.productId = :productId")})
public class SubCategoryProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubCategoryProductPK subCategoryProductPK;

    public SubCategoryProduct() {
    }

    public SubCategoryProduct(SubCategoryProductPK subCategoryProductPK) {
        this.subCategoryProductPK = subCategoryProductPK;
    }

    public SubCategoryProduct(int subCategoryId, int productId) {
        this.subCategoryProductPK = new SubCategoryProductPK(subCategoryId, productId);
    }

    public SubCategoryProductPK getSubCategoryProductPK() {
        return subCategoryProductPK;
    }

    public void setSubCategoryProductPK(SubCategoryProductPK subCategoryProductPK) {
        this.subCategoryProductPK = subCategoryProductPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subCategoryProductPK != null ? subCategoryProductPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubCategoryProduct)) {
            return false;
        }
        SubCategoryProduct other = (SubCategoryProduct) object;
        if ((this.subCategoryProductPK == null && other.subCategoryProductPK != null) || (this.subCategoryProductPK != null && !this.subCategoryProductPK.equals(other.subCategoryProductPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smile24es.ts_project.beans.SubCategoryProduct[ subCategoryProductPK=" + subCategoryProductPK + " ]";
    }
    
}
