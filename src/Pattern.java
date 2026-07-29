public class Pattern {
    static void main() {

//        int n= 8;
        //      for(int row=1; row<=n; row++){
        //for each row -> n columns
        //        for(int col=1; col<=n; col++){
        //print *
        //          System.out.print("😍 ");

        //    }
        //movr to next line or row
        //  System.out.println();
        //}

        //    int n = 3;

        //  for(int row=1; row<=n; row++){ //
        //    for(int col=1; col<=5; col++){
        //      System.out.print("* ");
        //}
        // System.out.println();
        // }

//        int n = 5;
//
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//

//        int n=5;
//        for(int row=1; row<=n; row++){
//            //for each row -> sp aces, star
//
//            //Spaces
//            for(int col=1; col<=n-row; col++){
//
//                System.out.print(" ");
//            }
//            //Stars
//            for(int col=1; col<=n; col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int n=5;
//        for(int row=1; row<=n; row++) {
//            //for each row -> sp aces, star
//
//            //Spaces
//            for (int col = 1; col <= n - row +1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

//        int n =9;
//
//        for(int row=1; row<=n; row++) {
//            // for each row varibles columns
//            // space
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print(" ");
//
//            }
//            //Stars
//            for (int col = 1; col <= 2 * row - 1; col++) {
//                System.out.print("*");
//            }
//            //Move to next line.
//            System.out.println();
//        }

//        int n=4;
//
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=n+1/5; col++){
//                System.out.print(" ");
//            }
//            for(int col=1; col<=2*n-row-row; col++ ){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        int n = 4;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=6; col++) {
//                if (row == 1 || row == 4) {
//                    System.out.print("*");
//                } else {
//                    if (col == 1 || col == 6) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }


        //holo right angle trinangle
//        int n = 5;
//
//        for (int row=1; row<=n; row++) {
//            if (row==1 || row==2 || row==n) {
//                for (int col=1; col<=row; col++) {
//                        //PRinting Stars
//                    System.out.print("* ");}
//            }
//            else {
//                //firse stars
//                System.out.print("* ");
//                for (int col=1; col<=(row-2); col++) {
//                    //print space
//                    System.out.print("  ");
//                }
//                //print stars
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Hollow Pyramid (Triangle)

//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//            if (row == 1 || row == n) {
//                for(int col=1; col<=2*row-1; col++){
//
//                System.out.print("* ");
//            }
//        }
//           else{
//            //1*
//            System.out.print("* ");
//            for (int col = 1; col <= 2 * row - 3; col++) {
//                System.out.print("  ");
//            }
//            System.out.print("* ");
//        }
//        System.out.println();
//    }



//        int n = 4;
//
//// Top triangle (including middle row)
//        for (int row = 1; row <= n; row++) {
//            // Leading spaces
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print(" ");
//            }
//            // Stars
//            for (int col = 1; col <= 2 * row - 1; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//// Bottom triangle
//        for (int row = 1; row <= n; row++) {
//            if (row == 1) continue; // skip first row (already printed as middle)
//
//            // Leading spaces
//            for (int col = 1; col <= row - 1; col++) {   // ← fix: n - (n - row + 1)
//                System.out.print(" ");
//            }
//            // Stars
//            for (int col = 1; col <= 2 * (n - row) + 1; col++) {  // ← fix
//                System.out.print("*");
//            }
//            System.out.println();
//        }



     //Holo solid Dimond Pattern

//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//            if (row == 1) {
//                for(int col=1; col<=2*row-1; col++){
//
//                    System.out.print("* ");
//                }
//            }
//            else{
//                //1*
//                System.out.print("* ");
//                for (int col = 1; col <= 2 * row - 3; col++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

         // Part-2

//        for(int row=1; row<=(n-1); row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("  ");
//            }
//            if (row == n - 1) {
//                System.out.print("* ");
//            } else {
//                //1*
//                System.out.print("* ");
//
//                for (int col = 1; col <= 2 * (n - row) - 3; col++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }



        //ButterFly Pattern

//        int n=4;
//
//        //part=1
//        for(int row=1; row<=n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
////            part=2
//            for (int col = 1; col <= 2 * (n - row); col++) {
//                System.out.print("  ");
//            }
////            part=3
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//            for(int row=1; row<=n; row++){
////            part=4
//            for(int col=1; col<=n-row+1; col++){
//                System.out.print("* ");
//            }
////            part=5
//            for(int col=1; col<=2*(row-1); col++){
//                System.out.print("  ");
//            }
////            part=6
//            for(int col=1; col<=n-row+1; col++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }



//1 to 5 num,bers printing
//int n=5;
//
//for(int row=1; row<=n; row++) {
//    for (int col = 1; col <= row; col++){
//        System.out.print(col);
//    }
//    System.out.println();
//}


//  int n=5;
//  int count=1;
//
//  for(int row=1; row<=n; row++){
//      for(int col=1; col<=row; col++){
//          System.out.print(count +" ");
//          count++;
//      }
//      System.out.println();
//  }


//         int n=5;
//
//         for(int row=1; row<=n; row++){
//             for (int col=1; col<=row; col++){
//                 int a=col;
//                 int b=('A'-1);
//                 int ans=a+b;
//                 char finalans=(char)ans;
//                 System.out.print(finalans +" ");
//             }
//             System.out.println();
//         }


//        int n=5;
//
//        for(int row=1; row<=n; row++){
//            for (int col=1; col<=row; col++){
//                int a=n-col;
//                int b='A';
//                int ans=a+b;
//                char finalans=(char)ans;
//                System.out.print(finalans +" ");
//            }
//            System.out.println();
//        }


//int n=4;
//
// for(int row=1; row<=n; row++){
//     for(int col=1; col<=n-row; col++){
//         System.out.print("  ");
//     }
//     //part2
//     for(int col=1; col<=row; col++){
//         System.out.print(col + " ");
//     }
//     //part3
//int rowValue = row;
//     int decRowValue = row-1;
//     for(int col=1; col<=row-1; col++){
//         System.out.print(decRowValue + " ");
//         decRowValue--;
//     }
//     System.out.println();
// }


//      int n=4;
//
//      for(int row=1; row<=n; row++){
//          for(int col=1; col<=n-row; col++){
//              System.out.print("  ");
//          }
//          for(int col=1; col<=2*row-1; col++){
//              System.out.print(" "  +row);
//          }
//
//
//          System.out.println();
//
//
//
//      }


    int n=4;

    for(int row=1;  row<=n; row++){
        for(int col=1; col<=n-row; col++){
            System.out.print("  ");
        }
        for(int col=1; col<=row; col++){
            int a=col;
            int b='A'-1;
            int ans=a+b;
            char finalAns=(char)ans;
            System.out.print(finalAns + " ");
        }
        //part3
        char toPrint=(char) (row+ 'A' -2);
        for(int col=1; col<=row-1; col++){
            System.out.print(toPrint + " ");
            toPrint--;

        }
        System.out.println();
    }







    }
}
