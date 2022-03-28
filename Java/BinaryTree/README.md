# Trees
## Trees are non-linear data structures. They are often used to represent hierarchical data. For a real-world example, a hierarchical company structure uses a tree to organize.

## Challenge
* Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
* Implement a binary tree
* Implement a binary search tree

## Approach & Efficiency
* Binary Tree
    * Time: -Inserting a new node is O(n). -Searching for a specific node is O(n)
    * Space: -O(w), where w is the largest width of the tree
* Binary Search Tree
    * Time: -insertion and search operations is O(h), or O(height), In a balanced (or “perfect”) tree, the height of the tree is log(n)
    * Space: -It's an O(1)

## API
* Binary Tree Methods:
   * preOrderTraverse: to print the data as root ==> left ==> right
   * inOrderTraverse: to print the data as left ==> root ==> right
   * postOrderTraverse: to print the data as left ==> right ==> root
* Binary Search Tree Methods:
   * add => input integer: to add a new node to the tree and if the number was larger than the root go to the right and if smaller go to the left
   * contain => input integer: search the tree if the value exists and return true if it does or false if it doesn't
   
   # [My Code](https://github.com/hashem98/data-structures-and-algorithms/tree/main/Java/BinaryTree/app/src/main/java/BinaryTree)
