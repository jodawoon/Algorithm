package POSTECH_2022_Programming_Contest_Open;

/*
포닉스는 PPC를 위해 알고리즘 공부를 열심히 하고 있다. 특히, MST만 엄청나게 공부한 포닉스는 Minimum Spanning Tree(최소 신장 트리)도 아니고 Maximum Spanning Tree(최대 신장 트리)도 아닌 신장 트리에 대해 흥미가 생겼다.

포닉스는 이러한 신장 트리를 MMST(Moderate Medium Spanning Tree)라고 이름을 붙이고, 이를 직접 만들어보려 한다. 신장 트리는 그래프의 모든 정점을 포함하는 트리 형태의 부분 그래프를 의미하며, 최소 신장 트리와 최대 신장 트리는 트리에 속하는 간선의 가중치 합이 각각 최소 / 최대인 신장 트리이다. MMST는 간선의 가중치 합이 최소 신장 트리와도, 최대 신장 트리와도 다른 신장 트리를 말한다.

모든 간선의 가중치가 다른 무향 연결 그래프가 주어질 때, 그래프의 MMST를 구하는 프로그램을 작성하여라.
*/

/*
입력:
첫째 줄에 그래프의 정점의 개수 $N$과 간선의 개수 $M$이 주어진다. $(1 \leq N \leq 200\,000$, $N-1 \leq M \leq 500\,000)$ 

둘째 줄부터 $M$줄에 걸쳐 $i$번째 간선의 정보가 $(U_i, V_i, C_i)$와 같이 주어진다. 이는 $i$번째 간선이 $U_i$번 정점과 $V_i$번 정점을 잇는 가중치 $C_i$의 간선이라는 뜻이다. $(1 \leq U_i, V_i \leq N, U_i \ne V_i, -10^9 \leq C_i \leq 10^9)$ 

모든 간선의 가중치는 서로 다른 정수이며 한 정점 쌍을 잇는 간선은 최대 하나임이 보장된다.
 */

/*
출력:
첫째 줄에는 주어진 그래프에서 MMST를 구성할 수 있다면 YES, 불가능하다면 NO를 출력한다.

만약 MMST를 만드는 것이 가능하다면, 둘째 줄에는 MMST를 구성하는 $N-1$개의 간선 번호를 공백으로 구분해 출력한다. MMST를 만드는 방법이 여러 개 존재할 경우 그 중 아무 것이나 출력하면 된다.


 */

public class C번_MMST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
