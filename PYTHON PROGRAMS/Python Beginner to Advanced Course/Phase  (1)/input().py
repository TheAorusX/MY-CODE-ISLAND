# Example 1: Simple input
name = input("Enter your name: ")
print("Hello,", name)

# Example 2: Input as integer
age = int(input("Enter your age: "))
print("You are", age, "years old.")

# Example 3: Input with calculation
num1 = float(input("Enter first number: "))
num2 = float(input("Enter second number: "))
print("Sum:", num1 + num2)

# Example 4: Input for list
items = input("Enter items separated by commas: ").split(',')
print("Items list:", items)

# Example 5: Input with conditional
password = input("Enter password: ")
if password == "secret":
    print("Access granted")
else:
    print("Access denied")