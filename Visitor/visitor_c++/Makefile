CXX = g++ 
CXXFLAGS = -std=c++17 -fsanitize=address -o 

# source files
SRC = main.cpp Visitor.cpp Patient.cpp

# header files
HEADERS = Visitor.h Patient.h

TARGET = out

$(TARGET): $(SRC) $(HEADERS)
	$(CXX) $(CXXFLAGS) $(TARGET) $(SRC)

clean:
	rm -rf $(TARGET)