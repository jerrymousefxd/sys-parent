package com.eaju.service.job;

import java.io.IOException;
import java.io.Serializable;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.eaju.util.AesEncrypt;
import com.eaju.util.BaseResponse;
import com.eaju.util.DateUtils;
import com.eaju.util.En_decrypt;
import com.eaju.util.HttpXmlClient;
import com.eaju.util.ResourcesUtil;
import com.google.gson.Gson;

public class QuartzJM implements Serializable{
	
	private static final long serialVersionUID = -7082956986101973473L;
	
	private static final Logger logger = Logger.getLogger(QuartzJM.class);
	
	public void work(){
		try {
			logger.info("拉取九牧訂單,当前时间是【"+DateUtils.getCurrentStrDateBySpecifiedFormatType("yyyy-MM-dd HH:mm:ss")+"】");
			StringBuilder sb=new StringBuilder(ResourcesUtil.getValue("http", "JMUrl"));
			sb.append("type=").append(ResourcesUtil.getValue("http", "type")).append("&");
			sb.append("key=").append(ResourcesUtil.getValue("http", "key")).append("&");
			sb.append("path=").append(ResourcesUtil.getValue("http", "path")).append("&");
			sb.append("startdate=").append(getCurrentDate()).append("&");
			sb.append("_search=").append(ResourcesUtil.getValue("http", "_search")).append("&");
			sb.append("rows=").append(ResourcesUtil.getValue("http", "rows")).append("&");
			sb.append("sord=").append(ResourcesUtil.getValue("http", "sord"));
			String post= sendGetRequest(sb.toString(),null);
			Map<String, String> params =new HashMap<String,String>();
			params.put("businessKey", ResourcesUtil.getValue("http", "businessKey"));
			params.put("merchantType", ResourcesUtil.getValue("http", "merchantType"));
			params.put("textContent", AesEncrypt.parseByte2HexStr(AesEncrypt.encrypt(post, ResourcesUtil.getValue("http", "des"))));
			params.put("token", ResourcesUtil.getValue("http", "token"));
			params.put("orderType", ResourcesUtil.getValue("http", "orderType"));
			String post2 = HttpXmlClient.post(ResourcesUtil.getValue("http", "BWUrl"), params);
			Gson gson = new Gson();
			BaseResponse fromJson = gson.fromJson(post2, BaseResponse.class);
			logger.info(fromJson);
			if(200!=fromJson.getReturnCode()){
				throw new Exception("报文插入失败！！！");
			}
			logger.info("拉取九牧訂單成功,当前时间是【"+DateUtils.getCurrentStrDateBySpecifiedFormatType("yyyy-MM-dd HH:mm:ss")+"】");
		} catch (Exception e) {
			logger.info("拉取九牧訂單失敗,当前时间是【"+DateUtils.getCurrentStrDateBySpecifiedFormatType("yyyy-MM-dd HH:mm:ss")+"】"+"拉取九牧訂單失敗原因："+e.getMessage());
		}
	}
	/**
	 * 获取当前日期
	 * @return
	 */
	private static String getCurrentDate() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//return sdf.format(new Date(System.currentTimeMillis()));
		return "2016-11-20";
	}
	 private static String sendGetRequest(String reqURL, String decodeCharset){  
	        String responseContent = null; //响应内容  
	        HttpClient httpClient = new DefaultHttpClient(); //创建默认的httpClient实例  
	        HttpGet httpGet = new HttpGet(reqURL);           //创建org.apache.http.client.methods.HttpGet  
	        try{  
	            HttpResponse response = httpClient.execute(httpGet); //执行GET请求  
	            HttpEntity entity = response.getEntity();            //获取响应实体  
	            if(null != entity){  
	                responseContent = EntityUtils.toString(entity, decodeCharset==null ? "UTF-8" : decodeCharset);  
	                EntityUtils.consume(entity); //Consume response content  
	            }  
	        }catch(Exception e){  
	            logger.info("请求异常", e);  
	            throw new RuntimeException(e);
	        }finally{  
	            httpClient.getConnectionManager().shutdown(); //关闭连接,释放资源  
	        }  
	        return responseContent;  
	    }  
}
