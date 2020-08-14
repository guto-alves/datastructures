def countingValleys(n, s):
    depth = 0
    valleyCount = 0
    inValley = False

    for step in s:
        if step == "U":
            depth += 1
        else:
            depth -= 1

        if depth < 0 and not inValley:
            valleyCount += 1
            inValley = True
        elif depth == 0:
            inValley = False
        
    return valleyCount


if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    s = input()

    result = countingValleys(n, s)
    print(result)
    
    # fptr.write(str(result) + '\n')
    # fptr.close()