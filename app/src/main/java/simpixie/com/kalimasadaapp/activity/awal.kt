package simpixie.com.kalimasadaapp.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import simpixie.com.kalimasadaapp.R


class awal : AppCompatActivity(), View.OnClickListener {
    private var mButton1: Button? = null
    private var mButton2: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awal)

        mButton1 = findViewById(R.id.btnMasuk) as Button
        mButton1!!.setOnClickListener(this)
        mButton2 = findViewById(R.id.btnLewati) as Button
        mButton2!!.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val id=p0!!.id
        when (id) {
            R.id.btnMasuk -> {
                startActivity(Intent(this, masuk::class.java))
            }
            R.id.btnLewati ->{
                startActivity(Intent(this, utama::class.java))
            }

        }
    }


}
