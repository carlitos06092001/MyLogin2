package com.example.mylogin

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }


Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    ) {
    Image(painter = painterResource(id = R.drawable.imagenlogin2), contentDescription = "Login Image",
    modifier = Modifier.size(200.dp))

    Text(text = "Bienvenido a Reloop DJ Academy", fontSize = 20.sp, fontWeight = FontWeight.Bold)

    Spacer(modifier = Modifier.height(4.dp))
    
    Text(text ="Ingresa a tu cuenta")

    OutlinedTextField(value = email, onValueChange ={

        email =it

    }, label ={
        Text(text = "Email Adress")
    })

    Spacer(modifier = Modifier.height(4.dp))
    OutlinedTextField(value =password, onValueChange ={

       password=it

    }, label ={
        Text(text = "Password")
    }, visualTransformation = PasswordVisualTransformation())

    Spacer(modifier = Modifier.height(4.dp))
Button(onClick = {
        Log.i("Credential", "Email : $email Password : $password")
}) {
    Text(text = "Login")
}

    Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Olvidó la contraseña?", modifier = Modifier.clickable {

        })




    }



}
