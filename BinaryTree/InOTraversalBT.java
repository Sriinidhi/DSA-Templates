/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

//Function for inorder traversal of BT
    void inOrder(Node node)
    {
        
        if(node != null){inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);}
    }
