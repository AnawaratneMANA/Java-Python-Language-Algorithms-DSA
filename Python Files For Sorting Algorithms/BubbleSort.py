# Bubble Sorting Method
# Creating a Array of Numbers.
numbers = [56, 42, 5, 87, 34, 23, 45, 90, 22, 7]


# Creating the Method
def BubbleSort(arr):
    for i in range(0, len(arr) - 1):
        for k in range(len(arr) - 1, i, -1):
            if arr[k] < arr[k - 1]:
                temp = arr[k]
                arr[k] = arr[k - 1]
                arr[k - 1] = temp


# Calling the Method.
BubbleSort(numbers)
print(numbers)
