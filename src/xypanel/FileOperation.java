package xypanel;
import java.io.*;
  
public class FileOperation{  
	 public static void main(String[] args){
	        try {
	            BufferedReader br = new BufferedReader(new FileReader(new File("D:/XYPanel/apache2.4/conf/httpd.conf")));
	            StringBuffer sb = new StringBuffer();
	            String str = null;
	            while((str=br.readLine()) != null){//һ��һ�ж��������Ϊ�գ���������
	                if(str.matches("(.*)/Apache24(.*)")){//������
	                    str=str.replaceAll("(.*)/Apache24(.*)", "D:/XYPanel/Apache2.4/");//�ҵ�/Apache24 �޸ĳ�·��
	 
	                }
	                System.out.println(str);
	                //sb.append(str+"\n");
	                System.out.println(sb);
	            }
	            sb.setLength(sb.length()-1);//��Ϊ�����һ�����з������Խص�
	            br.close();//�ر�������
	            
	//д��
	            FileWriter fw = new FileWriter("D:/XYPanel/apache2.4/conf/httpd.conf");
	            PrintWriter out = new PrintWriter(new BufferedWriter(fw));
	            out = new PrintWriter(new BufferedWriter(new FileWriter("D:/XYPanel/apache2.4/conf/httpd.conf")));
	            out.write(sb.toString());//��sb���������д��httpd.conf��
	             
	            out.flush();
	            out.close();
	        }catch(FileNotFoundException e){
	            System.out.println("�ļ�δ�ҵ�");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}  