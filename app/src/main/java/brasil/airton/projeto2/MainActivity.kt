package brasil.airton.projeto2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var res:Int=0
        btnsub.setOnClickListener(){
            res=num1.text.toString().toInt()-num2.text.toString().toInt()
            txt1.setText("${res}")
        }
        btnadc.setOnClickListener(){
            res=num1.text.toString().toInt()+num2.text.toString().toInt()
            txt1.setText("${res}")
        }
        btndiv.setOnClickListener(){
            if(num1.text.toString().toInt() == 0 || num2.text.toString().toInt()==0){
                Toast.makeText(this,"Divisão Com Zero proibida",Toast.LENGTH_SHORT).show()
            }else {
                res = num1.text.toString().toInt() / num2.text.toString().toInt()
                txt1.setText("${res}")
            }
        }
        btnmut.setOnClickListener(){
            res=num1.text.toString().toInt()*num2.text.toString().toInt()
            txt1.setText("${res}")
        }
    }
}
