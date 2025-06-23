# Example 1: Basic usage of self in a class
class Person:
    def __init__(self, name):
        self.name = name  # 'self' refers to the instance

    def greet(self):
        print(f"Hello, my name is {self.name}")

p = Person("Alice")
p.greet()

# Example 2: Modifying instance variables using self
class Counter:
    def __init__(self):
        self.count = 0

    def increment(self):
        self.count += 1
        print(f"Count is now {self.count}")

c = Counter()
c.increment()
c.increment()

# Example 3: Using self to call other methods in the same class
class Rectangle:
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

    def display_area(self):
        print(f"Area: {self.area()}")  # self.area() calls another method

r = Rectangle(5, 3)
r.display_area()

# Example 4: Difference between instance and class variables
class Example:
    class_var = "I am a class variable"

    def __init__(self, value):
        self.instance_var = value

    def show_vars(self):
        print(f"Instance variable: {self.instance_var}")
        print(f"Class variable: {Example.class_var}")

e = Example("I am an instance variable")
e.show_vars()