package baekJoon.level.twelve;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 
 * 문제번호 : 2751번 
 * 문제제목 : 수 정렬하기2
 * 문제링크 : https://www.acmicpc.net/problem/2751
 * 작 성 일 : 2020.03.14
 * 작 성 자 : YUN YOUNG
 * 문제내용 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 
 * 입   력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
 * 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 출   력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 
 * 풀이방법 1 : 우선순위 큐를 이용하는 방법. 단순히 값들을 입력받고, 우선순위 큐에 넣고, poll하는 순서대로 출력한다. 
 */
public class Solution2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(sc.next().trim());
		
		for (int i = 0; i < N; i++) {
			pq.add(Integer.parseInt(sc.next().trim()));
		}
		
		while (!pq.isEmpty()) {
			sb.append(pq.poll()+"\n");
		}
		System.out.println(sb);
		sc.close();
	}
}
