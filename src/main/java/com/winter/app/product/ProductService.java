package com.winter.app.product;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//DAO 보내기 전에 전처리, 후처리
@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	//insert
	public int add(ProductDTO productDTO)throws Exception{
		
		return productDAO.add(productDTO);
	}
	
	//list
	public List<ProductDTO> getList(Pager pager)throws Exception{
		pager.makeRow();
		List<ProductDTO> ar = this.productDAO.getList(pager);
		
		return ar;
		
	}
	
//	//delete
//	public int delete(ProductDTO productDTO)throws Exception{
//		return productDAO.delete(productDTO);
//	}
//	
//	//update
//	public int update(ProductDTO productDTO)throws Exception{
//		return productDAO.update(productDTO);
//	}
//	
//	
//	//detail
//	public ProductDTO getDetail (ProductDTO productDTO)throws Exception{
//		return productDAO.getDetail(productDTO);
//	}
//	

}
