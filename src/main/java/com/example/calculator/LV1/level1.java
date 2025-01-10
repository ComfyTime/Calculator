package main.java.com.example.calculator.LV1;

import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {

        System.out.println("Simple Calculator LV1 running.");
        Scanner sc=new Scanner(System.in);
        int i=0;

        while (i <1){
            System.out.println("첫번째 숫자를 입력 :");
            double num1 = sc.nextDouble();
            System.out.println("사칙연산 기호를 입력 :");
            String cal = sc.next();
            System.out.println("두번째 숫자를 입력 :");
            double num2 = sc.nextDouble();
            double ans = 0;


            switch (cal){
                case "+": ans=num1+num2;
                    break;
                case "-": ans=num1-num2;
                    break;
                case "*": ans=num1*num2;
                    break;
                case "x": ans=num1*num2;
                    break;
                case "X": ans=num1*num2;
                    break;
                case "/": if (num2==0){
                    System.out.println("나눗셈 연산에서 0으로는 나눌 수 없습니다.");
                    break;
                } else {
                    ans=num1/num2;
                    break;
                }
                default:
                    System.out.println("올바른 값이 입력되지 않았습니다.");
            }

            System.out.println("계산 결과 :"+ans);
            System.out.println("계산을 중단하려면 [exit]입력");
            String continu = sc.next();
            switch (continu){
                case "exit": i++;
            }
        }
    }
}