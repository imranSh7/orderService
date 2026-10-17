package in.order.imran.model;

public class OrderRequest {

	private String customerName;

	private String productName;

	private Integer quantity;

	private Double price;

	public OrderRequest(String customerName, String productName, Integer quantity, Double price) {
		super();
		this.customerName = customerName;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public OrderRequest() {
		super();
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
