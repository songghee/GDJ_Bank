package com.winter.app.product;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.winter.app.util.pager;


@Controller
@RequestMapping("/product/*")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	//list
	@RequestMapping(value="list", method=RequestMethod.GET)
	public void getList(Pager pager, Model model) throws Exception {
		List<ProductDTO> ar = productService.getList(pager);
		model.addAttribute("list",ar);
		
	}
	
//	@RequestMapping(value="detail", method=RequestMethod.GET)
//	public void getDetail(ProductDTO productDTO) {
//			
//		}
	

}
