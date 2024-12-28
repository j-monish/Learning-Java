import java.util.*;
public class Array{
    public static void main(String[] args){
        // int [] numbers = new int [3];
        // numbers[0] = 1;
        // numbers[1] = 5;
        // numbers[2] = 7;
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // for (int i = 0 ; i<size; i++){
        //     int n = sc.nextInt();
        //     numbers[i]=n;
        // }

        // // int numbers [] = {1,3,9};
        // for(int i=0;i<size;i++){
        // System.out.println(numbers[i]);
        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // String names[] = new names [size];
        //     for ( int i =0; i < size; i++){
        //         n[i] = sc.nextInt();
        //     }
        //     for (int i=0; i< size; i++){
        //         System.out.println(numbers[i]);
        //     }
        //     for (int i=0; i< numbers.length; i++){
        //         if(numbers[i] ==9){
        //             System.out.println(i);
        //         }




        // Take an array of names as input from the user and print them on the screen.

//                 Scanner sc = new Scanner(System.in);
//                 int size = sc.nextInt();
//                 // sc.nextLine();
//                 String names[] = new String[size];
//                 for(int i=0; i<size;i++){
//                     names[i]=sc.nextLine();
//                 }
//                 for (int i =0; i<names.length;i++){
//                     System.out.println(names[i]);
//                 }
//     }
// }


// Find the maximum & minimum number in an array of integers.
            Scanner sc = new Scanner (System.in);
            int size = sc.nextInt();
            // nextLine();
            int numbers [] = new int[size];
            for(int i=0; i<size;i++){
                numbers[i]=sc.nextInt();
            }
            int i;
            // int j;
            // int k;
            // int k = numbers[i-1];
            boolean Check = true;
            for (i=0;i<size-1;i++){
                // if(numbers[i+1]>numbers[i]){
                //    j = numbers[i+1];
                // }
                if(numbers[i+1]<numbers[i]){
                    // System.out.println(True);}
                    Check = false;}
                // else;
                // Check = false;
                }
            if (Check){
                System.out.println("Ascending");
            }
            else;
            System.err.println("Not Ascending");
            
            }
        }





