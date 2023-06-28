package StriverSDEsheet;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> res = generate(n);

        for (List<Integer> i : res) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // this will make sure 1st element of each row is 1
            row.add(1);

            // this add above row two element and add result to cuurent row. In pascal
            // triangle every element is sum of its above two element
            for (int j = 1; j < i; j++) {
                row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }

            // This will add 1 to end of every row
            if (i > 0)
                row.add(1);

            res.add(i, row);
        }

        return res;
    }

    public static Node findUnion(Node head1, Node head2) {
        Node head = new Node(-1);
        Node temp = head;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else if (head1.data > head2.data) {
                temp.next = head2;
                head2 = head2.next;
            } else {
                temp.next = head1;
                head1 = head1.next;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return head.next;
    }
}
