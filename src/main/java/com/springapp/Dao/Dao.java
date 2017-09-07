package com.springapp.Dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ivanybma on 3/27/16.
 */

public interface Dao<T extends Object> {

    public void insert(T obj);
    public void deleteById(Serializable id);
    public void update(T st);
    public List<T> query(String id);
    System.out.println("branch1");
    System.out.println("by B”);
    System.out.println("branch1 new updates");
//    System.out.println("by A");
//    System.out.println("test by b");
    Sustem.out.println("direct master");
    Sustem.out.println("direct master2");
}
