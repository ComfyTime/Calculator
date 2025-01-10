package main.java.com.example.calculator.LV2;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();

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

            calculator.setCalculate(ans);
            System.out.println("계산 결과 :"+ans);
            System.out.println("Result List :"+ calculator.getCalculate());
            System.out.println("계산 목록을 삭제 하시겠습니까?[y/n]");
            String remove=sc.next();
            switch (remove){
                case "y":
                    System.out.println("삭제할 항목 순번을 입력하세요.");
                    int j=sc.nextInt();
                    calculator.setCalculateRemove(j);
                    System.out.println("삭제합니다.");
                    System.out.println("Result List :"+ calculator.getCalculate());
                    break;
                case "n":
                    break;
                default:
                    System.out.println("올바른 값이 입력되지 않았습니다.");
            }
            System.out.println("계산을 중단하려면 [exit]입력");
            String continu = sc.next();
            switch (continu){
                case "exit": i++;
            }
        }
    }
}