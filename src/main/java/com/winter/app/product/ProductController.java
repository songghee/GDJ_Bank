package com.winter.app.product;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/product/*")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	//list
	@RequestMapping(value="list", method=RequestMethod.GET)
	public ModelAndView list() throws Exception {
		ModelAndView mv = new ModelAndView();

		List<ProductDTO> ar = productService.getList();
		
		mv.addObject("list", ar);
		mv.setViewName("product/list");
		
		return mv;
	}
	
	@RequestMapping(value="detail", method=RequestMethod.GET)
	public void getDetail(ProductDTO productDTO) {
			
		}
	

}
