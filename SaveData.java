package com.univ;
import java.io.*;

public class SaveData {

    /**
     * збереження гіcтограми в бінарний файл
     * @param hist to save
     * @param fname used to save the hist
     */
    public static void save_histogram(Histogram hist, String fname)  // збереження гітограми в бінарний файл
    {
        FileOutputStream fos;
        BufferedOutputStream bos;
        DataOutputStream dos;

        try {
            fos = new FileOutputStream(fname);
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);

            dos.writeDouble(hist.min());
            dos.writeDouble(hist.max());
            dos.writeDouble(hist.getM());
            for(double fr : hist.getFrequency()){
                dos.writeDouble(fr);
            }
            dos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * зчитування гіcтограми з бінарного файлу
     * @param filename to upload
     * @return histogram
     */
    public static Histogram import_histogram(String filename)
    {
        Histogram hist = new Histogram();
        FileInputStream fis;
        BufferedInputStream bis;
        DataInputStream dis;

        try {
            fis = new FileInputStream(filename);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            File file = new File(filename);
            hist.setMin_hist_(dis.readDouble());
            hist.setMax_hist_(dis.readDouble());
            hist.setM_hist_((int)dis.readDouble());

            int[] freqs = new int[hist.getM()];

            for(int i = 0; i < freqs.length; i++){
                freqs[i] = (int)dis.readDouble();
            }
            hist.setFrequency(freqs);
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return hist;
    }

    /**
     * збереження вектора даних в бінарний файл
     * @param data numbers to save as data
     * @param fname used to save the hist
     */
    public static void save_test_bin_data(double[] data, String fname)
    {
        FileOutputStream fos;
        BufferedOutputStream bos;
        DataOutputStream dos;

        try {
            fos = new FileOutputStream(fname);
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);

            for (double d : data) {
                dos.writeDouble(d);
            }
            dos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){ }

}
