package net.yasite.dao;import java.util.Map;import android.content.res.Resources.Theme;import android.database.sqlite.SQLiteDatabase;import de.greenrobot.dao.AbstractDao;import de.greenrobot.dao.AbstractDaoSession;import de.greenrobot.dao.identityscope.IdentityScopeType;import de.greenrobot.dao.internal.DaoConfig;public class DaoSession extends AbstractDaoSession {//	private final DaoConfig playRoundDaoConfig;//	private final PlayRoundDao playRoundDao;//	//	private final DaoConfig matchDaoConfig;//	private final MatchDao matchDao;//	//	private final DaoConfig categoryDaoConfig;//	private final ChannelInfoEntityDao categoryDao;//	//	private final DaoConfig userDaoConfig;//	private final UserDao userDao;//	//	private final DaoConfig newsDaoConfig;//	private final NewsDao newsDao;//	//	private final DaoConfig threadTempDaoConfig;//	private final ThreadTempDao threadTempDao;		public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> daoConfigMap) {		super(db);//		playRoundDaoConfig = daoConfigMap.get(PlayRoundDao.class).clone();//		playRoundDaoConfig.initIdentityScope(type);//		playRoundDao = new PlayRoundDao(playRoundDaoConfig,this);//		registerDao(PlayRoundEntity.class,playRoundDao);//		//		matchDaoConfig = daoConfigMap.get(MatchDao.class).clone();//		matchDaoConfig.initIdentityScope(type);//		matchDao = new MatchDao(matchDaoConfig,this);//		registerDao(MatchEntity.class, matchDao);//		//		categoryDaoConfig = daoConfigMap.get(ChannelInfoEntityDao.class).clone();//		categoryDaoConfig.initIdentityScope(type);//		categoryDao = new ChannelInfoEntityDao(categoryDaoConfig,this);//		registerDao(ChannelInfoEntity.class, categoryDao);//		//		userDaoConfig = daoConfigMap.get(UserDao.class).clone();//		userDaoConfig.initIdentityScope(type);//		userDao = new UserDao(userDaoConfig,this);//		registerDao(UserEntity.class, userDao);//		//		newsDaoConfig = daoConfigMap.get(NewsDao.class).clone();//		newsDaoConfig.initIdentityScope(type);//		newsDao = new NewsDao(newsDaoConfig,this);//		registerDao(NewsEntity.class, newsDao);//		//		threadTempDaoConfig = daoConfigMap.get(ThreadTempDao.class).clone();//		threadTempDaoConfig.initIdentityScope(type);//		threadTempDao = new ThreadTempDao(threadTempDaoConfig,this);//		registerDao(ThreadTempEntity.class, threadTempDao);	}	public void clear() {//		playRoundDaoConfig.getIdentityScope().clear();//		matchDaoConfig.getIdentityScope().clear();//		categoryDaoConfig.getIdentityScope().clear();//		userDaoConfig.getIdentityScope().clear();//		newsDaoConfig.getIdentityScope().clear();//		threadTempDaoConfig.getIdentityScope().clear();	}}