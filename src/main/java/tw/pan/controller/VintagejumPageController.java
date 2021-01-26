package tw.pan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VintagejumPageController {

	@GetMapping(value="/jumpIndex")
	public String goToIndex() {
		return "index";
	}
	
	@GetMapping(value="/jumpShopGrid")
	public String goToShopGrid() {
		return "shop-grid";
	}
	
	@GetMapping(value="/jumpShopDetails")
	public String goToShopDetail() {
		return "shop-details";
	}
	
	@GetMapping(value="/jumpShopingCart")
	public String goToShopingCart() {
		return "shoping-cart";
	}
}
