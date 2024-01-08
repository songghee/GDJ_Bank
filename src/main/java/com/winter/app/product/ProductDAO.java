package com.winter.app.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.DBConnector;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace="com.winter.app.product.ProductDAO.";
	
	public int delete(ProductDTO productDTO) throws Exception{
		return sqlSession.delete(namespace+"delete", productDTO);
	}
	
	public int update(ProductDTO productDTO) throws Exception {
		return sqlSession.update(namespace+"update", productDTO);
	
}
	
	public int add(ProductDTO productDTO)throws Exception{
		return sqlSession.insert(namespace+"add", productDTO);
	}
	
	public ProductDTO getDetail(ProductDTO productDTO)throws Exception{
		return sqlSession.selectOne(namespace+"getDetail", productDTO);
	}		

	public List<ProductDTO> getList()throws Exception{
		return sqlSession.selectList(namespace+"getList");
	}
}