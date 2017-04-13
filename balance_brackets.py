class Stack(object):

   def __init__(self):
      self.items = []

   def push(self, item):
      self.items.append(item)

   def pop(self):
       return self.items.pop()

   def peek(self):
       return self.items[-1]

   def is_empty(self):
       len(self.items) == 0


def check_balanced(given_string):
    stack = Stack()  # assuming we have a stack implementation which has push, pop and is_empty methods defined
    for character in given_string:
        poped_char = ''
        if character == '[' or character == '{' or character == '(':
            stack.push(character)
            #print character
        #print stack.is_empty()
        if character == ']' or character == '}' or character == ')':
            poped_char = stack.pop()
            if character == ']' and poped_char == '[':
                #rint character
                pass
            elif character == '}' and poped_char == '{':
                #print character
                pass
            elif character == ')' and poped_char == '(':
                #print character
                pass
            else:
                #print 'False will print'
                return False
    #print stack.is_empty()
    if stack.is_empty() == None:
        return True
    else:
        return False



print check_balanced('(a[b]){c(d)[e]}[f(g(h))]')
print check_balanced('((a[b)]{c(d}))')
