package com.eaju.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * 
 * @author shun
 * @date 2016年11月22日 上午11:01:44
 * @Discripition Java实现AES加密：近些年DES使用越来越少，原因就在于其使用56位密钥，比较容易破解，而AES可以使用128,192、
 * 、256位密钥，并且用128位分组加密和解密数据。所以，AES已经变成目前对称加密中最流行的算法之一；
 * <p>Company: eaju</p>
 * @version 1.0
 */
public class AesEncrypt {
    /** 
     * 加密 
     *  
     * @param content 需要加密的内容 
     * @param password  加密密码 
     * @return 
     */  
    public static byte[] encrypt(String content, String password) {  
            try {             
                    KeyGenerator kgen = KeyGenerator.getInstance("AES");  
                    kgen.init(128, new SecureRandom(password.getBytes()));  
                    SecretKey secretKey = kgen.generateKey();  
                    byte[] enCodeFormat = secretKey.getEncoded();  
                    SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");  
                    Cipher cipher = Cipher.getInstance("AES");// 创建密码器  
                    byte[] byteContent = content.getBytes("utf-8");  
                    cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化  
                    byte[] result = cipher.doFinal(byteContent);  
                    return result; // 加密  
            } catch (NoSuchAlgorithmException e) {  
                    e.printStackTrace();  
            } catch (NoSuchPaddingException e) {  
                    e.printStackTrace();  
            } catch (InvalidKeyException e) {  
                    e.printStackTrace();  
            } catch (UnsupportedEncodingException e) {  
                    e.printStackTrace();  
            } catch (IllegalBlockSizeException e) {  
                    e.printStackTrace();  
            } catch (BadPaddingException e) {  
                    e.printStackTrace();  
            }  
            return null;  
    }  
    /**
     * 
    * @Title: decrypt 
    * @Description: TODO 
    * @param @param content
    * @param @param password
    * @param @return    设定文件 
    * @return byte[]    返回类型 
    * @author  shun
    * @throws
     */

    
    public static byte[] decrypt(byte[] content, String password) {  
        try {  
                 KeyGenerator kgen = KeyGenerator.getInstance("AES");  
                 kgen.init(128, new SecureRandom(password.getBytes()));  
                 SecretKey secretKey = kgen.generateKey();  
                 byte[] enCodeFormat = secretKey.getEncoded();  
                 SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");              
                 Cipher cipher = Cipher.getInstance("AES");// 创建密码器  
                cipher.init(Cipher.DECRYPT_MODE, key);// 初始化  
                byte[] result = cipher.doFinal(content);  
                return result; // 加密  
        } catch (NoSuchAlgorithmException e) {  
                e.printStackTrace();  
        } catch (NoSuchPaddingException e) {  
                e.printStackTrace();  
        } catch (InvalidKeyException e) {  
                e.printStackTrace();  
        } catch (IllegalBlockSizeException e) {  
                e.printStackTrace();  
        } catch (BadPaddingException e) {  
                e.printStackTrace();  
        }  
        return null;  
}  
    
    /**将二进制转换成16进制 
     * @param buf 
     * @return 
     */  
    public static String parseByte2HexStr(byte buf[]) {  
            StringBuffer sb = new StringBuffer();  
            for (int i = 0; i < buf.length; i++) {  
                    String hex = Integer.toHexString(buf[i] & 0xFF);  
                    if (hex.length() == 1) {  
                            hex = '0' + hex;  
                    }  
                    sb.append(hex.toUpperCase());  
            }  
            return sb.toString();  
    } 
    
    
    /**将16进制转换为二进制 
     * @param hexStr 
     * @return 
     */  
    public static byte[] parseHexStr2Byte(String hexStr) {  
            if (hexStr.length() < 1)  
                    return null;  
            byte[] result = new byte[hexStr.length()/2];  
            for (int i = 0;i< hexStr.length()/2; i++) {  
                    int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);  
                    int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);  
                    result[i] = (byte) (high * 16 + low);  
            }  
            return result;  
    }  
    
    public static void main(String[] args) {
        String content = "test";  
        String password = "12345678";  
        //加密  
        System.out.println("加密前：" + content);  
        byte[] encryptResult = encrypt(content, password);  
        //二进制转换成十六进制
        String encryptResultStr = parseByte2HexStr(encryptResult);  
        System.out.println("加密后：" + encryptResultStr);  
        //解密    十六进制转换成二进制
        byte[] decryptFrom = parseHexStr2Byte(encryptResultStr);  
        byte[] decryptResult = decrypt(decryptFrom,password);  
        System.out.println("解密后：" + new String(decryptResult));  
    }

}
