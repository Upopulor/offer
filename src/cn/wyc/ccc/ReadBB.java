package cn.wyc.ccc;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBB {
	public static void main(String[] args) {
		readFile("C:\\Users\\xd\\Desktop\\946730414548724");
	}
	
	public static void readFile(String fileName){  
        File file = new File(fileName);   
        if(file.exists()){  
            try {  
                FileInputStream in = new FileInputStream(file);  
                DataInputStream dis=new DataInputStream(in);
                //float ss = dis.readFloat();
                //System.out.println(ss);
                byte[] itemBuf = new byte[20];  
                dis.read(itemBuf, 0, 8); 
                String marketID =new String(itemBuf,0,8); 
                System.out.println(marketID);
            }catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }finally{  
                //close  
            }  
        }
	}
}
