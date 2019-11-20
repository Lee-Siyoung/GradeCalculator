public class Subject {
    private String subJectName;     // 과목명
    private String professorName;   // 교수명
    private int degree;             // 이수 단위(3학점)
    private Grade grade;            // 학점(ABCDF)

    public Subject(String subJectName, String professorName, int degree, Grade grade) {
        this.subJectName = subJectName;
        this.professorName = professorName;
        this.degree = degree;
        this.grade = grade;
    }

    public String getSubJectName() {
        return subJectName;
    }

    public void setSubJectName(String subJectName) {
        this.subJectName = subJectName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return subJectName + " - " + professorName + " : " + grade + "(" + degree + ")";
    }
}
