import java.util.Scanner;
class square{
    int side;
    int breadth;
int getside(){
    return side;

}
void setside(int side){
    this.side=side;
}
int getbreadth(){
    return breadth;
}
void setbreadth(int breadth){
    this.breadth=breadth;
}
int calculatesarea(){
    return side*side;

}
int calculaterarea(){
    return side*breadth;
}
int calculatesperi(){
    return 4*side;
}
int calculaterperi(){
    return 2*(side+breadth);
}
}
class rectanle{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter side and breadth:");
        int side=input.nextInt();
        int breadth=input.nextInt();
        square obj=new square();
        obj.setside(side);
        obj.setbreadth(breadth);
        int a=obj.calculaterarea();
        int b=obj.calculatesarea();
        if(a==b){
            System.out.println("area of rectangle and square is equal");
            int c=obj.calculaterperi();
            int d=obj.calculatesperi();
            System.out.println("perimeter of rectangle:"+c);
            System.out.println("perimeter of square:"+d);
        }
        else{
            System.out.println("areas are not equal");
        }
