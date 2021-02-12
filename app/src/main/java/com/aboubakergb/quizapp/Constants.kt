package com.aboubakergb.quizapp

object Constants{
    // this val is the key in intent
    const val USER_NAME :String ="User_name"
    const val TOTAL_QUESTIONS :String ="total_questions"
    const val CORRECT_ANSWER  :String ="correct_answer"


    fun getQuestion() : ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        //1
        val que1 = Question(1," من يتحمل العطش أكثر من الجمل؟",

            "الفهد",
            "السلحفاة",
            " الزرافة",
            "الفيل",
            3
            )
        questionsList.add(que1)

        // 2
        val que2 = Question(2,
            "من هي أول امرأة فازت بجائزة نوبل؟",
            "ماري كوري",
            "مارغريت ميد",
            " ريتا ليفي مونتالشيني",
            "دوروثي هودجكن",
            1
             )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "من هو مُكتشف الدورة الدموية؟" ,
            "كارلتون غايدوشك ",
            "جان أستروك",
            "تشارلز بست",
            "وليام هارفي.",
            4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "لمن اعطيت جائزه نوبل في الفيزياء لاول مره؟",

            "إرنست رذرفورد",
            "ولهلم كونرادرونتكن",

            "فيرنر هايزنبيرغ",
            "يوهانس كيبلر",
            2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "ما هي أول معركة بحرية في تاريخ الإسلام؟",

            "معركة اليرموك",
            "معركة القادسية",
            "معركة ذات الصواري",
            "معركة المرسى الكبير",
            3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "من هو القائد المسلم الذي تصدى للمغول والتتار واستطاع هزيمتهم؟",
            "سيف الدين قطز",
            "سليمان القانوني",
            "العباس بن سفيان",
            "المعتصم بالله",
            1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "ما اسم الغزوة التي تُسمى بغزوة الأوطاس؟",

            "خيبر.",
            "الكرامة",
            "حنين",
            "اليرموك",
            3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "من هو أول من بايع أبا بكر الصديق رضي الله عنه من الأنصار يوم السقيفة؟",
            "علي بن أبي طالب",
            "عثمان بن عفان",
            "حمزة بن عبدالمطلب",
            "بشير بن سعد الأنصاري",
            4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "محمد الغزنوي هو أول من أسس دولة إسلامية في…؟",
            "السعودية",
            "الهند",
            "الصين",
            "الإمارات",
            2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "أول من وضع رسوماً بالغة الدقة للعين وأجزاءها وأطلق عليها أسماءً لازالت تسمى بها حتى؟",
            "ابن الهيثم",
            "ابن سينا",
            "ابن البيطار",
            "ابن زههر",
            1
        )

        questionsList.add(que10)

    return questionsList
    }

}