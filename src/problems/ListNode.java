//You are given two non-empty linked lists representing two non-negative integers.
//Bạn được cung cấp hai danh sách liên kết không rỗng đại diện cho hai số nguyên không âm.
//The digits are stored in reverse order, and each of their nodes contains a single digit.
//Các chữ số được lưu trữ ngược và mỗi node của nó chỉ chứa một số duy nhất
//Add the two numbers and return the sum as a linked list.
//Thêm 2 chữ số và tr về tổng của linked list
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Ý tưởng:
//Tạo ra 1 biến dư đây là biến nhớ nếu kết quả lớn hơn 10
//Duyệt từng node l1 và l2
//Lấy giá trị trong node hiện nếu giá trị đó = null thì sẽ lấy 0
//Cộng 2 giá trị và cộng với phần dư
//Lấy tổng chia cho phần dư và lấy phần dư lưu vào trong giá trị dư
//Tiếp tục di chuyển node nếu không còn thì bỏ node giả và trả về kết quả

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dumpHead = new ListNode(0);
        ListNode currentHead = dumpHead;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0 ){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            currentHead.next = new ListNode(digit);
            currentHead = currentHead.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dumpHead.next;
    }
}