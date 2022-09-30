def insertionsort(array):
    for step in range(1,len(array)):
        key=array[step]
        j=step-1
        while j>=0 and key<array[j]:
            array[j+1]=array[j]
            j=j-1
        array[j+1]=key
data=[95,1,4,11110]
insertionsort(data)
print("sorted array in ascending order:")
print(data)
        