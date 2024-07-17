class area{
void area(int l,int b)
{

System.out.println("area:" +l*b);
}

void perimeter(int l,int b){
System.out.println("perimeter:"+(2*(l+b)));
}}
class rectmain{
public static void main(String args[]){
int l=5,b=3;
area s1=new area();
s1.perimeter(l,b);
s1.area(l,b);
}}
