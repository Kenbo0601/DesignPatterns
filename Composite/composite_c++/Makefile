CXX = g++ 
CXXFLAGS = -std=c++17 -o 

# source files
SRC = main.cpp Branch.cpp Leaf.cpp

# header files
HEADERS = Branch.h TreeComponent.h Leaf.h

TARGET = out

$(TARGET): $(SRC) $(HEADERS)
	$(CXX) $(CXXFLAGS) $(TARGET) $(SRC)

clean:
	rm -rf $(TARGET)