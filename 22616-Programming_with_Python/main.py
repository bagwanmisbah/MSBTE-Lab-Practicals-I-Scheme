'''l1 = [10, 20, 30, 40, 50]
n = len(l1)
max1 = l1[n - 1]
max2 = l1[n - 2]
l2 = [max1 + max2]
print(l2)'''


def add(l2, size):
    size = len(l2)
    max1 = l2[size - 1]
    max2 = l2[size - 2]
    l2 = [max1 + max2]
    for i in l2: 
        print(i)
l1 = []
num = int(input("Enter no of elements : "))
for i in range(0, num):
    n = int(input("enter elements : "))
    l1.append(n)
l1.sort()
add(l1, n)
