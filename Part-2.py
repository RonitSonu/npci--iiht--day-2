rows = int(input("Enter number of rows: "))
lis1=[]
k=0

gap=1
for i in range(1,rows+1):
    for j in range(1,(rows-i)+1):
        print(end=" ")
    num=gap
    k=1
    sum=0
    while k<=i:
        print(" ",num," ",end="")
        k+=1
        num+=1

    lis1.append(sum)
    k=0
    gap+=3
    print()

