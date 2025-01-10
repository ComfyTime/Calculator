# 계산기 과제

## LV1
### 기능
* 계산기를 클래스를 사용하지 않고 제작.
* 2개의 숫자를 받아 사칙연산
* 계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 반복

### 구성
* level1.java
  * 값 입력에 Scanner 사용
  * 연산에 Switch 사용
  * while 사용하여 반복 구현

## LV2
### 기능
* 계산된 결과 값을 기록하는 컬렉션 구현
* 컬렉션에 저장된 데이터를 삭제하는 기능 구현

### 구성
* app.java
  * level1.java 기반
  * setter,getter 이용하여 계산 결과를 다룰 수 있도록 구현

* Calculator.java
  * 컬랙션으로 arrayList 사용
  * 컬랙션을 private 처리하였기 때문에 외부 조회 가능하도록 setter, getter 사용
    * 입력 및 삭제 구현
velog: https://velog.io/@comfytime/2025.01.10TILJAVA
