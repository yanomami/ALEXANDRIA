package com.alexandria.dao;

import com.alexandria.entities.ClientEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

import static com.alexandria.persistence.PersistenceUtils.*;

public class ClientDao extends AbstractDao<ClientEntity> {

    private static final Logger logger = LogManager.getLogger(ClientDao.class);

    public ClientDao() {
        super(ClientEntity.class);
    }

    public List<ClientEntity> findFromFirstNameLastName(String name) {

        logger.info("DB_FIND_FROM_FIRST_NAME_LAST_NAME BEGIN");

        EntityManager em = getEntityManager();

        TypedQuery<ClientEntity> query = em.createNamedQuery("ClientEntity.findFromFirstNameLastName", ClientEntity.class);
        query.setParameter("name", name);
        List<ClientEntity> searchClientsList = query.getResultList();

        closeEntityManager();

        logger.info("DB_FIND_FROM_FIRST_NAME_LAST_NAME END");

        return searchClientsList;
    }
}
