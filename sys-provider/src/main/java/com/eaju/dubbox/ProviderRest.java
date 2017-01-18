package com.eaju.dubbox;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class ProviderRest {
	
//    public static void main(String[] args) throws IOException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml","classpath:spring-mybatis.xml","classpath:spring-mybatis2.xml","classpath:spring-quartz.xml");
//        context.start();
//        System.in.read(); // 按任意键退出
//    }
//	public static void main(String[] args) {
//		System.out.println(System.currentTimeMillis());
//	}
	public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml","classpath:spring-quartz.xml","classpath:spring-mybatis.xml","classpath:spring-mybatis2.xml");
        //org.apache.log4j.DailyRollingFileAppender 
        context.start();
        System.in.read(); // 按任意键退出
    }
}
