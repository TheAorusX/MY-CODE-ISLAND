# Example 1: Comparing two variables with 'is'
a = [1, 2, 3]
b = a
print(a is b)  # True, because both refer to the same object

# Example 2: Comparing two different objects with the same value
x = [4, 5, 6]
y = [4, 5, 6]
print(x is y)  # False, because they are different objects in memory

# Example 3: Using 'is' with None
result = None
print(result is None)  # True, commonly used to check for None

# Example 4: 'is' vs '=='
m = 1000
n = 1000
print(m == n)   # True, values are equal
print(m is n)   # False, different objects (for large integers)