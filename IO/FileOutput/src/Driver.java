import java.io.FileOutputStream;  
public class Driver {  
    public static void main(String args[]){    
           try{    
             
        	 // creat a stream 
        	 // filename is testout.txt
        	   
        	 FileOutputStream fout=new FileOutputStream("testout.txt");    
             
        	 fout.write('a');  // write takes int (byte) 65  
             
        	 // not flushing because close will do it. 
        	 
        	 fout.close(); 
        	 
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}