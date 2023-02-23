// Sort Doubly Linked List Using Merge Sort


// hard
// hint
// Hint

// asked in interviews by 1 company
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// The head of the doubly linked list will be given to you, and you must sort it using merge sort.
// Input
// You will be given the head of doubly Linked List and its length.

// Constraints:
// 0<= n <=10000
// Output
// Return the HEAD of the sorted linked list.
// Example
// Sample Input:
// 5
// 3 2 1 3 2
// Output:
// 1 2 2 3 3


Node mergeSort(Node node, int n) {
    if(n<=1){
  return node;
}
int mid=n/2;
Node temp=node;
int count=0;
while(count<n-mid-1){
  temp=temp.next;
  count++;
}
Node a;
Node b;

if(n%2==0){
  a=mergeSort(node, mid);
  b=mergeSort(temp.next,n-mid);
}
else
{
  a=mergeSort(node,mid);
  b=mergeSort(temp,n-mid);
}
return merge(a,b,mid,n-mid);
}
Node merge(Node node1,Node node2, int n1, int n2){
    Node head1=new Node(-1);
    Node temp1= node1;
    Node temp2= node2;
    Node temp= head1;
    int count1 = 0;
    int count2 = 0;
    while(count1<n1&& count2<n2){
        if(temp1.data<temp2.data){
            temp.next= new Node(temp1.data);
            temp1= temp1.next;
            count1++;
        }
        else{
            temp.next=new Node(temp2.data);
            temp2= temp2.next;
            count2++;
        }
        temp=temp.next;
    }
    while(count1<n1){
        temp.next= new Node(temp1.data);
        temp=temp.next;
        temp1= temp1.next;
        count1++;
    }
    while(count2<n2){
        temp.next=new Node(temp2.data);
        temp = temp.next;
        temp2= temp2.next;
        count2++;
    }
    temp=head1.next;
    temp1=node1;
    int count=0;
    while(count<(n1+n2)){
        temp1.data = temp.data;
        temp1=temp1.next;
        temp= temp.next;
        count++;
    }
   return  node1;
}