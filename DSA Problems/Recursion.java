// Print GFG n times without the loop.

// class Solution {
//     void helperPrintGfg(int N, int count){
//         if(count == N+1){
//             return;
//         }
//         // count = 1;
//         System.out.print("GFG ");
//         // count = count + 1;
//         helperPrintGfg(N, count+1);
//     }

//     void printGfg(int N) {
//         // code here
//         int count = 1;
//         helperPrintGfg(N, count);
        
//     }
// }




// Print 1 To N Without Loop

// class Solution {
    
//     public void helperPrintNos(int n, int count){
//         if (count == n+1){
//             return;
//         }
//         System.out.print(count +" ");
//         count = count + 1;
//         helperPrintNos(n, count);
        
//     }

//     public void printNos(int n) {
//         // Your code here
//         int count = 1;
//         helperPrintNos(n, count);
//     }
// }



// Print N to 1 without loop
// class Solution {
//     void helperPrintNos(int N, int count){
//         if(count == 0 ){
//             return;
//         }
//         System.out.print(count + " ");
//         helperPrintNos(N, count-1);
//     }

//     void printNos(int N) {
//         // code here
//         int count = N+1;
//         helperPrintNos(N, count-1);
//     }
// }


import java.util.*;
    public class Recursion{
        public static void helperPrintSum(int sum, int n, int i){
            if(i == n+1){
                System.out.println(sum);
                return;
            }
            // sum = i + sum; 
            // i++; 
            helperPrintSum(sum+i, n, i+1);
            
            }
            // public static void main(syr){
            public static void main(String[] args) {
                int i = 1;
                int sum =0;
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                helperPrintSum(sum, n, i);
                
            }
        }
        

