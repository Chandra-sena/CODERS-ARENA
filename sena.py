l=["Arun","Varun","Kent","Eat","Pot","Net","Peak","Peacock","Zebra","Nato","Toe","Poke","Knife","Peot","Venus","Ant"]
s=''
sen='akeotpn'
for i in range(len(l)):
    s=l[i]
    s=s.lower()
    s1=set()
    c=0
    for ch in s:
        if ch in sen:
            c+=1
    if c==len(s):
        print(l[i])