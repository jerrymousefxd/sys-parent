package com.eaju.facadeImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Path;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.eaju.facade.IVoiceCallRest;
import com.eaju.pojo.PageBean;
import com.eaju.pojo.VoiceCall;
import com.eaju.util.ResourcesUtil;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import EcpOpen.Model.NotifyCallInformation;
import EcpOpen.Model.SimpleReference;
import EcpOpen.Model.Sms;
import EcpOpen.constant.Constants;
import EcpOpen.http.Extend.MCSM.MessageAnalyzer;
import EcpOpen.http.Extend.MCSM.MessageHandler;
import EcpOpen.http.Extend.VCSM.callTransferToConference;
import EcpOpen.http.Extend.VCSM.makeCall;

public class VoiceCallRestServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader= req.getReader();
		StringBuilder sb= new StringBuilder();
		String line= null;
		while((line=reader.readLine())!=null){
			sb.append(line);
		}
		System.out.println("accept: "+sb.toString());
		MessageAnalyzer analyzer=new MessageAnalyzer(new MessageHandler(){
			/**
			 * 处理收到呼叫状态通知的回调方法
			 */
			@Override
			public void onRecvNotifyCallInformation(
					NotifyCallInformation information) {
				System.out.println("收到呼叫状态消息:");
				System.out.println("呼叫标识："+information.getCallIdentifier());
				System.out.println("电话号码："+information.getPhone());
				System.out.println("呼叫状态："+information.getCallStatus().toString());
				System.out.println();
				// TODO 
				if("ONLINE".equals(information.getCallStatus().toString())){
					System.out.println(information.getCallIdentifier());
					System.out.println(information.getPhoneID());
				}
				
			}
			/**
			 * 重写其它事件的处理方法
			 */
		});
		analyzer.analyze(sb.toString());
	}
}
