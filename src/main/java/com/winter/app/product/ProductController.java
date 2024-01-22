package com.winter.app.product;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.util.Pager;

//annotation
@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	private ProductService productService;
	
	
	@GetMapping("detail")
	public String getDetail(ProductDTO productDTO, Model model)throws Exception{
		productDTO = productService.getDetail(productDTO);
		model.addAttribute("productDTO", productDTO);
		return "product/detail";
	}
	
	@GetMapping("list")
	public String getList(Pager pager, Model model)throws Exception{
		
		List<ProductDTO> ar =productService.getList(pager);

		model.addAttribute("list", ar);
		model.addAttribute("pager", pager);
		
		return "product/list";

}
}
