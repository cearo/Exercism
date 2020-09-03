class RaindropConverter {

    String convert(int number) {
        final StringBuilder resultBuilder = new StringBuilder();

        if (number % 3 == 0) {
            resultBuilder.append("Pling");
        }
        if (number % 5 == 0) {
            resultBuilder.append("Plang");
        }
        if (number % 7 == 0) {
            resultBuilder.append("Plong");
        }

        final String result = resultBuilder.toString();

        return result.equals("") ? Integer.toString(number) : result;
    }

}
