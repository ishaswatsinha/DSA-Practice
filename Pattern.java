public class Pattern {
        public static void main(String[] args) {
                int n = 5;

// * * * *
// * * * *
// * * * *
// * * * *
                // for(int i = 1; i < n; i++){
                // for(int j=1 ; j < n; j++){
                // System.out.print("* ");
                // }
                // System.out.println();
                // }

// * * * *
// * * *
// * *
// *
                // for(int i = 1; i < n; i++){
                // for(int j=i ; j < n; j++){
                // System.out.print("* ");
                // }
                // System.out.println();
                // }
                // OR
                // for(int i=n ; i > 0; i--){
                // for (int j=1 ; j<=i ; j++ ){
                // System.out.print("* ");
                // }
                // System.out.println();
                // }

// *
// * *
// * * *
// * * * *

                // for(int i=0; i<n ; i++){
                // for(int j=0; j<=i ; j++){
                // System.out.print("* ");
                // }
                // System.out.println();
                // }

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
                // for(int i=1 ; i<=n ; i++) {
                // for(int j=1 ; j<=i ; j++){
                // System.out.print(j);
                // }
                // System.out.println();
                // }
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
                // int n = 4;
                // for (int i = 0; i < n; i++) {
                //         for (int j = 0; j <= i; j++) {
                //                 System.out.print("* ");
                //         }
                //         System.out.println();
                // }

                // for (int i = 0; i < n; i++) {
                //         for (int j = n; j >= i; j--) {
                //                 System.out.print("* ");
                //         }
                //         System.out.println();
                // }
//     * 
//    ** 
//   *** 
//  **** 
// ***** 
                for(int i = n; i>=0 ;  i--) {
                        for(int j=n ; j<=i;j--){
                                System.out.print(" ");
                        }
                        System.out.print("*");
                        System.out.println();
                }
        }
}
