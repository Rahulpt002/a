import java.util.Scanner;
class students{
    int rollno;
    String name;
    int[] submark=new int[7];
    int total;
    double per;
    students(int rollno,String name,int[] submark,int total){
        this.rollno=rollno;
        this.name=name;
        this.submark=submark;
        this.total=total;
        this.per=percentage();


    }
        double percentage(){
        int sum=0;
        for(int i=0;i<7;i++){
            sum=sum+submark[i];

        }
        
        double per=(sum*100)/this.total;
        
        return per;
    }
}
class mooc extends students{
    String course;
    double perc;
    mooc(int rollno,String name,int[] submark,int total,String course,double perc){
        super(rollno, name, submark,total);
        this.course=course;
        this.perc=perc;

    }
}
class course extends mooc{
    String coursename;
    course(int rollno,String name,int[] submark,int total,String course,double perc,String coursename){
        super(rollno, name, submark,total, coursename, perc);
        this.coursename=coursename;
    }
    void display(){
        System.out.println("rollno:"+rollno);
        System.out.println("name:"+name);
        System.out.println("total:"+total);
        for(int i=0;i<7;i++){
            System.out.println("sub"+(i+1)+submark[i]);
        }
        System.out.println("per:"+per);
        System.out.println("course:"+course);
        System.out.println("percentage:"+perc);
        System.out.println("coursename:"+coursename);
    }
}
class student{
    public static void main(String[] args){
        int[] submark=new int[7];
        Scanner input=new Scanner(System.in);
        System.out.println("enter rollno");
        int rollno=input.nextInt();
        input.nextLine();
        System.out.println("enter name");
        String name=input.nextLine();
        for(int i=0;i<7;i++){
            System.out.println("enter mark");
            submark[i]=input.nextInt();
        }
        System.out.println("enter total mark");
        int total=input.nextInt();
        input.nextLine();
        System.out.println("enter course");
        String course=input.nextLine();
        System.out.println("enter pecentage");
        double per=input.nextDouble();
        System.out.println("enter coursename");
        input.nextLine();
        String coursename=input.nextLine();
        course obj=new course(rollno,name,submark,total,course,per,coursename);
        obj.display();

    }
}
