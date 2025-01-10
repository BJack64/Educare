package com.example.mobileapplication

import android.util.Log
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class FirestoreHelper {

    private val db = FirebaseFirestore.getInstance()

    fun readLinkMateri(document: String, field: String, callback: (String?) -> Unit) {
        val documentRef = db.collection("materi").document((document))

        documentRef.get()
            .addOnSuccessListener { document ->
                if (document != null && document.exists()) {
                    val link = document.getString("$field")
                    callback(link)
                }
            }
    }

    fun readQuiz(document: String, collection2: String, document2: String, field: String, callback: (String?) -> Unit) {
        val documentRef = db.collection("quiz")
            .document((document))
            .collection((collection2))
            .document((document2))

        documentRef.get()
            .addOnSuccessListener { document ->
                if (document != null && document.exists()) {
                    val link = document.getString("$field")
                    callback(link)
                }
            }
    }

    fun updateLinkMateri(document: String, field: String, value: Any, callback: (Boolean) -> Unit) {
        val documentRef = db.collection("materi").document(document)

        documentRef.update(field, value)
            .addOnSuccessListener {
                callback(true)
            }
            .addOnFailureListener { e ->
                callback(false)
            }
    }
    fun updateQuiz(document: String, collection2: String, document2: String, field: String, value: String, callback: (Boolean) -> Unit) {
        val documentRef = db.collection("quiz")
            .document((document))
            .collection((collection2))
            .document((document2))

        documentRef.update(field, value)
            .addOnSuccessListener {
                callback(true)
            }
            .addOnFailureListener { e ->
                callback(false)
            }
    }
}

