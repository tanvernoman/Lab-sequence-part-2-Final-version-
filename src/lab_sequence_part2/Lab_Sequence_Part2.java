/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_sequence_part2;

/**
 *
 * @author thnom
 */
public class Lab_Sequence_Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sequence<Integer> s= new LinkedSequence<>();
        
        s.append(10);
        s.append(20);
        s.append(30);
        s.append(40);
        s.append(50);
        s.display();
        System.out.println("Array size is "+s.size());
        
        System.out.println(s.get(3));
       
        //s.set(3, 500);
        
        
        s.display();
//        
//        Sequence<String> s1= new LinkedSequence<>();
//        s1.append("tanver");
//        s1.append("Hasan");
//        
//        s1.display();
        
     
    }
    
}
