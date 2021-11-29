package com.zz.socket;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @Class: Client
 * @description:
 * @Author: hongzhi.zhao
 * @Date: 2021-11-29 22:17
 */
public class Client {

    public static void main(String args []) throws IOException {
        Socket socket = new Socket();
        //超时时间
        socket.setSoTimeout(3000);
        //链接本地，端口2000 超时时间3000
        socket.connect(new InetSocketAddress(Inet4Address.getLocalHost(),2000),3000);

    }

}
