package com.example.bharatapplication

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Which singer is shown in the provided photo?",
            R.drawable.lata_mangeshkar,
            "Armaan Malik", "Neha Kakkar",
            "Lata Mangeshkar", "Alka Yagnik",
            3
        )
        questionsList.add(que1)


        val que2 = Question(
            2,
            "Which singer is shown in the provided photo?",
            R.drawable.darshan_raval,
            "Darshan Raval", "Jubin Nautiyal",
            "Sonu Nigam", "Atif Aslam",
            1
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Which singer is shown in the provided photo?",
            R.drawable.armaan_malik,
            "Shreya Ghoshal", "Javed Ali",
            "KK", "Armaan Malik",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "Which singer is shown in the provided photo?",
            R.drawable.shreya_ghoshal,
            "Asha Bhosale", "Shreya Ghoshal",
            "Neha Kakkar", "Geeta Madhuri",
            2
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "Which singer is shown in the provided photo?",
            R.drawable.arijit_singh,
            "Javed Ali", "K.S. Chithra",
            "KK", "Arijit Singh",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "Which singer is shown in the provided photo?",
            R.drawable.sonu_nigam,
            "Sonu Nigam", "karan Singh Arora",
            "Sidhu Moosewala", "Sid Sriram",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "Which singer is shown in the provided photo?",
            R.drawable.a_r_rahman,
            "Vijay Prakash", "A. R. Rahman",
            "Kishore Kumar", "none of these",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "Which singer is shown in the provided photo?",
            R.drawable.k_k,
            "Dhvani Bhanushali", "Diljit Dosanjh",
            "Zubeen Garg", "KK",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "Which singer is shown in the provided photo?",
            R.drawable.kishore_kumar,
            "Kishore Kumar", "Salman Ali",
            "Gulzaar Chhaniwala", "Javed Ali",
            1
        )
        questionsList.add(que9)



        return questionsList
    }

}
