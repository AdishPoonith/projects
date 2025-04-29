package v7;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import androidx.security.crypto.a;
import androidx.security.crypto.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import w7.i;
import w7.m;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private final Context f19441c;

    /* renamed from: e  reason: collision with root package name */
    protected Map<String, Object> f19443e;

    /* renamed from: g  reason: collision with root package name */
    private SharedPreferences f19445g;

    /* renamed from: h  reason: collision with root package name */
    private i f19446h;

    /* renamed from: i  reason: collision with root package name */
    private m f19447i;

    /* renamed from: a  reason: collision with root package name */
    private final String f19439a = "SecureStorageAndroid";

    /* renamed from: d  reason: collision with root package name */
    protected String f19442d = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";

    /* renamed from: f  reason: collision with root package name */
    private String f19444f = "FlutterSecureStorage";

    /* renamed from: j  reason: collision with root package name */
    private Boolean f19448j = Boolean.FALSE;

    /* renamed from: b  reason: collision with root package name */
    private final Charset f19440b = StandardCharsets.UTF_8;

    public a(Context context) {
        this.f19441c = context.getApplicationContext();
    }

    private void a(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        try {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f19442d)) {
                    sharedPreferences2.edit().putString(key, c((String) value)).apply();
                    sharedPreferences.edit().remove(key).apply();
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f19447i.d(edit);
            edit.apply();
        } catch (Exception e10) {
            Log.e("SecureStorageAndroid", "Data migration failed", e10);
        }
    }

    private String c(String str) {
        if (str == null) {
            return null;
        }
        return new String(this.f19446h.b(Base64.decode(str, 0)), this.f19440b);
    }

    private void f() {
        if (this.f19443e.containsKey("sharedPreferencesName") && !((String) this.f19443e.get("sharedPreferencesName")).isEmpty()) {
            this.f19444f = (String) this.f19443e.get("sharedPreferencesName");
        }
        if (this.f19443e.containsKey("preferencesKeyPrefix") && !((String) this.f19443e.get("preferencesKeyPrefix")).isEmpty()) {
            this.f19442d = (String) this.f19443e.get("preferencesKeyPrefix");
        }
        SharedPreferences sharedPreferences = this.f19441c.getSharedPreferences(this.f19444f, 0);
        if (this.f19446h == null) {
            try {
                h(sharedPreferences);
            } catch (Exception e10) {
                Log.e("SecureStorageAndroid", "StorageCipher initialization failed", e10);
            }
        }
        if (!g() || Build.VERSION.SDK_INT < 23) {
            this.f19445g = sharedPreferences;
            return;
        }
        try {
            SharedPreferences i10 = i(this.f19441c);
            this.f19445g = i10;
            a(sharedPreferences, i10);
        } catch (Exception e11) {
            Log.e("SecureStorageAndroid", "EncryptedSharedPreferences initialization failed", e11);
            this.f19445g = sharedPreferences;
            this.f19448j = Boolean.TRUE;
        }
    }

    private boolean g() {
        return !this.f19448j.booleanValue() && this.f19443e.containsKey("encryptedSharedPreferences") && this.f19443e.get("encryptedSharedPreferences").equals("true") && Build.VERSION.SDK_INT >= 23;
    }

    private void h(SharedPreferences sharedPreferences) {
        i a10;
        this.f19447i = new m(sharedPreferences, this.f19443e);
        if (g()) {
            a10 = this.f19447i.c(this.f19441c);
        } else if (this.f19447i.e()) {
            j(this.f19447i, sharedPreferences);
            return;
        } else {
            a10 = this.f19447i.a(this.f19441c);
        }
        this.f19446h = a10;
    }

    private SharedPreferences i(Context context) {
        return androidx.security.crypto.a.a(context, this.f19444f, new b.a(context).b(new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(256).build()).a(), a.d.AES256_SIV, a.e.AES256_GCM);
    }

    private void j(m mVar, SharedPreferences sharedPreferences) {
        try {
            this.f19446h = mVar.c(this.f19441c);
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f19442d)) {
                    hashMap.put(key, c((String) value));
                }
            }
            this.f19446h = mVar.a(this.f19441c);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                edit.putString((String) entry2.getKey(), Base64.encodeToString(this.f19446h.a(((String) entry2.getValue()).getBytes(this.f19440b)), 0));
            }
            mVar.f(edit);
            edit.apply();
        } catch (Exception e10) {
            Log.e("SecureStorageAndroid", "re-encryption failed", e10);
            this.f19446h = mVar.c(this.f19441c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(String str) {
        f();
        return this.f19445g.contains(str);
    }

    public void d(String str) {
        f();
        SharedPreferences.Editor edit = this.f19445g.edit();
        edit.remove(str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        f();
        SharedPreferences.Editor edit = this.f19445g.edit();
        edit.clear();
        if (!g()) {
            this.f19447i.f(edit);
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k(String str) {
        f();
        String string = this.f19445g.getString(str, null);
        return g() ? string : c(string);
    }

    public Map<String, String> l() {
        f();
        Map<String, ?> all = this.f19445g.getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains(this.f19442d)) {
                String replaceFirst = entry.getKey().replaceFirst(this.f19442d + '_', "");
                boolean g10 = g();
                String str = (String) entry.getValue();
                if (!g10) {
                    str = c(str);
                }
                hashMap.put(replaceFirst, str);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(String str, String str2) {
        f();
        SharedPreferences.Editor edit = this.f19445g.edit();
        if (!g()) {
            str2 = Base64.encodeToString(this.f19446h.a(str2.getBytes(this.f19440b)), 0);
        }
        edit.putString(str, str2);
        edit.apply();
    }
}
