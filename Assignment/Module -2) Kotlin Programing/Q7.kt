import java.util.Scanner

//q7. Kotlin Program to Find the Frequency of Character in a String

fun main()
{
    var sc=Scanner(System.`in`)

    val str:String
    println("Enter A String: ")
    str=sc.next()
    str.toLowerCase()



    var count:Int=0

    for (i in 0..str.length-1)
    {
        if ('a'==str[i])
        {
            count++
        }
    }

    println(count)
}
