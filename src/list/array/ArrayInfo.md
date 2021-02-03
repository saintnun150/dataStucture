# 배열(Array)

배열은 그 자체로 자료구조지만 다른 자료구조의 부품으로도 사용한다.
데이터가 많아지면 그룹 관리의 필요성이 생긴다. 그 때 배열을 사용한다.

여러 데이터를 하나의 이름으로 그룹핑해서 관리하기 위한 자료구조
배열에는 index가 있는데 index를 통해서 어떤 데이터를 저장하고 읽을 수 있다.
> 배열의 값은 value, 배열에서의 특정 값의 위치는 index, index와 value를 결합한 것은 element

그룹핑되어 있는 데이터를 관리한다라는 의미는 그 그룹에 있는 데이터들만 처리할 수 있다는 뜻인데  
바로 그 때 사용하는 것이 반복문이다.  
반복문에서 iterator 같은 것을 사용해서 배열의 element를 꺼내 데이터 처리가 가능하다.
***
### 배열 생성

```java
int[] numbers1 = new int[4];
```
>여기서 int는 element 데이터 타입을 의미하고 int 뒤에 [] 는 배열임을 표시한다.  
또한 new int[number]는 배열의 크기를 의미한다. new는 객체를 생성할 때 쓰는 키워드다.  
따라서 배열도 객체(Object)의 범주에 속한다는 것이다.

***
### 배열 특징
```java
int[] number2 = {10, 20, 30, 40};
```
위와 같은 배열이 존재할 때 number2[4] 와 같이 배열에 따로 셋팅하지 않는 요소를 가져온다면  
기본적으로 숫자로 이루어진 배열의 경우 0을, 문자로 이루어진 배열은 null이 default다.

***
### 배열 크기
```java
int[] number1 = new int[4];
number1[0] = 10;
number1[1] = 20;
number1[2] = 30;
System.out.println(number1.length);
```

length 함수는 index와 다르게 설정 당시 배열 크기를 반환한다.
따라서 위와 같은 코드에서 4개의 element가 들어갈 수 있는 배열에
3개의 value만 setting 했지만 length는 4를 반환한다. 즉 배열을 사용할 때 몇개의 값을 넣었고 지정했는지  
를 알고 싶다면 직접 따로 설정이 필요하다. ex) count 변수를 만들어서 데이터를 변화시킴

***
###배열 관리

>배열의 각 요소들의 데이터 조작을 하고 싶다면 반복문을 사용해야한다.
>반복문은 지정한 조건이 true이면 실행이 되는데 for문의 경우 int j=0;은 초기 값을 의미한다.

```java
int i = 0;
while (number1.length > i) {
    System.out.println(number1[i]);
    i++;
}

for (int j = 0; j < number1.length; j++) {
    System.out.println(number1[i]);
}
// expected value
10
20
30
0
```
***
### 배열 장단점
> 1. 단점
>   * 크기가 정해져 있다 => 지정한 크기보다 더 많은 정보를 요청하면 Error 발생
>   * 기능이 없다 => 데이터를 추가, 삭제, 이동시키는 기능이 없음
> 2. 장점
>   * 이러한 단점이 배열을 다른 자료구조의 좋은 부품으로 사용가능하게 만듦
>   * 좋은 부품의 조건
>       - 작고 가볍다 => 크기가 정해져있기 때문에 빠르고 메모리를 적게 사용함
>       - 단순하다 => 단순히 저장하고 조회하는 기능밖에 없으니 다른 자료구조에서 데이터 공간으로 사용가능함







