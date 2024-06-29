public class Array {
    public static void main(String[] args) {
        // int[] num = {1,345,6,67,2};
        // System.out.println(num[0]);

        // int[] array = new int[3];
        // array[0] = 1;
        // array[1] = 2;
        // array[2] = 3;
        // // System.out.println(array[0]);
        // // System.out.println(array[1]);
        // // System.out.println(array[2]);
        // for(int i=0;i<=2;i++){
        //     System.out.println(array[i]);
            
        // }

        //*Multi-dimentional array */
        // int nums[][] = new int[3][4];

        // for(int i=0;i<=2;i++){
        //     for(int j=0;j<=3;j++){
        //         nums[i][j] = (int)(Math.random() * 10); //providing random values
        //         System.out.print(nums[i][j] + " ");
        //         }
        //         System.out.println();
        //         }
        // }

        //*Jagged Array */
        // int nums[][] = new int[3][];
        // nums[0] = new int[3];
        // nums[1] = new int[6];
        // nums[2] = new int[2];

        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         nums[i][j] = (int)(Math.random() * 10); //providing random values
        //         System.out.print(nums[i][j] + " ");
        //         }
        //         System.out.println();
        //         }
        // }

        // //*3-D Array */
        // int nums[][][] = new int[3][3][3];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         for(int k=0;k<nums[i][j].length;k++){
        //             nums[i][j][k] = (int)(Math.random() * 10); //
        //             System.out.print(nums[i][j][k] + " ");
        //             }
        //             System.out.println();
        //             }
        //             System.out.println();
        //             }
        //         }

        //*Array of object */
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.rollno = 1;
        s1.marks = 90;
        
        Student s2 = new Student();
        s2.name = "vedant";
        s2.rollno = 2;
        s2.marks = 93;

        Student s3 = new Student();
        s3.name = "Sachin";
        s3.rollno = 3;
        s3.marks = 99;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++){
            System.out.println("Name: " + students[i].name + " , Roll no: " + students[i].rollno + " , Marks: " + students[i].marks);
            }


        

    }
        public static class Student{
            String name;
            int rollno;
            int marks;
        }


        

}
