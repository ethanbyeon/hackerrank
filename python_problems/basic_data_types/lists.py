
N = int(input())
lis = []
s = []
z = 0

for i in range(N):
    s = input().strip().split()

    if s[0] == "insert":
        s.pop(0)
        z = int(s[0])
        lis.insert(z,int(s[1]))          
        s.clear()

    elif s[0] == "print":
        print(lis)
        s.clear()

    elif s[0] == "pop":
        lis.pop(-1)
        s.clear()


    elif s[0] == "remove":
        z = int(s[1])
        lis.remove(z)
        s.clear()

    elif s[0] == "sort":
        lis.sort()
        s.clear()

    elif s[0] == "append":
        lis.append(int(s[1]))
        s.clear()

    else:
        lis.reverse()
        s.clear()
