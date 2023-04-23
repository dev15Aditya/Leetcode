def getXOR(x, y):
    return (x | y) & (~x | ~y)

def xorSum(a):
    sum = 0
    for i in a:
        sum += getXOR(sum, i);
    return sum

def average(n):
    largest = 0
    smallest = 9

    while (n):
        r = n % 10
        largest = max(r, largest)
        smallest = min(r, smallest)
        n = n // 10
    return (smallest+largest)/2

a = input()
b = input()
count = 0
for i in range(a+1,b):
    if average(i) < xorSum(i):
        count += 1
        
print(count)