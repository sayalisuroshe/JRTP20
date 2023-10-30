 package in.ashokit1.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	 
	public static String encode(String txt) {
		
		Encoder encoder=Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());//getBytes method used to convert string to byte array because 
		//encodeToString method expect argument as byte array 
		
	}
	public static String decode(String encodetxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodetxt);
		return new String(decode);//converting byte array to string by using string constructor
		}
   public static void main(String args[]) {
	  String  encode=PasswordService.encode("sayali");
	   System.out.println(encode);  
	   System.out.println(PasswordService.decode(encode)); 
	   
	
	
	
} 
}
