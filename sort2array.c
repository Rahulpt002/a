#include<stdio.h>
void sort(int arr[], int n) {
int i, j, temp;
for (i = 0; i < n-1; i++) {
for (j = 0; j < n-i-1; j++) {
if (arr[j] > arr[j+1]) {
temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
}
}
}
void main() {
int i=0, j=0, n1, n2, k=0;
int a[1000], b[1000], c[2000];
printf("Enter the size of first array:");
scanf("%d", &n1);
printf("Enter the array elements:");
for(i=0; i<n1; i++)
scanf("%d", &a[i]);
sort(a, n1);
printf("Enter the size of second array:");
scanf("%d", &n2);
printf("Enter elements of second array:");
for(i=0; i<n2; i++)
scanf("%d", &b[i]);
sort(b, n2);
int n3 = n1 + n2;
i=0, j=0, k=0;
while(i<n1 && j<n2) {
if(a[i] < b[j])
c[k++] = a[i++];
else
c[k++] = b[j++];
}
while(i<n1)
c[k++] = a[i++];
while(j<n2)
c[k++] = b[j++];
printf("The merged and sorted array is :");
for(i=0; i<n3; i++)
printf("%d\n", c[i]);
}
