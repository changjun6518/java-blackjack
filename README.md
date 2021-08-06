# java-blackjack

#### 블랙잭 규칙
* 딜러와 게이머 단 2명만 존재한다.
* 카드는 조커를 제외한 52장이다. (즉, 카드는 다이아몬드,하트,스페이드,클로버 무늬를 가진 A,2~10,K,Q,J 으로 이루어져있다.)
* 2~10은 숫자 그대로 점수를, K/Q/J는 10점, A는 1로 계산한다. (기존 규칙은 A는 1과 11 둘다 가능하지만 여기선 1만 허용하도록 스펙아웃)
* 딜러와 게이머는 순차적으로 카드를 하나씩 뽑아 각자 2개의 카드를 소지한다.
* 게이머는 얼마든지 카드를 추가로 뽑을 수 있다.
* 딜러는 2카드의 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑고, 17점 이상이면 추가할 수 없다.
* 양쪽다 추가 뽑기 없이, 카드를 오픈하면 딜러와 게이머 중 소유한 카드의 합이 21에 가장 가까운 쪽이 승리한다.
* 단 21을 초과하면 초과한 쪽이 진다.

### 기능 목록

* 블랙잭 게임 시작한다
* 사용자를 입력 받는다
  * 여러명 입력
* 카드를 랜덤하게 딜러와 사용자 순차적으로 뽑는다
  * 받는 카드가 중복되는지 체크 (애초에 중복되지 않도록 할 듯)
* 사용자는 카드를 더 받을지 말지 선택한다
  * 딜러는 2카드의 합 점수가 16점 이하면 1장을 추가로 뽑고 17이상이면 추가할 수 없음
* 카드 오픈하면서 결과 확인
* 21을 넘지않으면서 높은 수가 이기도록 승자를 결정한다
  * 21을 초과하면 무조건 패배
  * A가 있다면 1인지 11인지 선택하기

  
### TODO LIST
* ~~카드 점수 합산하기~~
  * ~~점수 합산 출력~~
* ~~딜러 16점 이하면 자동으로 카드 받기~~
* ~~승자 결정하기~~
* ~~플레이어 여러명~~
* 배팅 기능 추가 ?
* A 1인지 11인지 선택
* 게임 계속 할지 여부 선택

* 예외 처리
  * ~~21점 넘으면 패배~~\
  * 한장 더 받을때 y or n 입력 체크
  * ~~카드 중복 체크~~
  
### 리팩토링
* 3개 이상 인스턴스 변수 가진 클래스 X
* 일급 컬렉션을 사용한다
* DI(Dependency Injection)

### 알게된 점
- 생성자나 메소드에서 다른 새로운 객체를 생성하기 보다 의존 객체를 주입 받아서 사용하면 의존역전원칙을 지킬 수 있음
- main 영역에서 객체 초기화 / 의존 처리 / 실행을 담당하게 끔 설정

### 궁금한 점
- 에러 체크는 각자의 객체에서 하는게 좋은지


### 아쉬운 점
* Game 클래스에 역할이 너무 많은 게 아닌가 -> 더 쪼갤 수 없을까(input과 output 등)
