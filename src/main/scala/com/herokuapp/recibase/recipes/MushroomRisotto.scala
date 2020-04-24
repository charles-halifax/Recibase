package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.{Ingredient, Recipe}

object MushroomRisotto extends
Recipe(
  "Mushroom Risotto",
  "mushroom-risotto",
  None,
  None,
  None,
  List(
    Ingredient("Chestnut mushrooms", Some("250g"), Some("sliced")),
    Ingredient("Dried mushrooms", Some("handful"), None, Some("Porcini, shiitake, wild, etc")),
    Ingredient("Arborio rice", Some("1 cup")),
    Ingredient("White wine", Some("A decent slosh")),
    Ingredient("Black pepper"),
    Ingredient("Stock cube", Some("1")),
    Ingredient("Water", Some("700ml"), Some("boiling"), Some("Might need to add more")),
    Ingredient("Stilton", Some("100g")),
    Ingredient("Butter", Some("knob"))
  ),
  List(
    "Dissolve the stock cube in the boiling water and add the dried mushrooms, wine and black pepper.",
    "Melt the butter in a wide pan and cook the mushrooms over a medium heat. Set aside.",
    "Meanwhile add the arborio rice to a second pan and gradually stir in the stock, mixing often and not adding more until the previous lot of water has been absorbed.",
    "When the rice is tender, add it to the mushroom pan and mix thoroughly.",
    "Mix in the stilton and allow it to melt through the risotto."
  )
)