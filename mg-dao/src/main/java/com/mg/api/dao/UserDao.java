package com.mg.api.dao;

import com.mg.api.entity.UserView;
import com.mg.api.model.User;

public interface UserDao extends GenericDao<User, Long> {
	/**
	 * 通过邮箱查找用户
	 * @param email
	 * @return
	 */
	public User getByEmail(String email);
	
	/**
	 * 通过手机号码查找用户
	 * @param mobile
	 * @return
	 */
	public User getByMobile(String mobile);
	
	/**
	 * 通过uid查找用户View
	 * @param uid
	 * @return
	 */
	public UserView getView(Long uid);
	
	/**
	 * 通过用户名查找用户View--邮箱/手机
	 * @param username
	 * @return
	 */
	public UserView getViewByUsername(String username);
	
	/**
	 * 根据Email取得用户数
	 * @param email
	 * @return
	 */
	public int getCntByEmail(String email);
	
	/**
	 * 根据Mobil取得用户数
	 * @param mobil
	 * @return
	 */
	public int getCntByMobile(String mobil);
}