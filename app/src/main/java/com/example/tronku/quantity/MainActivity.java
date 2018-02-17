package com.example.tronku.quantity;



         import android.os.Bundle;
         import android.support.v7.app.AppCompatActivity;
         import android.view.View;
         import android.widget.TextView;
         import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public int noOfCoffee = 0;
    public int noOfCapp = 0;
    public int noOfExp = 0;
    public int noOfMacc = 0;
    public int rateOfCapp = 2;
    public int rateOfExp = 3;
    public int rateOfMacc = 4;
    public int money = 0;
    public void submitOrder(View view) {
        money = (noOfCapp * rateOfCapp) + (noOfExp * rateOfExp) + (noOfMacc * rateOfMacc);
        String price = "Amount you have to pay: $" + money + " only!\nThank You!";
        displayMessage(price);
    }

    /**
     * This method displays the given quantity of cappuchino.
     */
    private void display_capp(int number) {
        TextView cappTextView = (TextView) findViewById(R.id.capp_text_view);
        cappTextView.setText("" + number);
    }

    /* This method displays the given quantity of expresso*/
    private void display_exp(int number) {
        TextView expTextView = (TextView) findViewById(R.id.exp_text_view);
        expTextView.setText("" + number);
    }

    // This method displays the given quantity of macchiato
    private void display_macc(int number) {
        TextView maccTextView = (TextView) findViewById(R.id.macc_text_view);
        maccTextView.setText("" + number);
    }


    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    //this method prints the total
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    public void inc_capp(View view){
        noOfCoffee = noOfCoffee + 1;
        noOfCapp = noOfCapp + 1;
        display_capp(noOfCapp);
    }
    public void dec_capp(View view){
        noOfCoffee = noOfCoffee - 1;
        noOfCapp = noOfCapp - 1;
        display_capp(noOfCapp);
    }

    public void inc_exp(View view){
        noOfCoffee = noOfCoffee + 1;
        noOfExp = noOfExp + 1;
        display_exp(noOfExp);
    }
    public void dec_exp(View view){
        noOfCoffee = noOfCoffee - 1;
        noOfExp = noOfExp - 1;
        display_exp(noOfExp);
    }

    public void inc_macc(View view){
        noOfCoffee = noOfCoffee + 1;
        noOfMacc = noOfMacc + 1;
        display_macc(noOfMacc);
    }
    public void dec_macc(View view){
        noOfCoffee = noOfCoffee - 1;
        noOfMacc = noOfMacc - 1;
        display_macc(noOfMacc);
    }


}
