import java.util.Scanner;
class Sum{
void sum(int l,int b){
int sum;
sum=l+b;
System.out.println("sum="+sum);
}
void sum(int l,int b,int h){
int sum;
sum=l+b+h;
System.out.println("sum="+sum);
}}
class main{
public static void main(String args[]){
Sum s=new Sum();
Scanner input=new Scanner(System.in);
System.out.println("enter two numbers");
 int l=input.nextInt();
int b=input.nextInt();
s.sum(l,b);
System.out.println("enter three numbers:");
int a=input.nextInt();
int h=input.nextInt();
int c=input.nextInt();

s.sum(a,h,c);
}}
