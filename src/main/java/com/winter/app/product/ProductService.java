package com.winter.app.product;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.util.Pager;

@Service
public class ProductService {
	@Autowired
	private ProductDAO productDAO;

	public List<ProductDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		pager.makeRow();
		Long totalCount = productDAO.getTotal(pager);
		pager.makeNum(totalCount);
		
		return productDAO.getList(pager);
	}

	public ProductDTO getDetail(ProductDTO productDTO) throws Exception {
		// TODO Auto-generated method stub
		return productDAO.getDetail(productDTO);
	}


}
