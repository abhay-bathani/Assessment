public class StringCalculator {

        public int add(String numbers) {

            if (numbers == null || numbers.isEmpty()) {
                return 0;
            }

            String unified = numbers.replace("\n", ",");

            String[] parts = unified.split(",");
            int sum = 0;

            for (String num : parts) {
                sum += Integer.parseInt(num.trim());
            }

            return sum;
        }
}


