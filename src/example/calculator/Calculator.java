package example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results = new ArrayList<>();
    // 결과 담는곳
    public int calculate(int num1, int num2, char operator) {
        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("분모가 0일경우 나눌 수 없습니다.");
                return -1; // 오류가 있으면 저장 x
            }
            result = num1 / num2;
        } else {
            System.out.println("유효하지 않은 연산자입니다.");
            return -1; // 저장 x
        }
        //결과 저장
        results.add(result);
        return result;
    }
    // Getter
    public List<Integer> getResults() {
        return results;
    }

    // Setter
    public void setResults(List<Integer> results) {
        this.results = results;
    }

    // 오래된 결과 삭제
    public void removeResults() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    }

// Calculator, Operation, Parser