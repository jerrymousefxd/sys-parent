package com.eaju.util;

import java.lang.reflect.Field;

public class VoiceCallConsants {
	public static final String code1100 = "1100";
	public static final String info1100 = "调用成功";
	public static final String code0010 = "0010";
	public static final String info0010 = "SessionToken不存在或者已失效,请重新发送请求";
	public static final String code0011 = "0011";
	public static final String info0011 = "信息发送过程可能被改动";
	public static final String code0012 = "0012";
	public static final String info0012 = "字节数值的格式不正确";
	public static final String code0013 = "0013";
	public static final String info0013 = "信息参数xml为空";
	public static final String code0014 = "0014";
	public static final String info0014 = "信息内容无法转换为xml格式";
	public static final String code0015 = "0015";
	public static final String info0015 = "SPID ServiceKey AppID AppKey可能不正确";
	public static final String code0016 = "0016";
	public static final String info0016 = "非法的appID";
	public static final String code0017 = "0017";
	public static final String info0017 = "AppCode解密信息失败";
	public static final String code0018 = "0018";
	public static final String info0018 = "SiCode解密信息失败";
	public static final String code0019 = "0019";
	public static final String info0019 = "鉴权过程出现异常";
	public static final String code0020 = "0020";
	public static final String info0020 = "AppCode验证失败";
	public static final String code0021 = "0021";
	public static final String info0021 = "SI身份验证失败或者SI没有该应用";
	public static final String code0022 = "0022";
	public static final String info0022 = "IP地址不合法";
	public static final String code0023 = "0023";
	public static final String info0023 = "信息内容不能为空";
	public static final String code0024 = "0024";
	public static final String info0024 = "时间戳格式不正确";
	public static final String code0025 = "0025";
	public static final String info0025 = "使用的方法名无效";
	public static final String code0026 = "0026";
	public static final String info0026 = "缺少必要参数";
	public static final String code0027 = "0027";
	public static final String info0027 = "userName格式不正确";
	public static final String code0028 = "0028";
	public static final String info0028 = "account中存在非法字符";
	public static final String code0029 = "0029";
	public static final String info0029 = "phone中存在非法字符";
	public static final String code0030 = "0030";
	public static final String info0030 = "phones个数要多于1个,少于12个";
	public static final String code0031 = "0031";
	public static final String info0031 = "调用服务失败";
	public static final String code0032 = "0032";
	public static final String info0032 = "该企业未开通该能力";
	public static final String code1103 = "1103";
	public static final String info1103 = "内部出错";
	public static final String code1120 = "1120";
	public static final String info1120 = "用户不存在";
	public static final String code1121 = "1121";
	public static final String info1121 = "修改密码接口：输入参数错误 或 重置密码接口：用户不存在";
	public static final String code1122 = "1122";
	public static final String info1122 = "用户不存在";
	public static final String code1123 = "1123";
	public static final String info1123 = "原始密码错误";
	public static final String code1124 = "1122";
	public static final String info1124 = "已经是翼聊好友。";
	public static final String code2010 = "2010";
	public static final String info2010 = "时间戳格式不正确";
	public static final String code2011 = "2011";
	public static final String info2011 = "时间戳已过期";
	public static final String code2012 = "2012";
	public static final String info2012 = "解密信息失败";
	public static final String code2013 = "2013";
	public static final String info2013 = "accesstoken不存在";
	public static final String code2014 = "2014";
	public static final String info2014 = "时间格式错误";
	public static final String code2015 = "2015";
	public static final String info2015 = "accesstoken失效";
	public static final String code2016 = "2016";
	public static final String info2016 = "accesstoken与app不匹配";
	public static final String code2017 = "2017";
	public static final String info2017 = "应用当前为禁用状态";
	public static final String code2018 = "2018";
	public static final String info2018 = "SessionToken信息有误";
	public static final String code2019 = "2019";
	public static final String info2019 = "超过流量";
	public static final String code2020 = "2020";
	public static final String info2020 = "缺少必要参数";
	public static final String code2021 = "2021";
	public static final String info2021 = "解析多结果出错";
	public static final String code2022 = "2022";
	public static final String info2022 = "Endpoint异常";
	public static final String code2023 = "2023";
	public static final String info2023 = "其它异常";
	public static final String code2024 = "2024";
	public static final String info2024 = "不存在该接口";
	public static final String code2025 = "2025";
	public static final String info2025 = "鉴权异常";
	public static final String code2026 = "2026";
	public static final String info2026 = "用户类型鉴权失败";
	public static final String code2027 = "2027";
	public static final String info2027 = "企业归属鉴权失败（ECP业务号码的企业ID不正确），如果调用接口出现此问题，请到所指连接处去查询该Ecp号码的企业ID。";
	public static final String code2028 = "2028";
	public static final String info2028 = "业务号码和账号都为空";
	public static final String code2029 = "2029";
	public static final String info2029 = "该帐号没有对应的通讯权限，如电话、短信、电话会议。";
	public static final String code3010 = "3010";
	public static final String info3010 = "sessiontoken参数为空";
	public static final String code3011 = "3011";
	public static final String info3011 = "timestamp参数为空";
	public static final String code3012 = "3012";
	public static final String info3012 = "sign参数为空";
	public static final String code3013 = "3013";
	public static final String info3013 = "account参数为空";
	public static final String code3014 = "3014";
	public static final String info3014 = "appid参数为空";
	public static final String code3015 = "3015";
	public static final String info3015 = "timestamp参数为空";
	public static final String code3016 = "3016";
	public static final String info3016 = "sign参数为空";
	public static final String code3017 = "3017";
	public static final String info3017 = "conferenceIdentifier参数为空";
	public static final String code3018 = "3018";
	public static final String info3018 = "participants参数为空";
	public static final String code3019 = "3019";
	public static final String info3019 = "calledparty参数为空";
	public static final String code3020 = "3020";
	public static final String info3020 = "address参数为空";
	public static final String code3021 = "3021";
	public static final String info3021 = "message参数为空";
	public static final String code3022 = "3022";
	public static final String info3022 = "URL格式不正确";
	public static final String code3023 = "3023";
	public static final String info3023 = "安全校验未通过（hashcode错误）";
	public static final String code90001 = "90001";
	public static final String info90001 = "业务错误";
	public static final String code90002 = "90002";
	public static final String info90002 = "不合法的输入值";
	public static final String code90003 = "90003";
	public static final String info90003 = "不合法的输入值包含部分合法值";
	public static final String code90004 = "90004";
	public static final String info90004 = "不合法地址";
	public static final String code90302 = "90302";
	public static final String info90302 = "会议人数不能超过25个";
	public static final String code90902 = "90902";
	public static final String info90902 = "因内容过滤，被拒绝";
	public static final String code90904 = "90904";
	public static final String info90904 = "被叫号码重复";
	public static final String code91101 = "91101";
	public static final String info91101 = "会议不存在";
	public static final String code91102 = "91102";
	public static final String info91102 = "会议成员不存在";
	public static final String code91103 = "91103";
	public static final String info91103 = "被叫号码有误";
	public static final String code91104 = "91104";
	public static final String info91104 = "线路资源不足";
	public static final String code91105 = "91105";
	public static final String info91105 = "会议资源不足";
	public static final String code91106 = "91106";
	public static final String info91106 = "呼叫标识不存在";
	public static String getValueByCode(String code) throws Exception{
		String er = null;
		try {
			er =  (String) VoiceCallConsants.class.getDeclaredField("info"+code).get(new VoiceCallConsants());
		} catch (Exception e) {
			throw new Exception("fuck you");
		}
		return er;
	}
}
