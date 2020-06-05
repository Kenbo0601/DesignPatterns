import java.rmi.*;
import java.rmi.server.*;

class Calculator extends UnicastRemoteObject implements CalculatorIF {
    Calculator() throws RemoteException{}

    public float add(float x, float y)throws RemoteException { return x+y;  }
}
