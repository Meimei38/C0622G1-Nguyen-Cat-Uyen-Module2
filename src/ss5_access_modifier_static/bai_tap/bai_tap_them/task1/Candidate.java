package ss5_access_modifier_static.bai_tap.bai_tap_them.task1;

import java.time.LocalDate;
import java.util.Date;
/*
Xây dựng lớp Candidate (Thí sinh) gồm các thuộc tính: mã, tên, ngày tháng năm sinh, điểm thi Toán, Văn, Anh và các phương thức cần thiết.
        Xây dựng lớp TestCandidate để kiểm tra lớp trên:
        – Nhập vào n thí sinh (n do người dùng nhập)
        – In ra thông tin về các thí sinh có tổng điểm lớn hơn 15
*/

public class Candidate {
    private int number = 0;
    private String name = " ";
    private String dateOfBirth = "0/00/000";
    private double mathScore = 0;
    private double englishScore = 0;
    private double literatureScore = 0;

    public Candidate() {

    }

    public Candidate(int number, String name, String dateOfBirth, double mathScore, double englishScore, double literatureScore) {
        this.number = number;
        this.name = name;
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.englishScore = englishScore;
        this.dateOfBirth = dateOfBirth;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getLiteratureScore() {
        return literatureScore;
    }

    public void setLiteratureScore(double literatureScore) {
        this.literatureScore = literatureScore;
    }

    public double getTotalScore() {
        return (mathScore + englishScore + literatureScore);
    }


    @Override
    public String toString() {
        if (getTotalScore() > 15) {
            return "Candidate{" +
                    "number=" + number +
                    ", name='" + name + '\'' +
                    ", dateOfBirth='" + dateOfBirth + '\'' +
                    ", mathScore=" + mathScore +
                    ", englishScore=" + englishScore +
                    ", literatureScore=" + literatureScore +
                    '}';
        }
        return "";
    }
}

