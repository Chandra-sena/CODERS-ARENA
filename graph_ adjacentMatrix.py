def add_node(v):
    global nc
    if v in nodes:
        print(v,'is already present in graph')
    else:
        nc+=1
        nodes.append(v)
        for n in graph:
            n.append(0)
        temp=[]
        for i in range(nc):
            temp.append(0)
        graph.append(temp)
def add_edge(v1,v2):
    if v1 not in nodes:
        print(v1,'is not present in Graph')
    elif v2 not in nodes:
        print(v2,'is not present in Graph')
    else:
        index1=nodes.index(v1)
        index2=nodes.index(v2)
        graph[index1][index2]=1
        graph[index2][index1]=1
def print_graph():
    for i in range(nc):
        for j in range(nc):
            print(graph[i][j],end=' ')
        print()
nodes=[]
graph=[]
nc=0
print("Before adding nodes:")
print(nodes)
print(graph)
add_node('A')
add_node('B')
add_node('C')
add_edge('A','B')
add_edge('A','c')
print("Before adding nodes:")
print(nodes)
print(graph)
print_graph()