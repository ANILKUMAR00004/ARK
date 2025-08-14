public class pattern2  {
    public static void main (String[]args){
        int k=4;
        for(int i=1;i<=k;i++){
            System.out.print("    ");
       for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=1;i<=k;i++)
            System.out.print("* ");
        System.out.println();
        System.out.print("    ");
        for(int i=1;i<=k;i++)
            System.out.print("* ");
        System.out.println();
        for(int i=k;i>=1;i--) {
            System.out.print("    ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
