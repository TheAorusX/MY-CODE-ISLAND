# Example 1: Modifying a global variable inside a function
x = 5

def change_global():
    global x
    x = 10

change_global()
print(x)  # Output: 10

# Example 2: Using global to create a new global variable inside a function
def create_global():
    global y
    y = 20

create_global()
print(y)  # Output: 20

# Example 3: Without global, local variable does not affect global variable
z = 30

def try_change():
    z = 40  # This only changes local z

try_change()
print(z)  # Output: 30

# Example 4: Using global to update a counter variable
counter = 0

def increment():
    global counter
    counter += 1

increment()
increment()
print(counter)  # Output: 2