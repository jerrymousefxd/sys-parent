package com.eaju.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

public class HttpXmlClient {

	Log log = LogFactory.getLog(HttpXmlClient.class);
	
	public final static String APPLICATION_PROTOBUF = "application/x-protobuf;charset=UTF-8";
    public final static String APPLICATION_JSON="application/json;charset=UTF-8";
    public final static String APPLICATION_XML="application/xml;charset=UTF-8";
    public final static String TEXT_PLAIN="text/plain;charset=UTF-8";
	
	@SuppressWarnings("deprecation")
	public static String put(String url, Map<String, String> params,String accept) {
		DefaultHttpClient httpclient = new DefaultHttpClient();
		String body = null;
		HttpPut put = putForm(url, params);
		put.setHeader("Accept", accept);
		body = invoke(httpclient, put);
		httpclient.getConnectionManager().shutdown();

		return body;
	}

	@SuppressWarnings("deprecation")
	public static String patch(String url, Map<String, String> params,String accept) {
		DefaultHttpClient httpclient = new DefaultHttpClient();
		String body = null;

		HttpPatch patch = patchForm(url, params);
		patch.setHeader("Accept", accept);
		body = invoke(httpclient, patch);

		httpclient.getConnectionManager().shutdown();

		return body;
	}
	@SuppressWarnings("deprecation")
	public static String post(String url, Map<String, String> params,String accept) {
		DefaultHttpClient httpclient = new DefaultHttpClient();
		String body = null;

		HttpPost post = postForm(url, params);
		post.setHeader("Accept", accept);
		body = invoke(httpclient, post);

		httpclient.getConnectionManager().shutdown();

		return body;
	}
	@SuppressWarnings("deprecation")
	public static String delete(String url,String accept) {
		DefaultHttpClient httpclient = new DefaultHttpClient();
		String body = null;

		HttpDelete delete = new HttpDelete(url);
		delete.setHeader("Accept", accept);
		body = invoke(httpclient,delete);

		httpclient.getConnectionManager().shutdown();

		return body;
	}
	
	@SuppressWarnings("deprecation")
	public static String post(String url, Map<String, String> params) {
		DefaultHttpClient httpclient = new DefaultHttpClient();
		String body = null;

		HttpPost post = postForm(url, params);
		body = invoke(httpclient, post);

		httpclient.getConnectionManager().shutdown();

		return body;
	}

	@SuppressWarnings("deprecation")
	public static String get(String url,String accept) {
		DefaultHttpClient httpclient = new DefaultHttpClient();
		String body = null;

		HttpGet get = new HttpGet(url);
		get.setHeader("Accept", accept);
		body = invoke(httpclient, get);

		httpclient.getConnectionManager().shutdown();

		return body;
	}

	@SuppressWarnings("deprecation")
	private static String invoke(DefaultHttpClient httpclient,
			HttpUriRequest httpost) {

		HttpResponse response = sendRequest(httpclient, httpost);
		String body = paseResponse(response);

		return body;
	}

	@SuppressWarnings("deprecation")
	private static String paseResponse(HttpResponse response) {
		HttpEntity entity = response.getEntity();

		String charset = EntityUtils.getContentCharSet(entity);

		String body = null;
		try {
			body = EntityUtils.toString(entity);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return body;
	}

	@SuppressWarnings("deprecation")
	private static HttpResponse sendRequest(DefaultHttpClient httpclient,
			HttpUriRequest httpost) {
		HttpResponse response = null;

		try {
			response = httpclient.execute(httpost);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	@SuppressWarnings("deprecation")
	private static HttpPost postForm(String url, Map<String, String> params) {

		HttpPost httpost = new HttpPost(url);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();

		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			nvps.add(new BasicNameValuePair(key, params.get(key)));
		}

		try {
			httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return httpost;
	}

	@SuppressWarnings("deprecation")
	private static HttpPut putForm(String url, Map<String, String> params) {
		HttpPut httpPut = new HttpPut(url);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();

		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			nvps.add(new BasicNameValuePair(key, params.get(key)));
		}

		try {
			httpPut.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return httpPut;
	}
	@SuppressWarnings("deprecation")
	private static HttpPatch patchForm(String url, Map<String, String> params) {
		HttpPatch httpPatch = new HttpPatch(url);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();

		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			nvps.add(new BasicNameValuePair(key, params.get(key)));
		}

		try {
			httpPatch.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return httpPatch;
	}
	public static void main(String[] args) {
		//http://192.16.8.182:8077/eaju_app_service/tmsApp/appGetReceiptDetail
		String post = HttpXmlClient.post("http://192.16.8.228:8081/eaju_app_service/merchant/receiveMerchantOrder", new HashMap());
		System.out.println(post);
	}
}
