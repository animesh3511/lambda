package com.example.oms;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

     Runnable thread1 = ()->{

         try{

             for (int i =0;i<=10;i++)
             {
                 System.out.println("values are "+i);
                 Thread.sleep(2000);

             }

         }catch (Exception e)
         {

             e.printStackTrace();

         }


     };


     Runnable thread2 = ()->
     {
       try{

           for (int i =1;i<=10;i++)
           {

               System.out.println("=> "+2*i);
               Thread.sleep(5000);
           }
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }


     };

     Thread t1 = new Thread(thread1);
     t1.start();

     t1.join();

     Thread t2 = new Thread(thread2);

     t2.start();


    }
}
