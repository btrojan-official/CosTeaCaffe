package com.example.costeacaffe

import java.io.Serial


data class Local(
    val name: String,
    val desc: String,
    val img: Int
) {
    companion object {
        val locals = listOf(
            Local("Starbucks", "Starbucks to międzynarodowa sieć kawiarni oferująca szeroki wybór napojów kawowych, herbaty oraz przekąsek. Znana jest z wysokiej jakości kawy i przytulnego wnętrza.", R.drawable.local),
            Local("McDonald's", "McDonald's to globalna sieć restauracji szybkiej obsługi, specjalizująca się w hamburgerach, frytkach, napojach i innych produktach. Jest jednym z największych i najbardziej rozpoznawalnych łańcuchów restauracji na świecie.", R.drawable.local),
            Local("Burger King", "Burger King to międzynarodowa sieć restauracji szybkiej obsługi, znana głównie z hamburgerów, frytek i innych produktów. Jest znany z promocji i innowacji w menu.", R.drawable.local),
            Local("KFC", "KFC, znane także jako Kentucky Fried Chicken, to międzynarodowa sieć restauracji szybkiej obsługi znana z kurczaka smażonego na sposób Kentucky. Menu obejmuje różnorodne produkty z kurczaka, frytki, sałatki i inne przekąski.", R.drawable.local),
            Local("Subway", "Subway to amerykańska sieć restauracji szybkiej obsługi, znana głównie z podgrzewanych kanapek, sałatek i wrapów. Klienci mogą wybierać spośród różnych rodzajów chleba, mięsa, warzyw i sosów.", R.drawable.local),
            Local("Pizza Hut", "Pizza Hut to międzynarodowa sieć restauracji specjalizująca się w pizzy, makaronach i innych włoskich daniach. Jest znana z różnorodności w menu i dostarczania zamówień na wynos lub dostawy.", R.drawable.local),
            Local("Domino's Pizza", "Domino's Pizza to międzynarodowa sieć restauracji specjalizująca się w pizzy, makaronach i przekąskach. Jest znana z szybkiej dostawy i szerokiego wyboru pizzy.", R.drawable.local),
            Local("Taco Bell", "Taco Bell to amerykańska sieć restauracji szybkiej obsługi, znana z meksykańskich przekąsek, takich jak tacos, burritos i quesadillas. Menu obejmuje różnorodne kombinacje składników.", R.drawable.local),
            Local("Wendy's", "Wendy's to międzynarodowa sieć restauracji szybkiej obsługi, znana głównie z hamburgerów, frytek i napojów. Jest znany z jakości składników i świeżości potraw.", R.drawable.local),
            Local("Dunkin' Donuts", "Dunkin' Donuts to amerykańska sieć kawiarni i sklepów z ciastami, znana głównie z donutów, kawy i innych napojów. Jest znany z różnorodności smaków donutów i kawowych specjałów.", R.drawable.local)
        )
    }

    override fun toString(): String {
        return this.name
    }
}