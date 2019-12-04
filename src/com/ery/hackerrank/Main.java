package com.ery.hackerrank;

public class Main {

    public static void main(String[] args) {
        System.out.println(encryption("    imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau"));
        System.out.println(encryption("haveaniceday"));


    }

    static String encryption(String str) {
        str = str.replace(" ", "");
        float sqrt = (float) Math.sqrt(str.length());
        int row = Math.round(sqrt);
        int column = (int) ((sqrt - (int) sqrt) > 0 ? Math.ceil(sqrt) : Math.floor(sqrt));
        String cryptStr = "";
        char[][] arr = new char[column][row];
        arr = fillArray(arr, column, row);

        for (int index = 0; index < str.length(); index++) {
            arr[index % column][index / column] = str.charAt(index);
        }

        for (int a = 0; a < column; a++) {
            for (int b = 0; b < row; b++) {
                cryptStr = cryptStr + arr[a][b];
            }
            cryptStr = cryptStr + " ";
        }

        return cryptStr.replace("-", "").trim();
    }

    static char[][] fillArray(char[][] arr, int column, int row) {
        for (int a = 0; a < column; a++) {
            for (int b = 0; b < row; b++) {
                arr[a][b] = '-';
            }
        }
        return arr;
    }
}
