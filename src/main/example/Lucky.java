package example;

import com.amazonaws.services.lambda.runtime.Context;

public class Lucky {
    public String myHandler(int luckyNumber, Context context) {
        return "My lucky number is: " + String.valueOf(luckyNumber);
    }
}