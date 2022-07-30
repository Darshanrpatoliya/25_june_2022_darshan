import java.util.Scanner

//q5. Kotlin Program to Compute Quotient and Remainder

fun main()
{
    var sc=Scanner(System.`in`)

    println("Enter Dividend: ")
    var dividend=sc.nextInt()

    println("Enter Divisor: ")
    var divisor=sc.nextInt()

    println("-----------------------------")

    println("Quotient: ${dividend/divisor}")
    println("Remainder: ${dividend%divisor}")
}