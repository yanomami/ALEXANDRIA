package com.alexandria.dao;

import com.alexandria.entities.ClientEntity;
import com.alexandria.entities.OrderHeaderEntity;

import java.util.List;

public interface OrderHeaderDao extends AbstractDao<OrderHeaderEntity> {

    void create(OrderHeaderEntity entity);

    void update(OrderHeaderEntity entity);

    void updateShippingMethod(OrderHeaderEntity entity);

    void updateDatePlaced(OrderHeaderEntity entity);

    void remove(OrderHeaderEntity entity);

    OrderHeaderEntity find(Object id);

    List<OrderHeaderEntity> findAll();

    List<OrderHeaderEntity> findRange(int iMin, int nb);

    List<OrderHeaderEntity> findFromClient(ClientEntity client);

    int count();
}