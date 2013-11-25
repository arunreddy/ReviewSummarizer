package edu.asu.nlp.reviewsummarizer.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by arun on 11/22/13.
 */
@Entity
@Table(name = "products", schema = "", catalog = "amazonreviews")
public class Product {
    private int id;
    private String productId;
    private String productName;
    private String productType;
    private String brand;
    private BigDecimal salesPrice;
    private BigDecimal listPrice;
    private String shortProductDescr;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_type")
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "sales_price")
    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Basic
    @Column(name = "list_price")
    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    @Basic
    @Column(name = "short_product_descr")
    public String getShortProductDescr() {
        return shortProductDescr;
    }

    public void setShortProductDescr(String shortProductDescr) {
        this.shortProductDescr = shortProductDescr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (brand != null ? !brand.equals(product.brand) : product.brand != null) return false;
        if (listPrice != null ? !listPrice.equals(product.listPrice) : product.listPrice != null) return false;
        if (productId != null ? !productId.equals(product.productId) : product.productId != null) return false;
        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        if (productType != null ? !productType.equals(product.productType) : product.productType != null) return false;
        if (salesPrice != null ? !salesPrice.equals(product.salesPrice) : product.salesPrice != null) return false;
        if (shortProductDescr != null ? !shortProductDescr.equals(product.shortProductDescr) : product.shortProductDescr != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (salesPrice != null ? salesPrice.hashCode() : 0);
        result = 31 * result + (listPrice != null ? listPrice.hashCode() : 0);
        result = 31 * result + (shortProductDescr != null ? shortProductDescr.hashCode() : 0);
        return result;
    }
}
