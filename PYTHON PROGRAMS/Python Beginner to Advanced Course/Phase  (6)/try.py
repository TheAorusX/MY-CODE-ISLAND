# Example 1: Basic try-except to handle division by zero
try:
    result = 10 / 0
except ZeroDivisionError:
    print("Cannot divide by zero!")

# Example 2: Try-except-else to handle value error
try:
    num = int("abc")
except ValueError:
    print("Invalid input! Not a number.")
else:
    print("Conversion successful:", num)

# Example 3: Try-except-finally to always execute cleanup code
try:
    file = open("sample.txt", "r")
    content = file.read()
except FileNotFoundError:
    print("File not found.")
finally:
    print("This runs no matter what.")

# Example 4: Multiple except blocks for different exceptions
try:
    lst = [1, 2, 3]
    print(lst[5])
except IndexError:
    print("Index out of range.")
except Exception as e:
    print("An error occurred:", e)