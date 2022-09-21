package com.sparta.AliZahir.sorters.Model;

import com.sparta.AliZahir.sorters.Sorter;

import java.util.ArrayList;
import java.util.Stack;

public class BinarySort implements Sorter {

    private Node Current;


    @Override
    public int[] sortArray(int[] arrayToSort) {
        Node root = null;
        int length = arrayToSort.length;

        if(length<2){
            return null;
        }
        if(root==null){
            root=new Node(arrayToSort[0]);
        }
        for (int i =0; i<arrayToSort.length; i++) {
            add(root, arrayToSort[i]);
        }
       // arrayToSort=goThroughTree();
        return arrayToSort;
    }


    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    int[] add(Node Current, int data){

        if(Current.data > data){
            if (Current.left == null){
                Current.left=new Node(data);
            }
            else {
                add(Current.left, data);
            }
        }
        else if (Current.data < data){
            if (Current.right == null){
                Current.right=new Node(data);
            }
            else {
                add(Current.right, data);
            }
        }

        ArrayList<Integer>result = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<>();
        Node current=Current;
        System.out.println(Current);
        while (current != null) {
            while (current.left != null) {
                stack.push(current);
                System.out.println(current);
                current = current.left;
                result.add(current.data);
            }
            current = stack.pop();
            result.add(current.data);

        }
        return (result.stream().mapToInt(i -> i).toArray());
    }

/*
    public int[] goThroughTree(){
        ArrayList<Integer>result = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<>();
        Node current=Current;
        System.out.println(Current);
        while (current != null) {
            while (current.left != null) {
                stack.push(current);
                System.out.println(current);
                current = current.left;
                result.add(current.data);
            }
            current = stack.pop();
            result.add(current.data);

        }
        return (result.stream().mapToInt(i -> i).toArray());
    }
*/

}
