package com.vlad;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public String reverseOrder(String string){
        String[] words = string.split(" ");

        String result = "";

        for (int i = words.length-1; i >= 0; i--) {
            result += words[i]+" ";
        }

        result = result.substring(0,result.length()-1);

        return result;
    }

    public int maxWidth(Node root){
        int maxWidth = 0;
        int levelNodes = 0;

        Queue<Node> queue = new LinkedList<>();

        if(root == null)
            return 0;

        queue.add(root);

        while(!queue.isEmpty()){
            levelNodes = levelNodes(queue);
            if(levelNodes > maxWidth){
                maxWidth = levelNodes;
            }
        }

        return maxWidth;
    }

    private int levelNodes(Queue<Node> queue){
        Node node = queue.remove();
        if (node.left != null) {
            queue.add(node.left);
        }
        if (node.right != null) {
            queue.add(node.right);
        }

        return queue.size();
    }
}
