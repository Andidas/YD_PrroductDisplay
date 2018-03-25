package entity;



/**
 * @param qd_id 编号
 * @param qd_t_id 外键type-id
 * @param qd_name 名称 
 * @param qd_num 产品编号
 * @param qd_color 色号
 * @param qd_price 价格
 * @param qd_inventory 库存
 * @param qd_sales 销量
 * @param qd_img 照片
 */

public class Product {
	
	private int qd_id;
	public Product(int qd_id, int qd_t_id, String qd_name, String qd_num,
			String qd_color, double qd_price, int qd_inventory, int qd_sales) {
		super();
		this.qd_id = qd_id;
		this.qd_t_id = qd_t_id;
		this.qd_name = qd_name;
		this.qd_num = qd_num;
		this.qd_color = qd_color;
		this.qd_price = qd_price;
		this.qd_inventory = qd_inventory;
		this.qd_sales = qd_sales;
	}

	private int qd_t_id;
	private String qd_name;
	private String qd_num;
	private String qd_color;
	private double qd_price;
	private int qd_inventory;
	private int qd_sales;
	private String qd_img;
	
	
	public Product(int qd_t_id, String qd_name, String qd_num, String qd_color,
			double qd_price, int qd_inventory, int qd_sales) {
		super();
		this.qd_t_id = qd_t_id;
		this.qd_name = qd_name;
		this.qd_num = qd_num;
		this.qd_color = qd_color;
		this.qd_price = qd_price;
		this.qd_inventory = qd_inventory;
		this.qd_sales = qd_sales;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getQd_num() {
		return qd_num;
	}
	public void setQd_num(String qd_num) {
		this.qd_num = qd_num;
	}
	
	public int getQd_id() {
		return qd_id;
	}
	public void setQd_id(int qd_id) {
		this.qd_id = qd_id;
	}
	public String getQd_name() {
		return qd_name;
	}
	public void setQd_name(String qd_name) {
		this.qd_name = qd_name;
	}
	public String getQd_color() {
		return qd_color;
	}
	public void setQd_color(String qd_color) {
		this.qd_color = qd_color;
	}
	public double getQd_price() {
		return qd_price;
	}
	public void setQd_price(double qd_price) {
		this.qd_price = qd_price;
	}
	public int getQd_inventory() {
		return qd_inventory;
	}
	public void setQd_inventory(int qd_inventory) {
		this.qd_inventory = qd_inventory;
	}
	public int getQd_sales() {
		return qd_sales;
	}
	public void setQd_sales(int qd_sales) {
		this.qd_sales = qd_sales;
	}


	public int getQd_t_id() {
		return qd_t_id;
	}
	public void setQd_t_id(int qd_t_id) {
		this.qd_t_id = qd_t_id;
	}
	@Override
	public String toString() {
		return "Product [qd_id=" + qd_id + ", qd_t_id=" + qd_t_id
				+ ", qd_name=" + qd_name + ", qd_num=" + qd_num + ", qd_color="
				+ qd_color + ", qd_price=" + qd_price + ", qd_inventory="
				+ qd_inventory + ", qd_sales=" + qd_sales + ", qd_img="
				+ qd_img + "]";
	}
	public String getQd_img() {
		return qd_img;
	}
	public void setQd_img(String qd_img) {
		this.qd_img = qd_img;
	}
	public Product(int qd_id, int qd_t_id, String qd_name, String qd_num,
			String qd_color, double qd_price, int qd_inventory, int qd_sales,
			String qd_img) {
		super();
		this.qd_id = qd_id;
		this.qd_t_id = qd_t_id;
		this.qd_name = qd_name;
		this.qd_num = qd_num;
		this.qd_color = qd_color;
		this.qd_price = qd_price;
		this.qd_inventory = qd_inventory;
		this.qd_sales = qd_sales;
		this.qd_img = qd_img;
	}
	
	
	}
