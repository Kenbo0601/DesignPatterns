CXX = g++ 
CXXFLAGS = -std=c++17 -o 

# source files
SRC = main.cpp memento.cpp textEditor.cpp undoManager.cpp

# header files
HEADERS = memento.h textEditor.h undoManager.h

TARGET = out

$(TARGET): $(SRC) $(HEADERS)
	$(CXX) $(CXXFLAGS) $(TARGET) $(SRC)

clean:
	rm -rf $(TARGET)