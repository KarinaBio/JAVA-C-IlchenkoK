#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <fstream>
#include <string>
#include <cmath>
#include <vector>
#include "Histogram.h"

using namespace std;

void test_num(Histogram hist)
{
    cout << "number of elements for histogram =  " << hist.num() << endl;
}

void test_max(Histogram hist)
{
    cout << "max for histogram =  " << hist.max() << endl;
}

void test_min(Histogram hist)
{
    cout << "min for histogram =  " << hist.min() << endl;
}

void test_mean(Histogram hist)
{
    cout << "mean for histogram =  " << hist.mean() << endl;
}

void test_median(Histogram hist)
{
    cout << "median for histogram =  " << hist.median() << endl;
}

void test_moda(Histogram hist)
{
    cout << "moda for histogram =  " << hist.moda() << endl;
}

void test_variance(Histogram hist)
{
    cout << "varince for histogram =  " << hist.variance() << endl;
}

void test_dev(Histogram hist)
{
    cout << "standart deviation for histogram =  " << hist.dev() << endl;
}

void test_range(Histogram hist)
{
    cout << "range for histogram =  " << hist.range() << endl;
}

void test_asymmetry(Histogram hist)
{
    cout << "asymmetry for histogram =  " << hist.asymmetry() << endl;
}

void test_excess_kurtosis(Histogram hist)
{
    cout << "excess_kurtosis for histogram =  " << hist.excess_kurtosis() << endl;
}


int main() {

    char f_hist[20] = "histogram1.dat";
    char f_bin_data1[20] = "f_bin_data1.dat";
    char f_txt_data1[20] = "f_txt_data1.txt";
    char f_empty[20] = "empty_txt_file.txt";

    // тестування функції збереження вектора даних в бінарний файл
    vector<double> data1 = { -0.87, - 1.31, 2.6, 1.023, - 3.72, - 1.73, 0.515, - 1.91, - 3.0, 
                             3.075, 2.0823, - 1.9, 2.14, - 1.13, 3.214, - 0.003, - 0.74, - 1.069,
                             - 0.981, 3.51, - 1.77, 2.15, 1.73, - 0.17, - 1.80, - 1.45, - 0.098, -15.80, 
                              -11.45, -22.098, 11.73, -0.17, 5.80, 6.45, 7.098, 6.80, 9.45, 9.098 };
    save_test_bin_data(data1, f_bin_data1);

    // тестування створення та ініціалізації гістограми 
    Histogram histogram1;
    histogram1.setM(8);
    histogram1.setMax(10);
    histogram1.setMin(-20);

    // тестування функції додавання  вектора даних з бінарного файлу
    histogram1.InputFromBinFile(f_bin_data1, 1);
    cout << "\nhistogram1\n";
    histogram1.print();

    // тестування функції збереження гістограми в бінарний файл
    save_histogram(histogram1, f_hist);

    // тестування функції зчитування гістограми з бінарного файлу
    Histogram histogram2;
    histogram2 = import_histogram(f_hist);

    // тестування функції додавання  вектора даних з текстового файлу
    histogram2.InputFromTxtFile(f_txt_data1, 2);
    cout << "\nhistogram2\n";
    histogram2.print();

    // тестування функції додавання  вектора даних з порожнього текстового файлу
    cout << "\nhistogram2\n";
    histogram2.InputFromTxtFile(f_empty, 2);
    histogram2.print();


    cout << "\n **** ANALYSIS OF HISTAGRAM **** \n";

    test_max(histogram2);
    test_min(histogram2);
    test_num(histogram2);
    test_mean(histogram2);
    test_median(histogram2);
    test_moda(histogram2);
    test_range(histogram2);
    test_variance(histogram2);
    test_dev(histogram2);
    test_asymmetry(histogram2);
    test_excess_kurtosis(histogram2);
}