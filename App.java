class App {
  public static void main(String args[]) {
    App.carCombinator("5/22/2022", 3, true, false, true, 28);
  }

  public static void carCombinator(String pickUpDate, float rentalDays, boolean tollTag, boolean gps, boolean roadsideAssistance, int age) {
    double totalCost = basicRentalCost(rentalDays) + optionsCost(rentalDays, tollTag, gps, roadsideAssistance) + underageCost(rentalDays, age);

    System.out.println("The total cost is " + totalCost);
  }

private static double underageCost(float rentalDays, int age) {
  if (age < 25) {
    System.out.println("The Underage driver surcharge is " + rentalDays * 29.99 * 0.3 );
    return rentalDays * 29.99 * 0.3;
  } else {
    System.out.println("There is no Underage driver surcharge");
    return 0;
  }
  }


private static double optionsCost(float rentalDays, boolean tollTag, boolean gps, boolean roadsideAssistance) {
  if (tollTag && gps && roadsideAssistance) {
    System.out.println("The Options cost is " + Math.round(rentalDays * 10.85 * 100.00)/100.00 );
    return rentalDays * 10.85;
  } else if (tollTag && gps) {
    System.out.println("The Options cost is " + Math.round(rentalDays * 6.9 * 100.00)/100.00);
    return rentalDays * 6.9;
  } else if (tollTag && roadsideAssistance) {
    System.out.println("The Options cost is " + Math.round(rentalDays * 7.9 * 100.00)/100.00 );
    return rentalDays * 7.9;
  }  else if (roadsideAssistance && gps) {
    System.out.println("The Options cost is " + Math.round(rentalDays * 6.9 * 100.00)/100.00 );
    return rentalDays * 6.9;
  } else if (tollTag || roadsideAssistance) {
    System.out.println("The Options cost is " + Math.round(rentalDays * 3.95 * 100.00)/100.00 );
    return rentalDays * 3.95;
  } else if (gps) {
    System.out.println("The Options cost is " + Math.round(rentalDays * 2.95 * 100.00)/100.00 );
    return rentalDays * 2.95;
  } else {
    System.out.println("There are no Options costs");
    return 0;
  }
}

private static double basicRentalCost(float rentalDays) {
  System.out.println("The Basic rental cost is " + Math.round(rentalDays * 29.99 * 100.00)/100.00 );
  return rentalDays * 29.99;
}

}