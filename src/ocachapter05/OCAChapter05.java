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
public class OCAChapter05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal a = new Animal(); //not valid if Animal is abstract
        Lion cowardly = new Lion(7);
        cowardly.roar();
        cowardly.roar(" loudly");
        System.out.println("The Lion can run up to " + cowardly.getMaximumSpeed()
                + " mph");
    }
    
}
