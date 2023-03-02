public class Test_Student {
    public static void main(String[] args) {
        System.out.println("Probando clase student");
    Student valentin69 = new Student();
        System.out.println("valentin69 = " + valentin69);

        valentin69.setName("Valentin");
        System.out.println("El nombre es: " + valentin69.getName());
        valentin69.setControlNumber(22670011L);
        System.out.println("El numero de ctrl es :"+ valentin69.getControlNumber());
    }
}
