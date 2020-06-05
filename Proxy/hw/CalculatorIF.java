import java.rmi.*;

interface CalculatorIF extends Remote {
    float add(float x, float y)throws RemoteException;
}
