CXX = g++ 
CXXFLAGS = -std=c++17 -o 

# source files
SRC = main.cpp NonTerminal.cpp Terminal.cpp

# header files
HEADERS = Expression.h NonTerminal.h Terminal.h

TARGET = out

$(TARGET): $(SRC) $(HEADERS)
	$(CXX) $(CXXFLAGS) $(TARGET) $(SRC)

clean:
	rm -rf $(TARGET)