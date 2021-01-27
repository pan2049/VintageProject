package tw.pan.service;

import tw.pan.valueObject.ProductReq;
import tw.pan.valueObject.ProductResp;

public interface ProductService {

	public String getProductAll() throws Exception;
	
	public String getProductByMain(ProductReq req) throws Exception;
	
	public String getProductByMainAndDetail(String p_main,String p_detail) throws Exception;
	
	public String getProductByName(String p_name) throws Exception;
}
