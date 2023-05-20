public class FindCommentElefromThreeArray {



        public static void findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
            int n1 = arr1.length;

            int n2 = arr2.length;

            int n3 = arr3.length;

            int i = 0;

            int j = 0;

            int k = 0;

            while (i < n1 && j < n2 && k < n3) {
                if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                    System.out.println(arr1[i]);

                    i++; j++; k++;
                }

                else if (arr1[i] < arr2[j]) {
                    i++; // increases i by 1
                }

                else if (arr2[j] < arr3[k]) {
                    j++; // increases j by 1
                }

                else {
                    k++; // increases k by 1
                }
            }
        }

        public static void main(String[] args) {
            int arr1[]={1,2,3,4,5};
            int arr2[]= {1,2,5,7,9};
            int arr3[]={1,3,4,5,8};
            findCommonElements(arr1,arr2,arr3);
        }



}
