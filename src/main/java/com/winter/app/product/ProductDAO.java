package com.winter.app.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.pager;



@Repository
public class ProductDAO {

	
	@Autowired
	private SqlSession Session;
	private final String namespace="com.winter.app.product.ProductDAO.";
	
	public int add(ProductDTO productDTO)throws Exception{
		return Session.insert(namespace+"add", productDTO);
	}
	
	public List<ProductDTO> getList(Pager pager)throws Exception{
		return Session.selectList(namespace+"getList", pager);
	}
//	
//	public int delete(ProductDTO productDTO) throws Exception{
//		return Session.delete(namespace+"delete", productDTO);
//	}
//	
//	public int update(ProductDTO productDTO) throws Exception {
//		return Session.update(namespace+"update", productDTO);
//	
//}
//	
//	
//	public ProductDTO getDetail(ProductDTO productDTO)throws Exception{
//		return Session.selectOne(namespace+"getDetail", productDTO);
//	}		
//
}