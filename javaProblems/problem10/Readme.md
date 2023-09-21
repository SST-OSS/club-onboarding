## Remove Duplicates from sorted Array

### Problem Statement
>Given an integer array `nums` sorted in non-decreasing order, remove the duplicates *in-place* such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the *number of unique elements* in `nums`.

## TODO:

- Iterate through all the elements of the `nums` array.
- If the element is non-repeating add it to the new `retArr`.
- If the __*element is repeating*__ skip and move to the next element.
- Return the number of elements in `retArr`.

## Example:

### Example 1:
Input: 
    
    nums = [1,1,2]

Output: 
    
    2, nums = [1,2]
    
Explanation: 
    
    Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.

### Example 2:

Input: 
    
    nums = [0,0,1,1,1,2,2,3,3,4]
Output: 
    
    5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: 
    
    Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.

### Constraints:

- `1 <= nums.length <= 3 * 10^4`
- `-100 <= nums[i] <= 100`
- `nums` is sorted in **non-decreasing order**.`


