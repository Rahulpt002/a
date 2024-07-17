import java.util.Scanner;
class sort {
    public static void main(String[] args) {
        
    
    int n=10;
    Scanner in=new Scanner(System.in);
    int[] array=new int[10];
    for(int i=0;i<n;i++){
        System.out.println("enter");
        array[i]=in.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.print(array[i]+" ");
    }
    System.out.println("array is:");
    for(int i=0;i<n;i++){
        for(int j=0;j<(i+1);j++){
            if(array[i]<array[j]){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
    }
    System.out.println("sorted array:");
    for(int i=0;i<10;i++){
        System.out.print(array[i]+" ");
        
    }
    int sum=0;
    for(int i=0;i<10;i++){
        sum=sum+array[i];
    }
    System.out.println("sum:"+sum);
    System.out.println("max:"+array[9]);
    System.out.println("min:"+array[0]);
    System.out.println("enter value to search:");
    int s=in.nextInt();
    int index=-1;
    for(int i=0;i<10;i++){
        if(s==array[i]){
            index=i;
            break;
        }
        
        
    }
    if(index==-1){
        System.out.println("not found");
    }
    else{
        System.out.println("found at:"+(index+1));
    }

    
}
}
