//  http://www.practice.geeksforgeeks.org/problem-page.php?pid=700170
//  n'th node from end of linked list


/* struct Node
 {
   int data;
   struct Node* next;
 }; */

/* Should return data of n'th node from the end of linked list */
int getNthFromLast(struct Node *head, int n)
{
       // Your code here
       int i=0;
       int x[1000];
        if(head==NULL)
            return -1;
       while(head!=NULL)
       {
           x[i]=head->data;
           head = head->next;
           i+=1;
       }
       if(n>i)
        return -1;
       return x[i-n];
}