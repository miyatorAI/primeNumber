public class PrimeNumberMethods {
    public long createPrimeNumber(final long num){
        long input = num;
        if(input <= 2){
            return input;
        }
        // NOTE: 偶数は明らかに素数でないので除く
        if(input %2 == 0){
            input -= 1;
        }

        while(true){
            boolean isPrime = true;
            for(int j = 3; j<input; j++){
                if(input%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                return input;
            }
            input -= 2;
        }
    }

    public boolean isPrimeNumber(final long num){
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
