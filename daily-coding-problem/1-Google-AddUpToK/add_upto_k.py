"""
Given a list of numbers and a number k, return whether any two numbers from 
the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
"""

def add_upto_k(array, k):
    diff_set = set()
    
    for i in array:
        if i in diff_set:
            return True
        
        diff = k - i
        diff_set.add(diff)
    
    return False

def add_upto_k2(array, k):
    sorted(array)
    
    i = 0
    j = len(array) - 1
    
    while i < j:
        sum = array[i] + array[j]
        
        if sum < k:
            i += 1
        elif sum > k:
            j -= 1
        else:
            return True
    
    return False
    

assert add_upto_k([10, 15, 3, 7], 17) == True
assert add_upto_k2([10, 15, 3, 7], 17) == True
    
