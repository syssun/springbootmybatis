package com.sys.base.service;

import java.util.List;
import java.util.Map;

import com.sys.entity.PageModel;
import com.sys.entity.QueryWhere;



public interface BaseService<T> {
	/**
	 * <p>
	 * 保存数据
	 * </p>
	 * 
	 * @author @2506715686@qq.com
	 * @param t
	 * @param table
	 * @
	 */
	public boolean save(T t, String table);

	/**
	 * <p>
	 * 返回主键，保存数据
	 * </p>
	 * 
	 * @author @2506715686@qq.com
	 * @param t
	 * @param table
	 * @return
	 * @
	 */
	public Object saveRetkey(T t, String table) ;

	/**
	 * <p>
	 * 修改数据
	 * </p>
	 * 
	 * @author @2506715686@qq.com
	 * @param t
	 * @param table
	 * @param column
	 * @return
	 * @
	 */
	public boolean update(T t, String table, List<QueryWhere> query);

	/**
	 * <p>
	 * 修改数据,直接传入要修改的字段
	 * </p>
	 * 
	 * @author @2506715686@qq.com
	 * @2016年6月13日
	 * @param params
	 * @param table
	 * @param query
	 * @return
	 * @
	 */
	public boolean update(Map<String, Object> params, String table,
			List<QueryWhere> query) ;

	/**
	 * <p>
	 * 删除数据
	 * </p>
	 * 
	 * @author @2506715686@qq.com
	 * @param t
	 * @param table
	 * @return
	 * @
	 */
	public boolean delete(T t, String table) ;

	/**
	 * <p>
	 * 删除数据
	 * </p>
	 * 
	 * @author @2506715686@qq.com
	 * @param t
	 * @param table
	 * @return
	 * @
	 */
	public boolean deletes(String idcolumn, Object[] ids, String table)
			;

	/**
	 * <p>
	 * 查询数据，单个数据
	 * </p>
	 * 
	 * @author @2506715686@qq.com
	 * @2016年6月13日
	 * @param columns
	 * @param table
	 * @param query
	 * @param sort
	 * @return
	 * @
	 */
	public Map<String, Object> findByWhere(String columns, String table,
			List<QueryWhere> query, String sort) ;

	/**
	 * <p>
	 * 查询数据，查询所有数据
	 * </p>
	 * 
	 * @author @2506715686@qq.com
	 * @param columns
	 * @param table
	 * @param sort
	 * @return
	 * @
	 */
	public List<Map<String, Object>> findAll(String columns, String table,
			String sort) ;

	/**
	 * <p>
	 * 查询数据，根据条件查询出所有数据
	 * </p>
	 * 
	 * @author @2506715686@qq.com
	 * @param columns
	 * @param table
	 * @param sort
	 * @return
	 * @
	 */
	public List<Map<String, Object>> findAllWhere(String columns, String table,
			List<QueryWhere> query, String sort) ;

	/**
	 * <p>
	 * 数据查找，根据条件查找出数据，分页显示
	 * </p>
	 * 
	 * @author @2506715686@qq.com
	 * @param pageNo
	 * @param pageSize
	 * @param columns
	 * @param table
	 * @param query
	 * @param sort
	 * @return
	 * @
	 */
	public PageModel<Map<String, Object>> findPageModel(int pageNo, int pageSize,
			String columns, String table, List<QueryWhere> query, String sort)
			;

	/**
	 * <p>
	 * 数据查询，查询出所有数据的个数
	 * </p>
	 * 
	 * @author @2506715686@qq.com
	 * @param table
	 * @param query
	 * @return
	 * @
	 */
	public int findAllnum(String table, List<QueryWhere> query)
			;

	/**
	 * 2015年12月16日 作者：szp 封装sql语句和条件
	 * 
	 * @param list
	 * @return
	 */
	public List<Map<String, Object>> createQuerySQL(List<QueryWhere> list);

	/**
	 * 插入数据 直接传入sql
	 * @author @2506715686@qq.com
	 * @2016年6月13日
	 * @param map
	 * @return
	 * @ 
	 */
	public boolean insertsql(String sql) ;

	/**
	 * 修改数据 直接传入sql
	 * @author @2506715686@qq.com
	 * @2016年6月13日
	 * @param map
	 * @return
	 * @ 
	 */
	public boolean updatesql(String sql) ;

	/**
	 * 删除数据 直接传入sql
	 * @author @2506715686@qq.com
	 * @2016年6月13日
	 * @param map
	 * @return
	 * @ 
	 */
	public boolean deletesql(String sql) ;

	/**
	 * 查询数据 直接传入sql
	 * @author @2506715686@qq.com
	 * @2016年6月13日
	 * @param map
	 * @return
	 * @ 
	 */
	public Map<String, Object> selectsqlone(String sql) ;

	/**
	 * 查询数据
	 * @author @2506715686@qq.com
	 * @2016年6月13日
	 * @param map
	 * @return
	 * @ 
	 */
	public List<Map<String, Object>> selectsqlall(String sql)
			;

	/**
	 * 
	 * 查询数据
	 * @author @2506715686@qq.com
	 * @2016年6月13日
	 * @param map
	 * @return
	 * @ 
	 */
	public int selectsqlnum(String sql) ;

}
