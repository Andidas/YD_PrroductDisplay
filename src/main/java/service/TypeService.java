package service;

import java.util.List;



import entity.Type;

public interface TypeService {
	List<Type> findAll();
	int insertOne(Type type);
	
	int deleteOne(int id);
	
	int updateOne(Type type);
}
