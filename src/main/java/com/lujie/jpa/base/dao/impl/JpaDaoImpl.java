package com.lujie.jpa.base.dao.impl;

import com.lujie.jpa.base.dao.JpaDao;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;
public class JpaDaoImpl<T,S> implements JpaDao<T,S> {

    @Override
    public List<T> findAll() {

        return findAll();
    }

    @Override
    public List<T> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<T> findAllById(Iterable<S> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(S s) {

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void deleteAll(Iterable<? extends T> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S1 extends T> S1 save(S1 s1) {
        return null;
    }

    @Override
    public <S1 extends T> List<S1> saveAll(Iterable<S1> iterable) {
        return null;
    }

    @Override
    public Optional<T> findById(S s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(S s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S1 extends T> S1 saveAndFlush(S1 s1) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<T> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public T getOne(S s) {
        return null;
    }

    @Override
    public <S extends T> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S1 extends T> List<S1> findAll(Example<S1> example) {
        return null;
    }

    @Override
    public <S1 extends T> List<S1> findAll(Example<S1> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends T> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends T> boolean exists(Example<S> example) {
        return false;
    }
}
