package business.info.co.in.businessinfo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by marauder on 3/17/15.
 */
public class DetailsDatabase extends SQLiteOpenHelper {

    public static int version_code = 1;
    public static String db_name = "DetailsDatabase.db";

    // table names to be used
    public static final String details_table = "Details";
    public static final String payments_table = "PaymentsDetails";

    // personal details column keys
    public static final String user_id = "id";
    public static final String username = "username";
    public static final String address = "address";
    public static final String village = "village";
    public static final String city = "city";
    public static final String district = "district";
    public static final String pincode = "pincode";
    public static final String state = "state";
    public static final String mobile = "mobile";
    public static final String landline = "landline";
    public static final String email = "email";

    // order details column keys
    public static final String item_name = "item_name";
    public static final String item_id = "item_id";
    public static final String amount = "amount";
    public static final String order_date = "order_date";
    public static final String balance = "balance";
    public static final String due_date = "due_date";

    // for payment details
    public static final String payment_id = "payment_id";
    public static final String payment = "payment";
    public static final String payment_date = "payment_date";

    public static final String create_details_table = " CREATE TABLE IF NOT EXISTS " + details_table +
            " (" + user_id + " INTEGER PRIMARY KEY AUTOINCREMENT, " + username + " TEXT, " +
            address + " TEXT, " + village + " TEXT, " + city + " TEXT, " + district + " TEXT, " +
            pincode + " TEXT, " + state + " TEXT, " + mobile + " TEXT, " + landline + " TEXT, " +
            email + " TEXT, " + item_name + " TEXT, " + item_id + " TEXT, " + amount + " REAL, " +
            order_date + " TEXT, " + balance + " REAL, " + due_date + " TEXT);";

    public static final String creat_payment_table = " CREATE TABLE IF NOT EXISTS " + payments_table +
            " (" + payment_id + " INTEGER PRIMARY KEY AUTOINCREMENT, " + user_id + " INTEGER, " + payment + " REAL, " +
            payment_date + " TEXT, FOREIGN KEY(" + user_id + ") REFERENCES " + details_table + "(" + user_id + "));";

    public DetailsDatabase(Context context) {
        super(context, db_name, null, version_code);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }
}
