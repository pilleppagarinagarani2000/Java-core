package co.in.excercise.bstree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	Node root;
	List<Node> orderedNodes = new ArrayList<>();

	public void add(int value) {
		root = insertNode(root, value);
	}

	private Node insertNode(Node current, int value) {
		if (current == null) {
			Node n = new Node(value);
			orderedNodes.add(n);
			return n;
		}

		if (value < current.value) {
			current.left = insertNode(current.left, value);
		} else if (value > current.value) {
			current.right = insertNode(current.right, value);
		}

		return current;
	}
	
    private void visit(int value) {
        System.out.print(" " + value);        
    }
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            visit(node.value);
            traverseInOrder(node.right);
        }
    }

	public static void main(String[] args) {
		BinarySearchTree searchTree = new BinarySearchTree();
		int[] data = {5, 3, 8, 2, 4, 11};
		for(int i: data) {
			searchTree.add(i);
		}
		searchTree.traverseInOrder(searchTree.root);
		System.out.println();
		for(Node n : searchTree.orderedNodes) {
			System.out.println(n.value);
		}
	}

}
