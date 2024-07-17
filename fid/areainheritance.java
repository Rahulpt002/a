class Shape{
int width;
int length;
Shape(int w,int h){
width=w;
length=h;

}}
class Rectangle extends Shape
{
Rectangle(int w,int h){
super(w,h);}
void display(){
System.out.println("width:"+width+"length:"+length);
}
void area()
{
int area=width*length;
System.out.println("area"+area);
}}

class area{
public static void main(String[] args){

Rectangle obj=new Rectangle(5,10);


obj.display();
obj.area();

}}
