package structure;
import java.util.*;
public class queue
{
     int queue[]=new int[3];
   
    int len=queue.length;
     int  front=-1;
     int rear=-1;
     int ch;  
     Scanner S=new Scanner(System.in);
               public void callqueue()
               {
                             do{
                                         System.out.println("Enter 1.Enqueue 2.dequeue 3.display");
                                         System.out.println("Enter your choice:");
                                         ch=S.nextInt();
                                        switch(ch)
                                        {
                                                case 1: if(rear==len)
                                                               System.out.println("Queue is full");
                                                           else
                                                           {
                                                                   System.out.println("enter a elements:");
                                                                    int ele=S.nextInt();
                                                                   enqueue(ele);
                                                           }
                                                          break;
                                                 case 2:  dequeue();
                                                              break;
                                                case 3:
                                                            display();
                                                             break;
                                               default: System.out.println("enter the valid choice");
                                                         
                                                          break;
                                        }
                              }while(ch<=3);
                 }
     void enqueue(int item)
     {
            if(front==-1)
                 front=0;
            rear++;
            queue[rear]=item;
     }
     void  dequeue()
     {
           int p=0;
           if(front==-1 || rear<0)
                System.out.println("the queue is empty");
           else
           {
                   System.out.println(queue[front]+" is removed from the queue");
                   front++;
                   
           }
      }
     void display()
      {
             int i;
             if(front==-1 || rear<0)
                    System.out.println("Queue is empty");
             else
              {
                     System.out.println("display");
                     for(i=front;i<=rear;i++)
                          System.out.println(queue[i]+" ");
               }
         }
       
        

  
}