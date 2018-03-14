import java.net.*;
import java.util.*;
class GetInterfaceAddresses1 {
public static void main(String args[]) throws Exception {
System.setProperty("java.net.preferIPv4Stack","true");
Enumeration<NetworkInterface> intfs =
NetworkInterface.getNetworkInterfaces();
while(intfs.hasMoreElements()) {
NetworkInterface intf = intfs.nextElement();
Enumeration<InetAddress> addresses = intf.getInetAddresses();
if(addresses.hasMoreElements()) {
System.out.println("\nName: "+intf.getName());
System.out.println("Display name: "+intf.getDisplayName());
while(addresses.hasMoreElements()) {
InetAddress addr = addresses.nextElement();
System.out.println("Address: "+addr);
}
}
}
}
}