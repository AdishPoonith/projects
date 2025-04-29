package com.google.firebase.auth.internal;

import a6.a1;
import a6.i1;
import a6.j1;
import a6.l;
import a6.z0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.k;
import com.google.android.gms.internal.p000firebaseauthapi.m;
import com.google.android.gms.internal.p000firebaseauthapi.x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import h4.h;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import q.d;
import w5.f;
/* loaded from: classes.dex */
public class RecaptchaActivity extends e implements m {
    private static final String J = "RecaptchaActivity";
    private static long K;
    private static final a1 L = a1.b();
    private boolean I = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Uri O(Uri uri, Task task) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            y5.a aVar = (y5.a) task.getResult();
            if (aVar.a() != null) {
                Log.w(J, "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(aVar.a())));
            }
            buildUpon.fragment("fac=".concat(String.valueOf(aVar.b())));
        } else {
            Log.e(J, "Unexpected error getting App Check token: ".concat(String.valueOf(task.getException().getMessage())));
        }
        return buildUpon.build();
    }

    private final void Q() {
        K = 0L;
        this.I = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        e0.a.b(this).d(intent);
        L.c(this);
        finish();
    }

    private final void R(Status status) {
        K = 0L;
        this.I = false;
        Intent intent = new Intent();
        int i10 = z0.f345b;
        d4.e.e(status, intent, "com.google.firebase.auth.internal.STATUS");
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        e0.a.b(this).d(intent);
        L.c(this);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void P(String str, Task task) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e(J, "Device cannot resolve intent for: android.intent.action.VIEW");
            q(str, null);
            return;
        }
        List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            d a10 = new d.a().a();
            a10.f15868a.addFlags(1073741824);
            a10.f15868a.addFlags(268435456);
            a10.a(this, (Uri) task.getResult());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
        intent.putExtra("com.android.browser.application_id", str);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        startActivity(intent);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m
    public final Uri.Builder c(Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        f p10 = f.p(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(p10);
        i1.b().e(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String c10 = j1.a(getApplicationContext(), p10.s()).c();
        if (!TextUtils.isEmpty(c10)) {
            return new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.o()) ? firebaseAuth.o() : x.a()).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c10);
        }
        Log.e(J, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
        R(l.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
        return null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m
    public final String d(String str) {
        return com.google.android.gms.internal.p000firebaseauthapi.i1.b(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m
    public final HttpURLConnection g(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            m.f4977d.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m
    public final void l(final Uri uri, final String str, s6.b bVar) {
        z5.b bVar2 = (z5.b) bVar.get();
        (bVar2 != null ? bVar2.c(false).continueWith(new Continuation() { // from class: com.google.firebase.auth.internal.a
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return RecaptchaActivity.O(uri, task);
            }
        }) : Tasks.forResult(uri)).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                RecaptchaActivity.this.P(str, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e(J, "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            Q();
            return;
        }
        long b10 = h4.f.c().b();
        if (b10 - K < 30000) {
            Log.e(J, "Could not start operation - already in progress");
            return;
        }
        K = b10;
        if (bundle != null) {
            this.I = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.I) {
                Q();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = h.a(h4.a.a(this, packageName)).toLowerCase(Locale.US);
                f p10 = f.p(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                new k(packageName, lowerCase, intent, p10, this).executeOnExecutor(FirebaseAuth.getInstance(p10).R(), new Void[0]);
            } catch (PackageManager.NameNotFoundException e10) {
                String str = J;
                String obj = e10.toString();
                Log.e(str, "Could not get package signature: " + packageName + " " + obj);
                q(packageName, null);
            }
            this.I = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            R(z0.b(intent2.getStringExtra("firebaseError")));
        } else if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            Q();
        } else {
            String stringExtra = intent2.getStringExtra("link");
            String c10 = i1.b().c(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
            if (TextUtils.isEmpty(c10)) {
                Log.e(J, "Failed to find registration for this event - failing to prevent session injection.");
                R(l.a("Failed to find registration for this reCAPTCHA event"));
            }
            if (intent2.getBooleanExtra("encryptionEnabled", true)) {
                stringExtra = j1.a(getApplicationContext(), f.p(c10).s()).b(stringExtra);
            }
            String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
            K = 0L;
            this.I = false;
            Intent intent3 = new Intent();
            intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
            intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
            if (e0.a.b(this).d(intent3)) {
                L.c(this);
            } else {
                SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                edit.putString("recaptchaToken", queryParameter);
                edit.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                edit.putLong("timestamp", h4.f.c().b());
                edit.commit();
            }
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.I);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m
    public final void q(String str, Status status) {
        if (status == null) {
            Q();
        } else {
            R(status);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m
    public final Context zza() {
        return getApplicationContext();
    }
}
