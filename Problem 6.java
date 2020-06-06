/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/
/* isLengthEvenorOdd method should return 1 if the length of LL is even 
   otherwise return 0.*/
class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	   Node n = head1;
	    int count = 0;
	    while(n != null){
	       if(n.next == null)a
	            return 1;
	       n = n.next.next;
	    }
	    return 0;
	       
	}
}


// Better Solution C++/Java you have to understand
/*int isLengthEvenOrOdd(struct Node* head)
{
if(head==nullptr) return 0;
return (1^isLengthEvenOrOdd(head->next));
}*/
