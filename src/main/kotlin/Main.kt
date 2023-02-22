fun main() {
    cities("Nairobi","Dodoma","Kampala","Kigali")
    africaCities()
    arrayOfNumber()
    println(myNames("Maureen","Akinyi","Ougo"))

}
//Question One
fun cities(name:String, name2:String,name3:String,name4:String){
    var nameOfCity = arrayOf(name,name2,name3,name4)
    println(nameOfCity.contentToString())
}
//Question Two
fun africaCities(){
   var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { city ->println(city.capitalize())}

}
//Question 4
fun arrayOfNumber(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum =numbers[1]+numbers[4]
    println(sum)
    println(numbers.indexOf(158))
     numbers.sort()
    println(numbers.contentToString())


}
//question4
fun myNames(name1: String,name2:String,name3: String) :String{
    var names =arrayOf(name1,name2,name3)
    return names.contentToString()
}


