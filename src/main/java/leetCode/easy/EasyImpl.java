package leetCode.easy;

import leetCode.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EasyImpl implements Easy{
    @Override
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length-1;i++){
            for(int j = i+1 ; j < nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    @Override
    public int[] twoSumOptimised(int[] nums, int target) {
        Map<Integer,Integer>numMap=new HashMap<>();
        for(int i = 0 ; i < nums.length;i++){
            int diff = target-nums[i];
            if(numMap.containsKey(diff)){
                return new int[]{numMap.get(diff),i};
            }
            numMap.put(nums[i],i );
        }
        return new int[]{};
    }


    @Override
    public boolean hasCycle(ListNode head) {
        List<ListNode> nodeList=new ArrayList<>();
        while(head!=null){
            if(nodeList.contains(head)){
                return true;
            }
            nodeList.add(head);
            head = head.next;
        }
        return false;
    }

    @Override
    public boolean hasCycleOptimised(ListNode head) {
        // Floyd's Tortoise and Hare algorithm
        if (head == null || head.next == null) {
            return false;  // No cycle with less than 2 nodes
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;  // Reached end of the list, no cycle
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;  // Cycle detected
    }

    @Override
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int count = -1;
        int sum=0;
        while(temp!=null){
            count++; temp=temp.next;
        }
        temp=head;
        while(temp!=null){
             sum+=temp.val==0?0:Math.pow(2,count);
             count--;
             temp=temp.next;
        }
        return sum;
    }
}
