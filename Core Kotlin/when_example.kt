import java.util.Scanner

fun main() {
    var sc=Scanner(System.`in`)

    var choice:Int

    var data = """
                            Menu 
                        press 1 for addition 
                        press 2 for multplication 
                """


    println(data)

    println("Enter your choice : ")

    choice = sc.nextInt()

    when(choice)
    {
        1-> {
            println("addition code here")
        }
        2-> {
            println("multiplication code ")
        }
        else->
        {
            println("something went wrong")
        }
    }

}