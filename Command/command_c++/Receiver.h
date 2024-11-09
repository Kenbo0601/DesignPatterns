// Receiver.h

#ifndef RECEIVER_H
#define RECEIVER_H


// Receiver Interface 
class Device {
    public:
        virtual void turnOn() = 0;
        virtual void turnOff() = 0;
        virtual ~Device() = default;
};

// Concrete Receiver class - TV
class TV : public Device {
    public:
        void turnOn() override;
        void turnOff() override;
        void changeChannel();
};

// Concrete Receiver class - Stereo 
class Stereo : public Device {
    public:
        void turnOn() override;
        void turnOff() override;
        void adjustVolume();
};

#endif // RECIEVER_H