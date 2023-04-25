package Q2.services;

import java.util.ArrayList;

 public class TreeNode{
	int data;
	public TreeNode left = null;
	public TreeNode right = null;

	public TreeNode(int data){
		this.data = data;
	}
	
	public static void inOrderInsertIntoList(TreeNode node, ArrayList<Integer> list) {
		if(node.left != null) {
			inOrderInsertIntoList(node.left, list);
		}
		list.add(node.data);
		if(node.right != null) {
			inOrderInsertIntoList(node.right, list);
		}
	}
}
