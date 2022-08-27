fun main() {
    println("27.0 degrees Celsius is 80.60 degrees Fahrenheit.")
    print("350.0 degrees Kelvin is 76.85 degrees Celsius.")
    print("10.0 degrees Fahrenheit is 260.93 degrees Kelvin")
    // Fill in the code.
}fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}