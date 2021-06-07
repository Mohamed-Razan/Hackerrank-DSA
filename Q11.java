// Question: https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
   
  	public static void preOrder( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return root;
        }

        else {
            Node current = root;

            while (true) {
                Node parent = current;

                if (newNode.data < current.data) {
                    current = current.left;

                    if (current == null) {
                        parent.left = newNode;
                        return root;
                    }
                }

                else {
                    current = current.right;

                    if (current == null) {
                        parent.right = newNode;
                        return root;
                    }
                }
            }
        }
        
    }

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
      	preOrder(root);
    }	
}