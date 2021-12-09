package com.univ;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Rectangle max_square(List<Rectangle> rectangles){
        Rectangle ans = rectangles.get(0);
        double max = rectangles.get(0).square();
        for (Rectangle rrr : rectangles){
            if (rrr.square() > max){
                ans = rrr;
                max = ans.square();
            }
        }
        return ans;
    }

    public static void writeBinaryFile(String filename, List<Rectangle> rectangles) {
        FileOutputStream fos;
        BufferedOutputStream bos;
        DataOutputStream dos;

        try {
            fos = new FileOutputStream(filename);
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);

            for (Rectangle r : rectangles) {
                dos.writeInt(r.getId());
                dos.writeInt(r.getX1());
                dos.writeInt(r.getY1());
                dos.writeInt(r.getX2());
                dos.writeInt(r.getY2());
            }
            dos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Rectangle>  readBinaryFile(String filename) {
        FileInputStream fis;
        BufferedInputStream bis;
        DataInputStream dis;

        try {
            fis = new FileInputStream(filename);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            File file = new File(filename);
            long size = file.length();
            int count = (int) size / Integer.BYTES / 5;
            System.out.println(count);
            List<Rectangle> rectangles = new ArrayList<>();
            for (int i = 0; i < count; i++){
                int id = dis.readInt();
                int x1 = dis.readInt();
                int y1 = dis.readInt();
                int x2 = dis.readInt();
                int y2 = dis.readInt();
                Rectangle r = new Rectangle(id,x1,y1,x2,y2);
                rectangles.add(r);
            }

            dis.close();
            return rectangles;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

        List<Rectangle> rectangles_in = new ArrayList<>();
        rectangles_in.add(new Rectangle(1, 0, 0, 1,2));
        rectangles_in.add(new Rectangle(2, 0, 0, 2,4));
        rectangles_in.add(new Rectangle(3, 1, 1, 5,2));

        System.out.print("Input filename: ");
        Scanner sc_fn = new Scanner(System.in);
        String filename = sc_fn.next();
        writeBinaryFile(filename, rectangles_in);

        List<Rectangle> rectangles_out = new ArrayList<>();
        rectangles_out = readBinaryFile(filename);
        for (Rectangle r : rectangles_out){
            System.out.println(r.toString());
        }

        Rectangle ans = max_square(rectangles_out);
        System.out.println("Rectangle with max square:  " + ans.toString());
        System.out.println("Square:  " + ans.square());
    }
}
