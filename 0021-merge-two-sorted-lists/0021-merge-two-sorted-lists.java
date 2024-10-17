/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null){
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null){
            current.next = list1;
        } else if (list2 != null){
            current.next = list2;
        }

        return dummy.next;
    }
    
    public static void main(String[] args) {
    // Test case 1: list1 = [1, 2, 4], list2 = [1, 3, 4]
    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(2);
    list1.next.next = new ListNode(4);

    ListNode list2 = new ListNode(1);
    list2.next = new ListNode(3);
    list2.next.next = new ListNode(4);

    Solution solution = new Solution();
    ListNode mergedList = solution.mergeTwoLists(list1, list2);

    // Print the merged list
    printList(mergedList); // Expected output: [1, 1, 2, 3, 4, 4]

    // Test case 2: list1 = [], list2 = []
    ListNode emptyList1 = null;
    ListNode emptyList2 = null;
    ListNode mergedEmptyList = solution.mergeTwoLists(emptyList1, emptyList2);
    printList(mergedEmptyList); // Expected output: []

    // Test case 3: list1 = [], list2 = [0]
    ListNode list3 = new ListNode(0);
    ListNode mergedSingleList = solution.mergeTwoLists(null, list3);
    printList(mergedSingleList); // Expected output: [0]
}

    // Helper method to print the linked list
    public static void printList(ListNode head) {
    if (head == null) {
        System.out.println("[]");
        return;
    }
    ListNode current = head;
    System.out.print("[");
    while (current != null) {
        System.out.print(current.val);
        if (current.next != null) {
            System.out.print(", ");
        }
        current = current.next;
    }
    System.out.println("]");
}


}