#include <stdio.h>
#define MAX_SIZE 100
int stack[MAX_SIZE];
int top = -1;
void push(int value) 
{
if (top >= MAX_SIZE - 1) 
{
printf("Stack overflow.\n");
} 
else 
{
stack[++top] = value;
}
}
int pop() 
{
if (top < 0) 
{
printf("Stack underflow.\n");
return -1;
} 
else 
{
return stack[top--];
}
}
void search(int value) 
{
int found = 0;
for (int i = 0; i <= top; i++) 
{
if (stack[i] == value) 
{
printf("Value found in stack at position %d.\n", i);
found = 1;
break;
}
}
if (found == 0) 
{
printf("Value not found in stack.\n");
}
}
void display() 
{
if (top >= 0) 
{
printf("Stack: ");
for (int i = 0; i <= top; i++) 
{
printf("%d ", stack[i]);
}
printf("\n");
} 
else 
{
printf("The stack is empty.\n");
}
}
int main() 
{
int choice, value;
while(1) 
{
printf("\n1. Push\n2. Pop\n3. Search\n4. Display\n5. Exit\nEnter your choice: ");
scanf("%d", &choice);
switch(choice) 
{
case 1: 
printf("Enter the value to be pushed: ");
scanf("%d", &value);
push(value);
break;
case 2: 
value = pop();
if(value != -1) 
{
printf("Popped value: %d\n", value);
}
break;
case 3: printf("Enter the value to be searched: ");
scanf("%d", &value);
search(value);
break;
case 4: 
display();
break;
case 5: 
return 0;
default: 
printf("Invalid choice.\n");
}
}
return 0;
}
