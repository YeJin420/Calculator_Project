package sparta.io;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Java");

        System.out.print("Hello");
        System.out.print("Java!");

        System.out.println("Hello\nWorld!");

        //입력 (Scanner)
        // 스캐너 객체를 스캐너형 박스에 넣었다(scanner)
        Scanner scanner = new Scanner(System.in);

        //정수형 데이터를 정수형 박스에 넣었다 (a)
        int a = 1;

        //문자열 입력받기
        System.out.println("좋아하는 문장을 입력하세요 : ");
        String sentence = scanner.nextLine();
        System.out.println("좋아하는 문장 : " + sentence);

        // 숫자 입력받기
        System.out.print("정수(int)를 입력하세요: ");
        int intBox = scanner.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.print("실수를 입력하세요: ");
        double doubleBox = scanner.nextDouble();
        System.out.println("doubleBox = " + doubleBox);

        System.out.print("큰 정수(long)를 입력하세요: ");
        long longBox = scanner.nextLong();
        System.out.println("longbox = " + longBox);

    }
}
