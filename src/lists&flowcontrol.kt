fun main() {
  println(isEven(8))
    println(isEven(7))

    var hygienePdt=Product("Detergent",5.5f,5000,"hygiene")
    hygienePdt.product("Sunlight")
    hygienePdt.product("Ariel")
    hygienePdt .product("Magic")
    var groceriesPdt=Product(name = "Vegetable",Weight = 2f,price = 2000,category = "groceries")
    groceriesPdt.product(pdName = "Greens")
    groceriesPdt.product(pdName = "Eggplants")
    var otherPdt=Product("Stationary",5f,5000,"others")
    otherPdt.product("Book")
    otherPdt.product("Pen")

    println(charEven("banana"))
    println(charEven("environment"))

    println(names(arrayOf("Elizabeth","Mercy","Hesed", "Faith", "Part","Annettte","Bint","Matthews")))
}
fun isEven(num:Int):String{
    return if (num%2==0){
        "true"
    }
    else{
        "false"
    }
}
data class Product(var name:String, var Weight:Float, var price:Int, var category:String ){

    fun product(pdName:String){
        var groceries=mutableListOf<String>()
        var hygiene=mutableListOf<String>()
        var other=mutableListOf<String>()
        when (category){
            "groceries"-> groceries.add(pdName)
            "hygiene"-> hygiene.add(pdName)
            "other"->other.add(pdName)
        }
        println("$pdName :$category")
    }
}
fun charEven(word:String):String{
    var newWord=""
    for(characters in word){
        if (word.indexOf(characters)%2==0){
            newWord+=characters
        }
    }
    return newWord
}

fun names(name:Array<String>):MutableList<String>{
    var evenNames=mutableListOf<String>()

    name.forEach{ element->
        if (element.length%2==0){
            evenNames.add(element)
        }
    }
    return evenNames
}