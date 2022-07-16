package com.mindhub.homebanking2.utilities;

public class utilities {
    public class Utilities {

        public Utilities(){}


        public int getRandomNumber(int min, int max) {
            return (int) ((Math.random() * (max - min)) + min);
        }

        public String getRandomAccountNumber(){
            return "VIN" + (int) ((Math.random() * (99999999 - 00000001)) + 00000001);
        }


        public String getRandomCardNumber(){
            return getRandomNumber(4000, 4999) +" "+getRandomNumber(1000,9999) +" "+getRandomNumber(1000,9999) +" "+getRandomNumber(1000,9999) ;
        }


        public Integer getRandomCVV(){
            Integer integer = (int)((Math.random() * (999 - 001)) + 001);
            return integer;
        }

    }
}
