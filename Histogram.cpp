#include "Histogram.h"

void Histogram::input()
{
    cout << "\nM = ";
    cin >> M;
    cout << "\nmin_hist_ = ";
    cin >> min_hist_;
    cout << "\nmax_hist_ = ";
    cin >> max_hist_;
    cout << "\nfrequencies = ";
    frequency = new unsigned[M];
    for (int i = 0; i < M; i++)
    {
        unsigned t;
        cin >> t;
        if (t < 0)
        {
            frequency[i] = -1 * t;
        }
        else frequency[i] = t;
    }
    cout << endl;
}

void Histogram::print()
{
    cout << "\n **** HISTOGRAM INFORMATION **** \n";
    cout << "\nM = " << M;
    cout << "\nmin_hist_ = " << min_hist_;
    cout << "\nmax_hist_ = " << max_hist_;
    cout << "\nfrequencies = ";
    for (int i = 0; i < M; i++)
    {
        cout << frequency[i] << ", ";
    }
    cout << endl;

}

void Histogram::setMax(double m)
{
    max_hist_ = m;
}

void Histogram::setMin(double m) 
{
    min_hist_ = m;
}

void Histogram::setM(unsigned m) 
{
    M = m;
    frequency = new unsigned[m];
    int i;
    for (i = 0; i < (int)m; i++) {
        frequency[i] = (unsigned)0;
    }
}

void Histogram::setAprox_values()
{
    aprox_values = new double[M];
    double step = (max_hist_ - min_hist_) / (double)M;

    for (int i = 0; i < M; i++) {
        aprox_values[i] = 0.5 * ((min_hist_ + step * ((double)i + 1.0)) + ((min_hist_ + step * (double)i)));
     }
}

void Histogram::addNumber_1(double x) 
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

void Histogram::addNumber_2(double x) 
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
    else if (x > max_hist_)
        frequency[M - 1]++;
    else if (x < min_hist_)
        frequency[0]++;
}

void Histogram::addbatch_1(const vector<double>& data)
{
    for (int i = 0; i < data.size(); i++)
        addNumber_1(data[i]);
}

void Histogram::addbatch_2(const vector<double>& data)
{
    for (int i = 0; i < data.size(); i++)
        addNumber_2(data[i]);
}

void Histogram::InputFromBinFile(char* filename, int way_to_add) 
{
    vector<double> new_data;
    double data;

    FILE* f1 = fopen(filename, "rb");
    while (!feof(f1)) {
        int ans = fread(&data, 1, sizeof(double), f1);
        if (ans < sizeof(double)) break;
        new_data.push_back(data);
    }
    fclose(f1);

    if (new_data.size() == 0)
    {
        cout << "\nEmpty file\n";
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

void Histogram::InputFromTxtFile(char* filename, int way_to_add) 
{
    vector<double> new_data;
    double data;

    fstream f1;
    f1.open(filename);

    if (f1)
    {
        while (!(f1 >> data).eof())
        {
            if (f1.bad())
            {
                cerr << "Wrong reading" << endl;
                return;
            }
            new_data.push_back(data);
        }
    }
    if (new_data.size() == 0)
    {
        cout << "\nEmpty file\n";
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

// ANALISE

unsigned Histogram::num() const
{
    unsigned ans = 0;
    for (int i = 0; i < M; i++)
        ans += frequency[i];
    return ans;
}

unsigned Histogram::numHist(unsigned i) const
{
    if ((i < 0) || (i > M - 1)) {
        cout << "Wrong index";
        return 0;
    }
    return frequency[i];
}

double Histogram::max() const
{
    return max_hist_;
}

double Histogram::min() const
{
    return min_hist_;
}

double Histogram::mean()
{
    setAprox_values();
    double ans = 0.0;
    for (int i = 0; i < M; i++)
        ans += aprox_values[i] * frequency[i];
    delete[] aprox_values;
    return ans / (double)num();
}

double Histogram::median()
{
    setAprox_values();
    unsigned index = num() / 2;
    unsigned sum = 0;
    double ans;
    for (int i = 0; i < M; i++) {    //i column
        sum += numHist(i);
        if (sum >= index) {
            ans = aprox_values[i];
            delete[] aprox_values;
            return ans;
        }
    } return -9999.0;
}

double Histogram::moda()
{
    setAprox_values();
    unsigned max_frequency = frequency[0];
    unsigned index = 0;
    for (int i = 0; i < M; i++) {
        if (frequency[i] > max_frequency)
        {
            max_frequency = frequency[i];
            index = i;
        }
    }
    double ans = aprox_values[index];
    delete[] aprox_values;
    return ans;
}

double Histogram::range()
{
    return max_hist_ - min_hist_;
}

double Histogram::max_value_error()
{
    double step = (max_hist_ - min_hist_) / M;
    return step / 2;
}

double Histogram::variance()
{
    double ans = 0.0;
    double mean_ = mean();
    setAprox_values();
    for (int i = 0; i < M; ++i)
        ans += (pow(aprox_values[i] - mean_, 2)) * frequency[i];

    delete[] aprox_values;
    return ans / (double)M;
}

double Histogram::dev()   
{
    return sqrt(variance());
}

double Histogram::asymmetry()
{
    unsigned n = num();
    double m = mean();

    setAprox_values();
    double moment3 = 0.0;
    for (int i = 0; i < M; i++)
    {
        moment3 += (pow(aprox_values[i] - m, 3) * frequency[i]);
    }
    moment3 /= (double)n;
    delete[] aprox_values;
    return moment3 / pow(dev(), 3);
}

double Histogram::excess_kurtosis()
{
    unsigned n = num();
    double m = mean();

    setAprox_values();
    double moment4 = 0.0;
    for (int i = 0; i < M; i++)
    {
        moment4 += pow(aprox_values[i] - m, 4) * frequency[i];
    }
    moment4 /= (double)n;
    delete[] aprox_values;
    return moment4 / pow(dev(), 4);
}


void save_histogram(const Histogram& hist, char* fname)
{
    FILE* fp = fopen(fname, "wb");
    if (fp == NULL)
    {
        cout << "problem with file write";
    }
    fwrite(&hist, 1, sizeof(Histogram), fp);
    fclose(fp);
}

Histogram import_histogram(char* fname)
{
    Histogram hist;
    FILE* fp = fopen(fname, "rb");
    if (fp == NULL)
    {
        cout << "problem with file read";
    }
    int ans = fread(&hist, 1, sizeof(Histogram), fp);
    fclose(fp);
    return hist;
}

void save_test_bin_data(vector<double>& data, char* fname)
{
    FILE* f1 = fopen(fname, "wb");
    for (int i = 0; i < data.size(); i++) {
        fwrite(&data[i], 1, sizeof(double), f1);
    }
    fclose(f1);
}
