package entity;

import java.util.List;

/**
 * @param t_id 编号
 * @param t_type 分类依据
 * @param t_area 面积
 */
public class Type {
	
	private int t_id;
	private String t_name;
	private String t_area;
	private List<Product> products;
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_area() {
		return t_area;
	}
	public void setT_area(String t_area) {
		this.t_area = t_area;
	}
	public Type(int t_id, String t_name, String t_area) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_area = t_area;
	}
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type(String t_name, String t_area) {
		super();
		this.t_name = t_name;
		this.t_area = t_area;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Type [t_id=" + t_id + ", t_name=" + t_name + ", t_area="
				+ t_area + ", products=" + products + "]";
	}
	
	
}