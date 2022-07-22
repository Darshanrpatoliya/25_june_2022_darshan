import java.util.Scanner

fun main()
{
    var sc=Scanner(System.`in`)
    var even=0
    var odd=0
    var num:Int
    for (i in 1..5)
    {
        println("Enetr  number: ")
        num=sc.nextInt()

        if (num%2==0)
        {
            even++
        }
        else
        {
            odd++
        }
    }
    println("even= $even")
    println("odd= $odd")
}