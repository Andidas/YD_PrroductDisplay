package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.Product;

public interface ProductDao {
	@Select("SELECT * from qd_product")
	List<Product> queryAll();
	
	@Insert("insert into qd_product(qd_t_id,qd_name,qd_num,qd_color,qd_price,qd_inventory,qd_sales) values (#{qd_t_id},#{qd_name},#{qd_num},#{qd_color},#{qd_price},#{qd_inventory},#{qd_sales})")
	int insertOne(Product product);
	
	@Delete("delete from qd_product where qd_id = #{_parameter}")
	int deteleOne(int id);
	
	@Update("update qd_product set qd_t_id=#{qd_t_id},qd_name=#{qd_name},qd_num=#{qd_num},qd_color=#{qd_color},qd_price=#{qd_price},qd_inventory=#{qd_inventory},qd_sales=#{qd_sales} where qd_id=#{qd_id}")
	int updateOne(Product product);
	
	/**
	 * 查找当前类别的数据
	 * @param t_id 类别的id
	 * @return
	 */
	@Select("select * from qd_product where qd_t_id = #{_parameter}")
	List<Product> queryList(int t_id);
	
	/**
	 * 按照编号查找单个产品
	 * @param qd_num
	 * @return
	 */
	@Select("select * from qd_product where qd_num like #{_parameter};")
	List<Product> queryOne(String qd_num);
}
