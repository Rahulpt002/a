import java.util.Scanner;
class Details{
int pcode,pprice;
String pname;
void ProductDetails()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the product code:");
pcode=input.nextInt();
input.nextLine();
System.out.println("Enter the product name:");
pname=input.nextLine();
System.out.println("Enter the product price:");
pprice=input.nextInt();
}
}
class Product
{
public static void main(String args[]){
Details p1=new Details();
Details p2=new Details();
Details p3=new Details();
System.out.println("Product 1 details:");
p1.ProductDetails();
System.out.println("Product 2 details:");
p2.ProductDetails();
System.out.println("Product 3 details:");
p3.ProductDetails();
if(p1.pprice>p2.pprice)
{
if(p1.pprice>p3.pprice)
{
System.out.println("product 1 price is greater:"+p1.pprice);
}
else{
System.out.println("product 3 price is greater:"+p3.pprice);
}
}
else{
if(p2.pprice>p3.pprice){
System.out.println("product 2 price is greater:"+p2.pprice);
}
else
{
System.out.println("product 2 price is greater"+p3.pprice);
}}
}
}
