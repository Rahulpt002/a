import java.util.Scanner;
class area{
void area(){
int l,b;
System.out.println("enter length and breadth:");
Scanner input=new Scanner(System.in);
l=input.nextInt();
b=input.nextInt();
int area=l*b;
System.out.println("area:"+area);
}
void perimeter(){
int l,b;
System.out.println("enter length and breadth:");
Scanner input=new Scanner(System.in);
l=input.nextInt();
b=input.nextInt();
int perimeter=2*(l+b);
System.out.println("perimeter:"+perimeter);
}}
class rectangle{
public static void main(String args[]){
area s=new area();
s.area();
s.perimeter();}}
