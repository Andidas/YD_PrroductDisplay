package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.Type;

public interface TypeDao {
	
	//@Select("select * from qd_type")
	List<Type> findAll();
	
	@Insert("insert into qd_type(t_name,t_area) values(#{t_name},#{t_area})")
	int insertOne(Type type);
	
	@Delete("delete from qd_type where t_id = #{_parameter };")
	int deleteOne(int id);
	
	@Update("update qd_type set t_name=#{t_name} , t_area=#{t_area} where t_id=#{t_id}")
	int updateOne(Type type);
	
	
	
	
}
