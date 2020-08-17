def jumpingOnClouds(c):
    index = 0
    jumps = 0
    totalClouds = len(c)

    while index < totalClouds - 1:
        if index + 2 < totalClouds and c[index + 2] == 0:
            index += 2
        else:
            index += 1
            
        jumps += 1
    
    return jumps


if __name__ == '__main__':
    c = list(map(int, input().rstrip().split()))

    result = jumpingOnClouds(c)
    
    print(result)