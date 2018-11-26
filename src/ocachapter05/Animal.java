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
public abstract class Animal {
    private int age;
    
    public Animal()
    {
        this.age = 0;
    }
    
    public Animal(int ag)
    {
        this.age = ag;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int ag)
    {
        this.age = ag;
    }
    
}
