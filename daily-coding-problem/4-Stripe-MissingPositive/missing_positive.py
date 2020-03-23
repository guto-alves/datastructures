"""
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
"""

# O(n) time and O(n) space
def find_missing_element(array):    
    dictionary = {i: True for i in array}
    
    lowest_positive = max(array) + 1
    
    if lowest_positive <= 0:
        return 1

    for element in array:
        if element < 0:     
            continue

        if element > 1 and 1 not in dictionary:
          return 1
    
        if element + 1 not in dictionary:
          if element + 1 < lowest_positive:
            lowest_positive = element + 1

    return lowest_positive

assert find_missing_element([2, 3, 7, 6, 8, -1, -10, 15]) == 1
assert find_missing_element([2, 3, -7, 6, 8, 1, -10, 15]) == 4
assert find_missing_element([1, 1, 0, -1, -2]) == 2
assert find_missing_element([3,1,3,5,1,3,3,3,3,1,2,3,5,5,0,1,2,3,1,2]) == 4
assert find_missing_element([-1, -4, 3, 3, 2, 0, 2, 5]) == 1
assert find_missing_element([-1, -2, 3, 4, 1, 2]) == 5
assert find_missing_element([0]) == 1