package leetcode.medium;

import leetcode.ListNode;

import java.util.*;

public class MediumImpl implements Medium{
    @Override
    public String removeStars(String s) {
        int i=0;
        Stack<Character>stack=new Stack<>();
        while(s.length()>i){
            if(s.charAt(i)=='*'){
                stack.pop();
                i++;
                continue;
            }
            stack.push(s.charAt(i));
            i++;
        }
        StringBuilder stringBuilder=new StringBuilder();
        while(!stack.empty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }

    @Override
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move fast pointer two steps and slow pointer one step at a time
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // Remove the middle node
        prev.next = slow.next;

        return head;
    }

    @Override
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int asteroid : asteroids) {
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                }
                asteroid = 0;
            }
            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs==null||strs.length==0){
           return new ArrayList<>();
       }
       Map<String,List<String>>anagramMap=new HashMap<>();
       for(String each:strs) {
           int[] charCount = new int[26];
           for (char c : each.toCharArray()) {
               charCount[c - 'a']++;
           }

           StringBuilder sb = new StringBuilder();
           for(int count:charCount){
               sb.append('#');
               sb.append(count);
           }
           String key =sb.toString();
           if(!anagramMap.containsKey(key)){
              anagramMap.put(key,new ArrayList<>());
           }
           anagramMap.get(key).add(each);

       }
       return new ArrayList<>(anagramMap.values());
    }

    @Override
    public int[] topKFrequent(int[] nums, int k) {
        return new int[0];
    }

    @Override
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            String delimiter=str.length()+"#";
            sb.append(delimiter);
            sb.append(str);
        }
        return sb.toString();
    }

    @Override
    public List<String> decode(String str) {
        List<String> decodedList=new ArrayList<>();
        int i =0;
        while (i<str.length()){
            int j=i;
            while (str.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            String each=str.substring(j+1,j+1+length);
            decodedList.add(each);
            i=j+1+length;
        }
        return decodedList;
    }

    @Override
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int prefix=1;
        for(int i = 0 ; i <nums.length;i++){
            arr[i]=prefix;
            prefix*=nums[i];
        }
        int postfix=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]*=postfix;
            postfix*=nums[i];
        }
        return arr;
    }

    @Override
    public boolean isValidSudoku(char[][] board) {
        // Initialize hash sets for rows, columns, and sub-boxes
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Iterate over each cell in the Sudoku board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                // Skip empty cells
                if (num == '.') continue;

                // Calculate the index for the 3x3 sub-box
                int boxIndex = (i / 3) * 3 + j / 3;

                // Check for duplicates in the current row, column, and 3x3 sub-box
                if (rows[i].contains(num) || cols[j].contains(num) || boxes[boxIndex].contains(num)) {
                    return false;
                }

                // Add the number to the corresponding row, column, and 3x3 sub-box
                rows[i].add(num);
                cols[j].add(num);
                boxes[boxIndex].add(num);
            }
        }

        return true;
    }

    @Override
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>integerHashSet=new HashSet<>();
        for(Integer i :nums){
            integerHashSet.add(i);
        }
        int maxLength=0;
        for(int num:nums)
            if(!integerHashSet.contains(num-1)){
                int length=1;
                int currentNum=num;
                while(integerHashSet.contains(currentNum+1)){
                    currentNum++;
                    length++;
                }
           maxLength=Math.max(maxLength,length);
        }
        return maxLength;
    }

    @Override
    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right = numbers.length-1;
        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum<target){
                left++;
                continue;
            }
            if(sum>target){
                right--;
                continue;
            }
            return new int[]{++left,++right};
        }
        return new int[]{};
    }

    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));


                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }


                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }


}
