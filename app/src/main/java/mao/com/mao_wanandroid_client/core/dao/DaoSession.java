package mao.com.mao_wanandroid_client.core.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import mao.com.mao_wanandroid_client.core.dao.SearchHistoryData;

import mao.com.mao_wanandroid_client.core.dao.SearchHistoryDataDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig searchHistoryDataDaoConfig;

    private final SearchHistoryDataDao searchHistoryDataDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        searchHistoryDataDaoConfig = daoConfigMap.get(SearchHistoryDataDao.class).clone();
        searchHistoryDataDaoConfig.initIdentityScope(type);

        searchHistoryDataDao = new SearchHistoryDataDao(searchHistoryDataDaoConfig, this);

        registerDao(SearchHistoryData.class, searchHistoryDataDao);
    }
    
    public void clear() {
        searchHistoryDataDaoConfig.clearIdentityScope();
    }

    public SearchHistoryDataDao getSearchHistoryDataDao() {
        return searchHistoryDataDao;
    }

}