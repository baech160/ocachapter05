/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocachapter05;

/**
 *
 * @author triosStudent
 */
public class Lion extends Animal implements CanRunAtSpeed {
    
    private int age = 0;
    
    public Lion()
    {
        super();
    }
    
    public Lion(int ag)
    {
        super(ag);
    }
    
     public final void roar()
    {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
        System.out.println("The " + age + " year old lion says: Roar!");
        //System.out.println("The lion says: Roar!");
    }   
    
    //public static void roar()
    //{
        //System.out.println("The " + getAge() + " year old lion says: Roar!");
        //System.out.println("The lion says: Roar!");
    //}
    
    public void roar(String how) //this is overloading function or method
    {
        System.out.println("The " + getAge() + " year old lion says: Roar," +
                how + "!");
    }

    public int getMaximumSpeed()
    {
        return 25;
    }
    

}
