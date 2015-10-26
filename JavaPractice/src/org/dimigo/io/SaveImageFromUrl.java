/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 * |_SaveImageFromUrl
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 26.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "http://cfile3.uf.tistory.com/image/253C8349546E87A12FACD8";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.png")){
				
				int result;
				byte[] buf = new byte[100];
				while((result = is.read(buf)) != -1){
					os.write(buf,0,result);
				}
				System.out.println("파일생성 완료");
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
