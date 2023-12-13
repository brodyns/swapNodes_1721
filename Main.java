public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution{
    public ListNode swapNodes(ListNode head, int k){
        ListNode left = head;
        ListNode right = head;
        for (int i = 1; i < k; i++) {
            left = left.next;
        }
        ListNode cur = left;
        while(cur.next != null) {
            cur = cur.next;
            right = right.next;
        }
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
