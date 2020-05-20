class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null && l2 == null) return null
        if (l1 == null) return l2
        if (l2 == null) return l1
        val t1 = l1.next
        val t2 = l2.next

        if (l1.`val` <= l2.`val`) {
            l1.next = mergeTwoLists(t1, l2)
            return l1
        } else {
            l2.next = mergeTwoLists(l1, t2)
            return l2
        }

    }
}