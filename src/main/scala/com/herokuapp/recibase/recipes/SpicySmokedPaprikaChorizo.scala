package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.{Ingredient, Recipe, Tag}

object SpicySmokedPaprikaChorizo extends Recipe {
  val name = "Spicy Smoked Paprika Chorizo"
  val permalink = "spicy-smoked-paprika-chorizo"

  override val tags = Set(Tag.Spicy, Tag.Scales, Tag.BetterNextDay, Tag.Slow)

  override val source: Option[String] = Some("Kit's Dad")
  override val notes: Option[String] = Some(
    """If your chorio is very spicy you might not need any chilli flakes. Similarly if you use chilli oil.
This dish tastes best if you leave it to cool then reheat it.
You could try serving this dish over grilled aubergines."""
  )

  val ingredients = List(
    Ingredient(
      "Spanish Chorizo",
      Some("225g"),
      None,
      Some("ideally good quality")
    ),
    Ingredient("Red Onions", Some("4"), Some("finely diced")),
    Ingredient(
      "Garlic Cloves",
      Some("Several"),
      Some("fined diced or crushed in a press")
    ),
    Ingredient("Pointed Red Pepper", Some("1"), Some("sliced")),
    Ingredient("Carrots", Some("2-3"), Some("diced")),
    Ingredient(
      "Fresh Spinach",
      Some("100g"),
      Some("torn"),
      Some("frozen would also work")
    ),
    Ingredient("Tinned Tomatoes", "3"),
    Ingredient("Tomato Paste", "4 Inches"),
    Ingredient(
      "Red Wine",
      Some("10-20CL"),
      None,
      Some("something in the \u00a35-10 range")
    ),
    Ingredient("Smoked Paprika", "Several teaspoons"),
    Ingredient("Olive Oil"),
    Ingredient("Chilli Flakes"),
    Ingredient(
      "Honey",
      Some("2 tsp"),
      None,
      Some("anything but that Rowse shit")
    ),
    Ingredient("Dried Oregano", "1 tbsp"),
    Ingredient(
      "Stick of Cinnamon",
      Some("1"),
      None,
      Some("Ground also works")
    ),
    Ingredient("Pitted Black Olives", Some("6 tbsp"), Some("halved")),
    Ingredient("Whole Cloves", Some("2-3"), None, Some("Optional")),
    Ingredient("Mascarpone", Some("2 tbsp"), None, Some("Optional"))
  )
  val method = List(
    "Cut the chorizo into half centimeter thick semi-circles.",
    "Add the oil and smoked paprika to a wide pan.",
    "Cook the carrots on a medium to high heat for a minute or so. Stir regularly to avoid sticking.",
    "Add the red onions, pepper and garlic then cook for minute.",
    "Stir in the chorizo, peppers and tomato paste then cook for a few more minutes.",
    "Add the pasata, tinned tomatoes, cloves, chilli flakes, red wine, oregano, cinamon stick, and honey. If the pan is looking full then wait until the mixure has reduced before adding the rest of the tinned tomatoes/wine.",
    "Wait until bubbling then turn down the heat and simmer for at least 20 minutes.",
    "Stir in spinach and mascarpone",
    "Serve with pasta"
  )
}
