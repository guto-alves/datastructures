"""
Implement division of two positive integers without using the division, 
multiplication, or modulus operators. Return the quotient as an integer, 
ignoring the remainder.
"""

def divide(dividend, divisor):
    if divisor == 0:
        return None
    
    sign = -1 if dividend < 0 or divisor < 0 else 1
    
    dividend = abs(dividend)
    divisor = abs(divisor)
    
    quotient = 0
    
    while dividend > 0:
        dividend -= divisor
        quotient += 1
        
    if dividend < 0:
        quotient -= 1
        
    return quotient * sign

assert divide(10, 2) == 5
assert divide(6, 2) == 3
assert divide(0, 5) == 0
assert divide(10, 0) == None
assert divide(10, -2) == -5
assert divide(10, 3) == 3
assert divide(45, -8) == -5



