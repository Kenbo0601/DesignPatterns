CXX = g++ 
CXXFLAGS = -std=c++17 -o 

# source files
SRC = main.cpp Command.cpp Invoker.cpp Receiver.cpp

# header files
HEADERS = Command.h Invoker.h Receiver.h

TARGET = out

$(TARGET): $(SRC) $(HEADERS)
	$(CXX) $(CXXFLAGS) $(TARGET) $(SRC)

clean:
	rm -rf $(TARGET)