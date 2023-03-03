public class Student {
    private long controlNumber;
    private String name;
    private String lastName;
    private String career;
    private String semester;


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

    public String getSemester() {
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

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String toString(){
        System.out.println("los datos del estudiante");
        System.out.println("nombre: "+getName());
        System.out.println("apellido: "+getLastName());
        System.out.println("el numero de control es: "+getControlNumber());
        System.out.println("el semestre es: "+getSemester());
        System.out.println("la carrera es: "+getCareer());
        return "";
    }
}
