package com.alexandria.dao;

import com.alexandria.entities.CategoryEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

import static com.alexandria.persistence.PersistenceUtils.*;


public class CategoryDaoImpl extends AbstractDaoImpl<CategoryEntity> implements CategoryDao {

    private static final Logger logger = LogManager.getLogger(CategoryDaoImpl.class);

    CategoryDaoImpl() {
        super(CategoryEntity.class);
    }

    @Override
    public List<CategoryEntity> findFromParent(int parent) {
        logger.info("DB_FIND_FROM_PARENT_ID BEGIN");

        EntityManager em = getEntityManager();

        TypedQuery<CategoryEntity> query = em.createNamedQuery("CategoryEntity.findFromParent", CategoryEntity.class);
        query.setParameter("parent", parent);
        List<CategoryEntity> searchCategoriesList = query.getResultList();

        closeEntityManager();

        logger.info("DB_FIND_FROM_PARENT_ID END");

        return searchCategoriesList;
    }
}
