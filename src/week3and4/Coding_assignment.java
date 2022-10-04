package week3and4;

import java.util.Scanner;

public class Coding_assignment {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
  Scanner s = new Scanner(System.in);

//  Question 1
  
  
   int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
   
//    1.a 
   
   int firstMinusLast = ages[0] - ages[ages.length -1];
   System.out.println(firstMinusLast);
   
   
//   1.b
   
   ages[ages.length -1] = 23;
   
   int firstMinusLast2 =  ages[0] - ages[ages.length -1];
   System.out.println(firstMinusLast2);
   
   
//   1.c
   
   double average = 0;
    for (int a : ages) {
      average += a;
     
    }
   System.out.println(average / ages.length);
     
     
     
//     Question 2
   
   
//   2.a
   
     String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob",}; 
     int sum = 0;
     
    for (String name : names) {
      sum += name.length();
    }
    System.out.println(sum / names.length );
    
//    2.b
    
    String sumOfNames = "";
   
    for (String name : names) {
      sumOfNames += name + " ";
    }
      System.out.println(sumOfNames);
      
      
//      Question 5
    
      int[] nameLengths = new int[names.length];
      
      for(int i = 0; i < names.length; i++) {
        nameLengths[i] = names[i].length();
      }
      for(int x : nameLengths) {
        System.out.println("Length of each name:" + x);
    }
    
        
//     Question 6
    
     int sumOfElements = 0;
      
     for (int j = 0; j < names.length; j++) {
       sumOfElements = sumOfElements + nameLengths[j];
     }
      System.out.println("Sum of elements: " + sumOfElements);
           
      
//      Question 3
      
//      Answer: In the value of the data type array[] variable, you use the array 'variable'[.lengths - 1]; 
//      Reason being, the index of the array starts at 0.
               int[] teamAges = {22,25,36,42,21,24};
                 int lastAge = teamAges[teamAges.length - 1]; 
                  System.out.println("This is the last element of the array: " +lastAge);  
      
     /*  Question 3 & 4 use the same code  */
      
//      Question 4
      
//     Answer: In arrays the elements start at 0, so the index of the array would be [0];
                teamAges[0] = 22;
                teamAges[1] = 25;
                teamAges[2] = 36;
                 System.out.println("This is the first element of the array: " + teamAges[0]);
                 
                 
                 
                 
                 
                 
                 
                
//                 Question 7:
                 System.out.println(multiplyingString("Tony ", 5));
  
       
  
                 
                 
//                 Question 8:
                 String firstName = "Tony";
                 String lastName = "Ortega";
                 String fullName = createFullName(firstName, lastName);
                 System.out.println("My full name is: " + fullName);
                 
                 
                 
                 
  
//                Question 9:
//                 int[] arr = {21,25,17,11,18,23,10};
                 
                 System.out.println(overOneHundred(nameLengths));
                 
                 
                 
                 
//                 Question 10:
                 double[] classGrades = {78.2,95.6,87.5,89.1,99.3};
                 System.out.println("The average grades in class is: " + averageGrade(classGrades));
                 
                 
                 
                 
//                 Question 11:
                 double[] classGrades2 = {73.2,98.7,95.6,83.2,97.8};
                 System.out.println("Class2 averages higher grades: " + greaterGrade(classGrades,classGrades2));
                 
                 
//                 Question 12:
                 double moneyInPocket = 11.57;
                 boolean isHotOutside = true;
                 System.out.println("I will buy a drink: " + willBuyDrink(isHotOutside, moneyInPocket));
                 
                 
//                 Question 13:
                 int tony = 24;
                 int nyla = 22;
                 System.out.println("Nyla may be the same age as Tony? : " + sameAge(tony, nyla)); 
                                                         // sameAge = method        tony, nyla is what's contained inside of the method. 
  }
                 
                                 
                 
//      Question 7
                 
      public static String multiplyingString(String word, int n) {// (line109)
        String result = "";
        for (int i = 0; i < n; i++) {
          result += word;
        }
        return result;
      }
    
      
    
      
//      Question 8 
      
      public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
      }
        
        
              
    
//     Question 9
      
   public static boolean overOneHundred(int[] arr) {
     int sumOfAll = 0;
     for (int k : arr) {
       sumOfAll += k;    
     } 
     
     if (sumOfAll > 100) {
       return true;
      
     }
     return false;
   }
   
   
   
//     Question 10
   
   public static double averageGrade(double[] classGrades) {
     double sum = 0;
     
     for (double l : classGrades) {
       sum += l;
       
     }
     return sum / classGrades.length;
   }
     
     
//     Question 11
   
   public static boolean greaterGrade(double[] classGrades,double[] classGrades2) {
     double sum = 0;
     double sum2 = 0;
     boolean higherGrades = true;
     
     for (double m : classGrades2) {
       sum2 += m;
     }
       for (double l : classGrades) {
         sum += l;
     }
     if (sum2 > sum) {
       higherGrades = true;
     }
     else {
       higherGrades = false;
     }
    return higherGrades;
}
   
   
   
//    Question 12
   
   public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
     boolean willBuyDrink = true;
          
     if (isHotOutside && moneyInPocket > 10.50) {
       willBuyDrink = true;
   }
     else {
       willBuyDrink = false;
     }
   return willBuyDrink;
   }
   
   
//   Question 13
   
   public static boolean sameAge(int tony, int nyla) {  // For starters, we are trying to figure out who is older between Nyla and Tony. 
     boolean sameAge = true;    // whoever is older will return true.
     
     if (tony == nyla) {  // if both are the same age, will return true; Ages of tony and nyla are on (line153,line154)
       sameAge = true;
     }
     else {
       sameAge = false;   // if both are the same age, will return false;
     }
   return sameAge;        // Will be returning true or false depending on what the if / else returns.  
   }
   
   
   

}