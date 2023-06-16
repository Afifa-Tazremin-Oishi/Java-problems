//19. Extract the OTP from the SMS. "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S"
//---------------------------------------------------------------------------------------------------------

public class GenerateOTP {
    public static String generateOTP()
    {
        int randomPin   =(int) (Math.random()*99999)+10000;
        String otp  = String.valueOf(randomPin);
        return otp;
    }

    public static void main(String[] args) {
        String otpSting  =generateOTP();//function calling
        System.out.println("Your one time password is : "+otpSting);

    }
}
