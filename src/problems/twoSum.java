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

//Ý tưởng thuật toán: Có dãy array là nums = [2,7,11,15] và target = 9 thì ta thấy đi từ trái sang phải thì 2+7=9 do đó
// i sẽ là vị trí đầu tiên của mảng là 2 và j sẽ nằm ở vị trí tiếp theo của mảng là 7 sẽ là j = i + 1, nếu kết thúc mảng mà không tìm được
// kết quả thì sẽ trả về null, nếu tìm thấy kết quả thì sẽ trả về vị trí của phẩn tử đó trong mảng [i = 0 và j=1]

package problems;

// public class TwoSum {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for(int i = 0; i < n; i++){
//             for(int j = i + 1; j < n; j++){
//                 if(nums[i] + nums[j] == target) {
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return null;
//     }
// }

//Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
// giảm độ phức tạp của thuật toán ít hơn O(n2)
// Ý tưởng: Sử dụng Map để duyệt qua các phần tử có trong mảng sau đó trừ với target
//Kiểm tra nếu số còn thiếu đó đã có trong map chưa.
//Nếu có thì sẽ trả về map.get[số cần],i
//Nếu chưa thì lưu lại dưới dạng nums[i]

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int kq = target - nums[i];

            if(map.containsKey(kq)) {
                return new int[]{map.get(kq),i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
