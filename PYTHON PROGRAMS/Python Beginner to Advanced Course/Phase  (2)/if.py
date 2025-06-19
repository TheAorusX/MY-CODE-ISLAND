"""
Defines and demonstrates the use of the 'if' function, which evaluates a condition and executes a block of code if the condition is true. 
The 'if' statement is fundamental in Python for controlling the flow of a program based on logical conditions. 
If the condition evaluates to True, the indented code block following the 'if' statement runs; otherwise, it is skipped. 
This allows for decision-making and branching in Python programs.
"""

# Definition and use of 'if' statement in Python

# Example 1: Basic if statement
x = 10
if x > 5:
    print("x is greater than 5")

# Example 2: if with equality check
name = "Alice"
if name == "Alice":
    print("Hello, Alice!")

# Example 3: if with boolean variable
is_active = True
if is_active:
    print("The system is active.")

# Example 4: if with multiple conditions
age = 18
if age >= 18 and age < 65:
    print("You are an adult.")

# Example 5: if with a function call
def is_even(n):
    return n % 2 == 0

number = 7
if is_even(number):
    print(f"{number} is even.")