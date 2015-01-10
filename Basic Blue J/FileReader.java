import java.util.*;
import java.io.*;
/**
 * Write a description of class FileReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileReader 
{
    // instance variables - replace the example below with your own
    private String nf;
    private String ok;
    /**
     * Constructor for objects of class FileReader
     */
    public FileReader()
    {
    }
    
    public String bF(String nf)throws IOException{
    String str = "";
    Scanner sc = new Scanner(new File(nf));
    str=sc.next();
    return str;
    }
    
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nama file : ");
        String nf =sc.next();
        FileReader fr1=new FileReader();
        try{
            String isiFile=fr1.bF(nf);
            System.out.println(isiFile);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
