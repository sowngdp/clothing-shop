package com.ecommerce.clothing_shop.repository;

import java.util.List;

public interface IBaseRepository<T, ID> extends ICrudRepository<T, ID> {
    List<T> findAll();
    List<T> findAllById(Iterable<ID> ids);
    <S extends T> List<S> saveAll(Iterable<S> entities);
    void  flush();
    <S extends T> S saveAndFlush(S entity);
    <S extends T> List<S> saveAllAndFlush(Iterable<S> entities);
    T getById(ID id);
}
