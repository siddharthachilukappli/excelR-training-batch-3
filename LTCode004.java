class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // Helper method to create a linked list from an array
    public static ListNode fromArray(int[] nums) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummyHead.next;
    }

    // Helper method to print a linked list as an array
    public static void printList(ListNode head) {
        System.out.print("[");
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(", ");
            }
            head = head.next;
        }
        System.out.println("]");
    }
}

public class LTCode004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] num1 = {2, 4, 3}; // Represents 342
        int[] num2 = {5, 6, 4}; // Represents 465

        // Convert arrays to linked lists
        ListNode l1 = ListNode.fromArray(num1);
        ListNode l2 = ListNode.fromArray(num2);

        // Call the LTCode004 method
        LTCode004 solution = new LTCode004();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        System.out.print("Output: ");
        ListNode.printList(result); // Expected output: [7, 0, 8]
    }
}