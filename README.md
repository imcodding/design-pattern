# design-pattern


### ▪️ Template 패턴 
<pre><code>어떤 일을 수행하는 데에 있어서, 그 전반적인 과정에 공통된 절차가 있을 때 쓰는 패턴</code></pre>

- 다양화된 방식을 각각 자식 클래스에서 오버라이딩하는 방식으로 구현
- 자식 클래스는 부모 클래스에서 정의해놓은 추상 메소드는 변경할 수 없다.    
  다만, 부모 클래스를 상속받아 메소드의 세부 구현은 자식 클래스가 정의할 수 있다.

#### 장점 & 단점
- 전체적인 기능과 구현을 분리하여 구체적인 기능은 각각 따로 구현할 수 있다.
- 추상 클래스와 구현 클래스가 강하게 연결되어 있다.
- 추상 메소드가 많아지면 클래스가 복잡해질 수 있다.

### ▪️ Decorator 패턴 
<pre><code>특정 객체들의 객체들이 할 수 있는 일을 여러가지 두고,     
각 객체마다 사용자가 원하는대로 골라 시키거나 기능들을 필요에 따라 추가할 때 쓰는 패턴
</code></pre>

- 객체가 생성자 변수로 다른 객체 안에 들어감으로써 그 실행하는 메소드에 행동이 추가됨
- ex) 비행기 게임(아이템 먹을 수록 미사일 종류 추가)

### ▪️ Factory 패턴 
<pre><code>객체를 만들어내는 부분을 서브 클래스에 위임하는 패턴
</code></pre>

- 스프링 같은 프레임워크에서 기존에 만들어진 라이브러리와 클래스들을 활용할 때    
  이를 사용하는 개발자는 세부적인 구현을 알 필요없이 사용할 수 있다.
- 사용할 객체의 조건들만 넘겨주면 팩토리(공장)가 적절한 클래스를 찾아 객체로 생성해 넘겨주는 것이다.
- ex) 약국에서 두통약을 살 때, 소비자는 두통약이 만들어진 과정을 알 필요없음. 약만 사면 됨.

#### 장점
- 클래스 간의 결합도를 낮춰, 클래스의 변경점이 생겼을 때 다른 클래스의 영향을 최소화 할 수 있다.

### ▪️ Abstract-factory 패턴
<pre><code>팩토리 메소드 패턴에 추상화가 입혀진 패턴
</code></pre>

- 특정 객체들을 찍어낼 팩토리도 여러 종류로 건설할 수 있도록 만든 것

### ▪️ Mediator 패턴
<pre><code>클래스 간의 복잡한 관계들을 캡슐화하여 하나의 클래스에서 관리하는 패턴
</code></pre>

- M개의 객체들 사이에 중재자를 추가하여 중재자가 모든 객체들의 통신을 담당.
- 특정 이벤트에 반응하면 관련된 다른 클래스에 알려줌.

#### 장점 & 단점
- M:N 관계를 M:1 관계로 만들어 복잡도를 낮추기 떄문에, 유지보수 및 확장성에 유리
- 특정 어플리케이션에 맞춰져서 개발이 되기 때문에 재사용이 어렵다.

### ▪️ Composite 패턴
<pre><code>단일 객체와 그 객체들을 가지는 집합 객체를 같은 타입으로 취급하며, 트리 구조로 객체들을 엮는 패턴
</code></pre>

- 객체들 간에 계층구조가 있거나 전체-부분 관계를 표현해야할 때 유용하다.
- ex) 폴더와 파일, 컴퓨터와 키보드/모니터/마우스

#### 장점 & 단점
- 객체들이 모두 같은 타입으로 취급되기 때문에 새로운 클래스 추가가 용이하다.
- 단일객체, 집합객체 구분하지 않고 코드 작성이 가능하다.
- 설계를 일반화 시켜 객체간의 구분, 제약이 힘들다.

### ▪️ Strategy 패턴
<pre><code>각 옵션들마다 역할(행위)들을 모듈화해서 독립적이고 상호 교체 가능하도록 만든 패턴
</code></pre>
- 객체가 할 수 있는 행위들 각각을 전략으로 만들어 놓고, 동적으로 행위의 수정이 필요한 경우 전략을 바꾸는 것만으로 행위의 수정이 가능하다.
- '어떻게'에 초점을 맞춘 패턴
- ex) 이미지/동영상/뉴스 등 조건에 따른 검색. 목적지까지 가는 이동수단 선택

#### 장점 & 단점
- 직접 행위에 대한 코드를 수정할 필요없이 전략만 변경하여 유연하게 확장할 수 있다.(OCP)
- 클라이언트와 전략 사이에 의존성이 있어서, 클라이언트는 구체적인 전략을 알아야 한다.
- 개체 인스턴스 수가 대량으로 누적되어 비효율성을 초래할 수 있다.

### ▪️ Command 패턴
<pre><code>조건에 따라 다른 명령을 행하게 하거나 여러 명령들을 목록으로 실어보내서 차례로 처리 수 있도록 하는 행동 중심 패턴
</code></pre>
- '무엇을'에 초점을 맞춘 패턴
- ex) 커피를 제조하는 커피머신. 정해진 명령대로 움직이는 로봇

#### 장점 & 단점
- 호출자(작업요청) 클래스와 수신자(작업실행) 클래스 사이의 분리함으로써 실행될 기능 변경에도 호출자 클래스를 수정없이 그대로 사용할 수 있다.
- 기존 코드 수정없이 새로운 수신자와 새로운 커맨드 추가가 가능하다.
- 설계 구조가 복잡하다.

### ▪️ Adapter 패턴
<pre><code>서로 다른 인터페이스 객체들이 같은 형식으로 동작할 수 있도록 어댑터를 사용하는 패턴
</code></pre>
- 어댑터란 형식이 다른 두 사이에 연결돼서 서로 호환될 수 있도록 해주는 것

#### 장점 & 단점
- 기존 코드를 수정하지 않고 기능만 추가하여 유연하게 확장할 수 있다. 
- 어댑터가 증가함에 따라 복잡도가 증가할 수 있다. 또한, 어댑터 클래스는 새로 작성해야 하기 때문에 번거로울 수 있다.

### ▪️ Proxy 패턴
<pre><code>실제 기능을 수행하는 객체 대신 가상의 객체를 사용해 로직의 흐름을 제어하는 패턴
</code></pre>
- 프록시(Proxy)를 번역하면 대리자, 대변인의 의미를 갖고 있다.
- 인터넷에서 다운받거나 메모리를 많이 차지하는 이유로 객체를 여러 개 생성하기 부담스러울 때 사용
- 가볍고 간단한 작업은 프록시 클래스에서 처리한다.

#### 장점 & 단점
- 실제 객체나 프록시 객체나 사용법이 유사해서 사용하기 편리하다.
- 비용이 많이 드는 연산(대용량 파일 생산, 동영상 로딩 등)을 실제로 필요한 시점에 수행할 수 있다. 
- 로직이 복잡해져 가독성이 떨어질 수 있다.