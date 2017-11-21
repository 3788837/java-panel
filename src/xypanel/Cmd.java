package xypanel;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
/** 
 * java执行cmd命令 
 * @author xue8 
 * 
 */  
public class Cmd {  
	 
	 public static void bat(String cmdc){
	  Runtime run= Runtime.getRuntime();
	  try
	  {
	      run.exec(cmdc);	//添加程序路径  打开运行指定的bat命令
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
//    public static void run_cmd(String strcmd) {   //执行bat文件
//    	//
//    	        Runtime rt = Runtime.getRuntime(); //Runtime.getRuntime()返回当前应用程序的Runtime对象
//    	        Process ps = null;  //Process可以控制该子进程的执行或获取该子进程的信息。
//    	        try {
//    	            ps = rt.exec(strcmd);   //该对象的exec()方法指示Java虚拟机创建一个子进程执行指定的可执行程序，并返回与该子进程对应的Process对象实例。
//    	            ps.waitFor();  //等待子进程完成再往下执行。
//    	        } catch (IOException e1) {
//    	            e1.printStackTrace();
//    	        } catch (InterruptedException e) {
//    	            // TODO Auto-generated catch block
//    	            e.printStackTrace();
//    	        }
//
//    	        int i = ps.exitValue();  //接收执行完毕的返回值
//    	        if (i == 0) {
//    	            System.out.println("执行完成.");
//    	        } else {
//    	            System.out.println("执行失败.");
//    	        }
//
//    	        ps.destroy();  //销毁子进程
//    	        ps = null;   
//    	    } 
////    调用例子
////    String strcmd = "cmd /c start  你的文件名.bat";  //调用我们在项目目录下准备好的bat文件，如果不是在项目目录下，则把“你的文件名.bat”改成文件所在路径。
////    run_cmd(strcmd);  //调用上面的run_cmd方法执行操作
//}  