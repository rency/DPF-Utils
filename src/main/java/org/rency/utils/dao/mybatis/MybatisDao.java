package org.rency.utils.dao.mybatis;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;

import org.hibernate.criterion.Order;
import org.rency.utils.dao.BasicDao;
import org.rency.utils.exceptions.CoreException;

/**
 * @desc MyBatis Common Basic Dao 
 * @author user_rcy@163.com
 * @date 2014年5月29日 下午10:06:33
 * @version 1.0.0
 */
public class MybatisDao implements BasicDao {

	@Override
	public <T> T get(Class<T> clazz, Serializable id) throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T load(Class<T> clazz, Serializable id) throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> loadAll(Class<T> clazz) throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findByHQL(String hql) throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findByHQL(String hql, Object value) throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findByHQL(String hql, Object... values)
			throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findBySQL(String sql, Object[] values, Class<T> clazz)
			throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findByProperty(HashMap<String, Object> properties,
			Class<T> clazz) throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Integer getCount(Class<T> clazz) throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> getByPage(String entity, int pageNo, int pageSize,
			Order order) throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> getByPage(String hql, int pageNo, int pageSize,
			Object... values) throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Object entity) throws CoreException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveOrUpdate(Object entity) throws CoreException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Object entity) throws CoreException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateByProperty(String entity, String whereName,
			Object whereValue, String setName, Object setValue)
			throws CoreException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateByProperty(String entity,
			HashMap<String, Object> where, HashMap<String, Object> set)
			throws CoreException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByProperty(String entity, String propertyName,
			Object propertyValue) throws CoreException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object entity) throws CoreException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> boolean deleteAll(Class<T> clazz) throws CoreException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> int bulkUpdate(String hql, Object... values)
			throws CoreException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultSet find(String sql, Object... values) throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(String sql, Object... values) throws CoreException {
		// TODO Auto-generated method stub
		return 0;
	}

}
