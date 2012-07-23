package com.example.model;

import net.csdn.jpa.model.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * User: WilliamZhu
 * Date: 12-7-23
 * Time: 下午4:53
 */
@Entity
public class BlogTag extends Model {

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Tag tag;
}