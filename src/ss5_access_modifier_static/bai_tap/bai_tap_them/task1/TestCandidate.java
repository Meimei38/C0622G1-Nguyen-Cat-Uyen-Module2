package ss5_access_modifier_static.bai_tap.bai_tap_them.task1;

import ss5_access_modifier_static.thuc_hanh.static_method.Student;

public class TestCandidate {
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        Candidate candidate2 = new Candidate(12, "Nguyễn Văn B", "23/12/1998", 9.8, 5.0, 6.7);
        Candidate candidate3 = new Candidate(13, "Nguyễn Thị C", "3/2/1999", 8.0, 5.0, 2.7);
        Candidate candidate4 = new Candidate(14, "Nguyễn D", "23/6/2000", 4.8, 5.0, 3.7);
        Candidate candidate5 = new Candidate(15, "Nguyễn Võ E", "4/4/2002", 2.7, 5.0, 1.9);
        Candidate candidate6 = new Candidate(16, "Nguyễn lê F", "31/1/1996", 8.4, 5.5, 3.7);
        System.out.println(candidate);
        System.out.println(candidate2);
        System.out.println(candidate3);
        System.out.println(candidate4);
        System.out.println(candidate5);
        System.out.println(candidate6);

    }
}
