import structure.*;
import java.util.*;
public class Data
{
    public static void main(String args[])
    {
            Scanner s=new Scanner(System.in);
            stack st=new stack();
            queue  q=new queue();
            LList list=new LList();
            int choice;
            do{
                  System.out.println("Choose which data structure you want to access------1.STACK 2.QUEUE 3.LINKED LIST");
                  choice=s.nextInt();
                  switch(choice)
                  {
                        case 1:  st.callstack(); 
                                     break;
                        case 2:  q.callqueue();
                                     break;
                        case 3: list.callList();
                                    break;
                        default: System.out.println("Please enter the valid choice");
                                    break;
                   }
            }while(choice<=2);
      }
}                 
                  