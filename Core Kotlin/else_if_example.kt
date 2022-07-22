import java.util.Scanner

fun main()
{
    var sc=Scanner(System.`in`)
    var marks:Int

    println("Enter marks : ")
    marks = sc.nextInt()

    if(marks>=70)
    {
        println("A grade")
    }
    else if(marks>=60 && marks<70)
    {
        println("B grade")
    }
    else if(marks>=50 && marks<40)
    {
        println("C grade")
    }
    else
    {
        println("Fail")
    }
}