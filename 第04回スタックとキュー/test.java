package 第04回スタックとキュー;

class Employee {
    int employeeNo;
    String name;
    String department;
}

public class test {

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.name = "かみさななｎ";
        obj.employeeNo = 1;

        System.out.println(obj.employeeNo);
    }

}