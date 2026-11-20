public static double average(int[] salary) {
    int min = salary[0];
    int max = salary[0];
    double sum = 0;
    for (int i = 0; i < salary.length; i++) {
        sum += salary[i];
        if (salary[i] < min) {
            min = salary[i];
        }
        if (salary[i] > max) {
            max = salary[i];
        }
    }
    return (sum - min - max) / (salary.length - 2);
}
