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
    import java.util.Scanner;
    public class Student {
        
        private String name;
        private int testOne; // Both tests are declared as ints, as pursuant to PowerSchool's system wherein final grades can only be integers. 
        private int testTwo;
       
        public Student(String studentName) {
            name = studentName;
        }
        public void inputGrades() {
            
            Scanner input = new Scanner(System.in);
                    do { System.out.print("Enter's " + name + "'s valid score (integer between 0 and 100) for testOne:");
                            testOne = input.nextInt(); } 
                while(testOne > 100 || testOne < 0);  // validation 
                    do { System.out.print("Enter's " + name + "'s valid score for testTwo:");
                            testTwo = input.nextInt(); } 
            while(testTwo > 100 || testTwo < 0);  // validation 
    }
    public int getAverage() {
        
        return (testOne + testTwo) / 2;
    }
  
  
    public String getName() {
        return name;
    }
    public String toString() {
        return "name:\t" + name + "\ttestOne:\t" + testOne + "%" + "\ttestTwo:\t" + testTwo + "%";
    }
}