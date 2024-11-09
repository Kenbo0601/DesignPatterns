#include "Receiver.h"
#include<iostream>
#include<string>

// TV class implementation 
void TV::turnOn() {
    std::cout << "TV is now ON" << std::endl;
}

void TV::turnOff() {
    std::cout << "TV is now OFF" << std::endl;
}

void TV::changeChannel() {
    std::cout << "Channel changed" << std::endl;
}

// Stereo class implementation 
void Stereo::turnOn() {
    std::cout << "Stereo is now ON" << std::endl;
}

void Stereo::turnOff() {
    std::cout << "Stereo is now OFF" << std::endl;
}

void Stereo::adjustVolume() {
    std::cout << "Volume Adjusted" << std::endl;
}
