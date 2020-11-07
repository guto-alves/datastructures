# first solution
def miniMaxSum(arr):
    max_sum = 0
    min_sum = 0
    length = len(arr)
    
    for excludedIndex in range(length):
        sum = 0 

        i = excludedIndex + 1
                
        while i < length:
            sum += arr[i]
            i += 1
        
        i = 0
        while i < excludedIndex:
            sum += arr[i]
            i += 1
            
        if excludedIndex == 0:
          min_sum = sum  
        elif sum < min_sum:
            min_sum = sum
        
        if sum > max_sum:
            max_sum = sum
        
    print("{} {}".format(min_sum, max_sum))
    
    
# second solution
def miniMaxSum1(arr):
    s = sum(arr)
    print("{} {}".format(s - max(arr), s - min(arr)))
    
    
if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)