
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        GradeCalculator gradeCalculator = new GradeCalculator();

        gradeCalculator.addSubject(
                new Subject("C++ 프로그래밍", "이재협", 3, Grade.APLUS),
                new Subject("컵퓨터공학입문", "김홍연", 3, Grade.F),
                new Subject("대학생활과비전", "강경태", 1, Grade.PASS))
                .calculate()
        .saveFile("내 학점");

        System.out.println(gradeCalculator);
    }
}