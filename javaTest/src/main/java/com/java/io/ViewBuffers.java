package com.java.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;

public class ViewBuffers {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        bb.rewind();
        System.out.println("Byte Buffer");
        while (bb.hasRemaining())
            System.out.println(bb.position() + "->" + bb.get() + ", ");
        CharBuffer cb =((ByteBuffer)bb.rewind()).asCharBuffer();
        System.out.println("Char Buffer ");
        while (cb.hasRemaining())
            System.out.println(cb.position()+"->"+cb.get()+", ");
        FloatBuffer fb = ((ByteBuffer) bb.rewind()).asFloatBuffer();
        System.out.println("Float Buffer ");
        while (fb.hasRemaining())
            System.out.println(fb.position()+"->"+fb.get()+",");


    }
}
