public class Student {
    private long controlNumber;
    private String name;
    private String lastName;
    private String career;
    private short semester;


    public Long getControlNumber() {
        return controlNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCareer() {
        return career;
    }

    public short getSemester() {
        return semester;
    }

    public void setControlNumber(Long controlNumber) {
        this.controlNumber = controlNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setSemester(short semester) {
        this.semester = semester;
    }
}
