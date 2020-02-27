"""
Given an array of integers, return a new array such that each element at 
index i of the new array is the product of all the numbers in the original 
array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be 
[120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be 
[2, 3, 6].

Follow-up: what if you can't use division?
"""
from functools import reduce

# Solution 1
def generate_array1(base_array):
    new_array = []
    new_array += base_array
    
    length = len(base_array)
    
    for i in range(length):
        new_array[i] = 1
        
        for j in range(i + 1, length):
            new_array[i] = new_array[i] * base_array[j]
                
        for j in range(i - 1, -1, -1):
                new_array[i] = new_array[i] * base_array[j]
                
    return new_array

# Solution 2
def generate_array2(base_array):
    new_array = []
    array_aux = list(base_array)
    
    for index, element in enumerate(base_array):
        del array_aux[index]
        
        product = reduce(lambda x, y: x * y, array_aux)
        
        array_aux.insert(index, element)
        
        new_array.append(product)
        
    return new_array

# Solution 3
def generate_array3(base_array):
    product = reduce(lambda x, y: x * y, base_array)
    return [product // element for element in base_array]


assert generate_array1([3, 2, 1]) == [2, 3, 6]
assert generate_array1([1, 2, 3, 4, 5]) == [120, 60, 40, 30, 24]
assert generate_array2([3, 2, 1]) == [2, 3, 6]
assert generate_array2([1, 2, 3, 4, 5]) == [120, 60, 40, 30, 24]
assert generate_array3([3, 2, 1]) == [2, 3, 6]
assert generate_array3([1, 2, 3, 4, 5]) == [120, 60, 40, 30, 24]

    
    

