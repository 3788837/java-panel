package xypanel;
import java.io.*;
  
public class FileOperation{  
	 public static void replaceApache(String file, String reg, String content){  //file��Ҫ�޸ĵ��ļ� reg������ʽ  content�滻Ϊʲô
	        try {
	            BufferedReader br = new BufferedReader(new FileReader(new File(file)));
	            StringBuffer sb = new StringBuffer();
	            String str = null;
	            while((str=br.readLine()) != null){//һ��һ�ж��������Ϊ�գ���������
	                if(str.matches(reg)){//������
	                    str=str.replaceAll(reg, content);//�ҵ�/Apache24 �޸ĳ�·��
	 
	                }
	               //System.out.println(str);
	               sb.append(str+"\r\n");  //  \n�� Linux�ϵĻ��У�Windows�ļ��±�ֻ��\r\n
	            }
	            System.out.println("******************�滻���********************");
	            sb.setLength(sb.length()-1);//��Ϊ�����һ�����з������Խص�
	            br.close();//�ر�������
	            
	//д��
	            FileWriter fw = new FileWriter(file);
	            PrintWriter out = new PrintWriter(new BufferedWriter(fw));
	            out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
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