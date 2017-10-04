import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author RahulReddy
 *
 */
public class ResponseParameters {
	
	private String status;
	private Map<String,String> responseHeaders;
	private String responseData;
	
	public ResponseParameters() {
		responseHeaders =  new HashMap<String,String>();
		this.responseData = "";
		this.status = "";
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String temp) {
		this.status = temp;
	}

	public Map<String, String> getResponseHeaders() {
		return responseHeaders;
	}
	
	public void addHeaderItem(String key, String val){
		this.responseHeaders.put(key, val);
	}

	public void setResponseHeaders(Map<String, String> responseHeaders) {
		this.responseHeaders = responseHeaders;
	}

	public String getResponseData() {
		return responseData;
	}

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}

	public void appendRespondData(String appendString){
		this.responseData += (appendString+'\n');
	}
}
