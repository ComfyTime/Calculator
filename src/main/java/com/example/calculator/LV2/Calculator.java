package main.java.com.example.calculator.LV2;

import java.util.ArrayList;

public class Calculator {
    //연산 결과 저장용 컬랙션
   private ArrayList<Double> doubleArrayList=new ArrayList<Double>();
   private Double calculate(double answer){
        doubleArrayList.add(answer);
        return answer;
   }
   double setCalculate(double answer) {
       calculate(answer);
       return answer;
   }
   String getCalculate(){
        return doubleArrayList.toString();
   }
   void setCalculateRemove(int j){
       this.doubleArrayList.remove(j);
   }
}