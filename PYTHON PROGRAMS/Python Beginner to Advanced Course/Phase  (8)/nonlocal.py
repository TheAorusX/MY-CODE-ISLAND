# Example 1: Basic usage of nonlocal
def outer():
    x = "hello"
    def inner():
        nonlocal x
        x = "world"
    inner()
    print(x)  # Output: world

outer()

# Example 2: Counter using nonlocal
def make_counter():
    count = 0
    def increment():
        nonlocal count
        count += 1
        return count
    return increment

counter = make_counter()
print(counter())  # Output: 1
print(counter())  # Output: 2

# Example 3: Modifying multiple variables
def outer():
    a, b = 1, 2
    def inner():
        nonlocal a, b
        a += 10
        b += 20
    inner()
    print(a, b)  # Output: 11 22

outer()

# Example 4: nonlocal vs local variable
def outer():
    msg = "original"
    def inner():
        msg = "local"
        print("Inner:", msg)  # Output: local
    inner()
    print("Outer:", msg)  # Output: original

outer()

def outer2():
    msg = "original"
    def inner():
        nonlocal msg
        msg = "changed"
        print("Inner:", msg)  # Output: changed
    inner()
    print("Outer:", msg)  # Output: changed

outer2()