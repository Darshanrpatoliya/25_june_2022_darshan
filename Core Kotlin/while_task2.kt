import java.util.Scanner

fun main()
{
    var sc=Scanner(System.`in`)
    var sumeven:Int=0
    var sumodd:Int=0
    var num:Int

    var i:Int=1
    while (i<=5)
    {
        println("Enter number: ")
        num=sc.nextInt()


        if (num%2==0)
        {
            sumeven+=num
        }
        else
        {
            sumodd+=num
        }

        i++
    }
    println("sum of even = $sumeven")
    println("sum of odd = $sumodd")
}