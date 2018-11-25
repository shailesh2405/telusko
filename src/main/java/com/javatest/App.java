package com.javatest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Runnable ap = ()->{System.out.println("hell11oddf");};
        new Thread(ap).start();
    }


    

    
}
