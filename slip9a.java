/* Write a java program to validate PAN number and Mobile Number. If it is invalid then throw user defined Exception “Invalid Data”, otherwise display it. */

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

public class slip9a {
    public static void main(String[] args) {
        String panNumber = "ABCDE1234F"; // Replace with the PAN number to be validated
        String mobileNumber = "1234567890"; // Replace with the mobile number to be validated

        try {
            validatePAN(panNumber);
            validateMobileNumber(mobileNumber);

            System.out.println("PAN Number: " + panNumber);
            System.out.println("Mobile Number: " + mobileNumber);
        } catch (InvalidDataException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void validatePAN(String panNumber) throws InvalidDataException {
        // PAN number validation logic
        if (!panNumber.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
            throw new InvalidDataException("Invalid PAN number");
        }
    }

    public static void validateMobileNumber(String mobileNumber) throws InvalidDataException {
        // Mobile number validation logic
        if (!mobileNumber.matches("[0-9]{10}")) {
            throw new InvalidDataException("Invalid mobile number");
        }
    }
}