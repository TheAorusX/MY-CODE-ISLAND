# Example 1: Basic try-except to handle ZeroDivisionError
try:
    result = 10 / 0
except ZeroDivisionError:
    print("You can't divide by zero!")

# Example 2: Handling multiple exception types
try:
    num = int("abc")
except ValueError:
    print("Invalid input! Cannot convert to integer.")
except Exception as e:
    print("An unexpected error occurred:", e)

# Example 3: Using except with else
try:
    value = int(input("Enter a number: "))
except ValueError:
    print("That's not a valid number.")
else:
    print("You entered:", value)

# Example 4: Catching all exceptions with except Exception
try:
    my_list = [1, 2, 3]
    print(my_list[5])
except Exception as error:
    print("An error occurred:", error)