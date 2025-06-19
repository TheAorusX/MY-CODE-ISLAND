"""
The elif keyword in Python stands for "else if" and is used in conditional statements. It allows you to check multiple expressions for True and execute a block of code as soon as one condition is met. You use elif after an initial if statement and before an optional else. This helps make your code more readable and avoids deeply nested if statements.
"""
x = 10
if x < 5:
    print("Less than 5")
elif x == 10:
    print("Equal to 10")
else:
    print("Other value")

grade = 85
if grade >= 90:
    print("A")
elif grade >= 80:
    print("B")
elif grade >= 70:
    print("C")
else:
    print("Below C")

day = "Tuesday"
if day == "Monday":
    print("Start of week")
elif day == "Friday":
    print("End of week")
else:
    print("Midweek")

num = 0
if num > 0:
    print("Positive")
elif num < 0:
    print("Negative")
else:
    print("Zero")

color = "green"
if color == "red":
    print("Stop")
elif color == "yellow":
    print("Caution")
elif color == "green":
    print("Go")
else:
    print("Unknown color")