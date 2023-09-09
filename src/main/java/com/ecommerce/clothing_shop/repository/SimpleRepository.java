package com.ecommerce.clothing_shop.repository;

import com.ecommerce.clothing_shop.util.MySQLDatabase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.spi.PersistenceProvider;

import java.util.List;
import java.util.Optional;

public abstract class SimpleRepository<T, ID> implements IBaseRepository<T, ID> {
    @Produces
    @PersistenceContext(unitName = "default")
    @MySQLDatabase
    private EntityManager em;



    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public List<T> findAllById(Iterable<ID> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(ID id) {
        assert id != null;
        this.delete(this.findById(id).orElseThrow(() -> {
            return new RuntimeException(String.format("No entity with id %s exists!", id));
        }));
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends ID> ids) {

    }

    @Override
    public void deleteAll(Iterable<? extends T> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends T> S save(S entity) {
        return null;
    }

    @Override
    public <S extends T> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(ID id) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends T> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends T> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public T getById(ID id) {
        return null;
    }
}
