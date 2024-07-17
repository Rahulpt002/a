import java.util.Scanner;
class vehicle{
    String manufacture;
    String color;
    String year;
    String model;
    vehicle(String manufacture,String color,String year,String model){
        this.manufacture=manufacture;
        this.color=color;
        this.year=year;
        this.model=model;
    }

}
class car extends vehicle{
    String bodystyle;
    car(String manufacture,String color,String year,String model,String bodystyle){
        super(manufacture, color, year, model);
        this.bodystyle=bodystyle;
    }
    void display(){
        System.out.println(manufacture+color+year+model+bodystyle);
    }
}
class vehicles{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter number of cars");
    int n=input.nextInt();
    car[] cars=new car[n];
    input.nextLine();
    for(int i=0;i<n;i++){
        System.out.println("enter manufacture");
        String m=input.nextLine();
        System.out.println("enter color");
        String c=input.nextLine();
        System.out.println("enter year");
        String y=input.nextLine();
        System.out.println("enter model");
        String mo=input.nextLine();
        System.out.println("enter bodystyle");
        String b=input.nextLine();
        cars[i]=new car(m,c,y,mo,b);

    }
    for(int i=0;i<n;i++){
    cars[i].display();
    }    
    }
    
}
