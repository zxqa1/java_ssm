package com.it.dao;

public interface BrandDao {
    public abstract  void save();
    public abstract  void update();

    String findNameByID(int id);
}
