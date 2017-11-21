package xypanel;
import java.io.*;
  
public class FileOperation{  
	 public static void replaceApache(String file, String reg, String content){  //file需要修改的文件 reg正则表达式  content替换为什么
	        try {
	            BufferedReader br = new BufferedReader(new FileReader(new File(file)));
	            StringBuffer sb = new StringBuffer();
	            String str = null;
	            while((str=br.readLine()) != null){//一行一行读，如果不为空，继续运行
	                if(str.matches(reg)){//正则表达
	                    str=str.replaceAll(reg, content);//找到/Apache24 修改成路径
	 
	                }
	               //System.out.println(str);
	               sb.append(str+"\r\n");  //  \n是 Linux上的换行，Windows的记事本只认\r\n
	            }
	            System.out.println("******************替换完成********************");
	            sb.setLength(sb.length()-1);//因为多加了一个换行符，所以截掉
	            br.close();//关闭输入流
	            
	//写入
	            FileWriter fw = new FileWriter(file);
	            PrintWriter out = new PrintWriter(new BufferedWriter(fw));
	            out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
	            out.write(sb.toString());//把sb里面的内容写入httpd.conf中
	             
	            out.flush();
	            out.close();
	        }catch(FileNotFoundException e){
	            System.out.println("文件未找到");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}  