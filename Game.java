import java.util.Scanner;
class Missingletter
{ 
  Missingletter()
    { 
      String[] word={"PRODAPT","BANGLORE","IPRIMED","STRING","ENGLISH","GRAMMER","PAPER","PRODUCT","NOTEPAD","PLACE"};
      String n[]=new String [10];
      int score=0;
      int i=0;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("1. P**DA*T");
      n[0]=sc.next();
      System.out.println("2. BA**L*R*");
      n[1]=sc.next();
      System.out.println("3. I**IM*D");
      n[2]=sc.next();
      System.out.println("4. S*RI*G");
      n[3]=sc.next();
      System.out.println("5. EN**IS*");
      n[4]=sc.next();
      System.out.println("6. *R*MM*R");
      n[5]=sc.next();
      System.out.println("7. P*P*R");
      n[6]=sc.next();
      System.out.println("8. P*OD*C*");
      n[7]=sc.next();
      System.out.println("9. **TEP*D");
      n[8]=sc.next();
      System.out.println("10. *L*AC*");
      n[9]=sc.next();
      for(String s:word)
       {
         if(n[i].equals(s))
          {
           score=score+1;
          }
         i++;
       }
       System.out.println("\nYour score is :"+score);
    }   
}
class Jumbledword
{ 
  Jumbledword()
    { 
      String[] word={"PRODAPT","BANGLORE","IPRIMED","STRING","ENGLISH","GRAMMER","PAPER","PRODUCT","NOTEPAD","PLACE"};
      String n[]=new String [10];
      int score=0;
      int i=0;
      Scanner sc=new Scanner(System.in);
      
  
      System.out.println("1. TPADORP");
      n[0]=sc.next();
      System.out.println("2. BALERONG");
      n[1]=sc.next();
      System.out.println("3. IPIMDRE");
      n[2]=sc.next();
      System.out.println("4. SRIGTN");
      n[3]=sc.next();
      System.out.println("5. SHENIGL ");
      n[4]=sc.next();
      System.out.println("6. MMRAGER");
      n[5]=sc.next();
      System.out.println("7. REPPA");
      n[6]=sc.next();
      System.out.println("8. DTCPORU");
      n[7]=sc.next();
      System.out.println("9. ADTEPON");
      n[8]=sc.next();
      System.out.println("10. EPALC");
      n[9]=sc.next();
      for(String s:word)
       {
         if(n[i].equals(s))
          {
           score=score+1;
          }
         i++;
       }
       System.out.println("\nFinal score is :"+score);
    }   
}
public class Game
{
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int ch=0;

    System.out.println("\n1.Finding missing letter game");
    System.out.println("2.Jumbled word game");
    System.out.println("\nEnter your choice");
    ch=sc.nextInt();
    System.out.println("enter the full word");
    switch(ch)
          {
           case 1: Missingletter a=new Missingletter();
                   break;
           case 2: Jumbledword b=new Jumbledword();
                   break;
         default : System.out.println("Wrong choice");
          }
        
   }
}