public class Main {
    public static void main(String[] args) {
        String[][] arr1 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        System.out.println(sumOfArrayElements(arr1));
    }

    protected static int sumOfArrayElements(String[][] inputArray) {
        int sum = 0;

        if (inputArray.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (inputArray[i].length != 4) throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(inputArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("not number in array" + " [" + i + "]" + " [" + j + "]");
                }
            }
        }

        return sum;
    }

}