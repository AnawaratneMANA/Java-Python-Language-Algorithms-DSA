# SelectionSort Sorting Method
numbers = [56, 42, 5, 87, 34, 23, 45, 90, 22, 7]


# Create a Function
def SelectionSort(numbers):
    n = len(numbers)
    for i in range(0, n):
        small = i
        for l in range(i+1, n):
            if numbers[l] < numbers[small]:
                small = l
        temp = numbers[i]
        numbers[i] = numbers[small]
        numbers[small] = temp


# calling the method
SelectionSort(numbers)
print(numbers)
