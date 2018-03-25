package service.impl;

import java.util.List;





import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.ProductDao;
import entity.Product;
import service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;
	
	public ProductDao getProductDao() {
		return productDao;
	}
	@Resource
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> queryAll() {
			List<Product> list = productDao.queryAll();
		return list;
	}

	@Override
	public int insertOne(Product product) {
		return productDao.insertOne(product);
	}
	@Override
	public int deteleOne(int id) {
		return productDao.deteleOne(id);
	}
	@Override
	public int updateOne(Product product) {
		return productDao.updateOne(product);
	}
	@Override
	public List<Product> queryList(int t_id) {
		return productDao.queryList(t_id);
	}
	@Override
	public List<Product> queryOne(String qd_num) {
		return productDao.queryOne("%"+qd_num+"%");
	}

}
