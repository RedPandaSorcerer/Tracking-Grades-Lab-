    /*
      Author: Adams Stone 
      Instructor: Denise Stiffler
      Date: 2/13/2021 
      Due Date: 2/12/2021
      Computer Science A 2020-21 Academic Year
      Declaration: 
      I, the copyright holder of this work, release this work into the public domain. 
      This applies worldwide. 
      In some countries this may not be legally possible; if so: 
      I grant anyone the right to use this work for any purpose, 
      without any conditions, unless such conditions are required by law.
     */

public class Grades {
    public static void main(String[] args) {
        Student studentOne = new Student("Mary");
        Student studentTwo = new Student("Mike");
            studentOne.inputGrades();
                    System.out.println(studentOne.getName() + "'s test average is: "
                    + studentOne.getAverage() + "%");
                            System.out.println();
            studentTwo.inputGrades();
                    System.out.println(studentTwo.getName() + "'s test average is: "
                    + studentTwo.getAverage() + "%");
                            System.out.println();
        System.out.println(studentOne);
        System.out.println(studentTwo);
        
    }
}