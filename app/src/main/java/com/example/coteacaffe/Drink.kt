package com.example.coteacaffe

class Drink (
    val name: String,
    val description: String,
    val img: Int
){
    companion object {
        val drinks = listOf(
            Drink("latte", "Latte to włoski napój kawowy przyrządzany z espresso i gorącego spienionego mleka.", R.drawable.latte),
            Drink("cappuccino", "Cappuccino to klasyczna włoska kawa, złożona z równych części espresso, gorącego mleka i spienionego mleka.", R.drawable.latte),
            Drink("espresso", "Espresso to mocna kawa parzona z drobno zmielonych ziaren kawy, znana z intensywnego smaku.", R.drawable.latte),
            Drink("americano", "Americano to kawa przyrządzana przez dodanie gorącej wody do pojedynczej porcji espresso.", R.drawable.latte),
            Drink("macchiato", "Macchiato to espresso z niewielką ilością spienionego mleka na wierzchu.", R.drawable.latte),
            Drink("mocha", "Mocha to kawa czekoladowa, przyrządzana z espresso, gorącego mleka i czekolady.", R.drawable.latte),
            Drink("flat white", "Flat white to kawa z espresso i mikrospienionym mlekiem, popularna w Australii i Nowej Zelandii.", R.drawable.latte),
            Drink("irish coffee", "Irish coffee to kawa z dodatkiem irlandzkiej whisky, cukru i śmietany.", R.drawable.latte),
            Drink("affogato", "Affogato to deser składający się z gałki lodów waniliowych zalanych gorącym espresso.", R.drawable.latte),
            Drink("cold brew", "Cold brew to kawa przygotowywana przez długie parzenie w zimnej wodzie, co nadaje jej łagodniejszy smak.", R.drawable.latte),
            Drink("matcha latte", "Matcha latte to napój przyrządzany z japońskiej sproszkowanej zielonej herbaty (matcha) i gorącego mleka.", R.drawable.latte),
            Drink("chai latte", "Chai latte to napój z indyjskiej herbaty masala chai i spienionego mleka.", R.drawable.latte),
            Drink("english breakfast tea", "English Breakfast Tea to klasyczna mieszanka czarnych herbat, często podawana z mlekiem i cukrem.", R.drawable.latte),
            Drink("earl grey", "Earl Grey to czarna herbata aromatyzowana olejkiem z bergamotki, znana ze swojego charakterystycznego smaku.", R.drawable.latte),
            Drink("green tea", "Green tea to popularna herbata o delikatnym, świeżym smaku, znana z licznych korzyści zdrowotnych.", R.drawable.latte),
            Drink("oolong tea", "Oolong tea to półfermentowana herbata, która łączy cechy zielonej i czarnej herbaty.", R.drawable.latte),
            Drink("white tea", "White tea to delikatna herbata z młodych pąków i liści krzewu herbacianego, znana ze swojego łagodnego smaku.", R.drawable.latte),
            Drink("herbal tea", "Herbal tea to napar z ziół, owoców, kwiatów lub innych części roślin, często bezkofeinowy.", R.drawable.latte),
            Drink("peppermint tea", "Peppermint tea to orzeźwiający napar z liści mięty pieprzowej, znany z właściwości uspokajających i trawiennych.", R.drawable.latte),
            Drink("chamomile tea", "Chamomile tea to kojący napar z kwiatów rumianku, często stosowany jako środek na bezsenność.", R.drawable.latte),
            Drink("lemon tea", "Lemon tea to herbata z dodatkiem soku z cytryny, znana z orzeźwiającego smaku.", R.drawable.latte),
            Drink("ginger tea", "Ginger tea to pikantny napar z korzenia imbiru, znany ze swoich właściwości przeciwzapalnych i trawiennych.", R.drawable.latte),
            Drink("jasmine tea", "Jasmine tea to zielona herbata aromatyzowana kwiatami jaśminu, znana ze swojego kwiatowego aromatu.", R.drawable.latte),
            Drink("pu-erh tea", "Pu-erh tea to fermentowana herbata chińska, znana z głębokiego, ziemistego smaku.", R.drawable.latte),
            Drink("honeybush tea", "Honeybush tea to słodki, miodowy napar z południowoafrykańskiej rośliny, często stosowany jako alternatywa dla herbaty rooibos.", R.drawable.latte),
            Drink("rooibos tea", "Rooibos tea to czerwona herbata z południowej Afryki, znana z łagodnego, słodkiego smaku i braku kofeiny.", R.drawable.latte),
            Drink("yerba mate", "Yerba mate to tradycyjny napój południowoamerykański przyrządzany z liści ostrokrzewu paragwajskiego, znany z pobudzających właściwości.", R.drawable.latte),
            Drink("hibiscus tea", "Hibiscus tea to napar z suszonych kwiatów hibiskusa, o jasnoczerwonym kolorze i kwaskowatym smaku.", R.drawable.latte),
            Drink("rosehip tea", "Rosehip tea to napar z owoców dzikiej róży, bogaty w witaminę C i znany ze swojego owocowego smaku.", R.drawable.latte),
            Drink("lavender tea", "Lavender tea to kojący napar z kwiatów lawendy, znany z relaksujących właściwości.", R.drawable.latte)
        )
    }

    override fun toString(): String {
        return name
    }
}