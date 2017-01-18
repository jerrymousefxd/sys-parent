package com.eaju.facadeImpl;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eaju.entity.VoiceCall;
import com.eaju.facade.IVoiceCallRest;
import com.eaju.pojo.PageBean;
import com.eaju.service.VoiceCallService;
import com.eaju.util.ResourcesUtil;
import com.eaju.util.VoiceCallConsants;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import EcpOpen.Model.SimpleReference;
import EcpOpen.constant.Constants;
import EcpOpen.http.Extend.VCSM.makeCall;

@Service("voiceCallRest")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = com.eaju.facade.IVoiceCallRest.class, protocol = { "rest",
		"dubbo" }, retries = 0)
public class VoiceCallRest implements IVoiceCallRest {

	@Autowired
	private VoiceCallService voiceCallService;
	private final static Logger logger = LoggerFactory.getLogger(VoiceCallRest.class);

	public String getAllOrderByPage(VoiceCall vc) {
		PageBean<Object> pb = new PageBean<Object>();
		Gson g = new GsonBuilder().setExclusionStrategies(new MyExclusionStrategy()).create();
		int insert = voiceCallService.insert(vc);
		if (insert!=0) {
			logger.info(vc.getPhonenumberfrom() + " " + vc.getPhonenumberto());
			Constants.extendUrl = ResourcesUtil.getValue("http", "extendUrl");
			Constants.spid = ResourcesUtil.getValue("http", "spid");
			Constants.serviceKey = ResourcesUtil.getValue("http", "serviceKey");
			Constants.appid = ResourcesUtil.getValue("http", "appid");
			Constants.appkey = ResourcesUtil.getValue("http", "appkey");
			Constants.type = ResourcesUtil.getValue("http", "type");
			SimpleReference simpleRef = new SimpleReference();
			simpleRef.setEndpoint("http://218.104.170.69:8080/sms/recv");
			simpleRef.setInterfaceName("notifySmsDeliveryStatus");
			simpleRef.setCorrelator("hello world");
			// 实例化sendSms接口类
			makeCall makeCallExam = new makeCall();
			String[] status = null;

			try {
				makeCallExam.init();
				// 添加必要参数，详见各接口API文档
				makeCallExam.setAccount(ResourcesUtil.getValue("http", "account"));
				// 发起
				makeCallExam.setCallingParty(vc.getPhonenumberfrom());
				// 被叫
				makeCallExam.setCalledParty(vc.getPhonenumberto());
				makeCallExam.setStatusRequest(simpleRef);
				String response = makeCallExam.invokeClient(true);
				logger.info(response);
				status = getStatusFromXmlString(response);
				voiceCallService.update(insert, status[1]);
				pb.setReturnCode(status[0]);
				pb.setInfo(VoiceCallConsants.getValueByCode(status[0]));

				// ----------------------------------
				// callTransferToConference calltranExample=new
				// callTransferToConference();
				// calltranExample.init();
				// calltranExample.setAccount("sip:"+ResourcesUtil.getValue("http",
				// "account")+"@ecplive.com");
				// //设置账号,此处账号为格式为sip:xxxxxx@ecplive.com,与上面的makecall账号需一致
				// calltranExample.setCallIdentifier("20170111161040133136779");
				// //获取通话id（同步返回）status[1]
				// calltranExample.setMaxDuration("4000"); //此处不能为空，0为不限制
				// calltranExample.setMaxParticipants("10");
				// calltranExample.setParticipantsPhoneID("11604541,11522438");
				// //从接口[endpoint]日志获取，主被叫号码的phoneID，非电话号码
				// calltranExample.setPrompted("0");
				// calltranExample.setRecorded("1");
				// calltranExample.setVoiceFile("");
				// calltranExample.setStatusRequest(simpleRef);
				// String response1 = calltranExample.invokeClient(true);
				// System.out.println(response1);
				// ----------------------------------
				// VoiceCallConsants
			} catch (Exception e) {
				logger.info(e.getMessage());
				pb.setReturnCode("500");
				pb.setInfo("服务器异常");
			}
		} else {
			pb.setReturnCode("100");
			pb.setInfo("参数不正确");
		}
		return g.toJson(pb);
	}

	public static void main(String[] args) {
		// 设置Constants中的常量值，web工程中应保证这些值能持久化
		Constants.extendUrl = ResourcesUtil.getValue("http", "extendUrl");
		Constants.spid = ResourcesUtil.getValue("http", "spid");
		Constants.serviceKey = ResourcesUtil.getValue("http", "serviceKey");
		Constants.appid = ResourcesUtil.getValue("http", "appid");
		Constants.appkey = ResourcesUtil.getValue("http", "appkey");
		Constants.type = ResourcesUtil.getValue("http", "type");
		SimpleReference simpleRef = new SimpleReference();
		simpleRef.setEndpoint("http://218.104.170.69:8080/sms/recv");
		simpleRef.setInterfaceName("notifySmsDeliveryStatus");
		simpleRef.setCorrelator("hello world");

		// 实例化sendSms接口类
		makeCall makeCallExam = new makeCall();
		try {
			makeCallExam.init();
			// 添加必要参数，详见各接口API文档
			makeCallExam.setAccount("057181930209");
			// 发起
			makeCallExam.setCallingParty("18663555637");
			// 被叫
			makeCallExam.setCalledParty("18510906497");
			makeCallExam.setStatusRequest(simpleRef);
			String response = makeCallExam.invokeClient(true);
			System.out.println(response);
			String[] status = getStatusFromXmlString(response);
			// ----------------------------------
			// callTransferToConference calltranExample=new
			// callTransferToConference();
			// calltranExample.init();
			// calltranExample.setAccount("sip:"+ResourcesUtil.getValue("http",
			// "account")+"@ecplive.com");
			// //设置账号,此处账号为格式为sip:xxxxxx@ecplive.com,与上面的makecall账号需一致
			// calltranExample.setCallIdentifier(status[1]);
			// //获取通话id（同步返回）status[1]
			// calltranExample.setMaxDuration("0"); //此处不能为空，0为不限制
			// calltranExample.setMaxParticipants("10");
			// calltranExample.setParticipantsPhoneID("15732670,15757071");
			// //从接口[endpoint]日志获取，主被叫号码的phoneID，非电话号码
			// calltranExample.setPrompted("0");
			// calltranExample.setRecorded("1");
			// calltranExample.setVoiceFile("");
			// calltranExample.setStatusRequest(simpleRef);
			// String response1 = calltranExample.invokeClient(true);
			// System.out.println(response1);
			// ----------------------------------
		} catch (Exception e) {
			e.printStackTrace();
		}
		// String valueByCode = VoiceCallConsants.getValueByCode("1100");
		// System.out.println(valueByCode);
		// sendSms sendSmsExam = new sendSms();
		// try {
		// sendSmsExam.init();
		// // 添加必要参数，详见各接口API文档
		// sendSmsExam.setAccount("057181930209");// 05723333333
		// sendSmsExam.setDestinationAddresses("1863555637");
		// sendSmsExam.setMessage("test123");
		// // sendSmsExam.setTimer(t);
		// sendSmsExam.setReceiptRequest(simpleRef);
		// // 调用invokeClient方法发起调用请求
		// String response = sendSmsExam.invokeClient(true);
		// System.out.println(response);
		// String status = getStatusFromXmlString(response);
		// System.out.println(status);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
	}

	private static String[] getStatusFromXmlString(String response) throws DocumentException {
		Document document = DocumentHelper.parseText(response);
		// XML转字符串
		Element element = document.getRootElement();
		List<Element> elements = element.elements();
		String[] aa = new String[2];
		for (Element element1 : elements) {
			if ("result".equals(element1.getName())) {
				aa[0] = element1.getText();
			}
			if ("CallIdentifier".equals(element1.getName())) {
				aa[1] = element1.getText();
			}
		}
		return aa;
	}

	private class MyExclusionStrategy implements ExclusionStrategy {

		@Override
		public boolean shouldSkipField(FieldAttributes f) {
			// TODO Auto-generated method stub
			return f.getName().equals("currentPage") || f.getName().equals("pageSize")
					|| f.getName().equals("recordCount") || f.getName().equals("pageCount")
					|| f.getName().equals("beginPageIndex") || f.getName().equals("endPageIndex");
		}

		@Override
		public boolean shouldSkipClass(Class<?> clazz) {
			// TODO Auto-generated method stub
			return false;
		}

	}
}
