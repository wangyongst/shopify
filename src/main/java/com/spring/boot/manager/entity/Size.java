package com.spring.boot.manager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Size implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    @Column(name = "size")
    private Double size;
    @Basic
    @Column(name = "symblesize")
    private String symblesize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getSymblesize() {
        return symblesize;
    }

    public void setSymblesize(String symblesize) {
        this.symblesize = symblesize;
    }
}
