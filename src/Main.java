//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        // 물을 담을 상자의 이름은 ? 물상자
        // 정수(int)를 담을 상자의 이름은 정수(int)상자

        // String을 담을 상자의 이름은? 문자열 상자

        String strA = "문자열";

        Cat mayo = new Cat("mayo", 5);
        Cat nez = new Cat();

        nez.name = "nez";
        System.out.println("mayo.name: " + mayo.name);

        // 메서드 호출부
        int ret = mayo.sum(1, 2);
        System.out.println("ret = " + ret);
        
        int ret2 = nez.sum(2, 2);
        System.out.println("ret2 = " + ret2);

    }
}
