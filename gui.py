from tkinter import *
from tkinter import messagebox
window = Tk()
window.title("Hello Mate")
window.geometry('350x200')
def clicked():
    messagebox.showinfo("HELLO", 'Click "OK" to exit')
btn = Button(window,text='Click here', command=clicked)
btn.grid(column=0,row=0)
window.mainloop()