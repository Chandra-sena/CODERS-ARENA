from random import randint
class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key
def insert(root, key):
    if root is None:
        return Node(key)
    else:
        if root.val == key:
            return root
        elif root.val < key:
            root.right = insert(root.right, key)
        else:
            root.left = insert(root.left, key)
    return root
def inorder(root):
    if root:
        inorder(root.left)
        print(root.val,end=" ")
        inorder(root.right)
n=int(input('Enter range of random numbers:'))
r = Node(randint(0,n))
n1=int(input("enter the number of nodes:"))-1
for i in range(n1):
    r = insert(r, randint(0,n))
inorder(r)
