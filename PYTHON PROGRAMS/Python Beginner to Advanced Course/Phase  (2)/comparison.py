"""
The comparison operators '==', '!=', '<', '>', '<=', and '>=' are used to compare two values in Python. 
'==' checks if two values are equal, '!=' checks if they are not equal, '<' checks if the left value is less than the right, 
'>' checks if the left value is greater than the right, '<=' checks if the left value is less than or equal to the right, 
and '>=' checks if the left value is greater than or equal to the right. These operators return a boolean value: True or False.
"""
# Comparison Operators in Python
# Examples for '==':
print(5 == 5)         # True
print('a' == 'b')     # False
print([1,2] == [1,2]) # True
print(None == None)   # True
print(3.0 == 3)       # True

# Examples for '!=':
print(5 != 3)         # True
print('a' != 'a')     # False
print([1] != [2])     # True
print(None != 0)      # True
print(2.5 != 2.5)     # False

# Examples for '<':
print(2 < 3)          # True
print(5 < 2)          # False
print('a' < 'b')      # True
print(3.5 < 3.6)      # True
print([1] < [2])      # True

# Examples for '>':
print(4 > 2)          # True
print(1 > 5)          # False
print('z' > 'a')      # True
print(7.1 > 7.0)      # True
print([2] > [1])      # True

# Examples for '<=':
print(3 <= 3)         # True
print(2 <= 1)         # False
print('a' <= 'b')     # True
print(5.0 <= 5)       # True
print([1,2] <= [1,2]) # True

# Examples for '>=':
print(5 >= 5)         # True
print(3 >= 4)         # False
print('b' >= 'a')     # True
print(2.2 >= 2.1)     # True
print([2] >= [1])     # True
