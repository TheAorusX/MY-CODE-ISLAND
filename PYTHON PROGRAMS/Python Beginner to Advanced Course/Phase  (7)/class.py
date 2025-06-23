# Example 1: Basic class with a function
class Dog:
    def bark(self):
        print("Woof!")

d = Dog()
d.bark()  # Output: Woof!

# Example 2: Class function with parameters
class Calculator:
    def add(self, a, b):
        return a + b

calc = Calculator()
print(calc.add(5, 3))  # Output: 8

# Example 3: Class function modifying object state
class Counter:
    def __init__(self):
        self.count = 0

    def increment(self):
        self.count += 1

c = Counter()
c.increment()
print(c.count)  # Output: 1

# Example 4: Class function returning a formatted string
class Person:
    def __init__(self, name):
        self.name = name

    def greet(self):
        return f"Hello, my name is {self.name}."

p = Person("Alice")
print(p.greet())  # Output: Hello, my name is Alice.