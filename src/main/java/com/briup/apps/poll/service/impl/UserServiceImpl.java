package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.User;
import com.briup.apps.poll.bean.UserExample;
import com.briup.apps.poll.dao.UserMapper;
import com.briup.apps.poll.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll() throws Exception {
		UserExample example = new UserExample();
		return userMapper.selectByExample(example);
	}

	@Override
	public User findById(long id) throws Exception {

		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> query(String keyWords) throws Exception {
		UserExample example = new UserExample();
		// 添加一个条件，name属性中包含keyWords
		example.createCriteria().andNameLike(keyWords);
		return userMapper.selectByExample(example);
	}

	@Override
	public void saveOrUpdate(User user) throws Exception {
		if (user.getId() != null) {
			// 更新
			userMapper.updateByPrimaryKey(user);
		} else {
			// 插入
			userMapper.insert(user);
		}
	}

	@Override
	public void deleteById(long id) throws Exception {
		userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDelete(long[] ids) throws Exception {
		for (long id : ids) {
			userMapper.deleteByPrimaryKey(id);
		}
	}
}
