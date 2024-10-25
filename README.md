
# Rapport

Developing this app was based on two activities, the first one, MainActivity is used to read 
data which has previously been saved i SharedPreferences for later use. The SecondActivity was
build to ensure that the user could navigate between different screens, furthermore it organize 
the user interface.

EditText-widget was used in the SecondActivity, which allow the user
to enter data. This data will be saved in SharedPreferences, and by doing that the data
that have been saved can be accessed from other parts of the app, so whenever SecondActivity
shuts down, the saved data can be accessed from MainActivity.


## The Code:


```
public class MainActivity extends AppCompatActivity {

    private TextView sharedresult;
    private Button button;
    private final String key = String.valueOf(R.string.app_name);
    private SharedPreferences myPreferenceREf;
    private SharedPreferences.Editor myPreferenceEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button = findViewById(R.id.sendButton);
        sharedresult = findViewById(R.id.textViewAccount);

        myPreferenceREf = getPreferences(MODE_PRIVATE);
        myPreferenceEditor = myPreferenceREf.edit();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
            }
        });
    }

```
```
 <EditText
        android:id="@+id/viewinput"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="Type"

        android:maxEms="20"
        android:minEms="10"
        android:textSize="24sp"
        android:gravity="center_horizontal"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
         />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/sendButton"
        android:layout_marginTop="24dp"
        android:text="Click"
        app:layout_constraintEnd_toEndOf="@+id/viewinput"
        app:layout_constraintStart_toStartOf="@+id/viewinput"
        app:layout_constraintTop_toBottomOf="@+id/viewinput" />


```



![](Screenshot_20241025_105705.png)
![](Screenshot_20241025_105743.png)
![](Screenshot_20241025_105758.png)
![![Screenshot_20241025_105705.png](Screenshot_20241025_105705.png)]()