CXX = g++ 
CXXFLAGS = -std=c++17 -o 

# source files
SRC = main.cpp Proxy.cpp RealSubject.cpp 

# header files
HEADERS = Proxy.h AbstractSubject.h RealSubject.h

TARGET = out

$(TARGET): $(SRC) $(HEADERS)
	$(CXX) $(CXXFLAGS) $(TARGET) $(SRC)

clean:
	rm -rf $(TARGET)