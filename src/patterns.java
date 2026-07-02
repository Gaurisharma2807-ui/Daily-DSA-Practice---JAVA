public class patterns {
    static void main() {
        // square
//        int n=3;
//        for( int row=1;row<=n;row++){
//            for(int col=1;col<=5;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // right angle triangle
//        int n=5;
//
//        for(int row=1;row<=n; row++){
//            for(int col=1;col<=row;col++){
//                System.out.print  ("* ");
//            }
//            System.out.println();
//        }

        // solid rhombus pattern
//        int n=5;
//        for(int row=1;row<=n;row++){
//            //fro each row -> spaces, stars
//            //spaces
//            for(int col=1;col<=n-row;col++){
//                System.out.print(" ");
//            }
//            //stars
//            for(int col=1;col<=n;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        // inverted right angled triangle
//        int n=5;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=n-row+1;col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //solid pyramid triangle
//        int n=5;
//        for(int r=1;r<=n;r++){
//            //spaces
//            for (int c=1;c<=n-r ; c++){
//                System.out.print("  ");
//
//            }
//            //stars
//            for(int c=1;c<=2*r-1;c++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // inverted solid pyramid triangle
//        int n=4;
//        for(int r=1;r<=n;r++){
//            //spaces
//            for(int c=1;c<=r-1;c++){
//                System.out.print("  ");
//            }
//            for(int c=1;c<=2*n-2*r+1;c++){
//                System.out.print ("* ");
//            }
//            System.out.println();
//        }
        // hollow rectangular patter
//        int n = 4;
//        for (int r = 1; r <= n; r++) {
//            for (int c = 1; c <= 6; c++) {
//                if (r == 1 || r == n) {
//                    System.out.print("* ");
//                } else {
//                    //middle rows
//                    if (c == 1||c==6) {
//                        System.out.print("* ");
//                    }else {
//                        //middle col
//                        System.out.print("  ");
//                    }
//                }
//
//            }
//            System.out.println();
//
//
//        }
//
//   int n=5;
//   for(int r = 1; r<=n; r++){
//       if(r==1||r==2||r==n){
//           for(int c=1;c<=r;c++){
//               System.out.print("* ");
//           }
//       }else{
//           //middle row
//           System.out.print("* ");
//           //(r-2) spaces
//           for(int c=1;c<=(r-2);c++){
//               System.out.print("  ");
//           }
//           //1*
//           System.out.print("* ");
//
//       }
//       //move to the next row
//       System.out.println();
//   }


        int n=4;
        for(int r=1;r<=n;r++) {
            //spaces
            for (int c = 1; c <= n - r; c++) {
                System.out.print("  ");
            }
            //part 2
            if (r == 1 ) {
                for (int c = 1; c <= 2 * r - 1; c++) {
                    System.out.print("* ");
                }
            } else {
                //middle rows
                //1*
                System.out.print("* ");
                //2r-3 spaces
                for (int c = 1; c <= 2 * r - 3; c++) {
                    System.out.print("  ");

                }
                //1*
                System.out.print("* ");


            }
            System.out.println();

        }
        for (int r=1;r<=(n-1);r++){
            //for eacg row-> variable col

            //part 1
            for(int c=0;c<=r;c++){
                System.out.print("  ");
            }
            //part2
            if(r==(n-1)){
                System.out.print("* ");

            }else{
                //remaining rows
                //1*
                System.out.print("* ");
                //(2(n-r)-3) spaces
                for(int c=1;c<=2*(n-r)-3;c++){
                    System.out.print("  ");
                }
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}