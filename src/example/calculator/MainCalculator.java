package example.calculator;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // 숫자 -> 연산자 -> 숫자 -> 결과 -> 더 할건지 안할건지 물어보기 -> 종료
        while (true) {
            //숫자 -> 연산자 -> 숫자
            System.out.print("계산 할 첫번째 숫자를 입력하세요. : ");
            int num1 = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요. (+, -, *, /) : ");
            char operator = scanner.next().charAt(0);

            System.out.print("계산 할 두번째 숫자를 입력하세요. : ");
            int num2 = scanner.nextInt();

            //결과
            int result = calculator.calculate(num1, num2, operator);

            //결과 출력
            if (result != -1) {
                System.out.println("결과 " + result);

            }

            // 저장된 결과 출력
            System.out.println("저장된 결과들" + calculator.getResults());

            scanner.nextLine();

            //삭제
            System.out.println("제일 오래된 결과를 삭제하겠습니까? (Y/N) : ");
            String delete = scanner.nextLine();
            if (delete.equals("Y")) {
                calculator.removeResults();
                System.out.println(" 삭제 후 결과 : " + calculator.getResults());
            }

            // 계속 할건지에 대한 코드
            System.out.println("계속 하시겠습니까? (Y/N) : ");
            String answer = scanner.nextLine();
            if (answer.equals("N")) {
                break;

            }
            System.out.println();

        }
        // 종료코드
        System.out.println("계산기를 종료합니다.");
        scanner.close();

    }
}
