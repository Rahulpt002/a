import java.util.Scanner;
class celsious{
    double c;
    double f;
    celsious(double c){
        this.c=c;

    }
    double calcelcious(){
        f=(9/5)*this.c+32;
        return f;
    }
}
class farhen{
    double c;
    double f;
    farhen(double f){
        this.f=f;
    }
    double calfarhen(){
        c=(this.f-32)*(5.0/9);
        return c;
    }
}
class comp{
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        do{
        System.out.println("enter a choice:1-c to f,2-f to c,3-exit");
        n=input.nextInt();
        switch(n){
            case 1:
            System.out.println("enter celcious:");
            double a=input.nextDouble();
            celsious c=new celsious(a);
            double f=c.calcelcious();
            System.out.println("f="+f);
            break;
            case 2:
            System.out.println("enter farhen:");
            double b=input.nextDouble();
            farhen d=new farhen(b);
            double g=d.calfarhen();
            System.out.println("c="+g);
            break;
            case 3:
            System.out.println("exit");
            break;
            default:
            System.out.println("enter valid choice");

        }
        }while( n != 3 );
    }
}
