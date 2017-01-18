package com.eaju.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.eaju.entity.VoiceCall;


@Path("/voice")
public interface IVoiceCallRest{
	
	/**
	 * @param vc
	 * @return
	 */
	@POST
    @Path("/call")
	@Consumes({MediaType.APPLICATION_JSON })/*接收参数对象类型*/
	@Produces({ContentType.APPLICATION_JSON_UTF_8 })/*响应对象类型*/
	String getAllOrderByPage(VoiceCall vc);
	
}
