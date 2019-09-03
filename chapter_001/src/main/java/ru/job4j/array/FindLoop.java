package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.

        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }

        return rst;
    }

    public int[] sort(int[] data) {
        int minIndex, minElem, tmp;
        for (int j = 0; j < data.length; j++) {
            minElem = data[j];
            for (int i = j; i < data.length; i++) {
                if (data[i] < minElem) {
                    minElem = data[i];
                }
            }
            minIndex = indexOf(data, minElem, j, data.length);
            tmp = data[j];
            data[j] = minElem;
            data[minIndex] = tmp;
        }

        return data;
    }

}
