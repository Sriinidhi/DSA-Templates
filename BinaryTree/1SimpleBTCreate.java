class Solution{
class Node
{
/* This is node in BT which has 3 Node left, Node right,the value of node = data*/
  int data;
  Node left, right;
  Node(int val)
  {
    data = val;
    left=right=null;//pointingto null it means a single node with null popinting left right child is created
  }
}

class BinaryTree{
//for ease apply of further operations like add, delete
  Node root;
  BinaryTree()
  {
    root = null;
  }
}

/*
    1
  /  \
 2    3
*/

  public static void main(String[] args)
  {
      // Creating the binary tree manually with Node class only
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        // You now have a simple binary tree:
        //     1
        //    / \
        //   2   3

    //Creating The binary tree manually with BinaryTree class and Node class
    BinaryTree BT = new BinaryTree();
    BT.root = new Node(1);
    BT.root.left = new Node(2);
    BT.root.right = new Node(3);
  // You now have a simple binary tree:
        //     1
        //    / \
        //   2   3
  }
  
}
