public enum Grade {
    APLUS(4.5), A(4.0), BPLUS(3.5), B(3.0), CPLUS(2.5), C(2.0), DPLUS(1.5), D(1.0), F(0), PASS(-1.0), UNPASS(-2.0);

    private double gradeDouble;

    Grade(double v) {
        gradeDouble = v;
    }

    public double getGradeDouble() {
        return gradeDouble;
    }

    @Override
    public String toString() {
        if (gradeDouble == 4.5) return "A+";
        if (gradeDouble == 4.0) return "A";
        if (gradeDouble == 3.5) return "B+";
        if (gradeDouble == 3.0) return "B";
        if (gradeDouble == 2.5) return "C+";
        if (gradeDouble == 2.0) return "C";
        if (gradeDouble == 1.5) return "D+";
        if (gradeDouble == 1.0) return "D";
        if (gradeDouble == 0) return "F";
        if (gradeDouble == -1.0) return "S";
        if (gradeDouble == -2.0) return "UNPASS";

        return "";
    }
}
