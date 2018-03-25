package controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Product;
import entity.Type;
import service.ProductService;
import service.TypeService;

@Controller
@RequestMapping("/product")	
public class ProductController {
	private ProductService productService;
	private TypeService typeService;
	
	public TypeService getTypeService() {
		return typeService;
	}
	@Resource
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	public ProductService getProductService() {
		return productService;
	}
	@Resource
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	
	/**
	 * 跳到产品界面
	 * @return
	 */
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String toProducts() {
		return "product";
	}
	
	/**
	 * 得到所有分类
	 * @return
	 */
	@RequestMapping(value="/getAllType",method=RequestMethod.POST)
	public @ResponseBody List<Type> getAllType(){
		return typeService.findAll();
	}
	
	/**
	 * 得到某个分类的所有产品
	 * @param t_id 分类编号
	 * @return
	 */
	@RequestMapping(value="{t_id}/getProducts",method=RequestMethod.POST)
	public @ResponseBody List<Product> getProducts(@PathVariable int t_id){
		return productService.queryList(t_id);
	}
	
	/**
	 * 模糊查询单个产品
	 * @param qd_num 产品名称
	 * @return
	 */
	@RequestMapping(value="{qd_num}/queryOne",method=RequestMethod.POST)
	public @ResponseBody List<Product> queryOne(@PathVariable String qd_num){
		return productService.queryOne(qd_num);
	}
	
	
}
