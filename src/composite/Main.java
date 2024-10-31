package composite;

public class Main {
    public static void main(String[] args) {
        Employee bekzod = new Employee("Bekzod", "Web Developer");
        Employee shuhrat = new Employee("Shuhrat", "Software tester");
        Employee valeriya = new Employee("Valeriya", "Teacher");

        Department mainDept = new Department("Main Department");
        Department itDept = new Department("IT Department");
        mainDept.addComponent(itDept);

        Department academicDept = new Department("Academic Department");
        mainDept.addComponent(academicDept);
        Department bisDept = new Department("BIS Department");
        mainDept.addComponent(bisDept);


        itDept.addComponent(bekzod);
        bisDept.addComponent(shuhrat);
        academicDept.addComponent(valeriya);

        mainDept.showDetails();
    }
}
