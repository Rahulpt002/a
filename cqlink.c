#include<stdio.h>
#include<stdlib.h>
typedef struct node {
int data;
struct node* next;
} Node;
Node *front = NULL;
Node *rear = NULL;
void enqueue(int value) {
Node* newNode = malloc(sizeof(Node));
if(newNode == NULL) {
printf("Queue is full\n");
} else {
newNode->data = value;
newNode->next = NULL;
if(front == NULL) front = rear = newNode;
else {
rear->next = newNode;
rear = newNode;
}
}
}
void dequeue() {
if(front == NULL) {
printf("Queue is empty\n");
} else {
Node* temp = front;
printf("Deleted element: %d\n", front->data);
front = front->next;
if(front == NULL) rear = NULL;
free(temp);
}
}
void search(int value) {
if(front == NULL) {
printf("Queue is empty, cannot search elements.\n");
} else {
Node* temp = front;
int index = 0;
while(temp != NULL) {
if(temp->data == value) {
printf("Entered %d found at index %d.\n", value, index);
return;
}
temp = temp->next;
index++;
}
printf("Element %d not found in the queue.\n", value);
}
}
void display() {
if(front == NULL) {
printf("Queue is empty\n");
} else {
printf("Queue elements: ");
Node* temp = front;
while(temp != NULL) {
printf("%d ", temp->data);
temp = temp->next;
}
printf("\n");
}
}
int main() {
int choice, value;
do {
printf("1.Enqueue \n2.Dequeue \n3.Search \n4.Exit \n5.Display \nEnter your choice: ");
scanf("%d", &choice);
switch(choice) {
case 1:
printf("Enter the value to be entered: ");
scanf("%d", &value);
enqueue(value);
break;
case 2:
dequeue();
break;
case 3:
printf("Enter element you want to search: ");
scanf("%d", &value);
search(value);
break;
case 4:
return 0;
case 5:
display();
break;
default:
printf("No choice found\n");
}
} while(choice != 4);
return 0;
}
