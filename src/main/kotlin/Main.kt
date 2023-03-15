fun main() {
    one()

    var names = arrayOf("Susan","Blaire","Talia","Antonilla","Mwamkinga","Tanzania","Australia")


    three(6)
    three(40)
    three(17)
    three(1)
    three(24)

    four()


}
//1.Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun one (){

    for (nums in 1..100 )
        if (nums % 2 !== 0){
            println(nums)
        }

}

//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)

fun two (names:Array<String>):Int{
    var x = 0
    for(name in names)
        if (name.length > 5){
            return x++
        }



}

//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)


fun three(age:Int){
       if(age > 6){
           println("milk")
       }
    else if (age in 7..14){
        println("Fanta Orange")
       }
    else{
        println("Cocacola")
       }
}


//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun four(){
    for (nums in 1..100 )
    if(nums % 3 == 0 && nums % 5 == 0 ){
        println("FizzBuzz")
    }
       else if (nums % 3 == 0){
            println("Fizz")
        }
        else if (nums % 5 == 0){
            println("Buzz")
        }

        else{
            println(nums)
        }
}
