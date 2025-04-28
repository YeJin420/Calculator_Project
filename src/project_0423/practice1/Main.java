package project_0423.practice1;

public class Main {
    // 속성
    // 생성자
    // 기능

    public static void main(String[] args) {
        Icecream icecream1 = new Icecream("바닐라", 1000);
        icecream1.exPrice();
        icecream1.exFlavor();

        Icecream icecream2 = new Icecream("딸기" , 1500);
        icecream2.exPrice();
        icecream2.exFlavor();

        //세터

        icecream1.setPrice(1800);
        icecream1.setFlavor("초코");


        // 게터
        String flavor = icecream1.getexFlavor();
        int price = icecream1.getexPrice();

        System.out.println("수정한 맛 : " + flavor);
        System.out.println("수정한 가격 : " + price + "원");


    }



}
