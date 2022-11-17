package com.project.driveasy;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAODriverSignupFB {
    private DatabaseReference databaseReference;

    public DAODriverSignupFB(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(DriverSignupFB.class.getSimpleName());
    }
    public Task<Void> add(DriverSignupFB driver){return databaseReference.push().setValue(driver);}
}
