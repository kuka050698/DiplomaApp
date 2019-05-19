package com.example.diploma.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.diploma.ID
import com.example.diploma.R
import com.example.diploma.Singleton
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_fingerprint.*
import java.io.Serializable

class FingerprintActivity : AppCompatActivity() {

    private lateinit var database: DatabaseReference
    private lateinit var input_Id:String
    var list:ArrayList<String> = ArrayList()
    var elements = ArrayList<ID>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fingerprint)
        database = FirebaseDatabase.getInstance().reference
        finger_button.setOnClickListener{
            database.child("mode").setValue("1")
            Toast.makeText(this,"Firebase",Toast.LENGTH_SHORT).show()
            checktheId()
//            val intent = Intent(this@FingerprintActivity,MainPage::class.java)
//            startActivity(intent)
//            checktheId(s)
        }
    }
    private fun checktheId(){
        val mRef = FirebaseDatabase.getInstance().reference
        val idRef = mRef.child("IDget")
        val idsRef = mRef.child("ID")
        idsRef.addValueEventListener(object:ValueEventListener{
            override fun onCancelled(p0: DatabaseError) {
                println(p0.message)

            }

            override fun onDataChange(p0: DataSnapshot) {
                p0.children.forEach {
                    it.getValue<ID>(ID::class.java)?.let{ item->
                        elements.add(item)
                    }

                    it.key?.let{ key->
                        list.add(key)
                    }
                }

                idRef.addValueEventListener(object: ValueEventListener{
                    override fun onCancelled(p0: DatabaseError) {
                        println(p0.message)
                    }

                    override fun onDataChange(p0: DataSnapshot) {
                        var id = p0.getValue(String::class.java)
                        Log.d("idvalue",id)



                        list.mapIndexed { index, key ->
                            if(key == id){
                                Log.d("key",key)
                                Singleton.globalUser = elements[index]
                                Singleton.globalID = key
                                var intent = Intent(this@FingerprintActivity,Successfulpageactivity::class.java)
                                startActivity(intent)
                                Log.d("key",key)
                                return
                            }
                        }
                        val intent = Intent(this@FingerprintActivity,Erroractivity::class.java)
                        startActivity(intent)
                    }

                })
            }

        })


    }
}
