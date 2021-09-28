l1 = [1,2,4,5,6,8,9]

a=len(l1)

total = (a+1)*(a+2)/2

suml1 = sum(l1)

for x in range(l1[0], l1[-1]+1):
    if x not in l1:
        print("The missing numbers are ", x)