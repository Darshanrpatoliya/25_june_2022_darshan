import java.util.Scanner

//q6. Kotlin Program to Check Whether a Number is Even or Odd

fun main()
{
    var sc=Scanner(System.`in`)
    println("Enter Number: ")
    var num_6=sc.nextInt()

    if (num_6%2==0)
    {
        println("$num_6 is Even number")
    }
    else
    {
        println("$num_6 is odd number")
    }
}