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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> l = new ArrayList<>();
        for(ListNode n: lists){
            while(n != null){
                l.add(n.val);
                n = n.next;
            }
        }
    

        Collections.sort(l);

        ListNode res = new ListNode(0);

        ListNode cur = res;

        for(int li: l){
            cur.next = new ListNode(li);
            cur = cur.next;
        }
        return res.next;
    }
}
