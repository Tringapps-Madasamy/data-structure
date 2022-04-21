package structure;
import java.util.*;
public class stack
{
     int ch;
     Scanner S=new  Scanner(System.in);                       
     int s[]=new int[3];
     int len=s.length;
     int tos=-1;
  public void callstack()
  {
                    
           
       do{
                       System.out.println("1.push 2.pop 3.display");
                       System.out.println("which action you want to perform"); 
                       ch=S.nextInt();
                       switch(ch)
                       {
                          case 1: System.out.println("enter your element:");
                                     int ele=S.nextInt();
                                     push(ele);
                                     break;
                          case 2:  pop();
                                      break;
                          case 3:  display();
                                         break;
                          default: System.out.println("invalid choice...please input the valid choice");
                                        
                                          break;
                       }
             }while(ch<=3);            
      }
     void push(int item)                         
     {
            if(tos==len-1)
            {
                 System.out.println("the stack is full");
            }
            else
            {
                tos++;
                s[tos]=item;
                 System.out.println( item+"pushed  to stack ");
            }
      }
      void pop()
     {
            if(tos<0)
                System.out.println("stack is empty");
            else
            {
                 System.out.println(s[tos]+"is popped from the stack");
                 tos--;
                 
            }    
     }
    void display()
    {
          if(tos<0)
              System.out.println("stack is empty");
          else
           {
                    System.out.println("display:");
                    for(int i=tos;i>=0;i--)
                    {
                            System.out.println(s[i]+" ");
                    }
           }
    }
   
          

}