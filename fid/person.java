import java.util.Scanner;
class persons{
    String name;
    String gender;
    String address;
    int age;
    persons(String name,String gender,String address,int age){
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
}
class employee extends persons{
    int empid;
    String companyname;
    String qualification;
    int salary;
    employee(String name,String gender,String address,int age,int empid,String companyname,String qualification,int salary){
        super(name,gender,address,age);
        this.empid=empid;
        this.companyname=companyname;
        this.qualification=qualification;
        this.salary=salary;
    }
}
class Teacher extends employee{
    String subject;
    String department;
    int teacherid;
    Teacher(String name,String gender,String address,int age,int empid,String companyname,String qualification,int salary,String subject,String department,int teacherid){
        super(name, gender, address, age, empid, companyname, qualification, salary);
        this.subject=subject;
        this.department=department;
        this.teacherid=teacherid;

    }
    void display(){
        System.out.println(this.name + this.gender+this.address+this.age+this.empid+this.companyname+this.qualification+this.salary+this.subject+this.department+this.teacherid);

    }
    
}
class person{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of teachers");
        int n=input.nextInt();
        input.nextLine();
        Teacher[] teacher=new Teacher[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the details"+(i+1)+":");
            System.out.print("name");
            String name=input.nextLine();
            System.out.println("gender:");
            String gender=input.nextLine();
            System.out.println("address:");
            String address=input.nextLine();
            System.out.println("age");
            int age=input.nextInt();
            System.out.println("empid:");
            int empid=input.nextInt();
            input.nextLine();
            System.out.println("companyname:");
            String companyname=input.nextLine();
            
            System.out.println("qualification:");
            String qualification=input.nextLine();
            System.out.println("salary:");
            int salary=input.nextInt();
            input.nextLine();
            System.out.println("subject"); 
            String subject=input.nextLine();
            System.out.println("department:"); 
           String department=input.nextLine();
            System.out.println("teacherid:");
            int teacherid=input.nextInt();
            input.nextLine();
            teacher[i]=new Teacher(name,gender,address,age,empid,companyname,qualification,salary,subject,department,teacherid);

        }
        
        System.out.println("details of teacher:");
        for (int i=0;i<n;i++){
            teacher[i].display();
            System.out.println();
        }
    }
}
