package trees;

import trees.bst.BinarySearchTree;

public class TreeMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.add(30);
        bst.add(15);
        bst.add(44);
        bst.add(33);
        bst.add(11);
        bst.add(50);
        bst.add(100);

        //bst.inOrder();
        //bst.preOrder();
        //bst.postOrder();
        bst.descOrder();
        System.out.println(bst.search(50));
        System.out.println(bst.search(55));
        System.out.println(bst.minimum());
        System.out.println(bst.maximum());
    }
}
