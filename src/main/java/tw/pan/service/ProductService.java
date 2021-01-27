package tw.pan.service;

import java.util.List;

import tw.pan.valueObject.ProductReq;
import tw.pan.valueObject.ProductResp;

public interface ProductService {

	public String getProductAll() throws Exception;
	
	public String getProductByMain(String p_main) throws Exception;
	
	public String getProductByMainAndDetail(String p_main,String p_detail) throws Exception;
	
	public String getProductByName(String p_name) throws Exception;
}
