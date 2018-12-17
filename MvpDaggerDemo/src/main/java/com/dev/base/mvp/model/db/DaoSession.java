package com.dev.base.mvp.model.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.dev.base.mvp.model.entity.table.MovieCollect;

import com.dev.base.mvp.model.db.MovieCollectDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig movieCollectDaoConfig;

    private final MovieCollectDao movieCollectDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        movieCollectDaoConfig = daoConfigMap.get(MovieCollectDao.class).clone();
        movieCollectDaoConfig.initIdentityScope(type);

        movieCollectDao = new MovieCollectDao(movieCollectDaoConfig, this);

        registerDao(MovieCollect.class, movieCollectDao);
    }
    
    public void clear() {
        movieCollectDaoConfig.clearIdentityScope();
    }

    public MovieCollectDao getMovieCollectDao() {
        return movieCollectDao;
    }

}