//在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个
//整数，判断数组中是否含有该整数。 
//
// 
//
// 示例: 
//
// 现有矩阵 matrix 如下： 
//
// 
//[
//  [1,   4,  7, 11, 15],
//  [2,   5,  8, 12, 19],
//  [3,   6,  9, 16, 22],
//  [10, 13, 14, 17, 24],
//  [18, 21, 23, 26, 30]
//]
// 
//
// 给定 target = 5，返回 true。 
//
// 给定 target = 20，返回 false。 
//
// 
//
// 限制： 
//
// 0 <= n <= 1000 
//
// 0 <= m <= 1000 
//
// 
//
// 注意：本题与主站 240 题相同：https://leetcode-cn.com/problems/search-a-2d-matrix-ii/ 
// Related Topics 数组 双指针 
// 👍 248 👎 0

  
package com.leetcode.editor.en;
public class ErWeiShuZuZhongDeChaZhaoLcof{
     public static void main(String[] args) {
          Solution solution = new ErWeiShuZuZhongDeChaZhaoLcof().new Solution();
     }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //例子：
        //[[1,4,7,11,15],
        // [2,5,8,12,19],
        // [3,6,9,16,22],
        // [10,13,14,17,24],
        // [18,21,23,26,30]]
        //5

        //思路一：暴力双重for

        //思路二：
        //如果当前位置元素比target小，则row++       【最后一个数字为该行最大元素，如果此数字小于target,说明该行中均小于target】
        //如果当前位置元素比target大，则col--       【前面行都被排除，该行最后一个数字大于target,说明该数字在此行】
        //如果相等，返回true
        //如果越界了还没找到，说明不存在，返回false

        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while(row < m && col >= 0) {
            if(matrix[row][col] > target) {
                col--;
            }else if(matrix[row][col] < target) {
                row++;
            }else {
                return true;
            }
        }
        return false;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }