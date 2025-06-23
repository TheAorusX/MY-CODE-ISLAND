# Example 1: Function that returns None by default
def greet(name):
    print(f"Hello, {name}!")

result = greet("Alice")
print(result)  # Output: None

# Example 2: Assigning None to a variable
x = None
if x is None:
    print("x is None")  # Output: x is None

# Example 3: Function explicitly returning None
def do_nothing():
    return None

output = do_nothing()
print(output)  # Output: None

# Example 4: Using None as a default argument
def print_message(msg=None):
    if msg is None:
        print("No message provided.")
    else:
        print(msg)

print_message()            # Output: No message provided.
print_message("Hi there")  # Output: Hi there