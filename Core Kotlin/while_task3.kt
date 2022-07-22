import java.util.Scanner

fun main()
{
    var sc=Scanner(System.`in`)
    var even=0
    var odd=0
    var num:Int

    var i:Int=1
    while (i<=5)
    {
        println("Enter number: ")
        num=sc.nextInt()
        i++

        if (num%2==0)
        {
            even++
        }
        else
        {
            odd++
        }
    }
    println("count of even = $even")
    println("count of odd = $odd")
}