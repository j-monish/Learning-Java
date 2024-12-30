import java.util.*;
public class BasicMaths {

    //             public static void main(String args[]) {
    //                 Scanner sc = new Scanner(System.in);
    //                 int n = sc.nextint();
    //             int dup = n;
    //                 int rev = 0;
    //                 while (n>0) {
    //                     int ld = n%10;
    //                     rev = rev*10 +ld;
    //                     n=n/10;
    //                 }
    //                 if(rev == dup){
    //                 System.out.print("true");
    //             }
    //             else{
    //                 System.out.println("false");
    //             }
    //         }
    //     }

        //             import java.util.*;
    //             public class Main{
    //             public static void main(String args[]) {
    //                 Scanner sc = new Scanner(System.in);
    //                 int n = sc.nextint();
    //                 int j=0;
    //                 while(n>0){
    //                     int last_digit=n%10;
    //                     j=j+1;
    //                     n=n/10;
    //                 }
    //                 System.out.println(j);
    // }
    //             }



    
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int dup = n;
    //     int dup_1 = n;
    //    int count=0;
    //    int sum = 0;
    //     while (n>0) {
    //         count = count + 1;
    //         n=n/10;
    //     }
    //     System.out.println(count);
    //     while (dup>0){
    //        int ld = dup%10;
    //        sum = sum + (int)Math.pow(ld,count);
    //        dup=dup/10;                               
    //     }
    //     System.out.println(sum);
    //     if(sum==dup_1){
    //         System.out.println("No is an armstrong no.");
    //     }
    // }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dup = n;
        int count = 0;
    //     while (n>0) {
    //         int ld=n%10;
    //         if (dup%ld == 0){
    //             System.out.println(ld);
    //             count=count+1;
    //         }
    //         n=n/10;
    //         }
    //         System.out.println(count);
    //     }
    // }
    for(int i = 1;i <= n; i++){
        if(n%i==0){
            count = count + 1;}
        }
    int[] divisors = new int[count];
    int j =-1;
    for(int i=1;i<=n;i++){
        if(n%(i) == 0){
            j=j+1;
            // for(j =0; j< count; j++){
        divisors[j] =i;
        
        
        }

    }
for(int i=0;i<count;i++){
System.out.println(divisors[i]);
    }
}
}

    

