


class Apple:
    def __init__(self, color , size):
        self.color = color
        self.size = size

    def get_color(self):
        return self.color

'''
A constructor details what information you need to create an instance of a class
'''
def part1():
    return "hello "

def part2():
    return "world"

if __name__ == '__main__':
    # my_apple = Apple("yoink","bigBoi")
    #
    # print(my_apple.size)
    #
    # print(my_apple.get_color())

    a = part1()
    b = part2()

    print(a+b)
