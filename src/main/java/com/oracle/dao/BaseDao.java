package com.oracle.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author RussWest0
 *
 */
public interface BaseDao<T> {
	
	
	/**
	 * ����һ������
	 * 
	 * @param o
	 *            ����
	 * @return �����ID
	 */
	public Serializable save(T o);

	/**
	 * ɾ��һ������
	 * 
	 * @param o
	 *            ����
	 */
	public void delete(T o);

	/**
	 * ����һ������
	 * 
	 * @param o
	 *            ����
	 */
	public void update(T o);

	/**
	 * ��������һ������
	 * 
	 * @param o
	 *            ����
	 */
	public void saveOrUpdate(T o);

	/**
	 * ͨ��������ö���
	 * 
	 * @param c
	 *            ����.class
	 * @param id
	 *            ����
	 * @return ����
	 */
	public T get(Class<T> c, Serializable id);

	/**
	 * ͨ��HQL����ȡһ������
	 * 
	 * @param hql
	 *            HQL���
	 * @return ����
	 */
	public T get(String hql);

	/**
	 * ͨ��HQL����ȡһ������
	 * 
	 * @param hql
	 *            HQL���
	 * @param params
	 *            ����
	 * @return ����
	 */
	public T get(String hql, Map<String, Object> params);

	/**
	 * ��ö����б�
	 * 
	 * @param hql
	 *            HQL���
	 * @return List
	 */
	public List<T> find(String hql);

	/**
	 * ��ö����б�
	 * 
	 * @param hql
	 *            HQL���
	 * @param params
	 *            ����
	 * @return List
	 */
	public List<T> find(String hql, Map<String, Object> params);

	/**
	 * ��÷�ҳ��Ķ����б�
	 * 
	 * @param hql
	 *            HQL���
	 * @param page
	 *            Ҫ��ʾ�ڼ�ҳ
	 * @param rows
	 *            ÿҳ��ʾ������
	 * @return List
	 */
	public List<T> find(String hql, int page, int rows);

	/**
	 * ��÷�ҳ��Ķ����б�
	 * 
	 * @param hql
	 *            HQL���
	 * @param params
	 *            ����
	 * @param page
	 *            Ҫ��ʾ�ڼ�ҳ
	 * @param rows
	 *            ÿҳ��ʾ������
	 * @return List
	 */
	public List<T> find(String hql, Map<String, Object> params, int page, int rows);

	/**
	 * ͳ����Ŀ
	 * 
	 * @param hql
	 *            HQL���(select count(*) from T)
	 * @return long
	 */
	public Long count(String hql);

	/**
	 * ͳ����Ŀ
	 * 
	 * @param hql
	 *            HQL���(select count(*) from T where xx = :xx)
	 * @param params
	 *            ����
	 * @return long
	 */
	public Long count(String hql, Map<String, Object> params);

	/**
	 * ִ��һ��HQL���
	 * 
	 * @param hql
	 *            HQL���
	 * @return ��Ӧ�����Ŀ
	 */
	public int executeHql(String hql);

	/**
	 * ִ��һ��HQL���
	 * 
	 * @param hql
	 *            HQL���
	 * @param params
	 *            ����
	 * @return ��Ӧ�����Ŀ
	 */
	public int executeHql(String hql, Map<String, Object> params);

	/**
	 * ��ý����
	 * 
	 * @param sql
	 *            SQL���
	 * @return �����
	 */
	public List<Object[]> findBySql(String sql);

	/**
	 * ��ý����
	 * 
	 * @param sql
	 *            SQL���
	 * @param page
	 *            Ҫ��ʾ�ڼ�ҳ
	 * @param rows
	 *            ÿҳ��ʾ������
	 * @return �����
	 */
	public List<Object[]> findBySql(String sql, int page, int rows);

	/**
	 * ��ý����
	 * 
	 * @param sql
	 *            SQL���
	 * @param params
	 *            ����
	 * @return �����
	 */
	public List<Object[]> findBySql(String sql, Map<String, Object> params);

	/**
	 * ��ý����
	 * 
	 * @param sql
	 *            SQL���
	 * @param params
	 *            ����
	 * @param page
	 *            Ҫ��ʾ�ڼ�ҳ
	 * @param rows
	 *            ÿҳ��ʾ������
	 * @return �����
	 */
	public List<Object[]> findBySql(String sql, Map<String, Object> params, int page, int rows);

	/**
	 * ִ��SQL���
	 * 
	 * @param sql
	 *            SQL���
	 * @return ��Ӧ����
	 */
	public int executeSql(String sql);

	/**
	 * ִ��SQL���
	 * 
	 * @param sql
	 *            SQL���
	 * @param params
	 *            ����
	 * @return ��Ӧ����
	 */
	public int executeSql(String sql, Map<String, Object> params);

	/**
	 * ͳ��
	 * 
	 * @param sql
	 *            SQL���
	 * @return ��Ŀ
	 */
	public Long countBySql(String sql);

	/**
	 * ͳ��
	 * 
	 * @param sql
	 *            SQL���
	 * @param params
	 *            ����
	 * @return ��Ŀ
	 */
	public Long countBySql(String sql, Map<String, Object> params);
	
	
	
}
