import java.util.Scanner

fun main()
{
    var sc=Scanner(System.`in`)
    var sumeven=0
    var sumodd=0
    var num:Int
    for (i in 1..5)
    {
        println("Enetr  number: ")
        num=sc.nextInt()

        if (num%2==0)
        {
            sumeven+=num
        }
        else
        {
            sumodd+=num
        }
    }
    println("sum of even= $sumeven")
    println("sum of odd= $sumodd")
}