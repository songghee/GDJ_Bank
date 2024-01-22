package com.winter.app.product;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.Pager;

@Service
public class ProductService {
	@Autowired
	private ProductDAO productDAO;


	@Override
	public List<ProductDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		pager.makeRow();
		Long totalCount = productDAO.getTotalCount(pager);
		pager.makeNum(totalCount);
		
		return productDAO.getList(pager);
	}

	@Override
	public ProductDTO getDetail(ProductDTO productDTO) throws Exception {
		// TODO Auto-generated method stub
		return productDAO.getDetail(productDTO);
	}

	@Override
	public int setAdd(ProductDTO productDTO, MultipartFile [] attachs) throws Exception {
		int result= productDAO.setAdd(productDTO);
		
		return result;
	}

	@Override
	public int setUpdate(ProductDTO productDTO, MultipartFile [] attachs) throws Exception {
		// TODO Auto-generated method stub
		return productDAO.setUpdate(productDTO);
	}

	@Override
	public int setDelete(ProductDTO productDTO) throws Exception {

		return productDAO.setDelete(productDTO);
	}
	
	

}
