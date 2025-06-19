import tkinter as tk
from tkinter import messagebox
import time
import threading
import pygame

# Initialize pygame mixer for alarm sound
pygame.mixer.init()

def play_alarm():
    pygame.mixer.music.load("j_a_r_v_i_s_alarm.mp3")  # Replace with your own sound file
    pygame.mixer.music.play()

def check_alarm():
    while True:
        current_time = time.strftime("%H:%M:%S")  # Get current time
        if current_time == alarm_time.get():
            play_alarm()
            messagebox.showinfo("Alarm", "Time to wake up!")
            break
        time.sleep(1)

def set_alarm():
    t = threading.Thread(target=check_alarm)
    t.start()

# GUI Setup
root = tk.Tk()
root.title("Alarm Clock")

tk.Label(root, text="Set Alarm (HH:MM:SS):").pack(pady=5)
alarm_time = tk.StringVar()
tk.Entry(root, textvariable=alarm_time).pack(pady=5)

tk.Button(root, text="Set Alarm", command=set_alarm).pack(pady=10)

root.mainloop()
