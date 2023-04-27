package com.green.java.ch07.arraylist;

public class MyArrayList extends Object {

    private int[] items;

    public MyArrayList() {
        items = new int[0];     //0은 여기서 찍힘 #주소값 #배열 #ootd
        System.out.println(items.length);
    }

    public void add(int value) {
        int[] temp = new int[items.length + 1];
        temp[items.length] = value;
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    public void add(int idx, int value) {
        if (idx > items.length) {
            return;
        }
        int[] temp = new int[items.length + 1];
        temp[idx] = value;
        for (int i = 0; i < items.length; i++) {
            if (i < idx) {
                temp[i] = items[i];
            } else {
                temp[i + 1] = items[i];
            }
        }
        items = temp;
    }

    @Override
    public String toString() {
        String str = "[";
        if (items.length > 0) {
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += ", " + items[i];
            }
        }
        str += "]";
        return str;
    }

    public int size() { //배열의 길이 뽑는 return type method
        return items.length;
    }

    public int get(int idx) {
        return items[idx];
    }



    public void bubbleSort() {
        for (int i = 0; i < items.length; i++) {
            for (int z = 0; z < i; z++) {
                int sideIdx = z+1;
                if(items[z] > items[sideIdx]) {
                    int temp = items[z];
                    items[z] = items[sideIdx];
                    items[sideIdx] = temp;
                }
            }
        }           //이해안가면 엑셀로 찍어보자
                    /////// or ///////
//        for (int i = 0; i < items.length; i++) {
//            for (int j = 0; j < items.length-i; j++) {
//                if(j == items.length-1) {
//                    break;
//                }
//                if (items[j] > items[j+1]) {
//                int temp = items[j+1];
//                items[j+1] = items[j];
//                items[j] = temp;
//                }
//            }
//        }
    }



    /////////////////////////////   remove 실험실   //////////////////////////
    public int remove (int a) {
        int temp[] = new int[items.length - 1];
        temp[items.length] = a;
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        return a;
    }

/*
    remove 만들어보자

    public int remove (int value) {
          items[i-1] = items[i] ??


                      리턴타입




    }
 */
}



