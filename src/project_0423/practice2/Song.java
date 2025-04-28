package project_0423.practice2;

public class Song {

    // 속성-변수

    private String title;
    private String singer;

    // 생성자 - 설명서
    // 이름같음
    // 변환데이터 타입 x
    // 여러개 존재o

    // 생성자(기본생성자)
    public Song() {
        this.title = "제목";
        this.singer = "가수";
    }

    // 생성자
    public Song(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    // 기능

    public void play() {
        System.out.println(singer + "의 " + title + "을(를) 재생합니다.");
    }

    // 세터
    public void setTitle(String title) {
        this.title = title;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    // 게터
    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }




}
