# Example 1: finally always executes
try:
    print("Trying to divide by zero")
    result = 10 / 0
except ZeroDivisionError:
    print("Caught division by zero!")
finally:
    print("This always runs (Example 1)")

# Example 2: finally with no exception
try:
    print("Trying normal division")
    result = 10 / 2
except ZeroDivisionError:
    print("Caught division by zero!")
finally:
    print("This always runs (Example 2)")

# Example 3: finally with file handling
try:
    file = open("sample.txt", "w")
    file.write("Hello, world!")
except IOError:
    print("File error!")
finally:
    file.close()
    print("File closed (Example 3)")

# Example 4: finally with return statement
def test_finally():
    try:
        return "Returning from try"
    finally:
        print("This runs even with return (Example 4)")

print(test_finally())