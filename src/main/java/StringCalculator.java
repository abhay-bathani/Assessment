import java.util.regex.Pattern;

public class StringCalculator {

        public int add(String numbers) {

            if (numbers == null || numbers.isEmpty()) {
                return 0;
            }

            String delimiterPattern = "[,\n]";
            String numberPart = numbers;


            if (numbers.startsWith("//")) {
                int newlineIndex = numbers.indexOf("\n");

                String delimiterDef = numbers.substring(2, newlineIndex);
                numberPart = numbers.substring(newlineIndex + 1);

                if (delimiterDef.startsWith("[") && delimiterDef.endsWith("]")) {

                    delimiterDef = delimiterDef.substring(1, delimiterDef.length() - 1);
                    delimiterPattern = Pattern.quote(delimiterDef);
                } else {

                    delimiterPattern = Pattern.quote(delimiterDef);
                }
            }

            String[] parts = numberPart.split(delimiterPattern);
            int sum = 0;

            for (String num : parts) {
                int value = Integer.parseInt(num.trim());
                if (value <= 1000) {
                    sum += value;
                }
            }

            return sum;
        }
}


