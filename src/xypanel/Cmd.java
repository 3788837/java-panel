package xypanel;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
/** 
 * javaִ��cmd���� 
 * @author xue8 
 * 
 */  
public class Cmd {  
	 
	 public static void bat(String cmdc){
	  Runtime run= Runtime.getRuntime();
	  try
	  {
	      run.exec(cmdc);	//��ӳ���·��  ������ָ����bat����
	  }catch(Exception e)
	  {
	      e.printStackTrace();
	  }
	 }
	 
//	 public static void main(String[] aegs){
//		  cmd("G:/java/java-panel/bat/installApache.bat");
//		 }
}  



//public class Cmd {  
////	public static void main(String [] args) throws IOException {
////        Process p = Runtime.getRuntime().exec("cmd /c dir");  
////        StringBuffer contentCmd = new StringBuffer();  
////          
////        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(),"GBK"));  
////          
////        String line;  
////        while ((line=br.readLine())!=null) {  
////            contentCmd.append(line);  
////        }  
////        System.out.println(contentCmd);
////		
////	}
//    public static void run_cmd(String strcmd) {   //ִ��bat�ļ�
//    	//
//    	        Runtime rt = Runtime.getRuntime(); //Runtime.getRuntime()���ص�ǰӦ�ó����Runtime����
//    	        Process ps = null;  //Process���Կ��Ƹ��ӽ��̵�ִ�л��ȡ���ӽ��̵���Ϣ��
//    	        try {
//    	            ps = rt.exec(strcmd);   //�ö����exec()����ָʾJava���������һ���ӽ���ִ��ָ���Ŀ�ִ�г��򣬲���������ӽ��̶�Ӧ��Process����ʵ����
//    	            ps.waitFor();  //�ȴ��ӽ������������ִ�С�
//    	        } catch (IOException e1) {
//    	            e1.printStackTrace();
//    	        } catch (InterruptedException e) {
//    	            // TODO Auto-generated catch block
//    	            e.printStackTrace();
//    	        }
//
//    	        int i = ps.exitValue();  //����ִ����ϵķ���ֵ
//    	        if (i == 0) {
//    	            System.out.println("ִ�����.");
//    	        } else {
//    	            System.out.println("ִ��ʧ��.");
//    	        }
//
//    	        ps.destroy();  //�����ӽ���
//    	        ps = null;   
//    	    } 
////    ��������
////    String strcmd = "cmd /c start  ����ļ���.bat";  //������������ĿĿ¼��׼���õ�bat�ļ��������������ĿĿ¼�£���ѡ�����ļ���.bat���ĳ��ļ�����·����
////    run_cmd(strcmd);  //���������run_cmd����ִ�в���
//}  