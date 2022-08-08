package ss5_access_modifier_static.bai_tap.bai_tap_them.task1;

import java.util.Date;
/*
Xây dựng lớp Candidate (Thí sinh) gồm các thuộc tính: mã, tên, ngày tháng năm sinh, điểm thi Toán, Văn, Anh và các phương thức cần thiết.
        Xây dựng lớp TestCandidate để kiểm tra lớp trên:
        – Nhập vào n thí sinh (n do người dùng nhập)
        – In ra thông tin về các thí sinh có tổng điểm lớn hơn 15
*/

public class Candidate {
    int number;
    String name;
    double mathScore;
    double englishScore;
    double literatureScore;
    Date dateOfBirth =new Date();
    public Candidate(int number, String name, double mathScore, double englishScore, double literatureScore){
         
    }

}
