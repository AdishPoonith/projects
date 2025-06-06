package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: j  reason: collision with root package name */
    protected int f3730j = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i10, boolean z10) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", z10);
        return intent;
    }

    private final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
        } else if (pendingIntent == null) {
            b4.e.m().n(this, ((Integer) c4.s.j(num)).intValue(), 2, this);
            this.f3730j = 1;
        } else {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f3730j = 1;
            } catch (ActivityNotFoundException e10) {
                if (extras.getBoolean("notify_manager", true)) {
                    com.google.android.gms.common.api.internal.f.y(this).J(new b4.b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (Build.FINGERPRINT.contains("generic")) {
                        str = str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", str, e10);
                }
                this.f3730j = 1;
                finish();
            } catch (IntentSender.SendIntentException e11) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f3730j = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.f y10 = com.google.android.gms.common.api.internal.f.y(this);
                if (i11 == -1) {
                    y10.b();
                } else if (i11 == 0) {
                    y10.J(new b4.b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f3730j = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f3730j = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3730j = bundle.getInt("resolution");
        }
        if (this.f3730j != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f3730j);
        super.onSaveInstanceState(bundle);
    }
}
