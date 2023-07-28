package driver;

import pairs.Node;

import pairs.PairsBST;

public class Driver {

	public static void main(String[] args) {
		Node root = null;
		PairsBST bst = new PairsBST();
        root = bst.insert(root, 40);
        root = bst.insert(root, 20);
        root = bst.insert(root, 60);
        root = bst.insert(root, 10);
        root = bst.insert(root, 30);
        root = bst.insert(root, 50);
        root = bst.insert(root, 70);
 
        int sum = 130;
        bst.findPair(root, sum);

	}

}
