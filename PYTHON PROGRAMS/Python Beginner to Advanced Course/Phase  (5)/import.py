import math
from random import randint
import datetime as dt
from math import sin, cos

# Example 1: Importing a whole module
print(math.sqrt(16))  # Output: 4.0

# Example 2: Importing a specific function from a module
print(randint(1, 10))  # Output: Random integer between 1 and 10

# Example 3: Importing a module with an alias
print(dt.datetime.now())  # Output: Current date and time

# Example 4: Importing multiple functions from a module
print(sin(0), cos(0))  # Output: 0.0 1.0