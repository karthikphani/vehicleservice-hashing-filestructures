
import java.io.File;
import java.util.Scanner;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karthik
 */
public class search1 {
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achuu
 */

    public static boolean search(String k){
        boolean found=false;
        String nam="";
        String ph="";
        String vno="";
        String t="";
        String mn="";
    Scanner x;
    try{
        String filePath = "D:\\java\\NetBeansProjects\\fsproj\\vehicle.txt";
        x=new Scanner(new File(filePath));
        x.useDelimiter("[;\n]");
        while(x.hasNext()&&!found){
       //     mn=x.next();
            nam=x.next();
         //   t=x
          //  m=x.next();
           // d=x.next();
            ph=x.next();
            vno=x.next();
            t=x.next();
            mn=x.next();
            if(nam.equals(k))
                found=true;
        }
      
    
    }   
    catch (Exception ex) {
            System.err.println("Error: " + ex);
        }
    if(found)
            return true;
    else
            return false;    
    
    }
    public static boolean searchcust(String k){
        boolean found=false;
    //String id="";
    String name="";
   // String e="";
   // String ad="";
    String no="";
    Scanner x1;
    try{
        String filePath = "D:\\java\\NetBeansProjects\\fsproj\\Vehicle.txt";
        x1=new Scanner(new File(filePath));
        x1.useDelimiter("[;\n]");
        while(x1.hasNext()&&!found){
  //          id=x1.next();
            name=x1.next();
    //        e=x1.next();
      //      ad=x1.next();
            no=x1.next();
            if(k.equals(name))
                found=true;
        }
        
    
    }   
    catch (Exception ex) {
            System.err.println("Error: " + ex);
        }
    if(found)
            return true;
    else
            return false;    
    
    }
}


