import java.rmi.RemoteException;

interface TemperatureSensor extends java.rmi.Remote {
    public double getTemperature() throws RemoteException;

    public void addTemperatureListener(TemperatureListener listener) throws RemoteException;

    public void removeTemperatureListener(TemperatureListener listener) throws RemoteException;
}
