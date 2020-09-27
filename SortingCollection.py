# python code for sorting algorithms
A = []
for v in range(10):
    A.append(input('Enter a Number: '))
print(A)


# Insert sort
def insertSort(A):
    for j in range(1, len(A)):  # range function do not reach the len(A) it will stop at len(A)-1
        key = A[j]
        i = j - 1
        while i >= 0 and A[i] > key:
            A[i + 1] = A[i]
            i = i - 1
        A[i + 1] = key


# Partition Function Implementation.
n = len(A)
p = 0
r = n - 1


def partition(A, p, r):
    x = A[r]
    i = p - 1
    for j in range(p, r):
        if A[j] <= x:
            i = i + 1
            temp1 = A[i]
            A[i] = A[j]
            A[j] = temp1
    temp2 = A[i + 1]
    A[i + 1] = A[r]
    A[r] = temp2
    return i + 1


# Create Quick Sort function
def QuickSort(A, p, r):
    if p <= r:
        q = partition(A, p, r)
        QuickSort(A, p, q - 1)
        QuickSort(A, q + 1, r)


# calling the insert Sort function
# insertSort(A)

# print("Sorted array :")
# print(A)

# calling the quick sort function
QuickSort(A, p, r)
print("Sorted array using QuickSort: ")
print(A)

# m = partition(A, p, r)
# print(m)
