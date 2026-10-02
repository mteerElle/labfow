//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {
    static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[4];
        int[] arr3 = new int[3];

        fakearr ar = new fakearr(7);
        ar.addToEnd(7);

        ar.set(2, 5);
        ar.addToEnd(6);
        ar.addToEnd(9);
        ar.remove(2);



    }





    public static boolean lessthanhun( int[] arr){
        boolean ret = true;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] >=100){
                ret =false;
            }
        }
        return ret;
    }
}

