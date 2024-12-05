from abc import ABC, abstractmethod

# Flyweight Interface
# The Icon interface defines a common method draw for all icons
class Icon(ABC):
    @abstractmethod
    def draw(self, x, y):
        pass

# Concrete Flyweights
# The FileIcon and FolderIcon classes implement the Icon interface. 
# These classes represent the shared intrinsic state of file and folder icons.
class FileIcon(Icon):
    def __init__(self, file_type, image_name):
        self.file_type = file_type  # Intrinsic state: type of file icon
        self.image_name = image_name  # Intrinsic state: image name

    def draw(self, x, y):
        print(f"Drawing {self.file_type} icon with image {self.image_name} at position ({x}, {y})")


class FolderIcon(Icon):
    def __init__(self, color, image_name):
        self.color = color  # Intrinsic state: color of the folder icon
        self.image_name = image_name  # Intrinsic state: image name

    def draw(self, x, y):
        print(f"Drawing folder icon with color {self.color} and image {self.image_name} at position ({x}, {y})")


# Flyweight Factory 
# The IconFactory manages the creation and caching of flyweight objects. 
# It ensures that identical icons are shared.
class IconFactory:
    def __init__(self):
        self.icon_cache = {}

    def get_icon(self, key):
        # Check if the icon is already in the cache
        if key in self.icon_cache:
            return self.icon_cache[key]
        else:
            # Create a new icon based on the key
            if key == "file":
                icon = FileIcon("document", "document.png")
            elif key == "folder":
                icon = FolderIcon("blue", "folder.png")
            else:
                raise ValueError(f"Unsupported icon type: {key}")
            
            # Store the icon in the cache
            self.icon_cache[key] = icon
            return icon

# Client code 
if __name__ == "__main__":
    icon_factory = IconFactory()

    # Draw file icons at different positions
    file_icon1 = icon_factory.get_icon("file")
    file_icon1.draw(100, 100)

    file_icon2 = icon_factory.get_icon("file")
    file_icon2.draw(150, 150)

    # Draw folder icons at different positions
    folder_icon1 = icon_factory.get_icon("folder")
    folder_icon1.draw(200, 200)

    folder_icon2 = icon_factory.get_icon("folder")
    folder_icon2.draw(250, 250)
