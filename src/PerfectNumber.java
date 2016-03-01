import java.util.Scanner;

public class PerfectNumber {
  public static void main(String[] args){
    int sum = 0;
    
    for (int i = 1; i <= 10000; i++ ){
      for (int j = 1; j < i; j++){
        if (i % j == 0)
          sum += j;  
      }  // for j
      if (sum == i)
        System.out.println(i + " is a perfect number");
      sum = 0;
    }  // for i
  } // main   
} // PerfectNumber
