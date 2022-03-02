package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.model.{Ingredient, Recipe, Tag}

object CoconutLimeDahl extends Recipe {
  val name = "Coconut Lime Dahl"
  val permalink = "coconut-lime-dahl"

  override val source: Option[String] = Some(
    "https://greedypanda.co.uk/2021/05/coconut-lime-dal/"
  )
  override val notes: Option[String] =
    Some(
      """Serves 4
        |
        |You can cook this in a rice cooker, using the slow cooker setting, although the lentils may degrade more.
        |
        |The garlic will have a stronger flavour than normal, because it is boiled rather than cooked. Consider adjusting quantity.""".stripMargin
    )
  override val tags = Set(Tag.Vegan, Tag.Spicy, Tag.LowEffort, Tag.Scales)

  val ingredients = List(
    Ingredient("Lentils", "450g"),
    Ingredient("Turmeric", "1 tsp"),
    Ingredient("Garlic", "2 Cloves", "Diced"),
    Ingredient("Coconut Milk", "1 Tin"),
    Ingredient("Boiling Water", "1200ml"),
    Ingredient("Onion", "Half", "Chopped"),
    Ingredient("Cumin", "1 tsp"),
    Ingredient("Lime", "1", "Juiced and zested"),
    Ingredient("Spinach", "9 handfuls"),
    Ingredient("Oil")
  )
  val method = List(
    "Add the lentils, turmeric, garlic, coconut milk and boiling water to a large pan.",
    "The water back to the boil, stir, then gently simmer for 40m.",
    "Meanwhile, oil a frying pan and gently cook the onions in cumin for a few minutes.",
    "Take the frying pan off the heat and leave aside for later.",
    "Once the lentils have cooked, mix in the onions, baby spinach and lime juice.",
    "Serve garnished with lime zest."
  )
}
