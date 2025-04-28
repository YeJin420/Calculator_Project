package project_0423.practice4;

public class Main {
    // 속성
    // 생성자
    // 기능

    public static void main(String[] args) {
        // 기본 생성자 사용
        FlightReservation reservation1 = new FlightReservation();
        reservation1.confirmReservation();


        // 매개변수 생성자 사용
        FlightReservation reservation2 = new FlightReservation("이예진", "YBN23", "12A");
        reservation2.confirmReservation();

        // 세터
        reservation1.setPassengerName("김기환");
        reservation1.setFlightNumber("CLI13");
        reservation1.setSeatNumber("3D");

        //다시 확인
        reservation1.confirmReservation();
    }
}
