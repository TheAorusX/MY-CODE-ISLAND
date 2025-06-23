# 1. Basic lambda function to add two numbers
add = lambda x, y: x + y
print(add(5, 3))  # Output: 8

# 2. Using lambda with map to square a list of numbers
numbers = [1, 2, 3, 4]
squared = list(map(lambda x: x ** 2, numbers))
print(squared)  # Output: [1, 4, 9, 16]

# 3. Using lambda with filter to get even numbers from a list
even_numbers = list(filter(lambda x: x % 2 == 0, numbers))
print(even_numbers)  # Output: [2, 4]

# 4. Using lambda as a key in sorting a list of tuples by the second element
pairs = [(1, 'one'), (3, 'three'), (2, 'two')]
pairs.sort(key=lambda x: x[1])
print(pairs)  # Output: [(1, 'one'), (3, 'three'), (2, 'two')]