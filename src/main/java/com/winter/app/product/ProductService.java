package com.winter.app.product;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//DAO 보내기 전에 전처리, 후처리
@Service
public class ProductService {
	
	@Autowired
	private ProductService productDAO;
	
	//delete
	public int delete(ProductDTO productDTO)throws Exception{
		return productDAO.delete(productDTO);
	}
	
	//update
	public int update(ProductDTO productDTO)throws Exception{
		return productDAO.update(productDTO);
	}
	
	//insert
	public int add(ProductDAO productDTO)throws Exception{
		return productDAO.add(productDTO);
	}
	
	//detail
	public ProductDTO getDetail (ProductDTO productDTO)throws Exception{
		return productDAO.getDetail(productDTO);
	}
	
	//list
	public List<ProductDTO> getList()throws Exception{
		List<ProductDTO> ar = this.productDAO.getList();
		
		return ar;
		
	}

}
