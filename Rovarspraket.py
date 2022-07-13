a=input()

d={
    'a':'a',
    'b':'bac',
    'c':'cad',
    'd':'def',
    'e':'e',
    'f':'feg',
    'g':'geh',
    'h':'hij',
    'i':'i',
    'j':'jik',
    'k':'kil',
    'l':'lim',
    'm':'mon',
    'n':'nop',
    'o':'o',
    'p':'poq',
    'r':'ros',
    's':'sut',
    't':'tuv',
    'u':'u',
    'v':'vum',
    'w':'wux',
    'x':'xuy',
    'y':'yuz',
    'z':'zuz'
}
b=''
for i in range(len(a)):
    c=d[a[i]]
    b+=c

print(b)