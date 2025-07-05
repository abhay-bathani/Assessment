import java.util.regex.Pattern;

public class StringCalculator {

        public int add(String numbers) {

            if (numbers == null || numbers.isEmpty()) {
                return 0;
            }

            String delimiter = "[,\n]";
            String numberPart = numbers;


            if (numbers.startsWith("//")) {

                int delimiterEnd = numbers.indexOf("\n");
                delimiter = Pattern.quote(numbers.substring(2, delimiterEnd));
                numberPart = numbers.substring(delimiterEnd + 1);
            }


            String[] parts = numberPart.split(delimiter);
            int sum = 0;

            for (String num : parts) {
                sum += Integer.parseInt(num.trim());
            }

            return sum;
        }
}


