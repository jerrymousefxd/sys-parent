package testForRedis;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class test4Redis {
	
	private static String host;
	private static int port;
	private static String secret;
	static{
		host="r-bp1feff412826264.redis.rds.aliyuncs.com";
		port=6379;
		secret="Fxd123456";
	}
	
	public static Jedis getJedis() {
		Jedis j=new Jedis(host,port);
		return j;
		
	}
	public static void main(String[] args) {
		Jedis jedis = getJedis();
		System.out.println(jedis);
		String auth = jedis.auth(secret);
		 try {  
		        Transaction transaction = jedis.multi();  
		        transaction.lpush("key", "11");  
		        transaction.lpush("key", "22");  
		        int a = 6 / 0;  
		        transaction.lpush("key", "33");  
		        List<Object> exec = transaction.exec();  
		    } catch (Exception e) {  
		  
		    }  
	}
}
