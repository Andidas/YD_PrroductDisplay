package service;

import java.util.List;


import entity.Product;

public interface ProductService {
	List<Product> queryAll();
	int insertOne(Product product);
	
	int deteleOne(int id);
	
	int updateOne(Product product);
	
	/**
	 * 查找当前类别的数据
	 * @param t_id 类别的id
	 * @return
	 */
	List<Product> queryList(int t_id);
	
	/**
	 * 按照编号查找单个产品
	 * @param qd_num
	 * @return
	 */
	List<Product> queryOne(String qd_num);
}
