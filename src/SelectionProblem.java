/**
 * @Auther: ykq
 * @Date: 2019/3/19 18:20
 * @Description:
 */
public class SelectionProblem {
    /**随机给出的N个数*/
    static int [] arr = {5,8,7,4,9,2,6,3,10};

    /**第k个最大值*/
    static int k = 3;


    public static void main (String [] args) {
        solutionNormal();
    }

    public static void solutionEasy() {
        for (int i = 0; i < 3; i++) {

        }
    }

    public static void solutionNormal() {
        int i;
        int temp;
        int [] result = new int[k];

        /*先以递减的顺序将arr的前k个放到result里*/
        for (i = 0; i < k; i++) {
            result[i] = arr[i];
        }

        for (i = 0; i < k; i++) {
            if (result[i] < result[i+1]) {
                temp = result[i];
                result[i] = result[i+1];
                result[i+1] = temp;
            }
        }

        /*将余下的随机数与结果集比较*/
        for (i = k; i < arr.length; i++) {
            /*如果比结果集的第k个大，将这个数放到对应的位置，然后挤掉结果集的第k个*/
            if (arr[i] > result[k]) {
                for (int j = 0; j < k; j++) {
                    if ()
                }
            }
        }
    }

    public static void solutionHard() {
        for (int i = 0; i < 3; i++) {

        }
    }
}
