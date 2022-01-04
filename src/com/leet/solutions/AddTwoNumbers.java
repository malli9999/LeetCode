package com.leet.solutions;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4] Output: [7,0,8] Explanation: 342 + 465 =
 * 807.
 */
public class AddTwoNumbers {

// Problem statement
	// You are given two non-empty linked lists representing two non-negative
	// integers.
	// The digits are stored in reverse order, and each of their nodes contains a
	// single digit.
	// Add the two numbers and return the sum as a linked list.
	// You may assume the two numbers do not contain any leading zero, except the
	// number 0 itself.

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {

		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode dummy = new ListNode(0);
			ListNode l3 = dummy;
			int carry = 0;

			ListNode p = l1;
			ListNode q = l2;
			while (l1 != null || l2 != null) {
				int l1val = (l1 != null) ? l1.val : 0;
				int l2val = (l2 != null) ? l2.val : 0;

				int sum = l1val + l2val + carry;
				carry = sum / 10;
				int lastDigit = sum % 10;

				ListNode newnode = new ListNode(lastDigit);
				l3.next = newnode;

				if (l1 != null)
					l1 = l1.next;
				if (l2 != null)
					l2 = l2.next;
				l3 = l3.next;
			}
			if (carry > 0) {
				ListNode newnode = new ListNode(1);
				l3.next = newnode;
			}

			return dummy.next;

		}
	}
}