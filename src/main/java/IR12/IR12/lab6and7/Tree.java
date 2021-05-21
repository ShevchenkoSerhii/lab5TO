/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR12.IR12.lab6and7;

/**
 *
 * @author vshew
 */
import java.lang.reflect.Array;
import java.util.Arrays;  
import java.util.*;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.Global.print;


 class Node {

    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class Tree {

    static Node root;

    /* A function that constructs Balanced Binary Search Tree 
    from a sorted array */
    Node sortedArrayToBST(int arr[], int start, int end) {

        /* Base Case */
        if (start > end) {
            return null;
        }

        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        /* Recursively construct the left subtree and make it
        left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1);

        /* Recursively construct the right subtree and make it
        right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    /* A utility function to print preorder traversal of BST */
    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        int arr[] = new int[]{4, 3, 1, 6, 5, 11, 9, 10};
        String unsortedArrayToShow = Arrays.toString(arr);
System.out.println("The unsorted array: " + unsortedArrayToShow);
        Arrays.sort(arr);
        String sortedArrayToShow = Arrays.toString(arr);
System.out.println("The sorted array: " + sortedArrayToShow);
        int n = arr.length;
        root = tree.sortedArrayToBST(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");
        tree.preOrder(root);
    }
}

/*public class Tree {
public static void main(String[] args) {

// initializing unsorted int array
int intArr[] = {4, 3, 1, 6, 5, 11, 9, 10};
String unsortedArrayToShow = Arrays.toString(intArr);
System.out.println("The unsorted array: " + unsortedArrayToShow);
// sorting array
Arrays.sort(intArr);

// let us print all the elements available in list
System.out.println("The sorted int array is:");
for (int number : intArr) {
System.out.println("Number = " + number);
}

// entering the value to be searched
int searchVal = 5;

int retVal = Arrays.binarySearch(intArr,searchVal);




System.out.println("The index of element " + searchVal + " is : " + retVal);
}
}*/
