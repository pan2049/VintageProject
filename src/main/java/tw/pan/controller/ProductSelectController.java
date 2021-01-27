package tw.pan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;

import tw.pan.model.Product;
import tw.pan.service.ProductService;
import tw.pan.valueObject.ProductReq;
import tw.pan.valueObject.ProductResp;

@Controller
public class ProductSelectController {

	@Autowired
	private ProductService pService;
	
	@PostMapping(value="/productSelectAll")
	public @ResponseBody String shopGridOnlond() throws Exception {
		return pService.getProductAll();
	}
	
	@PostMapping(value="/productSelectByMain")
	@ResponseBody
	public String shopGridSelectByMain(@RequestBody ProductResp Main) throws Exception {
		String main = Main.getP_main();
		return pService.getProductByMain(main); 
	}
}
