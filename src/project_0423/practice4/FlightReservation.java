package project_0423.practice4;

public class FlightReservation {

    // 속성 = 변수
    private String passengerName;  // 예약자 이름
    private String flightNumber;   // 비행기 번호
    private String seatNumber;     // 좌석 번호


    //생성자 - 객체 조립설명서
    // 1. 클래스 이름과 동일
    // 2. 반환 데이터 타입 존재하지않음
    // 3. 여러개 존재 가능

    // 기본 생성자
    public FlightReservation() {
        this.passengerName = "예약자 없음";
        this.flightNumber = "비행기 없음";
        this.seatNumber = "좌석 없음";
    }

    // 매개변수 생성자

    public FlightReservation(String passengerName, String flightNumber, String seatNumber) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
    }

    // 기능
    public void confirmReservation() {
        System.out.println(passengerName + "님이 " + flightNumber + "편 " + seatNumber + "좌석을 예약하셨습니다.");
    }

    // 세터
    // 예약자 이름
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    // 비행기 번호
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    // 좌석 번호
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    // 게터
    public String getPassengerName() {
        return passengerName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }
}
