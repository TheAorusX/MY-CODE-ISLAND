# Example 1: Basic usage of range()
for i in range(5):
    print(i)  # Output: 0 1 2 3 4

# Example 2: Using start and stop arguments
for i in range(2, 7):
    print(i)  # Output: 2 3 4 5 6

# Example 3: Using step argument
for i in range(0, 10, 2):
    print(i)  # Output: 0 2 4 6 8

# Example 4: Using range() to create a list
numbers = list(range(1, 6))
print(numbers)  # Output: [1, 2, 3, 4, 5]