package me.smash.adapter;

import java.net.NetworkInterface;
import java.net.SocketException;

public class AdapterDemo {

  public static void main(String[] args) throws SocketException {
    new EnumerationIterator<>(NetworkInterface.getNetworkInterfaces())
        .forEachRemaining(System.out::println);
  }

}
