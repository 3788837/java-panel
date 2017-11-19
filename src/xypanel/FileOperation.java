package xypanel;
import java.io.*;
  
public class FileOperation{  
	 public static void main(String[] args){
	        try {
	            BufferedReader br = new BufferedReader(new FileReader(new File("D:/XYPanel/apache2.4/conf/httpd.conf")));
	            StringBuffer sb = new StringBuffer();
	            String str = null;
	            while((str=br.readLine()) != null){//一行一行读，如果不为空，继续运行
	                if(str.matches("(.*)/Apache24(.*)")){//正则表达
	                    str=str.replaceAll("(.*)/Apache24(.*)", "D:/XYPanel/Apache2.4/");//找到/Apache24 修改成路径
	 
	                }
	                System.out.println(str);
	                //sb.append(str+"\n");
	                System.out.println(sb);
	            }
	            sb.setLength(sb.length()-1);//因为多加了一个换行符，所以截掉
	            br.close();//关闭输入流
	            
	//写入
	            FileWriter fw = new FileWriter("D:/XYPanel/apache2.4/conf/httpd.conf");
	            PrintWriter out = new PrintWriter(new BufferedWriter(fw));
	            out = new PrintWriter(new BufferedWriter(new FileWriter("D:/XYPanel/apache2.4/conf/httpd.conf")));
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