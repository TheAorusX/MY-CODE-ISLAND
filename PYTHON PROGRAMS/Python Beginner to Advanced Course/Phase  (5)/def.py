# 1. Simple function with no arguments
def greet():
    print("Hello, world!")

greet()

# 2. Function with arguments
def add(a, b):
    return a + b

result = add(5, 3)
print("Sum:", result)

# 3. Function with a default argument
def say_hello(name="Guest"):
    print(f"Hello, {name}!")

say_hello("Ayaan")
say_hello()

# 4. Function returning multiple values
def get_stats(numbers):
    return min(numbers), max(numbers), sum(numbers)/len(numbers)

stats = get_stats([2, 4, 6, 8])
print("Min:", stats[0], "Max:", stats[1], "Average:", stats[2])