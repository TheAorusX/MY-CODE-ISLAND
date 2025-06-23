"""
The 'else' function is not a built-in Python function, but the 'else' keyword is used in control flow statements. 
It provides an alternative block of code that executes if the preceding 'if' condition is False. 
In loops, 'else' executes after the loop completes normally, without encountering a 'break' statement. 
Using 'else' improves code clarity by explicitly handling alternative execution paths.
"""

# Example 1: if-else
x = 5
if x > 10:
    print("Greater than 10")
else:
    print("10 or less")

# Example 2: if-elif-else
y = 0
if y > 0:
    print("Positive")
elif y < 0
    print("Negative")
else:
    print("Zero")

# Example 3: for-else
for i in range(3):
    if i == 5:
        break
else:
    print("Loop completed without break")

# Example 4: while-else
count = 0
while count < 3:
    count += 1
else:
    print("While loop ended normally")

# Example 5: else with try-except
try:
    result = 10 / 2
except ZeroDivisionError:
    print("Division by zero!")
else:
    print("Division successful")