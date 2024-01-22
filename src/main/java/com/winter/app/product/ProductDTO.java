package com.winter.app.product;

import java.util.List;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;

public class ProductDTO extends BoardDTO {
	
	private Long productNum;
	private String productName;
	private String productContents;
	private Double prodcutRate;
	private Double productJumsu;
	private int ProductCount;
	private int ProductSale;
	public Long getProductNum() {
		return productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductContents() {
		return productContents;
	}
	public void setProductContents(String productContents) {
		this.productContents = productContents;
	}
	public Double getProdcutRate() {
		return prodcutRate;
	}
	public void setProdcutRate(Double prodcutRate) {
		this.prodcutRate = prodcutRate;
	}
	public Double getProductJumsu() {
		return productJumsu;
	}
	public void setProductJumsu(Double productJumsu) {
		this.productJumsu = productJumsu;
	}
	public int getProductCount() {
		return ProductCount;
	}
	public void setProductCount(int productCount) {
		ProductCount = productCount;
	}
	public int getProductSale() {
		return ProductSale;
	}
	public void setProductSale(int productSale) {
		ProductSale = productSale;
	}




	

}
