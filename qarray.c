#include<stdio.h>
#define SIZE 5
int queue[SIZE], front = -1, rear = -1;
void enqueue(int value) {
if(rear == SIZE - 1) {
printf("Queue is full\n");
} 
else 
{
if(front == -1)
front = 0;
rear++;
queue[rear] = value;
}
}
void dequeue() {
if(front == -1 || front > rear) {
printf("Queue is empty\n");
} 
else 
{
printf("Deleted element: %d\n", queue[front]);
front++;
}
}
void display() 
{
if(front == -1 || front > rear) 
{
printf("Queue is empty\n");
} 
else 
{
printf("Queue elements: ");
for(int i = front; i <= rear; i++) 
{
printf("%d ", queue[i]);
}
printf("\n");
}
}
int main() 
{
int choice, value;
do 
{
printf("1.Enqueue \n2.Dequeue \n3.Display \n4.Exit \nEnter your choice: ");
scanf("%d", &choice);
switch(choice) 
{
case 1:
printf("Enter the value to be entered: ");
scanf("%d", &value);
enqueue(value);
break;
case 2:
dequeue();
break;
case 3:
display();
break;
case 4:
return 0;
default:
printf("No choice found\n");
}
} 
while(choice != 4);
return 0;
}
