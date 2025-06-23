# Example 1: Basic __init__() usage in a class
class Person:
    def __init__(self, name):
        self.name = name

p = Person("Alice")
print(p.name)  # Output: Alice

# Example 2: __init__() with multiple parameters
class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

pt = Point(3, 4)
print(pt.x, pt.y)  # Output: 3 4

# Example 3: __init__() with default parameter values
class Car:
    def __init__(self, brand="Toyota"):
        self.brand = brand

c1 = Car()
c2 = Car("Honda")
print(c1.brand)  # Output: Toyota
print(c2.brand)  # Output: Honda

# Example 4: __init__() initializing a list attribute
class ShoppingCart:
    def __init__(self):
        self.items = []

cart = ShoppingCart()
cart.items.append("Apple")
print(cart.items)  # Output: ['Apple']