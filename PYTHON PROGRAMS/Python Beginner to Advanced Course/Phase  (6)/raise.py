# Example 1: Raising a built-in exception
def divide(a, b):
    if b == 0:
        raise ZeroDivisionError("Cannot divide by zero!")
    return a / b

# Example 2: Raising a custom exception
class NegativeNumberError(Exception):
    pass

def check_positive(num):
    if num < 0:
        raise NegativeNumberError("Negative numbers are not allowed.")

# Example 3: Raising an exception with no arguments
def always_fail():
    raise RuntimeError

# Example 4: Re-raising an exception
def process():
    try:
        x = int("not a number")
    except ValueError as e:
        print("Caught ValueError, re-raising...")
        raise