

class Apple:
    def __init__(self, size, color):
        self.size = size
        self.color = color

    def color1(self):
        return "The color is: {}, {}".format(self.color, "hi")



if __name__ == '__main__':
    my_apple = Apple("large", "green")

    print(my_apple.color1())
