from abc import ABC, abstractmethod

# Implementor
class DrawingAPI(ABC):
    @abstractmethod
    def draw_circle(self, x, y, radius):
        pass


# Concrete Implementors
class OpenGLAPI(DrawingAPI):
    def draw_circle(self, x, y, radius):
        print(f"OpenGL: Drawing circle at ({x}, {y}) with radius {radius}")

class DirectXAPI(DrawingAPI):
    def draw_circle(self, x, y, radius):
        print(f"DirectX: Drawing circle at ({x}, {y}) with radius {radius}")


# Abstraction
class Shape(ABC):
    def __init__(self, drawing_api):
        self.drawing_api = drawing_api

    @abstractmethod
    def draw(self):
        pass

    @abstractmethod
    def resize(self, factor):
        pass


# Refined Abstraction
class Circle(Shape):
    def __init__(self, x, y, radius, drawing_api):
        super().__init__(drawing_api)
        self.x = x
        self.y = y
        self.radius = radius

    def draw(self):
        self.drawing_api.draw_circle(self.x, self.y, self.radius)

    def resize(self, factor):
        self.radius *= factor

if __name__ == "__main__":
    # Create shapes with different rendering APIs
    circle1 = Circle(10, 20, 5, OpenGLAPI())
    circle2 = Circle(15, 25, 10, DirectXAPI())

    # Draw shapes
    circle1.draw()  # OpenGL: Drawing circle at (10, 20) with radius 5
    circle2.draw()  # DirectX: Drawing circle at (15, 25) with radius 10

    # Resize and redraw
    circle1.resize(2)
    circle1.draw()  # OpenGL: Drawing circle at (10, 20) with radius 10
