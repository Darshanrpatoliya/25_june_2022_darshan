import java.util.Scanner

//q8. WAP to find max value using function as express

fun find_max(num1_q8: Int, num2_q8: Int)
{
    if (num1_q8>num2_q8)
    {
        println("$num1_q8 is gretter than $num2_q8")
    }
    else if (num1_q8==num2_q8)
    {
        println("$num1_q8 is equal to $num2_q8")
    }
    else
    {
        println("$num2_q8 is gretter than $num1_q8")
    }
}

fun main()
{
    var sc=Scanner(System.`in`)

    println("Enter number 1: ")
    var num1_q8=sc.nextInt()

    println("Enter number 2: ")
    var num2_q8=sc.nextInt()

    find_max(num1_q8,num2_q8)
}