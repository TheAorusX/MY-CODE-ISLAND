# Example 1: Simple generator using yield
def count_up_to(n):
    count = 1
    while count <= n:
        yield count
        count += 1

for num in count_up_to(5):
    print(num)

# Example 2: Yielding values from a list
def list_items(items):
    for item in items:
        yield item

for fruit in list_items(['apple', 'banana', 'cherry']):
    print(fruit)

# Example 3: Yield with multiple values (tuples)
def coordinates():
    for x in range(3):
        for y in range(2):
            yield (x, y)

for coord in coordinates():
    print(coord)

# Example 4: Using yield to generate Fibonacci numbers
def fibonacci(limit):
    a, b = 0, 1
    while a < limit:
        yield a
        a, b = b, a + b

for num in fibonacci(10):
    print(num)