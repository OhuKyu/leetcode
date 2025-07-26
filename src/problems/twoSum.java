//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//Cho 1 mảng số nguyên nums và 1 mảng số nguyên là target, trả về chỉ số của hai số sao cho tổng của chúng bẳng target
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//Bạn có thể giả định rằng mỗi đầu vào luôn có đúng một lời giải, và bạn không được dùng 1 phần tử quá 2 lần
//You can return the answer in any order.
//Bạn có thể trả về kết quả theo bất kỳ thứ tự nào!

/*
    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
*/

//Ý tưởng thuật toán: Có dãy array là nums = [2,7,11,15] thì ta thấy

package problems;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
