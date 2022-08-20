package com.dsa.adt;

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode {

        private int data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        public TreeNode(int data){
            this.data = data;
        }

        public void insert(int value){
            if(value == data){
                return;
            }

            if(value < data){
                if(leftChild == null){
                    leftChild = new TreeNode(value);
                } else {
                    leftChild.insert(value);
                }
            } else {
                if(rightChild == null){
                    rightChild = new TreeNode(value);
                }else {
                    rightChild.insert(value);
                }
            }
        }

        public void traverseInorder(){
            if(leftChild != null){
                leftChild.traverseInorder();
            }
            System.out.print(data+", ");
            if(rightChild != null){
                rightChild.traverseInorder();
            }
        }

        public TreeNode get(int value){
            if(value == data){
                return this;
            }

            if(value < data){
                if(leftChild != null){
                        return leftChild.get(value);
                }
            } else {
                if(rightChild != null){
                    return rightChild.get(value);
                }
            }

            return null;
        }

        public int min(){
            if(leftChild == null){
                return data;
            }else {
                return leftChild.min();
            }
        }

        public int max(){
            if(rightChild == null){
                return data;
            }else {
                return rightChild.max();
            }
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(TreeNode leftChild) {
            this.leftChild = leftChild;
        }

        public TreeNode getRightChild() {
            return rightChild;
        }

        public void setRightChild(TreeNode rightChild) {
            this.rightChild = rightChild;
        }

        @Override
        public String toString() {
            return "{" +
                    "data=" + data +
                    '}';
        }
    }

    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }else {
            root.insert(value);
        }
    }

    public void traversInOrder(){
        if(root != null){
            root.traverseInorder();
        }
    }

    public TreeNode get(int value){
        if(root != null){
            return root.get(value);
        }
        return null;
    }

    public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        }else {
            return root.max();
        }
    }

    public int min(){
        if(root ==  null){
            return Integer.MIN_VALUE;
        }else {
            return root.min();
        }
    }


}

class Test {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(2);
        binarySearchTree.insert(4);
        binarySearchTree.insert(6);
        binarySearchTree.insert(7);

        binarySearchTree.traversInOrder();
        System.out.println(binarySearchTree.min());
    }
}
