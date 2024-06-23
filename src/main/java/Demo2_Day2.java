
public class Demo2_Day2 {
    public static void main(String[] args) {
        int i = 0;
        /*while(i<4){
             System.out.println("Inder is automation tester");
             i++;

         }*/
        do {
            System.out.println("Inder is an automation tester with a 35 lakh package");
            i++;
        } while (i < 3);{
            }
        }


        public void forloopmethod(){
            for (int i=0; i<7; i++){
            System.out.println("Inder is an automation tester in microsoft.");
        }
    }

    public void ternaryoperation(){
        int a=17;
        String Result = a > 70 ? "Distinction" : (a > 18 ? "Pass" : "Fail");
        System.out.println(Result);
    }

    public void Switchmethod(){
            String Gender ="New";
            switch (Gender){
                case "Male" :{
                    System.out.println("Go the 5th Floor");
                    break;
                }
                case "Female" : {
                    System.out.println("Go the 3rd Floor");
                    break;
                }
                default: {
                    System.out.println("Go to the ground Floor");
                    break;
                }
            }
        }


    public void ifelsemethod(){
            int Total_marks = 90;
            if (Total_marks < 25){
                System.out.println(" Marked them as Fail");
            } else if (Total_marks > 91) {
                System.out.println("Marked them as Passed");
            } else if (Total_marks ==90){
                System.out.println("Passed with distiction");
            }
        }
    }