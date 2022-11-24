class newNode:
    def __init__(self, data):
        self.data = data
        self.left = self.right = None
def insertLevelOrder(arr, i, n):
    root = None
    if i < n:
        root = newNode(arr[i])
        root.left = insertLevelOrder(arr, 2 * i + 1, n)
        root.right = insertLevelOrder(arr, 2 * i + 2, n)
        
    return root
def inOrder(root):
    if root != None:
        inOrder(root.left)
        print(root.data,end=" ")
        inOrder(root.right)
n=int(input("enter the length of list:"))
arr=[]
for i in range(n):
    arr.append(input("Enter Element:"))
root = None
root = insertLevelOrder(arr, 0, n)
inOrder(root)
