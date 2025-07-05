import java.util.regex.Matcher;
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

                    Matcher m = Pattern.compile("\\[(.*?)]").matcher(delimiterDef);
                    StringBuilder patternBuilder = new StringBuilder();
                    while (m.find()) {
                        if (!patternBuilder.isEmpty()) patternBuilder.append("|");
                        patternBuilder.append(Pattern.quote(m.group(1)));
                    }
                    delimiterPattern = patternBuilder.toString();
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


