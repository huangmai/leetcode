package huangmai.leetCode.libClass;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x){
		val = x;
	}
	@Override
	public String toString() {
		return Integer.toString(val);
	}
}
