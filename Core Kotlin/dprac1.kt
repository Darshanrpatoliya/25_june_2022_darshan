import java.util.Scanner

fun main(args:Array<String>)
{
    var enter=Scanner(System.`in`)

    var fname:String
    var lname:String
    var email:String
    var phone:String

    println("-----Enter your details-----")
    println("Enter Your First Name")
    fname=enter.next()
    println("Enter Your Last Name")
    lname=enter.next()
    println("Enter Your Emain")
    email=enter.next()
    println("Enter Your Phonr no.")
    phone=enter.next()

    println("-----Your Information-----")
    println("First Name: $fname")
    println("Last Name: $lname")
    println("Email: $email")
    println("Phonr Number: $phone")


}