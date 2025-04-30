package org.example.poker.logic.evaluator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Node {

        Node next;
        int val;

    public Boolean checkIfMerger(Node node1, Node node2){

        Node nextNodeNode1 = node1;
        Node nextNodeNode2 = node2;

        while (nextNodeNode1.next != null){
            nextNodeNode1 = node1.next;
        }
        while (nextNodeNode2.next != null){
            nextNodeNode2 = node2.next;
        }

        if (nextNodeNode1 == nextNodeNode2){
            return true;
        }
        else {
            return false;
        }
    }

    public Node getNodeMerged(Node node1, Node node2){

        Node nextNodeNode1 = node1;
        Node nextNodeNode2 = node2;
        List<Node> nodeList1 = new ArrayList<Node>();
        List<Node> nodeList2 = new ArrayList<Node>();


        while (nextNodeNode1.next != null){
            nextNodeNode1 = node1.next;
            nodeList1.add(nextNodeNode1);
        }

        while (nextNodeNode2.next != null){
            nextNodeNode2 = node2.next;
            nodeList2.add(nextNodeNode2);
        }
        for (int i = 0; i < nodeList1.size(); i++){
            for (int j = 0; j < nodeList2.size(); j++){
                if (nodeList1.get(i) == nodeList2.get(j)){
                    return nodeList1.get(i);
                }
            }
        }
        return null;
    }

}


