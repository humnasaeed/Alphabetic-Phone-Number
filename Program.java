import java.util.Scanner;

public class Q3_AlphabeticPhoneNumber
{
    private static Scanner input;

    public static void main(String[] args)
    {
        input = new Scanner(System.in);
        System.out.println("Enter The Phone Number (With Letters): ");
        String initial_phone_number = input.nextLine();

        initial_phone_number = initial_phone_number.toUpperCase();
        long phone_number_final = full_number(initial_phone_number);

        System.out.printf("%nOutput phone number for '%s' is '%s'",
                initial_phone_number, phone_number_final);
    }

    public static long full_number(String initial_phone_number)
    {
        // Use long instead of int for 'number' if the string will be longer than max int value
        // 2147483647, which is '10 digits'

        long number = 0; // 'number' is the digital phone number to compute from the initial alphabetic phone number.
        // Declaring and initializing empty string to store results
        String all_nums = "";

        //Creating char list
        char[] num_list;
        num_list = new char[10];

        // iterating through list to store all char of alphabetic phone number
        for (int i = 0; i < 10; i++ ) {
            // Assigning char at each index to corresponding index in list
            num_list[i] = initial_phone_number.charAt(i);
            char digit = num_list[i];

            // Translating each element of list to numeric equivalent
            // Storing results
            if ((digit == 'A') || (digit == 'B') || (digit == 'C')) {
                digit = '2';
                all_nums = all_nums + digit;

            } else if ((digit == 'D') || (digit == 'E') || (digit == 'F')) {
                digit = '3';
                all_nums = all_nums + digit;

            } else if ((digit == 'G') || (digit == 'H') || (digit == 'I')) {
                digit = '4';
                all_nums = all_nums + digit;
            } else if ((digit == 'J') || (digit == 'K') || (digit == 'L')) {
                digit = '5';
                all_nums = all_nums + digit;
            } else if ((digit == 'M') || (digit == 'N') || (digit == 'O')) {
                digit = '6';
                all_nums = all_nums + digit;
            } else if ((digit == 'P') || (digit == 'Q') || (digit == 'R') || (digit == 'S')) {
                digit = '7';
                all_nums = all_nums + digit;
            } else if ((digit == 'T') || (digit == 'U') || (digit == 'V')) {
                digit = '8';
                all_nums = all_nums + digit;
            } else if ((digit == 'W') || (digit == 'X') || (digit == 'Y') || (digit == 'Z')) {
                digit = '9';
                all_nums = all_nums + digit;

                // Remains the same if already a numerical value
            } else {
                digit = digit;
                all_nums = all_nums + digit;
            }

            // Converting string to long format
            long long_format = Long.parseLong(all_nums);

            // Assigning digital number to variable 'number'
            number = long_format;
        }


        // Returning digital number at the end
        return number;

    }// End of full_number function
}
