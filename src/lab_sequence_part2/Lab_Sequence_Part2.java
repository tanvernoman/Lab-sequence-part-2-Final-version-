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

        test();
    }

    private static void test() {
       Sequence<Integer> s = new LinkedSequence<>();

        s.append(10);
        s.append(20);
        s.append(30);
        s.append(40);
        s.append(50);
        s.display();
        System.out.println("list size is " + s.size());

        System.out.println(s.get(3));

        s.set(3, 500);
        System.out.println("----------------After set-------------");
        s.display();

        s.remove(4);
        System.out.println("-----------After remove---------");
        s.display();
        System.out.println("list size is " + s.size());

        s.add(2, 2000);
        System.out.println("------After add---------");
        s.display();
        System.out.println("list size is " + s.size());
        
        
        s.add(3, 3000);
        System.out.println("------After add---------");
        s.display();
        System.out.println("list size is " + s.size());
        
        System.out.println(s.contains(20));
         System.out.println(s.contains(2000000000));
    }

}
