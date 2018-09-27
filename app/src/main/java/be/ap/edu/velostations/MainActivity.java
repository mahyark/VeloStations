package be.ap.edu.velostations;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends Activity {
    Context mContext;
    public void getDataClass(Context context) { mContext = context; }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Gson gson = loadJSONFromAsset();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public Gson loadJSONFromAsset() {
        Gson gson = new Gson();

        try {
            InputStream is = getAssets().open("velostation.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            Log.w("JSON", new String(buffer,"UTF-8"));
            gson.toJson(new String(buffer,"UTF-8"));
            Log.w("test", "Success");
        } catch (IOException ex) {
            ex.printStackTrace();
            Log.w("Error", "Failed to get Json");
        }

        return gson;
    }
}
