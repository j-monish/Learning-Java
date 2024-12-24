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
//       int a = sc.nextInt();
//        int b = sc.nextInt();
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
//         int a = sc.nextInt();
//     System.out.println("b is:");
//     int b = sc.nextInt();
    
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
//     int a = sc.nextInt();
    
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
//     int L = sc.nextInt();
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
    //         int n = sc.nextInt();
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
    //         int n = sc.nextInt();
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
//             int n = sc.nextInt();
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
//             int n = sc.nextInt();
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
//             int n = sc.nextInt();
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
    //         int n = sc.nextInt();
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
            //         int n = sc.nextInt();
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
                //         int n = sc.nextInt();
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
                //             int n = sc.nextInt();
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
                //         int n = sc.nextInt();
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
                    //         int n = sc.nextInt();
                    //         int num = 0;
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
                    //         int n = sc.nextInt();
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
                    //         int n = sc.nextInt();
                    //         int num = 0;
                    //         for (int i=1; i<=n;i++){
                    //             for (int j=n-i+1;j>=1;j--){
                    //                 System.out.print(" ");}
                    //             for (int j=1; j<=2*i-1; j++ ){
                    //                 System.out.print(a);
                    //             }
                    //             System.out.println();
                    //         }
                    //         for (int i=n; i<=2*n; i++){
                    //             for (int j=1;j<=i-n+1;j++){
                    //                 System.out.print(" ");}
                    //             for (int j=n-i+1; j>=1;j--){
                    //                 System.out.print(a);
                    //             }
                    //             System.out.println();
                    //         }
                    //     }
                    // }


