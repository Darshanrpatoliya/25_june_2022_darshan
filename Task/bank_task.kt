import java.util.Scanner

class CONFIRM
{
    var sc_class=Scanner(System.`in`)
    var name:String=""
    var op_bal:Int=0
    var bal:Int = 0
    var with:Int = 0
    var depo:Int=0


    fun c_name()
    {
        println("Enter Your Name")
        name=sc_class.next()
    }
    fun opening()
    {
        println("Enter Opening account balence: ")
        op_bal=sc_class.nextInt()
        if (op_bal>0)
        {
            bal+=op_bal

            println("Enetr Withdraw ammount: ")
            with=sc_class.nextInt()
            if (with<bal)
            {
                bal-=with

                println("Enter Deposite Ammount")
                depo=sc_class.nextInt()
                if (depo>=0)
                {
                    bal+=depo
                }
                else
                {
                    println("please enetr valid ammount")
                }
            }
            else
            {
                println("your balance is $bal so, you can not Withdawing ")
            }

        }
        else
        {
            println("please enter valid ammount")
        }
    }

    fun display()
    {
        println("Your Name : $name")
        println("Your Final Account Balance is: $bal")
    }
}


fun main()
{
    var sc=Scanner(System.`in`)

    println("------Wellcome To Online Banking System------")

    var con_obj:CONFIRM=CONFIRM()
    var status=true

    while (status)
    {
        println("Did You Creat New Bank Account?")
        println("press 1 for Confirm")
        var confirm=sc.nextInt()

        if (confirm==1)
        {
            status=true

            con_obj.c_name()
            con_obj.opening()
            con_obj.display()
        }
        else
        {
            status=false
        }

    }
}