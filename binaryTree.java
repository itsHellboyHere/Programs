import java.util.*;
import java.util.LinkedList;
public class binaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class binaryTreeTraversal{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;

        }
        public static List<Integer>  preorder(Node root){
            List<Integer> l=new LinkedList<>();
            if(root==null){
               // System.out.println(-1+" ");
                return l;
                    
            
            }
           l.add(root.data);
           preorder(root.left);
           preorder(root.right);
           return l;
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(" "+root.data);
            inorder(root.right);

        }
        public static void postoder(Node root){
            if(root==null){
                return;
            }
            postoder(root.left);
            postoder(root.right);
            System.out.print(" "+root.data);
        }
        public static void LevelOrderTraversal(Node root){//It Performs BFS.
            if(root==null){
                return; 
            }
            Queue<Node> q=new LinkedList<>();  //Takes 0(n) times.
            q.add(root);                        //queue ds is used for FIFO
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){    //currnode is null then next line and checks the queue is empty or not.
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null); //After every removal null is added till its not empty.
                    }
                }
                else{
                    System.out.print(currNode.data); 
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static void maxLevelSum(Node root) {
            if(root==null){
                return ;
            }
            int result=root.data;
             Queue<Node> q=new LinkedList<>();
            int level=0;
             q.add(root); 
             while(!q.isEmpty()){
                
                 int count=q.size();
                 int sum=0;
                 while(count-->0){
                     Node node=q.poll();
                     sum+=node.data;
                     if(node.left!=null){
                         q.add(node.left);
                     }
                     if(node.right!=null){
                         q.add(node.right);
                     }
    
                 }

                 result=Math.max(sum,result);
                 level++;
             }
           //  level++;
             System.out.println(result);
             System.out.println(level);
        }
        public static void sumLevel(Node root , int k){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            int sum=0;
            int level=1;
            int flag=0;
            
            while(!q.isEmpty()){

               int size=q.size();
               for(int i=0;i<size;i++){  
                    Node curr=q.peek();
                    q.remove();
                    if(level==k){
                        flag=1;
                        sum+=curr.data;
                    }
                    else{
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                    
                }
            }
                    level++;
                    if(flag==1)
                        break;
                    
                
            
            } 
            System.out.println("the sum is :" +sum);
        }
        public static int CountOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftNodes=CountOfNodes(root.left);
            int rightNodes=CountOfNodes(root.right);
            return leftNodes+rightNodes +1;
        }
        public static int sumofNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftsum=sumofNodes(root.left);
            int rightsum=sumofNodes(root.right);
            return leftsum+rightsum+root.data;
        }
        public static int height(Node root){ 
            if(root==null){
                return 0;
            }
            int leftheight=height(root.left);
            int rightheight=height(root.right);
            int myheight=Math.max(leftheight, rightheight)+1;

            return myheight;
        }
        public static int diameter(Node root){  //this approach will take O(n^2) time .
            if(root==null){
                return 0;
            }
            int dim1=diameter(root.left); //heighest diameter found in left-subtree.
            int dim2=diameter(root.right);//heighest diameter found in right-subtree.
            int dim3=height(root.left)+height(root.right)+1;// heighest diameter if it goes through root of the tree.

            return Math.max(dim3,Math.max(dim2, dim1)); //max diamter between 1&2 then between 3 and these 2.
        }
        public static class Treeinfo{
            int ht;
            int dia;
            Treeinfo(int ht,int dia){
                this.ht=ht;
                this.dia=dia;
            }
        }
        public static Treeinfo diameterofTree(Node root ){
            if(root==null){
                return new Treeinfo(0,0);
            }
            Treeinfo left=diameterofTree(root.left);
            Treeinfo right=diameterofTree(root.right);
            int myheight=Math.max(left.ht, right.ht)+1;

            int dia1=left.dia;
            int dia2=right.dia;
            int dia3=left.ht+right.ht+1;

            int mydiameter=Math.max(Math.max(dia1, dia2),dia3);
            Treeinfo myinfo=new Treeinfo(myheight, mydiameter);
            return myinfo;
        }
    }
        public static void main(String[] args) {
            int [] Nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            binaryTreeTraversal tree=new binaryTreeTraversal();
            Node root=binaryTreeTraversal.buildTree(Nodes);
           // System.out.println(root.data);
        //  binaryTreeTraversal.preorder(root);
           // binaryTreeTraversal.inorder(root);
          // binaryTreeTraversal.postoder(root);
          binaryTreeTraversal.LevelOrderTraversal(root);
         // System.out.println(binaryTreeTraversal.CountOfNodes(root));
         // System.out.println("The sum is: "+binaryTreeTraversal.sumofNodes(root));
        // System.out.println(binaryTreeTraversal.height(root));
        // System.out.println(binaryTreeTraversal.diameter(root));
       // System.out.println(binaryTreeTraversal.diameterofTree(root).dia);
      //  System.out.println();
       // binaryTreeTraversal.sumLevel(root,3 );
     //  binaryTreeTraversal.maxLevelSum(root);
   //  System.out.println(binaryTreeTraversal.preorder(root));
        }

    }
