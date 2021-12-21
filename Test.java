package com.univ;

public class Test {


    public static void test_num(Histogram hist)
    {
        System.out.println("\nnumber of elements for histogram =  " + hist.num());
    }

    public static void test_max(Histogram hist)
    {
        System.out.println("\nmax for histogram =  " + hist.max());
    }

    public static void test_min(Histogram hist)
    {
        System.out.println("\nmin for histogram =  " + hist.min());
    }

    public static void test_mean(Histogram hist)
    {
        System.out.println("\nmean for histogram =  " + hist.mean());
    }

    public static void test_median(Histogram hist)
    {
        System.out.println("\nmedian for histogram =  " + hist.median());
    }

    public static void test_moda(Histogram hist)
    {
        System.out.println("\nmoda for histogram =  " + hist.moda());
    }

    public static void test_variance(Histogram hist)
    {
        System.out.println("\nvarince for histogram =  " + hist.variance());
    }

    public static void test_dev(Histogram hist)
    {
        System.out.println("\nstandart deviation for histogram =  " + hist.dev());
    }

    public static void test_range(Histogram hist)
    {
        System.out.println("\nrange for histogram =  " + hist.range());
    }

    public static void test_asymmetry(Histogram hist)
    {
        System.out.println("\nasymmetry for histogram =  " + hist.asymmetry());
    }

    public static void test_excess_kurtosis(Histogram hist)
    {
        System.out.println("\nexcess_kurtosis for histogram =  " + hist.excess_kurtosis() + '\n');
    }

    public static void main(String[] args) {}
}
