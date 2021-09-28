chars = 256
str1 = "Grab"
str2 = "Brag"

strr1 = str1.lower()
strr2 = str2.lower()


c1=[0]*chars
c2=[0]*chars

for i in strr1:
    c1[ord(i)]+=1

for i in strr2:
    c2[ord(i)]+=1

for i in range(chars):
    if c1[i] !=c2[i]:
        print("Two strings are not Anagram")
print("Two strings are Anagram")
