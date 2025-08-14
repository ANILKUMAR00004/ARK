//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ButterflyPattern {
    public static void main(String[] args) {
        int k=4;
        for(int i=1;i<k;i++){
            for (int j=1;j<=(2*k);j++){
                if(j<=i||j>(2*k-i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=k;i>=1;i--){
            for (int j=1;j<=(2*k);j++){
                if(j<=i||j>(2*k-i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
