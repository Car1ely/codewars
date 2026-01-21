//Implement a function that receives two IPv4 addresses, and returns the number of addresses between them
// (including the first one, excluding the last one).
//All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.
//kyu 6
//https://www.codewars.com/kata/526989a41034285187000de4/train/java
package com.example.codewars.week3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        try {
            return ipToLong(end) - ipToLong(start);
        } catch (UnknownHostException e) {
            return 0;
        }
    }

    private static long ipToLong(String ip) throws UnknownHostException {
        byte[] octets = InetAddress.getByName(ip).getAddress();
        long result = 0;

        for (byte octet : octets) {
            result <<= 8;
            result |= (octet & 0xFF);
        }
        return result;
    }
}