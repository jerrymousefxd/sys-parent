package com.eaju.util;

import java.util.UUID;

public class UuidUtil {
	
	public static  String getUuid(){
		UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
	}
	
	public static void main(String [] args){
		System.out.println(UuidUtil.getUuid());
	}

}
