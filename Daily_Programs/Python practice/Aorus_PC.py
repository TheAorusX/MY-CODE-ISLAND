import datetime
time=datetime.time()
bot_name:str='Aorus'
print(f'{time} Hello! Ayaan I\'m {bot_name} How Can I Assist You Today?')
while True:
    uint:str=input(f"{time} You:  ").lower()
    if uint in ['hello','hi']:
        print(f"{time}{bot_name}:Greetings Ayaan!")
    elif uint in ['bye']:
        print(f"{time}{bot_name}:Goodbye Ayaan!")
    else:
        print(f"{time}{bot_name}:Sorry Didn\'t Catch Ya! :(")