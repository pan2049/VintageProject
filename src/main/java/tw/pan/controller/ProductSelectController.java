package tw.pan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.pan.service.ProductService;

@Controller
public class ProductSelectController {

	@Autowired
	private ProductService pService;
	
	@PostMapping(value="/productSelectAll")
	public @ResponseBody String shopGridOnlond() throws Exception {
		return pService.getProductAll();
	}
}
