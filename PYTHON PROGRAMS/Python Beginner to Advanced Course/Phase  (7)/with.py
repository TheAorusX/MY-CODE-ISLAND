# Example 1: Reading a file using 'with'
with open('sample.txt', 'r') as file:
    content = file.read()
    print(content)

# Example 2: Writing to a file using 'with'
with open('output.txt', 'w') as file:
    file.write('Hello, world!')

# Example 3: Using 'with' to handle multiple files
with open('input1.txt', 'r') as file1, open('input2.txt', 'r') as file2:
    print(file1.read())
    print(file2.read())

# Example 4: Using 'with' with a custom context manager
class MyContext:
    def __enter__(self):
        print("Entering context")
        return self
    def __exit__(self, exc_type, exc_val, exc_tb):
        print("Exiting context")

with MyContext():
    print("Inside the context")