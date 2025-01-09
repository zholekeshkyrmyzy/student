class MyApplication {
    public static void printData(Iterable<? extends Payable> payables) {
        for (Payable payable : payables) {
            System.out.printf("%s earns %.2f tenge\n", payable.toString(), payable.getPaymentAmount());
        }
    }
}