package com.winter.app.product;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.Pager;

//annotation
@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	private ProductService productService;
	
	
	@GetMapping("add")
	public String setAdd()throws Exception{
		return "product/add";
	}
	
	@PostMapping("add")
	public String setAdd(ProductDTO productDTO, MultipartFile [] attachs)throws Exception{
		int result = productService.setAdd(productDTO, attachs);
		return "redirect:./list";
	}
	
	
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
