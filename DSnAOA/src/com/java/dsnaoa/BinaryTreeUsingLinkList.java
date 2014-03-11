package com.java.dsnaoa;

public class BinaryTreeUsingLinkList {

	private BinaryNode root;
	BinaryNode parent;
	int result, pathLength;
	static final int MAX_VALUE = 10000;


	public BinaryTreeUsingLinkList(){
		root = null;
		parent = null;
	}

	public void insert(int data){
		root = insertBinaryNode(root, data);
	}

	private BinaryNode insertBinaryNode(BinaryNode node, int data){
		if(null==node){
			node = new BinaryNode(data);
		}else if(data > node.data) {
			node.right = insertBinaryNode(node.right, data);
		}else if(data <= node.data) {
			node.left = insertBinaryNode(node.left, data);
		}
		return node;
	}

	public void deleteNode(int data){
		deleteBinaryTreeNode(root,data);
	}

	private void deleteBinaryTreeNode(BinaryNode node, int data){

		//if node to be deleted not found
		if(null!= node){
			//if node found 
			if(node.data == data){

				//if no child exists
				if(node.left == null && node.right == null){
					node = null;
					System.out.println("\n Node found & deleted");
					return;
				}

				//if left child exists
				if(node.left !=null && node.right == null){
					parent.left = node.left;
					node = null;
					System.out.println("\n Node found & deleted");
					return;
				}

				//if right child exists
				if(node.right !=null  && node.left == null){
					parent.right = node.right;
					node = null;
					System.out.println("\n Node found & deleted");
					return;
				}

				//if both child exists 
				if(node.left!=null && node.right !=null){
					//find least element in right sub tree 
					//replace value with existing element's value 
					// remove node present at least element in right sub tree

					node.data = replaceValueAndRemoveLeastElement(node.right);
					System.out.println("\n Node found & deleted");
					return;
				}
			}

			parent = node;
			if(node.data> data){
				deleteBinaryTreeNode(node.left, data);
			} else if (node.data < data){
				deleteBinaryTreeNode(node.right, data);
			}

		} else{ 
			System.out.println("\n Node not found");
		}

	}



	private int replaceValueAndRemoveLeastElement(BinaryNode node) {

		if(node.left == null){
			result = node.data;
			node = null;
		} else {
			replaceValueAndRemoveLeastElement(node.left);
		}

		return result;
	}

	public void traversePreOrder(){
		System.out.println("\n***************PreOrderTraversal************************");
		preOrderTraversal(root);
	}

	private void preOrderTraversal(BinaryNode node){
		if(null!= node){
			System.out.print(Integer.toString(node.data) + " ");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
		else{
			return;
		}
	}

	public void traversePostOrder(){
		System.out.println("\n***************PostOrderTraversal************************");
		postOrderTraversal(root);
	}

	private void postOrderTraversal(BinaryNode node){
		if(null!= node){
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.print(Integer.toString(node.data) + " ");
		}
		else{
			return;
		}
	}

	public void traverseInOrder(){
		System.out.println("\n***************InOrderTraversal************************");
		inOrderTraversal(root);
	}

	private void inOrderTraversal(BinaryNode node){
		if(null!= node){
			inOrderTraversal(node.left);
			System.out.print(Integer.toString(node.data)  + " ");
			inOrderTraversal(node.right);
		}
		else{
			return;
		}
	}


	//find all nodes which are at distance K form leaf node
	public void findNodeAtDistanceFromLeaf(int steps ){
		int[] path = new int[MAX_VALUE];
		boolean[] visited = new boolean[MAX_VALUE];
		printNodeAtDistanceFromLeaf(root,steps,0,path,visited);
	}

	private void printNodeAtDistanceFromLeaf(BinaryNode node, int steps, int pathLength, int[] path, boolean[] visited){

		// if node is null than return
		if(null==node){
			return;
		}

		path[pathLength] = node.data;
		visited[pathLength] = false;
		pathLength++;

		//if node is a leaf node
		if(null == node.left && null == node.right && pathLength - steps -1 >= 0 && visited[pathLength-steps-1] == false){
			System.out.println("\n" + Integer.toString(path[pathLength-steps-1]));
			visited[pathLength-steps-1] = true;
			return;
		}

		printNodeAtDistanceFromLeaf(node.left, steps, pathLength, path, visited);
		printNodeAtDistanceFromLeaf(node.right, steps, pathLength, path, visited);

	}
	
	public void isBalanced(){
		if (isHeightBalancedTree(root) == true ){
			System.out.println("Balanced Tree") ;
		}
		else
		{
			 System.out.println("Unbalanced Tree");
		}
	}

	//check if tree is height balanced tree
	private boolean isHeightBalancedTree(BinaryNode node){
		if(node == null){
			return true; //null root node
		}
		
		int htLft = heightOfBtree(node.left);
		int htRft = heightOfBtree(node.right);

		if((htLft - htRft<=1)&&(isHeightBalancedTree(node.left))&&(isHeightBalancedTree(node.right))){
			return true;
		}
		return false;
	}


	public void levelOrder(){
		int height = heightOfBtree(root);
		for(int i = 1 ; i < height ; i ++){
			System.out.println("*******************Level "+i+"********************");
			levelOrderTraversal(root, i);
		}

	}
	// function to do level order traversal
	private void levelOrderTraversal(BinaryNode node, int level){

		if(node == null){
			return;
		}
		if(level == 1){
			System.out.println(" "+Integer.toString(node.data));
		} else if(level>1){
			levelOrderTraversal(node.left, level-1);
			levelOrderTraversal(node.right, level-1);
		}

	}


	public void height(){
		System.out.println("\n\nHeight: "+Integer.toString(heightOfBtree(root)));
	}

	// find height of tree
	private int heightOfBtree(BinaryNode node){
		if(node == null){
			return 0;
		}else {
			int leftH = heightOfBtree(node.left);
			int rightH = heightOfBtree(node.right);

			if(leftH > rightH){
				return leftH + 1; 
			}else {
				return rightH + 1;
			}
		}

	}

	public class BinaryNode{
		BinaryNode left, right;
		int data;

		public BinaryNode(int data){
			this.data = data;
		}
	}

}
