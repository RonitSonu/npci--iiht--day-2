rows=int(input("Enter number of rows: "))

lis1=[]
lis2=[]
final=[]
k=0
gap=1
for i in range(1, rows+1):
    for j in range(1, (rows-i)+1):
        print(end=" ")
    num=gap
    k=1
    sum=0
    knew = []

    for j in range(rows):
        if k<=1:
            print(" ",num," ",end="")
            k+=1
            sum+=num
            knew.append(num)
            num+=1
        else:
            knew.append(0)
    lis2.append(knew)
    lis1.append(sum)

    k=0
    gap+=3
    print()
    final.append(lis2)

print(lis1)

print(lis2[::-1])

sqr=[]
for i in lis2:
    spt = []
    for j in i:
        spt.append(j*j)
    sqr.append(spt)

print(sqr[::-1])
