import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GcdOfArray{
    public static void main(String[] args) {
        Integer[] arr={24,48,96};
        int ln=arr.length;
        int min = Collections.min(Arrays.asList(arr));
        int gcd=0;
        for(int i=1;i<=min;i++){
                int flag=0;
                for(int j=0;j<ln;j++){
                    if(arr[j]%i==0){
                        flag +=1;
                    }
                    else{
                        break;
                    }
                }
                if(flag==ln){
                        gcd=i;
                }
        }
        System.out.println("Gcd of given array alement is :" +  gcd);

    }
}