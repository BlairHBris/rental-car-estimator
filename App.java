class App {
  public static void main(String args[]) {
    App.carCalculation("5/22/2022", 3, true, false, true, 28);
  }

  private static void carCalculation(String pickUpDate, float rentalDays, boolean tollTag, boolean gps, boolean roadsideAssistance, int age) {
    float basicCharge = 29.99f * rentalDays;
    double roundedBasicCharge = Math.round(basicCharge*100.0)/100.0;
    System.out.println("The Basic car rental cost is " + roundedBasicCharge);

    if (age < 25) {
      if (tollTag && gps && roadsideAssistance) {
        float optionCharge = rentalDays * 10.85f;
        System.out.println("The total cost for all options is " + (rentalDays * 10.85));
        float underageCharge = .3f * basicCharge;
        System.out.println("The underage driver surcharge is " + underageCharge);
        float totalCharge = underageCharge + basicCharge + optionCharge;
        System.out.println("The total cost is " + totalCharge);
      } else if (tollTag && gps) {
        float optionCharge = rentalDays * 6.9f;
        System.out.println("The total cost for all options is " + (rentalDays * 6.9));
        float underageCharge = .3f * basicCharge;
        System.out.println("The underage driver surcharge is " + underageCharge);
        float totalCharge = underageCharge + basicCharge + optionCharge;
        System.out.println("The total cost is " + totalCharge);
      } else if (tollTag && roadsideAssistance) {
        float optionCharge = rentalDays * 7.9f;
        System.out.println("The total cost for all options is " + (rentalDays * 7.9));
        float underageCharge = .3f * basicCharge;
        System.out.println("The underage driver surcharge is " + underageCharge);
        float totalCharge = underageCharge + basicCharge + optionCharge;
        System.out.println("The total cost is " + totalCharge);
      } else if (roadsideAssistance && gps) {
        float optionCharge = rentalDays * 6.9f;
        System.out.println("The total cost for all options is " + (rentalDays * 6.9));
        float underageCharge = .3f * basicCharge;
        System.out.println("The underage driver surcharge is " + underageCharge);
        float totalCharge = underageCharge + basicCharge + optionCharge;
        System.out.println("The total cost is " + totalCharge);
      } else if (roadsideAssistance || tollTag) {
        float optionCharge = rentalDays * 3.95f;
        System.out.println("The total cost for all options is " + (rentalDays * 3.95));
        float underageCharge = .3f * basicCharge;
        System.out.println("The underage driver surcharge is " + underageCharge);
        float totalCharge = underageCharge + basicCharge + optionCharge;
        System.out.println("The total cost is " + totalCharge);
      } else if (gps) {
        float optionCharge = rentalDays * 2.95f;
        System.out.println("The total cost for all options is " + (rentalDays * 2.95));
        float underageCharge = .3f * basicCharge;
        System.out.println("The underage driver surcharge is " + underageCharge);
        float totalCharge = underageCharge + basicCharge + optionCharge;
        System.out.println("The total cost is " + totalCharge);
      }  
    } else {
      if (tollTag && gps && roadsideAssistance) {
        float optionCharge = rentalDays * 10.85f;
        System.out.println("The total cost for all options is " + (rentalDays * 10.85));
        float totalCharge = basicCharge + optionCharge;
        System.out.println("The total cost is " + totalCharge);
      } else if (tollTag && gps) {
        float optionCharge = rentalDays * 6.9f;
        System.out.println("The total cost for all options is " + (rentalDays * 6.9));
        float totalCharge = basicCharge + optionCharge;
        System.out.println("The total cost is " + totalCharge);
      } else if (tollTag && roadsideAssistance) {
        float optionCharge = rentalDays * 7.9f;
        System.out.println("The total cost for all options is " + (rentalDays * 7.9));
        float totalCharge = basicCharge + optionCharge;
        System.out.println("The total cost is " + totalCharge);
      } else if (roadsideAssistance && gps) {
        float optionCharge = rentalDays * 6.9f;
        System.out.println("The total cost for all options is " + (rentalDays * 6.9));
        float totalCharge = basicCharge + optionCharge;
        System.out.println("The total cost is " + totalCharge);
      } else if (roadsideAssistance || tollTag) {
        float optionCharge = rentalDays * 3.95f;
        System.out.println("The total cost for all options is " + (rentalDays * 3.95));
        float totalCharge = basicCharge + optionCharge;
        System.out.println("The total cost is " + totalCharge);
      } else if (gps) {
        float optionCharge = rentalDays * 2.95f;
        System.out.println("The total cost for all options is " + (rentalDays * 2.95));
        float totalCharge = basicCharge + optionCharge;
        System.out.println("The total cost is " + totalCharge);
    }
  }
}
}
