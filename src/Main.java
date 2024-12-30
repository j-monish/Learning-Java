// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//       System.out.println("enter no 1 and 2"); 
//     //   String name = "ton stari";
//     //   int age = 56; 
//     //   int b = 10;
//     //   int a = 26;
//     //   int diff = a-b;
//     //   System.out.println(diff);
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextint();
//        int b = sc.nextint();
//       System.out.println(a);
//         System.out.println(b);
//       int sum = a+ b;
//       System.out.println(sum);
      
      
//   }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     System.out.println("a is:");
//         int a = sc.nextint();
//     System.out.println("b is:");
//     int b = sc.nextint();
    
//         if (a==b){
//             System.out.println("nos are equal");
//         }
//         else if(a>b){
//             System.out.println("a is greater");
//         }
//         else {
//             System.out.println("a is lesser");
//         }
//     }    
// }


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     System.out.println("a is:");
//     int a = sc.nextint();
    
//     if (a==1) {
//         System.out.println("Namaste");
//     }
//     else if (a==2) {
//         System.out.println("Hello");
//     }
//     else if (a==3){
//         System.out.println("Bonjour");
//     }

    // Switch cases
    // switch(a){
    // case 1:{ System.out.println("Hello"); 
    //         System.out.println("Hi");}
    // break;
    // case 2: System.out.println("Namaste");
    // break;
    // case 3: System.out.println("Bonjour");
    // break;
    // default : System.out.println("Invalid Button");
    // }

// }
// }
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     System.out.println("a:");
//     float a = sc.nextFloat();
//     System.out.println("b:");
//     float b = sc.nextFloat();
//     System.out.println("L is");
//     int L = sc.nextint();
//     float subtraction = a-b;
//     float division = a/b;
//     float modulo= a%b;
//     switch (L){
//     case 1 :{ float addition = a+b;
//             System.out.println(addition);}
//     break;
//     case 2 : System.out.println(subtraction);
//     break;
//     case 3 : System.out.println(division);
//     break;
//     case 4 : {float multiply = a*b; 
//                 System.out.println(multiply);}
//     break;
//     case 5 : System.out.println(modulo);
//     break;
// }
// }
// }

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         // int j; // Declaration
//         // j = 0; // Initialization

//         // for (int i= 0; i<5; i++){
//             // j+= i;
//             // System.out.println(i);
//             // System.out.println("Hello World");
//             int i = 0;
//             while (i<11) {
//                 System.out.println(i);
//                 i++;
//             }
//         }
//     }

    // import java.util.*;
    // public class Main {
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner (System.in);
    //         System.out.println("n is:");
    //         int n = sc.nextint();
        //     int i = 1;
        //     int j=0;
        //     for (i=1;i<= n ;i++){
        //         j+=i;
        //     }
        //     System.out.println(j);
    //     }
    // }

    // import java.util.*;
    // public class Main {
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner (System.in);
    //         System.out.println("n is:");
    //         int n = sc.nextint();
    //         for (int i=1; i<=10;i++){
    //             System.out.println(n+"*"+i+"="+n*i);

    //         }
    //         int i=1;
    //         while (i<=10){
    //         System.out.println(n+"*"+i+"="+n*i);
    //         i++;
    //         }
    //     }
    // }
//     import java.util.*;
//     public class Main {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner (System.in);
//             String a = "*";
//             // String b = " ";
//             System.out.println("n is:");
//             int n = sc.nextint();
//             // System.out.println(a.repeat(n));
//             for (int i=1; i<=n ; i++){
//                 for (int j=1; j <=n; j++){
//                     System.out.print(a);
//                 }
//                 System.out.println();
//             // System.out.println(a+b.repeat(n-2)+a);
//             // }
//             // System.out.println(a.repeat(n));
        
//         }
//     }
// }

// import java.util.*;
//     public class Main {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner (System.in);
//             String a = "*";
//             System.out.println("n is:");
//             int n = sc.nextint();
//             for(int i=1; i<=n; i++){
//                 for(int j=1; j<=n; j++){
//                     if (j==1||j==n||i==1||i==n){
//                         System.out.print(a);
//                     }
//                     else{
//                         System.out.print(" ");
//                     }
//                     }
//                 System.out.println();
//                 }
//             }
//         }



// import java.util.*;
//     public class Main {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner (System.in);
//             String a = "*";
//             System.out.println("n is:");
//             int n = sc.nextint();
//             for(int i= 1; i<=n; i++){
//                 for(int j=n-i+1; j>=1; j--){
//                 System.out.print(a);
//                 }
//                 System.out.println();
//             }
//         }
//     }




    // import java.util.*;
    // public class Main {
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner (System.in);
    //         String a = "*";
    //         System.out.println("n is:");
    //         int n = sc.nextint();
            // for(int i= 1; i<=n; i++){
            //     for(int j=n-i; j>=1; j--){
            //         for(int k=n-j; k>=1; k--){
            //             System.out.print(" ");}
            //             System.out.print(a.repeat(i));
            //         System.out.println();
            // for(int i= 1; i<=n; i++){
            //     for (int j=n-i; j>=1; j--){
            //             System.out.print(" ");}
            //     for (int j=1; j<=n-i+1; j++){
            //     System.out.print(a);}
            //     System.out.println();}       
            //     }
            // }


            // import java.util.*;
            // public class Main {
            //     public static void main(String[] args) {
            //         Scanner sc = new Scanner (System.in);
            //         String a = "*";
            //         System.out.println("n is:");
            //         int n = sc.nextint();
            //         // int number=1;
            //         for (int i=1; i<=n;i++){
            //             for(int j=1;j<=i;j++){
            //                 if(((i+j)%2)==0){

            //                     System.out.print("1");
            //                 }
            //                 else{
            //                     System.out.print("0");            
            //                 }
            //             // if(i%2==0){
            //             // // for(int j=1;j<=i;j++){
            //             //     System.out.print("01".repeat(i));}
            //             //     // number++;
            //             }
            //             System.out.println();
            //             }
            //         }
            //     }


                // import java.util.*;
                // public class Main {
                //     public static void main(String[] args) {
                //         Scanner sc = new Scanner (System.in);
                //         String a = "* ";
                //         System.out.println("n is:");
                //         int n = sc.nextint();
                //         for (int i=1; i<=n;i++){
                //             for(int j=1;j<=i;j++){
                //                 System.out.print(a);}
                //             System.out.println();}
                //         for (int i=n+1; i<=2*n-1; i++){
                //             for(int j=2*n-i;j>=1;j--){
                //                 System.out.print(a);}
                //             System.out.println();}
                //         }
                //     }
                



                //     import java.util.*;
                //     public class Main {
                //         public static void main(String[] args) {
                //             Scanner sc = new Scanner (System.in);
                //             String a = "* ";
                //             System.out.println("n is:");
                //             int n = sc.nextint();
                //             for (int i=1; i<=n;i++){
                //                 for(int j=1;j<=i;j++){
                //                     System.out.print(a);}
                //                 for(int j=i+1;j<=2*n-2*i;j++){
                //                     System.out.print(" ");}
                //                 for(int j=1;j<=i;j++){
                //                         System.out.print(a);}
                //                 }
                //             for (int i = n+1; i<=2*n;i++){
                //                 for(int j=n;j<=2*(2*n-i+1);j--){
                //                     System.out.print(a);}
                //                 for(int j=2*n-i+2;j<=n-i;j++){
                //                     System.out.print(" ");}
                //                 for(int j=1;j<=i;j++){
                //                         System.out.print(a);}
                //                 }

                //             }
                //     }
                // }


                // import java.util.*;
                // public class Main {
                //     public static void main(String[] args) {
                //         Scanner sc = new Scanner (System.in);
                //         String a = "* ";
                //         System.out.println("n is:");
                //         int n = sc.nextint();
                //         for (int i=1; i<=n;i++){
                //             for (int j=n-i+1;j>=1;j--){
                //                 System.out.println(" ");
                //             }
                //             for(int j=1;j<=n;j++){
                //                 System.out.print(a);}
                //             System.out.println();
                //             }
                //         }
                //     }


                    // import java.util.*;
                    // public class Main {
                    //     public static void main(String[] args) {
                    //         Scanner sc = new Scanner (System.in);
                    //         String a = "* ";
                    //         System.out.println("n is:");
                    //         int n = sc.nextint();
                    //         // int num = 0;
                    //         for (int i=1; i<=n;i++){
                    //             for (int j=n-i;j>=1;j--){
                    //                 System.out.print(" ");
                    //             }
                    //             for(int j=1;j<=i;j++){
                    //                 // num++;
                    //                 System.out.print(i+" ");
                    //             }
                    //             System.out.println();
                    //         }
                    //     }
                    // }



                    // import java.util.*;
                    // public class Main {
                    //     public static void main(String[] args) {
                    //         Scanner sc = new Scanner (System.in);
                    //         String a = "* ";
                    //         System.out.println("n is:");
                    //         int n = sc.nextint();
                    //         int num = 0;
                    //         for (int i=1; i<=n;i++){
                    //             for (int j=n-i;j>=1;j--){
                    //                 System.out.print(" ");}
                    //             for (int j=i; j>=1;j--){
                    //                 System.out.print(j+" ");}
                    //             for (int j=2; j<=i;j++){
                    //                 System.out.print(j+" ");
                    //             }
                    //             System.out.println();
                    //         }
                    //     }
                    // }
                        

                    // import java.util.*;
                    // public class Main {
                    //     public static void main(String[] args) {
                    //         Scanner sc = new Scanner (System.in);
                    //         String a = "*";
                    //         System.out.println("n is:");
                    //         int n = sc.nextint();
                    //         int num = 0;
                    //         for (int i=1; i<=n;i++){
                    //             for (int j=n-i+1;j>=1;j--){
                    //                 System.out.print(" ");}
                    //             for (int j=1; j<=2*i-1; j++ ){
                    //                 System.out.print(a);
                    //             }
                    //             System.out.println();
                    //         }
                    //         for (int i=1; i<=n; i++){
                    //             for (int j=1;j<=i;j++){
                    //                 System.out.print(" ");}
                    //             for (int j=2*n-2*i+1; j>=1;j--){
                    //                 System.out.print(a);
                    //             }
                    //             System.out.println();
                    //         }
                    //     }
                    // }


                //    import java.util.*;
                //     public class Main {
                //         public static void main(String[] args) {
                //             Scanner sc = new Scanner (System.in);
                //             String a = "*";
                //             System.out.println("n is:");
                //             int n = sc.nextint();
                //             int num = 0;
                //             for (int i=1; i<=n;i++){
                //                 for (int j=1;j<=i-1;j++){
                //                     System.out.print(" ");}
                //                 for(int j=n-i+1;j>=1;j--){
                //                     System.out.print(a);
                //                 }
                //                 System.out.println();
                //             }
                //         }
                //     }


                // import java.util.*;
                // public class Main {
                //     public static void main(String[] args) {
                //         Scanner sc = new Scanner (System.in);
                //         String a = "*";
                //         System.out.println("n is:");
                //         int n = sc.nextint();
                //         int num = 0;
                //         for (int i=1; i<=n;i++){
                //             for(int j=1;j<=i-1;j++){
                //                 System.out.print(" ");}
                //             for(int j=n-i+1;j>=1;j--){
                //                 System.out.print(a+" ");}
                //             System.out.println();
                //         }
                //     }
                // }
            
                // import java.util.*;
                // public class Main {
                //     public static void main(String[] args) {
                //         Scanner sc = new Scanner (System.in);
                //         String a = "*";
                //         System.out.println("n is:");
                //         int n = sc.nextint();
                //         int num = 0;
                //         for (int i=1; i<=n;i++){
                //             for(int j=1;j<=i-1;j++){
                //                 System.out.print(" ");}
                //             // for(int j=n-i+1;j>=1;j--){
                //                 // System.out.print(a+" ");}
                //                 for (int j=1;j<=2*n-1;j++){
                //                     if((i+j)%2==0){
                //                         System.out.print(a);
                //                     }
                //                     else;
                //                     System.out.print(" ");
                //                 }
                //             System.out.println();
                //         }
                //     }
                // }


                // import java.util.*;
                // public class Main {
                //     public static void main(String[] args) {
                //         Scanner sc = new Scanner (System.in);
                //         String a = "*";
                //         System.out.println("n is:");
                //         int n = sc.nextint();
                //         int num = 0;
                //         for (int i=1; i<=n;i++){
                //             for(int j=1;j<=i-1;j++){
                //                 System.out.print(" ");}
                //             for(int j=n-i+1;j>=1;j--){
                //                 System.out.print(a+" ");}
                //             System.out.println();
                //         }
                //     }
                // }


                // import java.util.*;
                // public class Main {
                //     public static int calculateSum(int a, int b){
                //         int sum = a+b;
                //         // System.out.println(sum);
                //         return(sum);
                //     }
                //     public static void main(String[] args) {
                //         Scanner sc= new Scanner(System.in);
                //         int a = sc.nextint();
                //         int b = sc.nextint();
                //         // String name = sc.nextLine();
                //         // printMyName(name);
                //         int sum=calculateSum(a, b);
                //         System.out.println(sum);
                //     }
                // }
                

                // import java.util.*;
                // public class Main {
                //     public static int calculateProduct(int a, int b){
                //         int Product = a*b;
                //         // System.out.println(sum);
                //         return(Product);
                //     }
                //     public static void main(String[] args) {
                //         Scanner sc= new Scanner(System.in);
                //         int a = sc.nextint();
                //         int b = sc.nextint();
                //         // String name = sc.nextLine();
                //         // printMyName(name);
                //         int Product=calculateProduct(a, b);
                //         System.out.println(Product);
                //     }
                // }


                // import java.util.*;
                // public class Main {
                //     public static int calculateProduct(int n){
                //         int j=1;
                //         for(int i=n;i>=1;i--){
                //         j++=i;
                //         int k=j++*j;
                //         }
                //         return(Product);




                //         import java.util.*;
                //         public class Main {
                //             public static void main(String[] args) {
                // System.out.println("n is:");
                // Scanner sc= new Scanner(System.in);
                //   int n = sc.nextint();
                //         int j=1;
                //         for(int i=n;i>=1;i--){
                //         j++=i;
                //         int k=j++*j;
                //         }
                //         system.out.println(k);
                //     }
                // }



                 // import java.util.*;
                // public class Main {
                //     public static int calculateProduct(int a, int b){
                //         int Product = a*b;
                //         // System.out.println(sum);
                //         return(Product);
                //     }
                //     public static void main(String[] args) {
                //         Scanner sc= new Scanner(System.in);
                //         int a = sc.nextint();
                //         int b = sc.nextint();
                //         // String name = sc.nextLine();
                //         // printMyName(name);
                //         int Product=calculateProduct(a, b);
                //         System.out.println(Product);
                //     }
                // }


      // Enter 3 numbers from the user & make a function to print their average.

                // import java.util.*;
                // public class Main {
                //     public static float average(int a, int b, int c){
                //         float average = (float)(a+b+c)/3;
                //         return average;
                //     }
                //     public static void main(String[] args){
                //         Scanner sc = new Scanner(System.in);
                //         int a = sc.nextint();
                //         int b = sc.nextint();
                //         int c = sc.nextint();
                //         float average=average(a, b, c);
                //         System.out.println(average);
                //     } 
                // }

// Write a function to print the sum of all odd numbers from 1 to n.

                // import java.util.*;
                // public class Main {
                //     public static int sum(int n){
                //         int sum=0;   
                //         for (int i=1; i<=n; i+=2){
                //             sum=sum+i;
                //             // System.err.println(n);
                //         }
                //         return sum;
                //     }

                //     public static void main(String[] args){
                //         Scanner sc = new Scanner(System.in);
                //         int n = sc.nextint();
                //         int sum= sum(n);
                //         System.out.println(sum);
                //     }
                // }

                // Write a function which takes in 2 numbers and returns the greater of those two.
            
            // import java.util.*;
            //     public class Main {
            //         public static int greater(int a, int b){
            //             // if(a>b){ 
            //             //     int greater = a;}
                            
            //             // else;
            //             //     int greater = b;
            //             // return greater;
            //             int greater = 0;
            //             greater = a > b ? a : b;
            //             return greater;
  
            //         }
            //         public static void main (String[] args){
            //             Scanner sc = new Scanner (System.in);
            //             int a = sc.nextint();
            //             int b = sc.nextint();
            //             int greater=greater(a, b);
            //             System.out.println(greater);
            //         }
            //     }



            // Write a function that takes in the radius as input and returns the circumference of a circle.

            //    import java.util.*;
            //     public class Main {
            //         public static float circumference(int radius){
            //             // int radius;
            //             float circumference = (float) (2*3.14*radius);
            //             return circumference;
            //         }
            //         public static void main(String[] args){
            //             Scanner sc = new Scanner (System.in);
            //             int radius = sc.nextint();
            //             float circumference=circumference(radius);
            //             System.out.println(circumference);
            //         }
                // }


                // Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

                // import java.util.*;
                //     public class Main {
                //         public static String eligible(int age){
                //             // if(age>=18){
                //             //     System.out.println("Eligible to vote");
                //             // }
                //             // else;
                //             //     System.out.println("Not elligible to vote");    
                //             String eligible;
                //             eligible = age>=18?"Eligible":"Ilegible";
                //             return(eligible);
                //         }                
                //         public static void main(String[] args){
                //             Scanner sc = new Scanner (System.in);
                //             int age = sc.nextint();
                //             String eligible = eligible(age);
                //             System.out.println(eligible);
                //         }
                //     }


                // Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

                // import java.util.*;
                //     public class Main {
                //         public static int value(int x,int n){
                //             // int value=Math.pow(x, n);
                //             // return value;
                //             int value=x;
                //             for(int i=1; i<=n; i++){
                //                 value=value*x;
                //             }
                //             return(value);
                //         }
                //         public static void main(String[] args){
                //             Scanner sc = new Scanner(System.in);
                //             int x = sc.nextint();
                //             int n = sc.nextint();
                //             int value = value(x, n);
                //             System.out.println(value);
                //         }
                //     }



                // Write a function that calculates the Greatest Common Divisor of 2 numbers. 
                // import java.util.*;
                // public class Main{
                //     public static int gcd(int a, int b){
                //         int min = Math.min(a, b);
                //         int gcd=1;
                //         // int i=1;
                //          for(int i=1; i<=min; i++){
                //         if(a%i==0 && b%i==0){            
                //             gcd=i;}
                //         // else;
                //         // gcd=1;
                //     }
                //     return gcd;}
                //     public static void main(String[] args){
                //         Scanner sc = new Scanner(System.in);
                //         int a = sc.nextint();
                //         int b = sc.nextint();
                //         int gcd = gcd(a, b);
                //         System.out.println(gcd);

                //     }
                // }
            


                // import java.util.*;


    //           
    
                
                // import java.util.Scanner;

                // public class Main {
                //     public static void main(String[] args) {
                //         Scanner sc = new Scanner(System.in);
                //         int n = sc.nextInt();  // Use integer for whole numbers
                //         int dup = n;           // Duplicate of n for digit count
                //         int dup_1 = n;         // Duplicate of n for Armstrong check
                //         int count = 0;         // Count of digits
                //         int sum = 0;           // Sum of powered digits
                
                //         // Count the number of digits
                //         while (dup > 0) {
                //             count++;
                //             dup /= 10;
                //         }
                
                //         // Calculate the sum of the digits raised to the power of count
                //         while (dup_1 > 0) {
                //             int ld = dup_1 % 10; // Last digit
                //             sum += Math.pow(ld, count);
                //             dup_1 /= 10;         // Remove the last digit
                //         }
                
                //         // Check if the number is an Armstrong number
                //         if (sum == n) {
                //             System.out.println("The number is an Armstrong number.");
                //         } else {
                //             System.out.println("The number is not an Armstrong number.");
                //         }
                
                //         sc.close();  // Close the scanner to prevent resource leaks
                //     }
                // }


                              
                                                       
                                


                //     while(input == 1) {
                //         System.out.println("Enter your number : ");
                //         int number = sc.nextint();
                //         if(number > 0) {
                //             positive++;
                //         } else if(number < 0) {
                //             negative++;
                //         } else {
                //             zeros++;
                //         }


                //         System.out.println("Press 1 to continue & 0 to stop");
                //         input = sc.nextint();
                //     }


                //     System.out.println("Positives : "+ positive);
                //     System.out.println("Negatives : "+ negative);
                //     System.out.println("Zeros : "+ zeros);
                // }   
                // }


    //    import java.util.*;
    //    public class Main{
    //     public static int factorial(int n){
    //         int factorial=1;
    //         for(int i=1; i<=n; i++){
    //             factorial=factorial*i;
    //         }
    //        return(factorial);
    //         }
    //     public static void main(String args[]){
    //         Scanner sc = new Scanner(System.in);
    //         int n = sc.nextint();
    //         int factorial = factorial(n);
    //         System.out.println(factorial);
    //     }
    //    }