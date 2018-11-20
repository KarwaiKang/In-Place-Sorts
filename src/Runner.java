public class Runner {
    public static void main(String[] args) {
        int len = 10000;
        System.out.println("Common array size: " + len + "\n");

        int[] intArr = InPlaceSorts.getRandIntArr(len);
        System.out.println("Random int array: " + InPlaceSorts.printArr(intArr).substring(0,200) + "...");
        InPlaceSorts.insertionSort(intArr);
        System.out.println("Sorted int array: " + InPlaceSorts.printArr(intArr).substring(0,200) + "...\n");

        double[] doubleArr = InPlaceSorts.getRandDoubleArr(len);
        System.out.println("Random double array: " + InPlaceSorts.printArr(doubleArr).substring(0,200) + "...");
        InPlaceSorts.selectionSort(doubleArr);
        System.out.println("Sorted double array: " + InPlaceSorts.printArr(doubleArr).substring(0,200) + "...\n");

        String[] stringArr = InPlaceSorts.randStringArr(len);
        System.out.println("Random String array: " + InPlaceSorts.printArr(stringArr).substring(0,200) + "...");
        InPlaceSorts.bubbleSort(stringArr);
        System.out.println("Sorted String array: " + InPlaceSorts.printArr(stringArr).substring(0,200) + "...\n");

        intArr = InPlaceSorts.getRandIntArr(len);
        System.out.println("Random int array: " + InPlaceSorts.printArr(intArr).substring(0,200) + "...");
        InPlaceSorts.mergeSort(intArr);
        System.out.println("Sorted int array: " + InPlaceSorts.printArr(intArr).substring(0,200) + "...\n");
    }
}