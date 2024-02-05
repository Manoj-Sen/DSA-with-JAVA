class Solution {
    public Node sortedInsert(Node head, int data) {
        // Head is NULL
        Node node = new Node(data);
        if(head == null)
        {
            node.next = node;
            return node;
        }
        // if data position in first
        if(node.data <= head.data)
        {
            int temp = node.data;
            node.data = head.data;
            head.data = temp;
            node.next = head.next;
            head.next = node;
            return head;
        }
        // in Middle
        Node curr = head;
        int flage = 0;
        while(curr.next != head)
        {
            if(curr.next.data >= data)
            {
                node.next = curr.next;
                curr.next = node;
                flage = 1;
                break;
            }
            curr = curr.next;
        }
        // at the End
        if(flage == 0)
        {
            node.next = curr.next;
            curr.next = node;
        }
        return head;
    }
}
