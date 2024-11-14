CXX = g++ 
CXXFLAGS = -std=c++17 -o 

# source files
SRC = main.cpp GasCar.cpp GasCarAdapter.cpp

# header files
HEADERS = ElectricCar.h GasCar.h GasCarAdapter.h

TARGET = out

$(TARGET): $(SRC) $(HEADERS)
	$(CXX) $(CXXFLAGS) $(TARGET) $(SRC)

clean:
	rm -rf $(TARGET)