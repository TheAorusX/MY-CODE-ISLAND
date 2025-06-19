# The int(), str(), and float() functions in Python are built-in type conversion functions. 
# int() converts a value to an integer, str() converts a value to a string, and float() converts a value to a floating-point number. 
# These functions are useful for handling user input, data processing, and type compatibility in operations. 
# Below are five examples for each function:

# int() examples
print(int("42"))         # Converts string to integer: 42
print(int(3.99))         # Converts float to integer (truncates): 3
print(int(True))         # Converts boolean True to integer: 1
print(int(False))        # Converts boolean False to integer: 0
print(int("101", 2))     # Converts binary string to integer: 5

# str() examples
print(str(123))          # Converts integer to string: '123'
print(str(45.67))        # Converts float to string: '45.67'
print(str(True))         # Converts boolean to string: 'True'
print(str([1, 2, 3]))    # Converts list to string: '[1, 2, 3]'
print(str(None))         # Converts None to string: 'None'

# float() examples
print(float("3.14"))     # Converts string to float: 3.14
print(float(10))         # Converts integer to float: 10.0
print(float(True))       # Converts boolean True to float: 1.0
print(float(False))      # Converts boolean False to float: 0.0
print(float("2e2"))      # Converts scientific notation string to float: 200.0