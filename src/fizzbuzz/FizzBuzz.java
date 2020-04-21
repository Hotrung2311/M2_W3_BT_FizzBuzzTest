package fizzbuzz;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        //int a = number;
        String result = Integer.toString(number);
        String[] res = result.split("");
        if (result.contains("3") == false && result.contains("5")==false) {
            result = readNumber(number);
        }

        if (result.contains("3")){
            result = "Fizz";
        }else if (result.contains("5")){
            result = "Buzz";
        }

        if (number % 3 == 0 && number % 5 == 0){
            result = "FizzBuzz";
        }else if (number % 3 == 0){
            result = "Fizz";
        }else if (number % 5 == 0){
            result = "Buzz";
        }


        return result;
    }
    static public String readNumber(int nums){
        String res = Integer.toString(nums);
        String[] num = res.split("");
        if (nums > 100 && nums <0){
            res = "Không hợp lệ";
        }
        if (nums > 9){
            res = readOneNumber(num[0]) + " " +readOneNumber(num[1]);
        }else res = readOneNumber(num[0]);
        return res;
    }
    public static String readOneNumber(String a) {
        String result = "";
        switch (a) {
            case "0":
                result = "không";
                break;
            case "1":
                result = "một";
                break;
            case "2":
                result = "hai";
                break;
            case "3":
                result = "ba";
                break;
            case "4":
                result = "bốn";
                break;
            case "5":
                result = "năm";
                break;
            case "6":
                result = "sáu";
                break;
            case "7":
                result = "bảy";
                break;
            case "8":
                result = "tám";
                break;
            case "9":
                result = "chín";
                break;

        }
        return result;
    }
}
