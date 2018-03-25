package service.impl;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.TypeDao;
import entity.Type;
import service.TypeService;

@Service
public class TypeServiceImpl implements TypeService {
	
	private TypeDao typeDao;
	

	@Override
	public List<Type> findAll() {
		
		return typeDao.findAll();
	}

	@Override
	public int insertOne(Type type) {
		return typeDao.insertOne(type);
	}

	@Override
	public int deleteOne(int id) {
		return typeDao.deleteOne(id);
	}

	@Override
	public int updateOne(Type type) {
		return typeDao.updateOne(type);
	}

	public TypeDao getTypeDao() {
		return typeDao;
	}
	@Resource
	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}
	
}
