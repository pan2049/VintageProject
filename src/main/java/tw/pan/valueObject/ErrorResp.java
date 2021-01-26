package tw.pan.valueObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResp {

	@JsonProperty(value="ERROR_CODE")
	private String errorCode;
	
	@JsonProperty(value="MESSAGE")
	private String message;
}
