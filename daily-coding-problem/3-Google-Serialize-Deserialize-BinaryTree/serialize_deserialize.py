"""
Given the root to a binary tree, implement serialize(root), which serializes 
the tree into a string, and deserialize(s), which deserializes the string back 
into the tree.

For example, given the following Node class

class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        
The following test should pass:
    
node = Node('root', Node('left', Node('left.left')), Node('right'))

assert deserialize(serialize(node)).left.left.val == 'left.left'
"""

class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def serialize(node):
    if node == None:
        return '/'
    
    string = node.val
    string += ';' + serialize(node.left)
    string +=  ';' + serialize(node.right)
    
    return string

def deserialize(string):
    return deserializer(string.split(';') )

def deserializer(node_strings, index=0, node=None):
    if node_strings[index] == '/':
        return None
    
    node = Node(node_strings[index])
    node.left = deserializer(node_strings, index + 1, node.left)
    node.right = deserializer(node_strings, index + 1, node.right)
    return node

node = Node('root', Node('left', Node('left.left')), Node('right'))

assert deserialize(serialize(node)).left.left.val == 'left.left'
        
