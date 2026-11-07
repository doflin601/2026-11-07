package pto.ch00;

public class Execute {
    static void method1(Parent parent) {
        if (parent instanceof Child) {
            Child child = (Child) parent;
            System.out.println("method1 - Child로 변환 성공");
        } else {
            System.out.println("method1 - Child로 변환 실패");
        } // if문을 사용하는 게 좋음
    }
    public static void method2(Parent parent) {
        Child child = (Child)  parent; // Parent 생성자를 인수로 넘기면 에러
        System.out.println("method2  - Child로 변환 성공");
    }

    static void main(String[] args) {
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);
        Parent parentB = new Parent();
        method1(parentB);
    }
}
