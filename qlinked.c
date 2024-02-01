#include<stdio.h>
#include<stdlib.h>
struct Node {
int data;
struct Node* next;
};
struct Queue 
{
struct Node *front, *rear;
};
struct Node* newNode(int k) {
struct Node *temp = (struct Node*)malloc(sizeof(struct Node));
temp->data = k;
temp->next = NULL;
return temp;
}
struct Queue* createQueue() 
{
struct Queue* q = (struct Queue*)malloc(sizeof(struct Queue));
q->front = q->rear = NULL;
return q;
}
void enqueue(struct Queue* q, int k) {
struct Node* temp = newNode(k);
if (q->rear == NULL) {
q->front = q->rear = temp;
return;
}
q->rear->next = temp;
q->rear = temp;
}
void dequeue(struct Queue* q) 
{
if (q->front == NULL)
return;
struct Node* temp = q->front;
q->front = q->front->next;
if (q->front == NULL)
q->rear = NULL;
free(temp);
}
void display(struct Queue* q) {
struct Node* temp = q->front;
while(temp) {
printf("%d ", temp->data);
temp = temp->next;
}
printf("\n");
}
int main() {
struct Queue* q = createQueue();
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
enqueue(q, value);
break;
case 2:
dequeue(q);
break;
case 3:
display(q);
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
