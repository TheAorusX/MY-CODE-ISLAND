# Example 1: Returning a value from a function
def add(a, b):
    return a + b

result = add(3, 5)
print("Sum:", result)  # Output: Sum: 8

# Example 2: Returning multiple values
def get_name_and_age():
    name = "Alice"
    age = 25
    return name, age

n, a = get_name_and_age()
print("Name:", n, "Age:", a)  # Output: Name: Alice Age: 25

# Example 3: Returning from a function early
def check_even(num):
    if num % 2 == 0:
        return True
    return False

print(check_even(4))  # Output: True
print(check_even(7))  # Output: False

# Example 4: Function without return (returns None)
def greet(name):
    print("Hello,", name)

result = greet("Bob")
print("Returned:", result)  # Output: Hello, Bob \n Returned: None