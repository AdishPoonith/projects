package com.google.firebase.auth.internal;

import a6.a1;
import a6.h1;
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
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.i3;
import com.google.android.gms.internal.p000firebaseauthapi.k;
import com.google.android.gms.internal.p000firebaseauthapi.m;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import h4.h;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import q.d;
import w5.f;
@KeepName
/* loaded from: classes.dex */
public class GenericIdpActivity extends e implements m {
    private static long J;
    private static final a1 K = a1.b();
    public static final /* synthetic */ int L = 0;
    private boolean I = false;

    private final void P() {
        J = 0L;
        this.I = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (e0.a.b(this).d(intent)) {
            K.c(this);
        } else {
            K.e(this, l.a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    private final void Q(Status status) {
        J = 0L;
        this.I = false;
        Intent intent = new Intent();
        int i10 = z0.f345b;
        d4.e.e(status, intent, "com.google.firebase.auth.internal.STATUS");
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (e0.a.b(this).d(intent)) {
            K.c(this);
        } else {
            K.e(getApplicationContext(), status);
        }
        finish();
    }

    public final Uri.Builder O(Uri.Builder builder, Intent intent, String str, String str2) {
        String jSONObject;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str3 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str3);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject2.put(str3, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            jSONObject = jSONObject2.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String a10 = com.google.android.gms.internal.p000firebaseauthapi.l.a(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str4 = jSONObject;
        String str5 = join;
        i1.b().d(getApplicationContext(), str, uuid, a10, action, stringExtra2, stringExtra3, stringExtra4);
        String c10 = j1.a(getApplicationContext(), f.p(stringExtra4).s()).c();
        if (TextUtils.isEmpty(c10)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            Q(l.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        } else if (a10 == null) {
            return null;
        } else {
            builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", a10).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c10);
            if (!TextUtils.isEmpty(str5)) {
                builder.appendQueryParameter("scopes", str5);
            }
            if (!TextUtils.isEmpty(str4)) {
                builder.appendQueryParameter("customParameters", str4);
            }
            if (!TextUtils.isEmpty(stringExtra3)) {
                builder.appendQueryParameter("tid", stringExtra3);
            }
            return builder;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m
    public final Uri.Builder c(Intent intent, String str, String str2) {
        return O(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m
    public final void l(final Uri uri, final String str, s6.b bVar) {
        z5.b bVar2 = (z5.b) bVar.get();
        (bVar2 != null ? bVar2.c(false).continueWith(new Continuation() { // from class: a6.c0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Uri uri2 = uri;
                int i10 = GenericIdpActivity.L;
                Uri.Builder buildUpon = uri2.buildUpon();
                if (task.isSuccessful()) {
                    y5.a aVar = (y5.a) task.getResult();
                    if (aVar.a() != null) {
                        Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(aVar.a())));
                    }
                    buildUpon.fragment("fac=".concat(String.valueOf(aVar.b())));
                } else {
                    Log.e("GenericIdpActivity", "Unexpected error getting App Check token: ".concat(String.valueOf(task.getException().getMessage())));
                }
                return buildUpon.build();
            }
        }) : Tasks.forResult(uri)).addOnCompleteListener(new OnCompleteListener() { // from class: a6.b0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GenericIdpActivity genericIdpActivity = GenericIdpActivity.this;
                String str2 = str;
                if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
                    Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    genericIdpActivity.q(str2, null);
                    return;
                }
                List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    q.d a10 = new d.a().a();
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                    a10.a(genericIdpActivity, (Uri) task.getResult());
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                intent.putExtra("com.android.browser.application_id", str2);
                Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                genericIdpActivity.startActivity(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            P();
            return;
        }
        long b10 = h4.f.c().b();
        if (b10 - J < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        J = b10;
        if (bundle != null) {
            this.I = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
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
                P();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = h.a(h4.a.a(this, packageName)).toLowerCase(Locale.US);
                f p10 = f.p(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(p10);
                if (com.google.android.gms.internal.p000firebaseauthapi.i1.g(p10)) {
                    l(O(Uri.parse(com.google.android.gms.internal.p000firebaseauthapi.i1.a(p10.r().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.K());
                } else {
                    new k(packageName, lowerCase, getIntent(), p10, this).executeOnExecutor(firebaseAuth.R(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                String obj = e10.toString();
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + obj);
                q(packageName, null);
            }
            this.I = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            Q(z0.b(intent.getStringExtra("firebaseError")));
        } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            P();
        } else {
            String stringExtra = intent.getStringExtra("link");
            String stringExtra2 = intent.getStringExtra("eventId");
            String packageName2 = getPackageName();
            boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
            h1 a10 = i1.b().a(this, packageName2, stringExtra2);
            if (a10 == null) {
                P();
            }
            if (booleanExtra) {
                stringExtra = j1.a(getApplicationContext(), f.p(a10.a()).s()).b(stringExtra);
            }
            i3 i3Var = new i3(a10, stringExtra);
            String e11 = a10.e();
            String b10 = a10.b();
            i3Var.F(e11);
            if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(b10) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(b10) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(b10)) {
                Log.e("GenericIdpActivity", "unsupported operation: ".concat(b10));
                P();
                return;
            }
            J = 0L;
            this.I = false;
            Intent intent2 = new Intent();
            d4.e.e(i3Var, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
            intent2.putExtra("com.google.firebase.auth.internal.OPERATION", b10);
            intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
            if (e0.a.b(this).d(intent2)) {
                K.c(this);
            } else {
                SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                edit.putString("verifyAssertionRequest", d4.e.f(i3Var));
                edit.putString("operation", b10);
                edit.putString("tenantId", e11);
                edit.putLong("timestamp", h4.f.c().b());
                edit.commit();
            }
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.I);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m
    public final void q(String str, Status status) {
        if (status == null) {
            P();
        } else {
            Q(status);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m
    public final Context zza() {
        return getApplicationContext();
    }
}
