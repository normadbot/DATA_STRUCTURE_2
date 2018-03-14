import java.net.*;
import java.util.*;
class GetNetworkInterfaces {
public static void main(String args[]) throws Exception {
Enumeration<NetworkInterface> intfs =
NetworkInterface.getNetworkInterfaces();
while(intfs.hasMoreElements()) {
NetworkInterface intf = intfs.nextElement();
System.out.println("\nInterface: "+intf.getName());
System.out.println("Display name: "+intf.getDisplayName());
Enumeration<NetworkInterface> subIfs = intf.getSubInterfaces();
for (NetworkInterface subIf : Collections.list(subIfs)) {
System.out.print("\tSub Interface : "+subIf.getName());
System.out.print("\tSub Interface Displayssname :"+subIf.getDisplayName());
}
}
}
}