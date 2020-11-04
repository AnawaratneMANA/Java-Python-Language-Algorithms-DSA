# bubble sort algorithm
# getting the dataset
arr = []
for i in range(0,10):
    arr.append(int(input("Enter Number:")))
# print(arr)

# writing the algorithm for Bubble sort 
def bubbleSort(A):
    for i in range(0,len(arr)):
        for k in range(len(arr)-1, i, -1):
            if A[k] < A[k-1]:
                temp = A[k]
                A[k] = A[k-1]
                A[k-1] = temp
                
# writing algorithm selectionSort
def selectionSort(A):
    for i in range(0,len(A)):
        small = i
        for k in range(i+1,len(A)):
            if A[k]<A[small]:
                small = k
        temp = A[i]
        A[i] = A[small]
        A[small] = temp

# calling the function 
# bubbleSort(arr)
# print(arr)

# calling the function 
selectionSort(arr)
print(arr)
     