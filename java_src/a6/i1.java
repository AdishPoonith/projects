package a6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    private static final i1 f233a = new i1();

    private i1() {
    }

    public static i1 b() {
        return f233a;
    }

    private static void f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : sharedPreferences.getAll().keySet()) {
            edit.remove(str);
        }
        edit.apply();
    }

    private static final SharedPreferences g(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", str), 0);
    }

    public final synchronized h1 a(Context context, String str, String str2) {
        c4.s.f(str);
        c4.s.f(str2);
        SharedPreferences g10 = g(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2);
        String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        String string = g10.getString(format, null);
        String string2 = g10.getString(format2, null);
        String string3 = g10.getString(format3, null);
        String string4 = g10.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
        String string5 = g10.getString(format4, null);
        SharedPreferences.Editor edit = g10.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.remove(format3);
        edit.remove(format4);
        edit.apply();
        if (string == null || string2 == null || string3 == null) {
            return null;
        }
        return new h1(string, string2, string3, string4, string5);
    }

    public final synchronized String c(Context context, String str, String str2) {
        String string;
        String string2;
        c4.s.f(str);
        c4.s.f(str2);
        SharedPreferences g10 = g(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        string = g10.getString(format, null);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        string2 = g10.getString(format2, null);
        SharedPreferences.Editor edit = g10.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.apply();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string2;
    }

    public final synchronized void d(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        c4.s.f(str);
        c4.s.f(str2);
        c4.s.f(str3);
        c4.s.f(str7);
        SharedPreferences g10 = g(context, str);
        f(g10);
        SharedPreferences.Editor edit = g10.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str4);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2), str5);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str7);
        edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
        edit.apply();
    }

    public final synchronized void e(Context context, String str, String str2, String str3, String str4) {
        c4.s.f(str);
        c4.s.f(str2);
        SharedPreferences g10 = g(context, str);
        f(g10);
        SharedPreferences.Editor edit = g10.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str4);
        edit.apply();
    }
}
