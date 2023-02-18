public class EX1 {
        enum Month {
            January(1),
            February(2),
            March(3),
            April(4),
            May(5),
            June(6),
            July(7),
            August(8),
            September(9),
            October(10),
            November(11),
            December(12);

            private final Integer number;

            Month(int number) {
                this.number = number;
            }

            public static String monthNumber(int number) {
                Month[] months = Month.values();
                for (Month m : months) {
                    if (number == m.number) {
                        return m.name();
                    }
                }
                return null;
            }

            public static Integer numberMonth(String name) {
                Month[] months = Month.values();
                for (Month m : months) {
                    if (m.name().equalsIgnoreCase(name)) {
                        return m.number;
                    }
                }
                return null;
            }
        }
            public static void main(String[] args) {
                System.out.println(Month.monthNumber(0));
                System.out.println(Month.numberMonth("March"));
            }
        }


