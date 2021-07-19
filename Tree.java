import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
// class Stack{

// }
class Node{
    int data;

    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left=null;

        right=null;
    }
}


public class Tree {
    static void Inorder(Node root){

        if(root==null){
            return ;
        }
        else{
            Inorder(root.left);
            System.out.print(root.data+"  ");
            Inorder(root.right);
        }
    }
    static void preorder(Node root){

        if(root==null){
            return ;
        }
        else{
            System.out.print(root.data+"  ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void InorderStack(Node root){

        Stack<Node> st=new Stack<Node>();

        while(root!=null || st.empty()==false){
          //left 
            while(root!=null){
                st.push(root);
                root=root.left;
            }

            root=st.pop();
            System.out.println(root.data);
            root=root.right;
        }
    }


    static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);

        while(q.isEmpty()==false){
            Node temp=q.peek();
            q.remove();
            System.out.print(temp.data+" ");

            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }

    }
static Node insertBinary(Node root, int data){

    Node temp=new Node(data);

    if(root==null){
        return temp;
    }

    else{
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()==false){
            Node current=q.peek();
            q.remove();
            
            if(current.left==null){
                current.left=temp;
                return root;
            }
            else{
                q.add(current.left);
            }
            if(current.right==null){
                current.right=temp;
                return root;
            }
            else{
                q.add(current.right);
            }
        }
        return null;
    }

}
static int maxEle(Node root){

    if(root==null){
        return Integer.MIN_VALUE;

    }

    int left=maxEle(root.left);
    int right=maxEle(root.right);
    if(root.data>left&& root.data>right){
        return root.data;
    }
    else if(left>right && left>root.data){
        return left;
    }
    else{
        return right;
    }

}
static int leafCount(Node root){

    Queue<Node> q=new LinkedList<Node>();

    q.add(root);
    int count=0;

    while(q.isEmpty()==false){
        Node temp=q.peek();
        q.remove();
        if(temp.left==null && temp.right==null){
            count++;
        }
        else{
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
return count;
}



static int maxWidth(Node root){

    Queue<Node> q=new LinkedList<Node>();
    int max=0;
    q.add(root);
    while(q.isEmpty()==false){
        int size=q.size();
        if(max<size){
            max=size;
        }

        for(int i=0;i<size;i++){
            Node temp=q.poll();
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }

    }
 
    return max;
}
static void printK(Node root,int k,int currlevel){
if(root==null){
    return;
}
if(currlevel==k){
    System.out.print(root.data+"  ");
    return;
}
printK(root.left,k,currlevel+1);
printK(root.right,k,currlevel+1);
}

public static void main(String[] args) {
    // Node root= null;
    // root=new Node(10);
    // root.left=new Node(20);
    // root.right=new Node(30);
    // root.left.left=new Node(40);
    // root.left.right=new Node(50);
    // root.right.left=new Node(60);
    // root.right.right=new Node(70);

//    Inorder(root);
// InorderStack(root);
//preorder(root);

// insertBinary(root,80);
// insertBinary(root,90);
// insertBinary(root,100);
// printK(root, 2, 0);
// levelOrder(root);
//System.out.println(maxEle(root));
//System.out.println(leafCount(root));
//System.out.println(maxWidth(root));
}    
}
