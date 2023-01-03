//Linked List traversal
//Linked List Insertion
//Linked List Deletion
//Linked List Reverse
//Linked List Length
//Linked List Sort

class  LinkedList{
static Node Head;
static class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

public void insertAtpos(int data ,int pos){
  Node new_node=new Node(data);
  if(Head==null){
    if(pos!=0){
      return;
    }
    else{
      Head=new_node;
      return;
    }
  }
  if(Head !=null && pos==0){
    new_node.next=Head;
    Head=new_node;
    return;
  }
  Node temp=Head;
  Node prev=null;
  int i =0;
  while(i<pos){
    prev=temp;
    temp=temp.next;
    if(temp==null){
      
      break;
    }
    i++;

  }
  new_node.next=temp;
  prev.next=new_node;
 

}



public void lengthCheck(){
  Node temp=Head;
  int count=0;
  while(temp!=null){
    count+=1;
    temp=temp.next;
    
  }
  System.out.print(count);
}
public void insertAtend(int data){
  Node new_node=new Node(data);
  if(Head==null){
    Head=new_node;
    return;
  }
  new_node.next=null;
  Node temp=Head;
  while(temp.next!=null)
    temp=temp.next;
  
  temp.next=new_node;
  return;
}
public void sortList(){
  Node curr=Head,index =null;
  int temp;
  if(curr==null){
    return ;
  }
  else{
    while(curr!=null){
        index=curr.next;
        while(index!=null){
          if(curr.data>index.data){
            temp=curr.data;
            curr.data=index.data;
            index.data=temp;
          }
          index=index.next;
        }
        curr=curr.next;
    }
  }
}
public void insertAtBeg(int data){
    Node n=new Node(data);
    n.next=Head;
    Head=n;
}
public void deleteAtpos(int pos){
  Node temp=Head;
  if(temp!=null && pos==0){
    Head=temp.next;
    return;
  }
  Node prev=null;
  int i=0;
  while(i<pos){
    prev=temp;
    temp=temp.next;
    if(temp==null){
      break;
    }
    i++;
  }
  prev.next=temp.next;

}
public void deleteatHead(int key){
  Node n=Head , prev=null;
  if(n!=null && n.data==key){
    Head=n.next;
    return;
  }
  while(n!=null && n.data !=key){
    prev=n;
    n=n.next;
  }
  if(n==null)
    return;
  prev.next=n.next;
  }

public Node reverselin(Node Head){
  if(Head==null){
    return ;
  }
  return reverselin(Head.next);
 // System.out.print( Head.data);

}


public Node  rev(Node Head){
  Node temp=Head;
  Node prev=null;
  Node next=null;
  while(temp!=null){
    next=temp.next;
    temp.next=prev;
    prev=temp;
    temp=next;
  }
  Head=prev;
  
  return Head;
}
public void peekFun(){
    Node n=Head;
    while(n!=null){
        System.out.print(n.data);
        n=n.next;
    }
}

public static void main(String[] args) {
    LinkedList llist=new LinkedList();
    llist.insertAtend(2);
    llist.insertAtend(2);
    llist.insertAtend(5);
    llist.insertAtend(6);
    
   // llist.peekFun();
   // llist.deleteatHead(3);
   //llist.deleteAtpos(1);
  // llist.reverselin(Head);
    //llist.peekFun();

    //llist.peekFun();
    //Head=llist.rev(Head);
    //llist.sortList();
   // llist.peekFun();
  
    //llist.lengthCheck();
    System.out.println(llist.reverselin(Head));
}
}