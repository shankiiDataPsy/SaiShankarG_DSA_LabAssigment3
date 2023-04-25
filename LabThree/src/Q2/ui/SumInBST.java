package Q2.ui;

import java.util.ArrayList;

import Q2.services.TreeNode;


public class SumInBST {
	
	static boolean flag = false;
	
	public static boolean checkTarget(ArrayList<Integer> list, int target) {
		boolean flag = false;
		int low, high;
		high = list.size()-1;
		low = 0;
		while(low<high) {
			if(list.get(high) > target) {
				high = high - 1;
				continue;	
			}
			if(target - list.get(high) == list.get(low)) {
				System.out.println("Pair is ("+list.get(low)+","+list.get(high)+")");
				high = high - 1;
				low = -1;
				flag = true;
			}
			low = low + 1;
			if(low==high&&high>0) {
				high = high -1;
				low = 0;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		TreeNode head = new TreeNode(40);
		head.left = new TreeNode(20);
		head.right = new TreeNode(60);
		
		head.left.left = new TreeNode(10);
		head.left.right = new TreeNode(30);
		head.right.left = new TreeNode(50);
		head.right.right = new TreeNode(70);

		TreeNode.inOrderInsertIntoList(head, list);
//		System.out.println(list);
		
		int target = 130;
		if(checkTarget(list, target)) {
			System.out.println("Target is acheivable: " + target);
		} else {
			System.out.println("Target is not acheivable: " + target);
		}

		target = 100;
		if(checkTarget(list, target)) {
			System.out.println("Target is acheivable: " + target);
		} else {
			System.out.println("Target is not acheivable: " + target);
		}
	}

}
