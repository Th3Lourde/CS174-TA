
class LinkedList:
    def __init__(self, x=None, next=None):
        self.val = x
        self.next = next

    def __str__(self):
        return "{}-->{}".format(self.val, self.next)


if __name__ == '__main__':
    my_ll = LinkedList(1)
    a = LinkedList(2)
    b = LinkedList(3)
    c = LinkedList(4)
    d = LinkedList(5)

    print(a.val)

    my_ll.next = a
    a.next = b
    b.next = c
    c.next = d

    print(my_ll)
    # print(type(my_ll))
