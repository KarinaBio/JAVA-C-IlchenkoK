package com.univ;
import java.util.Scanner;
import java.io.*;

/**
 *      Через неможливість зберігати дані для статстичної обробки, в класі зберігається інформація
 *      про максимальне та мінімальне значення даних. Замість даних зберігаємо лише частоти
 *      у відповідних стовпцях гістограми, кількість стовпців фіксована.
 *      Для статистичного аналізу використовуємо встановлені приблизні значення для кожного стовпця:
 *      ( праве (максимальне для стовпця значення) + ліве (мінімальне) ) / 2
 *       ---  для великих масивів даних достатньо коректно відображають реальні експерементальні дані
 *      Варіанти задання гістограми:
 *      а) функція input() - частоти вказуються явно
 *      б) функції setMax, setMin, setM - частоти по замовчуванню "0"
 *      перезбачено зберігання в бінарний файл та зчитування з бінарного файлу
 */
public class Histogram {

    double min_hist_;       // максимальне значення даних
    double max_hist_;       // мінімальне значення даних
    int M;                  // кількість стовпців
    int[] frequency;        // замість даних - частоти у відповідних стовпцях
    double[] approx_values; // встановлені приблизні значення для кожного стовпця

    Scanner scanner = new Scanner(System.in);

    public Histogram(){}

    public Histogram(double min, double max, int M){
        this.min_hist_ = min;
        this.max_hist_ = max;
        setM_hist_(M);
    }

    /**
     * введення з консолі даних про мінімум, максимум, кількість стовпців та частоти
     */
    public void input()
    {
        System.out.print("\nM = ");
        setM_hist_(scanner.nextInt());
        System.out.print("\nmin_hist_ = ");
        this.min_hist_ = scanner.nextDouble();
        System.out.print("\nmax_hist_ = ");
        this.max_hist_ = scanner.nextDouble();
        System.out.print("\nn of data = ");
        int n = scanner.nextInt();
        System.out.print("\nway to add = ");
        int q = scanner.nextInt();
        System.out.print("\ndata = ");
        for (int i = 0; i < n; i++)
        {
            double t;

            t = scanner.nextDouble();
            if (q == 1)
            {
                addNumber_1(t);
            }
            else if (q ==2 ){
                addNumber_2(t);
            }
        }
        System.out.println("\n");
    }

    /**
     * виведення інформації про гістограму
     */
    public void print()
    {
        System.out.println("\n **** HISTOGRAM INFORMATION **** \n");
        System.out.println("\nM = " + M);
        System.out.println("\nmin_hist_ = " + min_hist_);
        System.out.println("\nmax_hist_ = " + max_hist_);
        System.out.println("\nfrequencies = ");
        for (int i = 0; i < M; i++)
        {
            System.out.println(frequency[i] + ", ");
        }
        System.out.println("\n");
    }


    public void setMin_hist_(double min_hist_) {
        this.min_hist_ = min_hist_;
    }

    public void setMax_hist_(double max_hist_) {
        this.max_hist_ = max_hist_;
    }

    public void setM_hist_(int m)
    {
        M = m;
        this.frequency = new int[m];
        int i;
        for (i = 0; i < m; i++) {
            frequency[i] = 0;
        }
    }

    public int[] getFrequency() {
        return frequency;
    }

    public void setFrequency(int[] frequency) {
        this.frequency = frequency;
    }

    public double[] getApprox_values() {
        return approx_values;
    }

    /**
     * встановити приблизні значення для кожного стовпця
     */
    public void setApprox_values() {

        this.approx_values = new double[M];
        double step = (max_hist_ - min_hist_) / (double) M;

        for (int i = 0; i < M; i++) {
            approx_values[i] = 0.5 * ((min_hist_ + step * ((double) i + 1.0)) + ((min_hist_ + step * (double) i)));
        }
    }

    /**
     * додати число. якщо число виходить за межі мін та макс - не додавати
     * @param x to add
     */
    public void addNumber_1(double x)
    {
        if ((x <= max_hist_) && (x >= min_hist_))
        {
            double step = (max_hist_ - min_hist_) / (double)M;
            for (int i = 1; i < M + 1; i++)
            {
                if (min_hist_ + step * (double)i >= x) {
                    frequency[i - 1]++;
                    break;
                }
            }
        }
    }

    /**
     * додати число. якщо число виходить за межі мін та макс - додати в крайні інтервали
     * @param x to add
     */
    public void addNumber_2(double x)
    {
        if ((x <= max_hist_) && (x >= min_hist_))
        {
            double step = (max_hist_ - min_hist_) / (double)M;
            for (int i = 1; i < M + 1; i++)
            {
                if (min_hist_ + step * (double)i >= x) {
                    frequency[i - 1]++;
                    break;
                }
            }
        }
        else if (x > max_hist_) {
            frequency[M - 1]++;
        }
        else if (x < min_hist_) {
            frequency[0]++;
        }
    }

    /**
     *  додати масив чисел.
     *  якщо число виходить за межі мін та макс - не додавати
     *  використовує функцію addNumber_1
     * @param data to add
     */
    public void addbatch_1(double[] data)
    {
        for (double data_ : data)
            addNumber_1(data_);
    }

    /**
     *      додати масив чисел.
     *      якщо число виходить за межі мін та макс - додати в крайні інтервали
     *      використовує функцію addNumber_2
     * @param data to add
     */
    public void addbatch_2(double[] data)
    {
        for (double data_ : data)
            addNumber_2(data_);
    }

    /**
     *      зчитує масив чисел (або одне число) з бінарного файлу
     *      допустимі значення параметра way_to_add "1" або "2"
     *      додати масив чисел.
     *      використовує функцію addbatch_1 або addbatch_2 (в залежності від параметра way_to_add)
     * @param filename to read
     * @param way_to_add 1 or 2
     */
    public void InputFromBinFile(String filename, int way_to_add)

    {
        FileInputStream fis;
        BufferedInputStream bis;
        DataInputStream dis;
        double[] new_data;

        try {
            fis = new FileInputStream(filename);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            double data;

            File file = new File(filename);
            long size = file.length();
            int count = (int) size / Double.BYTES;
            new_data = new double[count];
            new_data[0] = -9999.99;
            for (int i = 0; i < count; i++){
                data = dis.readDouble();
                new_data[i] = data;
            }

            dis.close();

            if (new_data[0] == -9999.99)
            {
                System.out.println("\nEmpty file\n");
            }
            else {
                if (way_to_add == 1) {
                    addbatch_1(new_data);
                }
                else if (way_to_add == 2) {
                    addbatch_2(new_data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     *      зчитує масив чисел (або одне число) з текстового файлу
     *      допустимі значення параметра way_to_add "1" або "2"
     *      додати масив чисел.
     *      використовує функцію addbatch_1 або addbatch_2 (в залежності від параметра way_to_add)
     * @param filename to read
     * @param way_to_add 1 or 2
     */
    public void InputFromTxtFile(String filename, int way_to_add)

    {
        double[] new_data;
        double data;

        try{
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                // 1 line
                String line = scanner.nextLine();
                String[] obj = line.split(" ");
                int count = obj.length;
                new_data = new double[count];
                new_data[0] = -9999.99;
                for (int i = 0; i < count; i++){
                    data = Double.parseDouble(obj[i]);
                    new_data[i] = data;
                }
                if (new_data[0] == -9999.99)
                {
                    System.out.println("\nEmpty file\n");
                }
                else {
                    if (way_to_add == 1) {
                        addbatch_1(new_data);
                    }
                    else if (way_to_add == 2) {
                        addbatch_2(new_data);
                    }
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }


    // ANALISE

    /**
     * @return повертає загальну кількість елементів гістограми
     */
    public int num()
    {
        int ans = 0;
        for (int i = 0; i < M; i++)
            ans += frequency[i];
        return ans;
    }

    /**
     * @param i to analyse
     * @return повертає кількість елементів гістограми для стовпця "і"
     */
    public int numHist(int i)
    {
        if ((i < 0) || (i > M - 1)) {
            System.out.println("Wrong index");
            return 0;
        }
        return frequency[i];
    }

    /**
     * @return повертає максимальне значення гістограми
     */
    public double max()
    {
        return max_hist_;
    }

    /**
     * @return повертає мінімальне значення гістограми
     */
    public double min()
    {
        return min_hist_;
    }

    /**
     * @return повертає кількість стовпців
     */
    public int getM() {
        return M;
    }

    /**
     * @return повертає середнє значення гістограми
     */
    public double mean()
    {
        setApprox_values();
        double ans = 0.0;
        for (int i = 0; i < M; i++)
            ans += approx_values[i] * frequency[i];
        return ans / (double)num();
    }

    /**
     * @return повертає медіану гістограми
     */
    public double median()
    {
        setApprox_values();
        int index = num() / 2;
        int sum = 0;
        double ans;
        for (int i = 0; i < M; i++) {    //i column
            sum += numHist(i);
            if (sum >= index) {
                ans = approx_values[i];
                return ans;
            }
        } return -9999.0;
    }

    /**
     * @return повертає моду гістограми
     */
    public double moda()
    {
        setApprox_values();
        int max_frequency = frequency[0];
        int index = 0;
        for (int i = 0; i < M; i++) {
            if (frequency[i] > max_frequency)
            {
                max_frequency = frequency[i];
                index = i;
            }
        }
        double ans = approx_values[index];
        return ans;
    }

    /**
     * @return повертає розмах даних гістограми
     */
    public double range()
    {
        return max_hist_ - min_hist_;
    }

    /**
     * @return повертає максимальну похибку при використанні встановлених середніх значень стовпця
     */
    public double max_value_error()
    {
        double step = (max_hist_ - min_hist_) / M;
        return step / 2;
    }

    /**
     * @return повертає дисперсію даних гістограми
     */
    public double variance()
    {
        double ans = 0.0;
        double mean_ = mean();
        setApprox_values();
        for (int i = 0; i < M; ++i)
            ans += (Math.pow(approx_values[i] - mean_, 2)) * frequency[i];
        return ans / (double)M;
    }

    /**
     * @return повертає середньоквадратичне відхилення даних гістограми
     */
    public double dev()
    {
        return Math.sqrt(variance());
    }

    /**
     * @return повертає значення асиметрії даних гістограми
     */
    public double asymmetry()
    {
        int n = num();
        double m = mean();

        setApprox_values();
        double moment3 = 0.0;
        for (int i = 0; i < M; i++)
        {
            moment3 += (Math.pow(approx_values[i] - m, 3) * frequency[i]);
        }
        moment3 /= n;
        return moment3 / Math.pow(dev(), 3);
    }

    /**
     * @return повертає значення ексцесу даних гістограми
     */
    public double excess_kurtosis()
    {
        int n = num();
        double m = mean();

        setApprox_values();
        double moment4 = 0.0;
        for (int i = 0; i < M; i++)
        {
            moment4 += Math.pow(approx_values[i] - m, 4) * frequency[i];
        }
        moment4 /= n;
        return moment4 / Math.pow(dev(), 4);
    }

}
