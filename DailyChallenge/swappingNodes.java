package DailyChallenge;

public class swappingNodes {

    public static void main(String[] args) {
        int k = 2;
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 7; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        // while (head != null) {
        // System.out.print(head.val + " ");
        // head = head.next;
        // }

        swappingNodes s = new swappingNodes();
        ListNode result = s.swapNodes(head, k);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode leftNode = head, rightNode = head;

        for (int i = 1; i < k; i++) {
            leftNode = leftNode.next;
        }

        ListNode current = leftNode;
        while (current.next != null) {
            current = current.next;
            rightNode = rightNode.next;
        }

        int temp = leftNode.val;
        leftNode.val = rightNode.val;
        rightNode.val = temp;

        return head;
    }
}
