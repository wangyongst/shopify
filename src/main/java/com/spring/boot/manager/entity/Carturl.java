package com.spring.boot.manager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Carturl implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    @Column(name = "productid")
    private Integer productid;
    @Basic
    @Column(name = "carturl")
    private String carturl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getCarturl() {
        return carturl;
    }

    public void setCarturl(String carturl) {
        this.carturl = carturl;
    }
}
