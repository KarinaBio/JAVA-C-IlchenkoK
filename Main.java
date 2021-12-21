package com.univ;

import java.util.Scanner;

public class Main {

    public static void ConsoleRequest(){
        Histogram histogram1 = new Histogram();
        histogram1.input();

        System.out.println("\nhistogram1");
        histogram1.print();

        System.out.println("\n **** ANALYSIS OF HISTOGRAM ****");

        Test.test_max(histogram1);
        Test.test_min(histogram1);
        Test.test_num(histogram1);
        Test.test_mean(histogram1);
        Test.test_median(histogram1);
        Test.test_moda(histogram1);
        Test.test_range(histogram1);
        Test.test_variance(histogram1);
        Test.test_dev(histogram1);
        Test.test_asymmetry(histogram1);
        Test.test_excess_kurtosis(histogram1);
    }

    public static void TextRequest(){

        Scanner scanner = new Scanner(System.in);

        String f_txt_data1 = "f_txt_data1.txt";
        String f_empty = "empty_txt_file.txt";

        System.out.print("\nM = ");
        int M = scanner.nextInt();
        System.out.print("\nmin_hist_ = ");
        double min_hist_ = scanner.nextDouble();
        System.out.print("\nmax_hist_ = ");
        double max_hist_ = scanner.nextDouble();
        System.out.print("\nway to add = ");
        int q = scanner.nextInt();

        Histogram histogram2 = new Histogram(min_hist_, max_hist_, M);

        histogram2.InputFromTxtFile(f_txt_data1, q);
        System.out.println("\nhistogram2");
        histogram2.print();

        System.out.println("\nhistogram2");
        histogram2.InputFromTxtFile(f_empty, q);
        histogram2.print();

        System.out.println("\n **** ANALYSIS OF HISTOGRAM **** ");

        Test.test_max(histogram2);
        Test.test_min(histogram2);
        Test.test_num(histogram2);
        Test.test_mean(histogram2);
        Test.test_median(histogram2);
        Test.test_moda(histogram2);
        Test.test_range(histogram2);
        Test.test_variance(histogram2);
        Test.test_dev(histogram2);
        Test.test_asymmetry(histogram2);
        Test.test_excess_kurtosis(histogram2);
    }

    public static void BinRequest(){

        String f_hist = "histogram1.dat";
        String f_bin_data1 = "f_bin_data1.dat";

        Scanner scanner = new Scanner(System.in);

        double[] data1 = { -0.87, - 1.31, 2.6, 1.023, - 3.72, - 1.73, 0.515, - 1.91, - 3.0,
                3.075, 2.0823, - 1.9, 2.14, - 1.13, 3.214, - 0.003, - 0.74, - 1.069,
                - 0.981, 3.51, - 1.77, 2.15, 1.73, - 0.17, - 1.80, - 1.45, - 0.098, -15.80,
                -11.45, -22.098, 11.73, -0.17, 5.80, 6.45, 7.098, 6.80, 9.45, 9.098 };

        SaveData.save_test_bin_data(data1, f_bin_data1);

        System.out.print("\nM = ");
        int M = scanner.nextInt();
        System.out.print("\nmin_hist_ = ");
        double min_hist_ = scanner.nextDouble();
        System.out.print("\nmax_hist_ = ");
        double max_hist_ = scanner.nextDouble();
        System.out.print("\nway to add = ");
        int q = scanner.nextInt();

        Histogram histogram3 = new Histogram();
        histogram3.setM_hist_(M);
        histogram3.setMax_hist_(max_hist_);
        histogram3.setMin_hist_(min_hist_);

        histogram3.InputFromBinFile(f_bin_data1, q);
        System.out.println("\nhistogram3");
        histogram3.print();

        SaveData.save_histogram(histogram3, f_hist);
        histogram3 = SaveData.import_histogram(f_hist);

        System.out.println("\nhistogram3");
        histogram3.print();

        System.out.println("\n **** ANALYSIS OF HISTOGRAM **** ");

        Test.test_max(histogram3);
        Test.test_min(histogram3);
        Test.test_num(histogram3);
        Test.test_mean(histogram3);
        Test.test_median(histogram3);
        Test.test_moda(histogram3);
        Test.test_range(histogram3);
        Test.test_variance(histogram3);
        Test.test_dev(histogram3);
        Test.test_asymmetry(histogram3);
        Test.test_excess_kurtosis(histogram3);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введіть запит:\n 1 - ввід з консолі\n 2 - ввід з текстового файлу \n 3 - ввід з бінарного файлу");

        int request = scanner.nextInt();

        if(request == 1){

            ConsoleRequest();

        } else if (request == 2){

            TextRequest();

        } else if (request == 3){

            BinRequest();

        } else {
            System.out.println("invalid (((");
        }
    }
}
