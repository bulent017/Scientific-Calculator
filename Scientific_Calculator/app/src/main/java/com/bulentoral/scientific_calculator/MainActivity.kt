package com.bulentoral.scientific_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.bulentoral.scientific_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var tvsec: TextView
    lateinit var tvMain: TextView
    lateinit var bac: Button
    lateinit var bc: Button
    lateinit var bbracket1: Button
    lateinit var bbracket2: Button
    lateinit var bsin: Button
    lateinit var bcos: Button
    lateinit var btan: Button
    lateinit var blog: Button
    lateinit var bln: Button
    lateinit var bfact: Button
    lateinit var bsquare: Button
    lateinit var bsqrt: Button
    lateinit var binv: Button
    lateinit var b0: Button
    lateinit var b9: Button
    lateinit var b8: Button
    lateinit var b7: Button
    lateinit var b6: Button
    lateinit var b5: Button
    lateinit var b4: Button
    lateinit var b3: Button
    lateinit var b2: Button
    lateinit var b1: Button
    lateinit var bpi: Button
    lateinit var bmultiply: Button
    lateinit var bminus: Button
    lateinit var bplus: Button
    lateinit var bequal: Button
    lateinit var bdot: Button
    lateinit var bdivide: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        tvsec = binding.idTVSecondary
        tvMain = binding.idTVPrimary
        bac = binding.idBtnAC
        bc = binding.idBtnC
        bbracket1 = binding.idBtnBracket1
        bbracket2 = binding.idBtnBracket2
        bsin = binding.idBtnSin
        bcos = binding.idBtnCos
        btan = binding.idBtnTan
        blog = binding.idBtnLog
        bln = binding.idBtnLn
        bfact = binding.idBtnFact
        bsquare = binding.idBtnSquare
        bsqrt = binding.idBtnSquareRoot
        binv = binding.idBtnInverse
        b0 = binding.idBtn0
        b1 = binding.idBtn1
        b2 = binding.idBtn2
        b3 = binding.idBtn3
        b4 = binding.idBtn4
        b5 = binding.idBtn5
        b6 = binding.idBtn6
        b7 = binding.idBtn7
        b8 = binding.idBtn8
        b9 = binding.idBtn9
        bpi = binding.idBtnPi
        bmultiply = binding.idBtnMultiply
        bminus = binding.idBtnSubtraction
        bdivide = binding.idBtnDivide
        bequal = binding.idBtnEqual
        bplus = binding.idBtnAddition
        bdot = binding.idBtnDot

        b0.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "0"
        }
        b1.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "1"
        }
        b2.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "2"
        }
        b3.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "3"
        }
        b4.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "4"
        }
        b5.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "5"
        }
        b6.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "6"
        }
        b7.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "7"
        }
        b8.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "8"
        }
        b9.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "9"
        }
        bdot.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "."
        }
        bplus.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "+"
        }
        bminus.setOnClickListener {


            val str: String = tvMain.text.toString()
            if (!str.get(str.length-1).equals("-")){
                tvMain.text = tvMain.text.toString()+ "-"
            }

        }
        bdivide.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "/"
        }
        bmultiply.setOnClickListener {

            val str: String = tvMain.text.toString()
            if (!str.get(str.length-1).equals("*")){
                tvMain.text = tvMain.text.toString()+ "*"
            }

        }
        bbracket1.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "("
        }
        bbracket2.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ ")"
        }
        bpi.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "3.142"
            tvsec.text = bpi.text.toString()
        }
        bsin.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "sin"
        }
        bcos.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "cos"
        }
        btan.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "tan"
        }
        binv.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "^ (-1)"
        }
        bln.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "ln"
        }
        blog.setOnClickListener {
            tvMain.text = tvMain.text.toString()+ "log"
        }
        bsqrt.setOnClickListener {

            if (tvMain.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter a valid number",Toast.LENGTH_SHORT).show()
            }
            else{
                val str:String = tvMain.text.toString()
                val result = Math.sqrt(str.toDouble()).toString()
                tvMain.text = result


            }
        }
        bac.setOnClickListener {
            tvMain.text = ""
            tvsec.text = ""
        }
        bc.setOnClickListener { //tek tek siliyoruz

            var str: String = tvMain.text.toString()
            if (!str.equals("")){
                str = str.substring(0,str.length - 1)
                tvMain.text = str
            }

        }
        bsquare.setOnClickListener {
            if (tvMain.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter a valid number",Toast.LENGTH_SHORT).show()
            }
            else{
                val d: Double = tvMain.text.toString().toDouble()
                val square: Double = d*d
                tvMain.text = square.toString()
                tvsec.text = square.toString()
            }


        }
        bfact.setOnClickListener {
            if (tvMain.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter a valid number",Toast.LENGTH_SHORT).show()
            }
            else{
                val number: Int = tvMain.text.toString().toInt()
                val fact: Int = factorial(number)
                tvMain.text = fact.toString()
                tvsec.text = fact.toString()
            }

        }
        bequal.setOnClickListener {
            val str: String = tvMain.text.toString()
            // on below line we are calling an evaluate
            // method to calculate the value of expressions.
            val result: Double = evaluate(str)
            // on below line we are getting result
            // and setting it to text view.
            val r = result.toString()
            tvMain.setText(r)
            tvsec.text = str
        }


    }
    fun factorial(number: Int):Int{

        if (number<=1){
            return  1
        }
        return number* factorial(number - 1)

    }
    fun evaluate(str: String): Double {
        return object : Any() {


            var pos = -1
            var ch = 0


            fun nextChar() {

                ch = if (++pos < str.length) str[pos].toInt() else -1
            }


            fun eat(charToEat: Int): Boolean {
                while (ch == ' '.toInt()) nextChar()

                if (ch == charToEat) {
                    nextChar()
                    return true
                }
                return false
            }


            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                return x
            }


            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.toInt())) x += parseTerm() // addition
                    else if (eat('-'.toInt())) x -= parseTerm() // subtraction
                    else return x
                }
            }


            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.toInt())) x *= parseFactor() // multiplication
                    else if (eat('/'.toInt())) x /= parseFactor() // division
                    else return x
                }
            }


            fun parseFactor(): Double {

                if (eat('+'.toInt())) return parseFactor() // unary plus
                if (eat('-'.toInt())) return -parseFactor() // unary minus

                var x: Double

                val startPos = pos

                if (eat('('.toInt())) { // parentheses
                    x = parseExpression()
                    eat(')'.toInt())
                } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                    // numbers
                    while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()
                    // on below line we are getting sub string from our string using start and pos.
                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                    // on below function we are checking for the operator in our expression.
                    while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                    val func = str.substring(startPos, pos)

                    x = parseFactor()
                    x =
                        if (func == "sqrt") Math.sqrt(x)

                        else if (func == "sin") Math.sin(
                            Math.toRadians(x)

                        ) else if (func == "cos") Math.cos(
                            Math.toRadians(x)

                        ) else if (func == "tan")
                            Math.tan(Math.toRadians(x))

                        else if (func == "log")
                            Math.log10(x)

                        else if (func == "ln") Math.log(x)

                        else throw RuntimeException(
                            "Unknown function: $func"
                        )
                } else {

                    throw RuntimeException("Unexpected: " + ch.toChar())
                }

                if (eat('^'.toInt())) x = Math.pow(x, parseFactor()) // exponentiation
                return x
            }

        }.parse()
    }
}