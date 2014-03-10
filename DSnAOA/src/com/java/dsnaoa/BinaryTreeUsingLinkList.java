package com.java.dsnaoa;

public class BinaryTreeUsingLinkList {

	private BinaryNode root;
	BinaryNode parent;
	int result;


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



//	public boolean deleteNode(int data){
//		return deleteBinaryTreeNode(root,data);
//	}
	
//	private boolean deleteBinaryTreeNode(BinaryNode node, int data){
//		boolean isDeleted = false;	
//
//		//if node to be deleted not found
//		if(null!= node){
//			//if node found 
//			if(node.data == data){
//
//				//if no child exists
//				if(node.left == null && node.right == null){
//					node = null;
//					isDeleted = true;
//				}
//
//				//if left child exists
//				if(node.left !=null && node.right == null){
//					parent.left = node.left;
//					node = null;
//					isDeleted = true;
//				}
//
//				//if right child exists
//				if(node.right !=null  && node.left == null){
//					parent.right = node.right;
//					node = null;
//					isDeleted = true;
//				}
//
//				//if both child exists 
//				if(node.left!=null && node.right !=null){
//					//find least element in right sub tree 
//					//replace value with existing element's value 
//					// remove node present at least element in right sub tree
//
//					node.data = replaceValueAndRemoveLeastElement(node.right);
//					isDeleted = true;
//				}
//
//				return isDeleted;
//			}
//
//			parent = node;
//			if(node.data> data){
//				return deleteBinaryTreeNode(node.left, data);
//			} else if (node.data < data){
//				return deleteBinaryTreeNode(node.right, data);
//			}
//
//		} else{ 
//			isDeleted = false;
//			System.out.println("Node not found");
//			return isDeleted;
//		}
//		
//	}
	
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
					System.out.println("Node found & deleted");
					return;
				}

				//if left child exists
				if(node.left !=null && node.right == null){
					parent.left = node.left;
					node = null;
					System.out.println("Node found & deleted");
					return;
				}

				//if right child exists
				if(node.right !=null  && node.left == null){
					parent.right = node.right;
					node = null;
					System.out.println("Node found & deleted");
					return;
				}

				//if both child exists 
				if(node.left!=null && node.right !=null){
					//find least element in right sub tree 
					//replace value with existing element's value 
					// remove node present at least element in right sub tree

					node.data = replaceValueAndRemoveLeastElement(node.right);
					System.out.println("Node found & deleted");
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
			System.out.println("Node not found");
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

	public class BinaryNode{
		BinaryNode left, right;
		int data;

		public BinaryNode(int data){
			this.data = data;
		}
	}

}
