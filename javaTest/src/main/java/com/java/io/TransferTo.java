package com.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * 通道相连
 */
public class TransferTo {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("arguments : Sourcefile destfile");
            System.exit(1);
        }

        try {
            FileChannel in = new FileInputStream(args[0]).getChannel(),
                    out = new FileOutputStream(args[1]).getChannel();
//            in.transferTo(0, in.size(), out);
            out.transferFrom(in,0,in.size());
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }


    }
}
