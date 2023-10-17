public class Box {
    public static void main(String[] args)  {
    
    }
    static void pattern1(int n){
            for(int row =1 ; row<=n ; row++) {
                //for every row ; run col
                for(int col =1 ; col <= n ; col++){
                    System.out.print("* ") ;
                }
                //when one row is printed , weadd newline
                System.out.println();
            }
        }
    }
