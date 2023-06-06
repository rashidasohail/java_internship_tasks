
package marksheet;

import java.util.Scanner;

/**
 *
 * @author Rashda Khanzada
 */
public class Marksheet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       System.out.print("Roll no:");
       String a = in.next();
       System.out.println("Total Marks of each subject : 100");
       System.out.println("Enter Obtained Marks");
       System.out.print("Object Oriented Programing :");
       int oop=in.nextInt();
       System.out.print("Laplace Transformation :");
       int lt=in.nextInt();
       System.out.print("Operating System Concept :");
       int osc=in.nextInt();
       System.out.print("Operation Research :");
       int or=in.nextInt();
       System.out.print("Database Management System :");
       int dbms=in.nextInt();
       float per=((oop+lt+osc+or+dbms)*100)/500;
       String grade="",remarks="";
       if (per>=80&&per<=100){
           grade="A+";
           remarks="Pass";
       }
       else if (per>=70&&per<80){
           grade="A";
           remarks="Pass";
       }
       else if (per>=65&&per<70){
           grade="B";
           remarks="Pass";
       }
       else if (per>=60&&per<65){
           grade="C";
           remarks="Pass";
       }
       else 
           remarks="Fail";
       
       
       System.out.println("**********************************MARKSHEET*********************************");
       System.out.println("**  ROLL NO :"+ a+"                                                       **");
       System.out.println("**                                                                        **");
       System.out.println("**  SUBJECT                    "+  " TOTAL MARKS  "+  " OBTAINED MARKS  "+"            **");
       System.out.println("**  Object Oriented Programing "+  "   100        "+  "     "+oop+"     "+"                 **");
       System.out.println("**  Laplace Transformation     "+  "   100        "+  "     "+lt+"     "+"                 **");
       System.out.println("**  Operating System Concept   "+  "   100        "+  "     "+osc+"     "+"                 **");
       System.out.println("**  Operation Research         "+  "   100        "+  "     "+or+"     "+"                 **");
       System.out.println("**  Database Management System "+  "   100        "+  "     "+dbms+"    "+"                  **");
       System.out.println("**                                                                        **");
       System.out.println("**  PERCENTAGE :"+per+"                                                      **");
       System.out.println("**  GRADE :"+grade+"                                                             **");
       System.out.println("**  REMARKS :"+remarks+"                                                         **");
       System.out.println("**                                                                        **");
       System.out.println("****************************************************************************");
    }
    
}
