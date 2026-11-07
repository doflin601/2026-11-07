package pto.ch02;

public class ExecutePhone {
    static void main(String[] args) {
//        //Phone phone = new Phone("홍길동"); 추상 클래스는 자신의 객체 생성 불가, 상속받은 클래스는 객체 생성 가능
//        SmartPhone phone = new SmartPhone("홍길동");
//        phone.turnOn();
//        phone.internetSearch();
//        phone.turnOff();
        Phone phone = new SmartPhone("홍길동");
        phone.turnOn();
        ((SmartPhone) phone).internetSearch();
        phone.turnOff();
    }
}