import java.util.Scanner

fun main()
{
    var sc=Scanner(System.`in`)

    var num:Int
    var i:Int=1
    for (i in 1..5)
    {
        println("Enter a number")
        num=sc.nextInt()

        if (num==4)
        {
            break
        }

        println(num)
    }
}