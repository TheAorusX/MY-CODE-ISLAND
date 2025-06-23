# Example 1: Deleting a variable
x = 10
del x
# print(x)  # This will raise a NameError because x is deleted

# Example 2: Deleting an item from a list
numbers = [1, 2, 3, 4, 5]
del numbers[2]
print(numbers)  # Output: [1, 2, 4, 5]

# Example 3: Deleting a slice from a list
letters = ['a', 'b', 'c', 'd', 'e']
del letters[1:4]
print(letters)  # Output: ['a', 'e']

# Example 4: Deleting a key from a dictionary
person = {'name': 'Alice', 'age': 25, 'city': 'New York'}
del person['age']
print(person)  # Output: {'name': 'Alice', 'city': 'New York'}