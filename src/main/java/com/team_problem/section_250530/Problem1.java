package com.team_problem.section_250530;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        /*
        - 문제 설명

        정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

        - 제한사항
        0 ≤ numbers의 원소 ≤ 10,000
        2 ≤ numbers의 길이 ≤ 100

        - 입출력 예
        numbers	               result
        [1, 2, 3, 4, 5]	       20
        [0, 31, 24, 10, 1, 9]	 744

        - 입출력 예 설명
        입출력 예 #1
        두 수의 곱중 최댓값은 4 * 5 = 20 입니다.

        입출력 예 #1
        두 수의 곱중 최댓값은 31 * 24 = 744 입니다.
        */

        Problem1 problem1 = new Problem1();
        System.out.println(problem1.solution(new int[]{0, 31, 24, 10, 1, 9}));

    }

    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        return answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
