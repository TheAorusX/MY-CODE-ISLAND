from math import sqrt
from random import randint, choice
from datetime import datetime as dt
from math import *

# Example 1: Importing a specific function from a module
print(sqrt(16))  # Output: 4.0

# Example 2: Importing multiple functions from a module
print(randint(1, 10))  # Output: Random integer between 1 and 10
print(choice(['apple', 'banana', 'cherry']))  # Output: Random fruit

# Example 3: Importing a module with an alias
print(dt.now())  # Output: Current date and time

# Example 4: Importing all names from a module (not recommended)
print(sin(0))  # Output: 0.0