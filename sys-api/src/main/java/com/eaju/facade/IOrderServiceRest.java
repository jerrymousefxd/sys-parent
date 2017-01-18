package com.eaju.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.eaju.pojo.PageQuery;


@Path("/order")
@Consumes({MediaType.APPLICATION_JSON })/*接收参数对象类型*/
@Produces({ContentType.APPLICATION_JSON_UTF_8 })/*响应对象类型*/
public interface IOrderServiceRest {
	/**
	 * APP-OMS订单
	 * @param pq 请求参数
	 * @return 
	 */
	@POST
    @Path("/getAllOrderByPage/")
	String getAllOrderByPage(PageQuery pq);

	@GET
    @Path("/test/{param}")
    String  getClassGroup(@PathParam("param") String param);
    
}
