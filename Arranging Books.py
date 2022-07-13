a=input()
b=a.count('L')
c=a.count('M')
d=0
e=0
f=0
g=0
for i in range(b):
    if a[i]!='L':
        f+=1
    if a[i]=='M':
        d+=1
for i in range(b, c+b):
    if a[i]!='M':
        g+=1
    if a[i]=='L':
        e+=1
q=min(d,e)
w=f+g-q
print(w)
