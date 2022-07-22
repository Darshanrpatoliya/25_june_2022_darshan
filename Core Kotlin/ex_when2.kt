import java.util.Scanner

fun main()
{
    var sc=Scanner(System.`in`)
    var num:Int
    var display="""
        press 1 for laptop
        press 2 for tablet
        press 3 foe Mobile
    """
    println(display)

    println("Enter Number: ")
    num=sc.nextInt()

    when(num)
    {
        1-> println("Laptop is Avialable")
        2-> println("Tablet not avilable")
        3-> println("Mobile is very soon...")
        else-> println("please enter only 1,2 and 3")
    }
}