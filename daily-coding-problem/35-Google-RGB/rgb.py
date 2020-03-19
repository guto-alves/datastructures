"""
Given an array of strictly the characters 'R', 'G', and 'B', segregate the 
values of the array so that all the Rs come first, the Gs come second, and 
the Bs come last. You can only swap elements of the array.

Do this in linear time and in-place.

For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should 
become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].
"""

def sort(array):
    nextRIndex = 0
    nextBIndex = len(array) - 1
    index = 0
      
    while index < len(array) and index <= nextBIndex:
        element = array[index]
        
        if array[index] == 'G':
            index += 1
        elif element == 'R':
            array[nextRIndex], array[index] = array[index], array[nextRIndex]
            nextRIndex += 1
        else:
            array[nextBIndex], array[index] = array[index], array[nextBIndex]
            nextBIndex -= 1
    
    return array

assert sort(['G', 'B', 'R', 'R', 'B', 'R', 'G']) == ['R', 'R', 'R', 'G', 'G', 'B', 'B']
assert sort(['G', 'B', 'R']) == ['R', 'G', 'B']
