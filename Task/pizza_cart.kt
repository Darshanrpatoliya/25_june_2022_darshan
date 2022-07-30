import java.util.Scanner


//--------------------------------global variable---------------------------------
var total_price_pizza:Int=0
var total_price_pasta:Int=0

var payment_recived_today:Int=0
var count_one_shift_pp:Int=0

var soft_drink:Int=0
var main_soft_drink:Int=0

var bruschetta:Int=0
var chocco:Int=0

//--------------------------------variable use in another class---------------------------------

open class variable
{
    var sc_choice=Scanner(System.`in`)
    var name:String=""
    var count_pizza:Int=0
    var count_pizza_after_order:Int=0
    var price_pizza:Int=0
    var per_pizza:Int=80
}

//--------------------------------class for pizza---------------------------------

open class CHOICEPIZZA : variable
{

    constructor()
    {
        println("----------PIZZA MENU----------")
        println("Enter your Choice")

        var data_choice_pizza="""
            
            1 large pizza = 99 ₹
            2 large pizza = 180 ₹
            3 large pizza = 240 ₹
            
            *** Buy 4 or More Pizza and get 1.5 Ltr of Soft Drink FREE ***
            
        """
        println(data_choice_pizza)

        println("-------------------------------------------------------------")
        println("Enter Your Name: ")
        name=sc_choice.next()

        println("Welcome , $name")
        println("Enter Number of Pizza Order You Want: ")

        count_pizza=sc_choice.nextInt()

        if (count_pizza<=0)
        {
            println("OK No Problem")
        }
        else if(count_pizza==1)
        {
//            count_pizza++
            price_pizza+=99
            count_one_shift_pp+=count_pizza
        }
        else if(count_pizza==2)
        {
//            count_pizza++
            price_pizza+=180
            count_one_shift_pp+=count_pizza
        }
        else if(count_pizza==3)
        {
//            count_pizza++
            price_pizza+=240
            count_one_shift_pp+=count_pizza
        }
        else if(count_pizza>3)
        {
            count_pizza_after_order+=count_pizza
            price_pizza=count_pizza_after_order*per_pizza

            println("*** Conratulation !! 1.5 Ltr of Soft Drink FREE for You")
            soft_drink++
            main_soft_drink+=soft_drink

        }

        println("Your Piza Order Ammount Is : $price_pizza")

//  -----------total for owner------------
        total_price_pizza+=price_pizza
        count_one_shift_pp+=count_pizza_after_order
    }
}

//--------------------------------class for pasta---------------------------------

class CHOICEPASTA:CHOICEPIZZA
{
    var count_pasta:Int=0
    var count_pasta_after_order:Int=0
    var price_pasta:Int=0
    var per_pasta:Int=40

    constructor():super()
    {
        println("----------PASTA MENU----------")

        var data_choice_pasta="""
            
            1 large Pasta = 60 ₹
            2 large Pasta = 100 ₹
            3 large Pasta = 140 ₹
            
            *** Buy 4 or More Pasta and get 2 bruschetta FREE ***
            *** Buy 4 or More Pizzas and Pasta and get 2 chocco brownies ice cream FREE ***
            
        """
        println(data_choice_pasta)

        println("Enter Number of Pasta Order You Want: ")
        count_pasta=sc_choice.nextInt()

        if (count_pasta<=0)
        {

        }
        else if(count_pasta==1)
        {
//            count_pasta++
            price_pasta+=60
            count_one_shift_pp+=count_pasta
        }
        else if(count_pasta==2)
        {
//            count_pasta++
            price_pasta+=100
            count_one_shift_pp+=count_pasta
        }
        else if(count_pasta==3)
        {
            price_pasta+=140
            count_one_shift_pp+=count_pasta
        }
        else if(count_pasta>3)
        {
            count_pasta_after_order+=count_pasta
            price_pasta+=count_pasta_after_order*per_pasta

            println("*** Conratulation !! 2 bruschetta FREE for You")
            bruschetta++

            if (count_pizza>3)
            {
                chocco++
                println("*** Conratulation !! 2 chocco brownies ice cream  FREE for You")

            }
        }
        println("Your Pasta Order Ammount Is : $price_pasta")

        //  -----------total for owner------------
        total_price_pasta+=price_pasta
        count_one_shift_pp+=count_pasta_after_order
    }

    //  -----------total bill for cusomer------------

    fun bill1()
    {
        var total_pp_both:Int=price_pizza+price_pasta

        println("-------bil of $name------")
        println("Your Total Order is : $total_pp_both")

        payment_recived_today+=total_pp_both

        println("Your Net Order ammount of the day is : ${price_pizza+price_pasta}")
    }

    //  -----------total bill for cusomer------------

    fun p_p_bill()
    {
        println("-----------------bil of pizza and pasta (for an owner)----------------")

        println("Payment Received from Pizza: $total_price_pizza")
        println("Payment Received from Pasta: $total_price_pasta")

        println("Payment Received Today : $payment_recived_today")

        println("Number of pizza and pasta sold in one shift: $count_one_shift_pp")

        println("Number of 1.5 Ltr soft drink bottles given : $main_soft_drink")

        println("Number of bruschetta given to customer: $bruschetta")

        println("Number of chocco brownies ice cream : $chocco")

        println("-----------------------Bye Bye !!-----------------------")
    }
}

fun main()
{
    println("==========Welcome to Amazing Pizza and Pasta Pizzeria==========")

    var sc=Scanner(System.`in`)

    var status=true
    while (status)
    {
        var data_entry="""

            press 1 : Order Menu

            pree 2 : Exit
        """
        println(data_entry)
        var press_option=sc.nextInt()

        if (press_option==1)
        {
            status=true
            var obj_choice=CHOICEPASTA()
            obj_choice.bill1()
//            obj_choice.p_p_bill()

            while (status)
            {
                var q_y_n="""

            want to enter order from another customer
             press Y for yes
              press N for no :
            """
                println(q_y_n)
                var a_y_n=sc.next()

                if (a_y_n=="y")
                {
                    var obj_choice = CHOICEPASTA()
                    obj_choice.bill1()
                }
                else if (a_y_n=="n")
                {
                    status=false
                    obj_choice.p_p_bill()
                }
                else
                {
                    println("please enter only Y and N")
                    status=false
                    obj_choice.p_p_bill()
                }
            }
        }
    }
}