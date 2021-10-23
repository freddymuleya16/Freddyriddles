package com.example.freddysriddles

object Constants {

    const val USER_NAME: String = "User_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answer"
    const val LEVEL: String = "level"
    const val NEXTLEVEL: String = "nextLevel"
    const val CURRENTLEVEL: String = "current_level"


    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "This has beautiful marble-white walls and beautiful gold. Many thieves, like yourself, want the gold. The thing has no doors or windows. However, it breaks easily to reveal the gold. It is a what?",
            R.drawable.riddle,
            "Old palace",
            "Museum attic",
            "Egg",
            "Ball",
            3
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "Adriana's mom had four kids: Marta, Anna, Justina...",
            R.drawable.riddle,
            "Annabell",
            "Chloe",
            "Adriana",
            "Cleopatra",
            3
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "A man pushed his car past a hotel, only to realize he was bankrupt. How did he figure this out?",
            R.drawable.riddle,
            "He was mugged as he pushed the car into the parking lot",
            "He was playing a board game",
            "His pockets were empty",
            "There was a text alert",
            2
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "If there are 100000000 bricks on a plane, and one falls off, how many are left?",
            R.drawable.riddle,
            "99999999",
            "100000000",
            "1",
            "0",
            1
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "The dead bodies of Bob and Ann are lying on the floor. They are naked and wet. Their bodies have absolutely no cuts. The windows are open to the house they live in, and it is stormy. How did they die?",
            R.drawable.riddle,
            "Struck by lightning",
            "Poisoned",
            "Drowned",
            "They aren't human",
            4
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "Imagine you're in a dark room that is perfectly empty with nothing in it. There are no windows or doors. What is the easiest way to escape?",
            R.drawable.riddle,
            "Stop imagining you are in that room",
            "Die",
            "Wait",
            "Dig a hole in the ground with your bare hands",
            1
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "A woman is walking, then suddenly dies in the middle of the street. How?",
            R.drawable.riddle,
            "She was run over by a car",
            "She was hit with a brick",
            "She was shot",
            "She was poisoned",
            2
        )

        questionsList.add(que7)

        val que8 = Question(
            8,
            "If you look you cannot see me. And if you see me you cannot see anything else. I can make anything you want happen, but later everything goes back to normal. What am I?",
            R.drawable.riddle,
            "Air",
            "Nothing",
            "Imagination",
            "Other",
            3
        )

        questionsList.add(que8)


        val que9 = Question(
            9,
            "A man is going to a party. Along the way he meets a man with seven wives. Each of the wives as seven bags. Each of the bags have seven cats. Each of the cats has seven kittens. Each of the kittens has seven toys. How many people are going to the party?",
            R.drawable.riddle,
            "1",
            "0",
            "16,807",
            "9",
            1
        )

        questionsList.add(que9)


        val que10 = Question(
            10,
            "What walks on four legs in the morning, two in the afternoon and three in the evening?",
            R.drawable.riddle,
            "A robot with special programming",
            "A human",
            "A monkey who gets his leg cut off, grows them back, then loses them again",
            "Someone demented",
            2
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions2(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)

        return questionsList
    }

    fun getQuestions3(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Which South African football club is know as 'Lidoda Duvha'",
            R.drawable.dstvpremiership,
            "Black Leopards", "Bloemfontein Celtic",
            "Baroka FC", "Chippa United", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Which South African football club is know as 'Abafana Bes’thende'?",
            R.drawable.dstvpremiership,
            "Cape Town City", "Golden Arrows",
            "Kaizer Chiefs", "Highlands Park", 2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Which South African football club is know as 'Abana Bokuthula Noxolo'?",
            R.drawable.dstvpremiership,
            "Mamelodi Sundowns", "Maritzburg United",
            "Kaizer Chiefs", "Highlands Park", 3
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Which South African football club is know as 'The Sea Robbers'?",
            R.drawable.dstvpremiership,
            "Orlando Pirates", "Polokwane City",
            "Maritzburg United", "Stellenbosch FC", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Which South African football club is know as 'Matsatsantsa a Pitori'?",
            R.drawable.dstvpremiership,
            "SuperSport United", "Polokwane City",
            "Mamelodi Sundowns", "Chippa United", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Which South African football club is know as 'Hebe Usuthu Olumabhesh’ ankone!'?",
            R.drawable.dstvpremiership,
            "Bidvest Wits", "Bloemfontein Celtic",
            "AmaZulu", "none of these", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Which South African football club is know as 'Siwelele Samasokolara'?",
            R.drawable.dstvpremiership,
            "Bloemfontein Celtic", "Baroka FC",
            "Highlands Park", "Stellenbosch FC", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Which South African football club is know as 'The Team of Choice'?",
            R.drawable.dstvpremiership,
            "Orlando Pirates", "Stellenbosch FC",
            "Highlands Park", "Maritzburg United", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Which South African football club is know as 'Rise & Shine'?",
            R.drawable.dstvpremiership,
            "Highlands Park", "Kaizer Chiefs",
            "SuperSport United", "Polokwane City", 4
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Which South African football club is know as 'Chilly Boys'?",
            R.drawable.dstvpremiership,
            "Chippa United", "Kaizer Chiefs",
            "Highlands Park", "Stellenbosch FC", 1
        )

        questionsList.add(que10)

        return questionsList
    }

    fun getQuestions4(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "I came, I saw, I conquered.",
            R.drawable.riddle,
            "Julius Caesar",
            "Mahatma Gandhi",
            "Napoleon Bonaparte",
            "Ronald Reagan",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "An eye for an eye only ends up making the whole world blind.",
            R.drawable.riddle,
            "Winston Churchill",
            "Martin Luther King Jr",
            "Mahatma Gandhi",
            "Friedrich Nietzsche",
            3
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "There are no facts, only interpretations.",
            R.drawable.riddle,
            "Nelson Mandela",
            "Friedrich Nietzsche",
            "Franklin Delano Roosevelt",
            "John F. Kennedy",
            2
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "All men by nature desire knowledge.",
            R.drawable.riddle,
            "Aristotle",
            "Mother Teresa",
            "Franklin Delano Roosevelt",
            "Martin Luther King Jr",
            1
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "Ask not what your country can do for you - ask what you can do for your country.",
            R.drawable.riddle,
            "Friedrich Nietzsche",
            "Martin Luther King Jr",
            "Franklin Delano Roosevelt",
            "John F. Kennedy",
            4
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "I have a dream that my four little children will one day live in a nation where they will not be judged by the color of their skin, but by the content of their character.",
            R.drawable.riddle,
            "Nelson Mandela",
            "Franklin Delano Roosevelt",
            "Martin Luther King Jr",
            "Friedrich Nietzsche",
            3
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "After climbing a great hill, one only finds that there are many more hills to climb.",
            R.drawable.riddle,
            "Ronald Reagan",
            "Nelson Mandela",
            "Mother Teresa",
            "Martin Luther King Jr",
            2
        )

        questionsList.add(que7)

        val que8 = Question(
            8,
            "Being unwanted, unloved, uncared for, forgotten by everybody - I think that is a much greater hunger, a much greater poverty than the person who has nothing to eat.",
            R.drawable.riddle,
            "Mahatma Gandhi",
            "Mother Teresa",
            "Julius Caesar",
            "Other",
            2
        )

        questionsList.add(que8)


        val que9 = Question(
            9,
            "I am ready to meet my Maker. Whether my Maker is prepared for the ordeal of meeting me is another matter.",
            R.drawable.riddle,
            "Winston Churchill",
            "Mahatma Gandhi",
            "Ronald Reagan",
            "Aristotle",
            1
        )

        questionsList.add(que9)


        val que10 = Question(
            10,
            "The only thing we have to fear is fear itself",
            R.drawable.riddle,
            "Nelson Mandela",
            "Franklin Delano Roosevelt",
            "Julius Caesar",
            "Napoleon Bonaparte",
            2
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions5(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            " The era of Apartheid lasted from ________ to ______(year)",
            R.drawable.riddle,
            "1958 – 1994",
            "1948 – 1994",
            "1948 – 1990",
            "1948 – to date",
            2
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "In which year was Nelson Mandela released?",
            R.drawable.riddle,
            "1990",
            "1991",
            "1992",
            "1993",
            1
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "How many years had he(Nelson Mandela) spent in prison?",
            R.drawable.riddle,
            "30 years",
            "27 months",
            "26 years",
            "27 years",
            4
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "Why did 20 000 school children march in protest in Soweto 1976?",
            R.drawable.riddle,
            "Free education for all",
            "For free unrestricted wifi",
            "About the use of Afrikaans in their schools",
            "To end apartheid and bring freedom to South Africa",
            3
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "Name the founder of the Black Consciousness Movement who died while in detention in 1977.",
            R.drawable.riddle,
            "Robert Sobukwe",
            "Martin Luther King Jr",
            "Sophie Williams",
            "Steve Biko",
            4
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "Who was awarded the Nobel Peace Prize in 1984?",
            R.drawable.riddle,
            "Nelson Mandela",
            "Desmond Tutu",
            "Ruth First",
            "Samora Machel",
            2
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "What was the armed wing of the ANC called?",
            R.drawable.riddle,
            "Umkhonto we Sizwe",
            "Nelson Mandela",
            "Umkhonto wethu",
            "Armed ANC",
            1
        )

        questionsList.add(que7)

        val que8 = Question(
            8,
            "In 1976 an iconic image of a 13 year boy who died during these riots was published around the world. Name this boy?",
            R.drawable.riddle,
            "Hector Pietersen",
            "Julius Malema",
            "Nelson Mandela",
            "Other",
            1
        )

        questionsList.add(que8)


        val que9 = Question(
            9,
            "After a day of demonstrations against Pass Laws 69 people were killed on 21 March 1960. What did this day become known as?",
            R.drawable.riddle,
            "Marikana Massacre",
            "Human Rights Day",
            "Sharpville Massacre",
            "Freedom Day",
            3
        )

        questionsList.add(que9)


        val que10 = Question(
            10,
            "Name the leader of Mozambique who was killed in a plane crash in 1986.",
            R.drawable.riddle,
            "Nelson Mandela",
            "Samora Machel",
            "Robert Sobukwe",
            "Desmond Tutu",
            2
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions6(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            R.drawable.riddle,
            "A keyboard",
            "A computer",
            "A calculator",
            "A wheel",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "Take off my skin -- I won't cry, but you will! What am I?",
            R.drawable.riddle,
            "Garlic",
            "An apple",
            "An orange",
            "An Onion",
            4
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "What has four eyes but cannot see?",
            R.drawable.riddle,
            "A dog",
            "Mississippi",
            "A cat",
            "A lion",
            2
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "What goes up white and comes down yellow?",
            R.drawable.riddle,
            "An egg.",
            "A cake.",
            "An omelet.",
            "A salad.",
            1
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "You answer me, although I never ask you questions. What am I?",
            R.drawable.riddle,
            "A telephone.",
            "A TV",
            "A radio",
            "A remote control",
            1
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "If you have me, you want to share me. If you share me, you haven't got me. What am I?",
            R.drawable.riddle,
            "A book",
            "A poem",
            "A secret",
            "A letter",
            3
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "What kind of room has no doors or windows?",
            R.drawable.riddle,
            "A mushroom",
            "A flower",
            "A fruit",
            "A tree",
            1
        )

        questionsList.add(que7)

        val que8 = Question(
            8,
            "What has an eye but can not see?",
            R.drawable.riddle,
            "A needle",
            "A knife",
            "A spoon",
            "A stick",
            1
        )

        questionsList.add(que8)


        val que9 = Question(
            9,
            "Who makes it, has no need of it.Who buys it, has no use for it.Who uses it can neither see nor feel it.What is it?",
            R.drawable.riddle,
            "A boat",
            "A house",
            "A car",
            "A coffin",
            4
        )

        questionsList.add(que9)


        val que10 = Question(
            10,
            "What is greater than God,more evil than the devil,the poor have it,the rich need it,and if you eat it, you'll die?",
            R.drawable.riddle,
            "Nothing",
            "Money",
            "Patience",
            "Love",
            1
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions7(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
                1, "Which Primier League football club is know as 'The Gunners'",
                R.drawable.premierleague,
                "Aston Villa F.C", "Crystal Palace F.C",
                "A.F.C. Bournemouth", "Arsenal F.C", 4
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
                2, "Which Primier League football club is know as 'The Villans'",
                R.drawable.premierleague,
                "Everton F.C", "Aston Villa F.C",
                "A.F.C. Bournemouth", "Leicester City F.C", 2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
                3, "Which Primier League football club is know as 'The Blues'",
                R.drawable.premierleague,
                "Everton F.C", "Crystal Palace F.C",
                "Chelsea F.C", "Leicester City F.C", 3
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
                4, "Which Primier League football club is know as 'The Toffees'",
                R.drawable.premierleague,
                "Everton F.C", "Manchester United F.C",
                "Liverpool F.C", "Leicester City F.C", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
                5, "Which Primier League football club is know as 'The Foxes'",
                R.drawable.dstvpremiership,
                "Leicester City F.C", "Liverpool F.C",
                "Norwich City F.C", "Manchester United F.C", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
                6, "Which Primier League football club is know as 'The Reds'",
                R.drawable.premierleague,
                "Manchester United F.C", "Norwich City F.C",
                "Liverpool F.C", "none of these", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
                7, "Which Primier League football club is know as 'The Red Devils'",
                R.drawable.premierleague,
                "Manchester United F.C", "Manchester City F.C",
                "Newcastle United F.C", "Southampton F.C", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
                8, "Which Primier League football club is know as 'The Citizens'",
                R.drawable.premierleague,
                "Southampton F.C", "Manchester City F.C",
                "Tottenham Hotspur F.C", "Newcastle United F.C", 2
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
                9, "Which Primier League football club is know as 'The Magpies'",
                R.drawable.premierleague,
                "Crystal Palace F.C", "Kaizer Chiefs",
                "Tottenham Hotspur F.C", "Newcastle United F.C", 4
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
                10, "Which Primier League football club is know as 'The Hammers'",
                R.drawable.premierleague,
                "West Ham United F.C", "Burnley F.C",
                "Wolverhampton Wanderers F.C", "Tottenham Hotspur F.C", 1
        )

        questionsList.add(que10)

        return questionsList
    }

    fun getQuestions8(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que5)

        val que6 = Question(
                6,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que6)

        val que7 = Question(
                7,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que7)

        val que8 = Question(
                8,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que8)


        val que9 = Question(
                9,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que9)


        val que10 = Question(
                10,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que10)
        return questionsList

    }
    fun getQuestions9(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que5)

        val que6 = Question(
                6,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que6)

        val que7 = Question(
                7,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que7)

        val que8 = Question(
                8,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que8)


        val que9 = Question(
                9,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que9)


        val que10 = Question(
                10,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions10(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "How is COVID-19 passed on?",
            R.drawable.covid,
            "Through droplets that come from your mouth and nose when you cough or breathe out",
            "In sexual fluids, including semen, vaginal fluids or anal mucous",
            "By drinking unclean water",
            "All of the above",
            1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What are the common symptoms of COVID-19? ",
            R.drawable.covid,
            "A new and continuous cough", "Fever",
            "Tiredness", "All of the above", 4
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Can you always tell if someone has COVID-19?",
            R.drawable.covid,
            "No – not everyone with COVID-19 has symptoms",
            "Yes – it will be obvious, a person with COVID-19 coughs a lot",
            "Yes – you can tell just by where a person comes from, their race and ethnicity", "Maybe", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Can washing your hands protect you from COVID-19?",
            R.drawable.covid,
            "Yes – but only if you use a strong bleach",
            "Yes – normal soap and water or hand sanitizer is enough",
            "No – Washing your hands doesn’t stop COVID-19",
            "Maybe", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Which of the following people is COVID-19 more dangerous for?",
            R.drawable.covid,
            "Children", "Older people – especially those aged 70 and above",
            "Rich people", "European people", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Are people living with HIV always more at risk? ",
            R.drawable.covid,
            "Yes – people with HIV have weaker immune systems", "No – people who adhere to antiretroviral treatment (ART) and have a high CD4 count aren’t more at risk",
            "Both of the above", "none of these", 2
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "When should fabric face masks be worn?",
            R.drawable.covid,
            "On public transport", "In confined or crowded spaces",
            "In small shops", "All of the above", 4
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Can COVID-19 be cured? ",
            R.drawable.covid,
            "Yes – Hot drinks can cure COVID-19", "No – COVID-19 is a death sentence",
            "No – but most people get better by themselves", "Maybe", 3
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Which of the following is an example of physical distancing?",
            R.drawable.covid,
            "You stop going to crowded places and visiting other people’s houses", "All of these",
            "You stop talking to the people you live with", "You stop speaking to your friends on the phone", 1
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "How can people living with HIV protect themselves from COVID-19?",
            R.drawable.covid,
            "Wash their hands regularly and follow the physical distancing advice", "Exercise regularly, eat well and look after their mental health",
            "Keep taking their antiretroviral treatment", "All of the above", 4
        )

        questionsList.add(que10)

        return questionsList
    }

    fun getQuestions11(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What can condoms protect you from?",
            R.drawable.condom,
            "Pregnancy", "STIs",
            "HIV", "All of the above", 4        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "How many times can the same male condom be used?",
            R.drawable.condom,
            "More than once if they're washed", "Only once",
            "More than once if it's with the same person", "Twice", 2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "To increase your protection when using condoms you can...",
            R.drawable.condom,
            "Use more than one condom at the same time",
            "Use another form of protection at the same time, such as spermicide or PrEP",
            "Wash inside the vagina or anus immediately before and after sex", "All of the above", 2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "If you're using a latex condom what type of lube should you use?",
            R.drawable.condom,
            "Any type of lube is fine", "Oil-based",
            "Water-based", "Condoms come pre-lubricated so you don't need to use any extra lube", 3
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "A condom might not work if...",
            R.drawable.condom,
            "It is past the use-by date", "The wrapper is open or torn",
            "You put it on 'inside-out'", "All of the above", 4
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "If you are sharing a sex toy such as a vibrator, is it necessary to apply a new condom to it?",
            R.drawable.condom,
            "Yes, for each person", "Yes, but just at the beginning - you can all use the same one",
            "No, it will be fine without a condom", "Toys don't need condom", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Condoms are one size fits all...",
            R.drawable.condom,
            "True", "False",
            "Neither", "Maybe", 2
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Do you have to go to a doctor or sexual health clinic to get a condom?",
            R.drawable.condom,
            "Yes", "No",
            "Maybe", "Pull out", 2
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Which South African football club is known as 'Rise & Shine'?",
            R.drawable.condom,
            "Neatly open the wrapper with a pair of scissors", "Pinch the air out of the top",
            "Make sure the rim of the condom is on the inside", "All of the above", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Which of the following are types of condoms that you can buy?",
            R.drawable.condom,
            "Flavoured condoms", "Ribbed condoms",
            "Extra-thin condoms", "All of the above", 1
        )

        questionsList.add(que10)

        return questionsList
    }

    fun getQuestions12(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que5)

        val que6 = Question(
                6,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que6)

        val que7 = Question(
                7,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que7)

        val que8 = Question(
                8,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que8)


        val que9 = Question(
                9,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que9)


        val que10 = Question(
                10,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions13(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que5)

        val que6 = Question(
                6,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que6)

        val que7 = Question(
                7,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que7)

        val que8 = Question(
                8,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que8)


        val que9 = Question(
                9,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que9)


        val que10 = Question(
                10,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions14(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que5)

        val que6 = Question(
                6,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que6)

        val que7 = Question(
                7,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que7)

        val que8 = Question(
                8,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que8)


        val que9 = Question(
                9,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que9)


        val que10 = Question(
                10,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions15(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que5)

        val que6 = Question(
                6,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que6)

        val que7 = Question(
                7,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que7)

        val que8 = Question(
                8,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que8)


        val que9 = Question(
                9,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que9)


        val que10 = Question(
                10,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions16(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que5)

        val que6 = Question(
                6,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que6)

        val que7 = Question(
                7,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que7)

        val que8 = Question(
                8,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que8)


        val que9 = Question(
                9,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que9)


        val que10 = Question(
                10,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions17(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que5)

        val que6 = Question(
                6,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que6)

        val que7 = Question(
                7,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que7)

        val que8 = Question(
                8,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que8)


        val que9 = Question(
                9,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que9)


        val que10 = Question(
                10,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions18(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que5)

        val que6 = Question(
                6,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que6)

        val que7 = Question(
                7,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que7)

        val que8 = Question(
                8,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que8)


        val que9 = Question(
                9,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que9)


        val que10 = Question(
                10,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions19(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que5)

        val que6 = Question(
                6,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que6)

        val que7 = Question(
                7,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que7)

        val que8 = Question(
                8,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que8)


        val que9 = Question(
                9,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que9)


        val que10 = Question(
                10,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que10)
        return questionsList

    }

    fun getQuestions20(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                4
        )

        questionsList.add(que5)

        val que6 = Question(
                6,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que6)

        val que7 = Question(
                7,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que7)

        val que8 = Question(
                8,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                1
        )

        questionsList.add(que8)


        val que9 = Question(
                9,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                3
        )

        questionsList.add(que9)


        val que10 = Question(
                10,
                "",
                R.drawable.riddle,
                "",
                "",
                "",
                "",
                2
        )

        questionsList.add(que10)
        return questionsList

    }


}