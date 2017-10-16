object GCD {
  
  //fun. to calculate the gcd of the 2 numbers
  def gcd(a:Int, b:Int): Int = {
    if(b==0) a else gcd(b,a%b)
  }
  
 //main
  def main(args:Array[String]) : Unit = {
    println("gcd Application for the two no")
    
    //1st input
    println("your first no please...")
    var input1 = readInt()
    
    //2ndinput
    println("your second no please...")
    var input2 = readInt()
    
    //Calling gcd fun. 
    println(s"GCD of $input1 and $input2 is: "+ gcd(input1,input2))
    
  }
}