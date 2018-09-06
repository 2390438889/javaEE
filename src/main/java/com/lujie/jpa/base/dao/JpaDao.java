package com.lujie.jpa.base.dao;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

public interface JpaDao<T,S> extends JpaRepository<T,S>{
}
