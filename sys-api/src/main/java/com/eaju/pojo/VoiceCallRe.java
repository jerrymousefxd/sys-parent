package com.eaju.pojo;
/**
 * 语音电话回调接口
* <p>Title: VoiceCallRe</p>
* <p>Description: </p>
* <p>Company: 蚁安居</p> 
* <p>Mail: jerrymousefxd@163.com</p> 
* @author 付兴东
* @date 2017年1月11日
 */
public class VoiceCallRe {
	/*{"conferenceid":"20160112134825126137118314471261370008545_4698",
		"endtime":"20160112134927",
		"filepushed":1,
		"recordfile":"1519568_1.wav",
		"starttime":"20160112134844"}*/
	private String conferenceid;
	private String endtime;
	private String filepushed;
	private String recordfile;
	private String starttime;
	public String getConferenceid() {
		return conferenceid;
	}
	public void setConferenceid(String conferenceid) {
		this.conferenceid = conferenceid;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getFilepushed() {
		return filepushed;
	}
	public void setFilepushed(String filepushed) {
		this.filepushed = filepushed;
	}
	public String getRecordfile() {
		return recordfile;
	}
	public void setRecordfile(String recordfile) {
		this.recordfile = recordfile;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	
	
}
