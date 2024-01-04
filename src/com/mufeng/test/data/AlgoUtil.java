package com.mufeng.test.data;

public class AlgoUtil {
    public static ListNode asListNode(int[] nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for (int n = 1; n < nums.length; n++) {
            cur.next = new ListNode(nums[n]);
            cur = cur.next;
        }
        return head;
    }
}
