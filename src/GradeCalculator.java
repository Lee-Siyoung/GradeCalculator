import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class GradeCalculator {
    private ArrayList<Subject> subjects;
    private double average;

    public GradeCalculator() {
        subjects = new ArrayList<>();
        average = 0.0;
    }

    public GradeCalculator addSubject(Subject... subjects) {
        for (Subject subject : subjects)
            this.subjects.add(subject);
        return this;
    }

    public GradeCalculator calculate() {
        double sum = 0.0;
        int sumDegree = 0;
        for (Subject subject : subjects) {
            if (subject.getGrade() == Grade.PASS) continue;
            if (subject.getGrade() == Grade.UNPASS) continue;
            sum += subject.getDegree() * subject.getGrade().getGradeDouble();
            sumDegree += subject.getDegree();
        }
        average = sum / sumDegree;

        return this;
    }

    public void saveFile(String fileName) throws IOException {
        OutputStream output = new FileOutputStream(fileName + ".txt");
        byte[] by = toString().getBytes();
        output.write(by);

    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Subject subject : subjects)
            stringBuilder.append(subject + "\n");
        stringBuilder.append("평균 학점 : ");
        stringBuilder.append(average);

        return stringBuilder.toString();
    }
}
