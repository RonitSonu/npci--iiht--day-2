data = {5,3,1,-4,7,-5}

l1 = list(data)
l2 = []

while l1:
    min = l1[0]
    for i in l1:
        if i < min:
            min=i
    l2.append(min)
    l1.remove(min)
req = set(l2)
print(req)