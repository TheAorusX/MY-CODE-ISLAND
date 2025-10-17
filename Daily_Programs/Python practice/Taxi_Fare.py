print("Welcome to FakeTaxi Cab Service!")
print("Please enter your name:")
name=input()
print("Please enter your age:")
age=(int)(input())
print("Please enter the distance of your trip in km:")
dist=(int)(input())
fare=(int)(80)
tfare=(int)(0)
if dist<10:
    tfare=(fare*dist)
elif dist>=10:
    tfare=(fare*dist*2)
print("Your Trip Fare Is", tfare)

# incomplete