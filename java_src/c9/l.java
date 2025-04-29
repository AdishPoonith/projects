package c9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import c9.a;
import i8.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class l implements i8.a, a.b {

    /* renamed from: j  reason: collision with root package name */
    private SharedPreferences f3466j;

    /* renamed from: k  reason: collision with root package name */
    private k f3467k;

    /* loaded from: classes.dex */
    static class a implements k {
        a() {
        }

        @Override // c9.k
        public String a(List<String> list) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // c9.k
        public List<String> b(String str) {
            try {
                return (List) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public l() {
        this(new a());
    }

    l(k kVar) {
        this.f3467k = kVar;
    }

    private Map<String, Object> i(String str) {
        Map<String, ?> all = this.f3466j.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str)) {
                hashMap.put(str2, k(str2, all.get(str2)));
            }
        }
        return hashMap;
    }

    private void j(r8.c cVar, Context context) {
        this.f3466j = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            j.j(cVar, this);
        } catch (Exception e10) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e10);
        }
    }

    private Object k(String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return this.f3467k.b(str2.substring(40));
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            SharedPreferences.Editor remove = this.f3466j.edit().remove(str);
            remove.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f3467k.a(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    @Override // c9.a.b
    public Map<String, Object> a(String str) {
        return i(str);
    }

    @Override // c9.a.b
    public Boolean b(String str) {
        SharedPreferences.Editor edit = this.f3466j.edit();
        Map<String, ?> all = this.f3466j.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    @Override // c9.a.b
    public Boolean c(String str, Long l10) {
        return Boolean.valueOf(this.f3466j.edit().putLong(str, l10.longValue()).commit());
    }

    @Override // i8.a
    public void d(a.b bVar) {
        j.j(bVar.b(), null);
    }

    @Override // c9.a.b
    public Boolean e(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f3466j.edit().putString(str, str2).commit());
    }

    @Override // c9.a.b
    public Boolean f(String str, List<String> list) {
        SharedPreferences.Editor edit = this.f3466j.edit();
        return Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f3467k.a(list)).commit());
    }

    @Override // c9.a.b
    public Boolean g(String str, Boolean bool) {
        return Boolean.valueOf(this.f3466j.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    @Override // c9.a.b
    public Boolean h(String str, Double d10) {
        String d11 = Double.toString(d10.doubleValue());
        SharedPreferences.Editor edit = this.f3466j.edit();
        return Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d11).commit());
    }

    @Override // i8.a
    public void m(a.b bVar) {
        j(bVar.b(), bVar.a());
    }

    @Override // c9.a.b
    public Boolean remove(String str) {
        return Boolean.valueOf(this.f3466j.edit().remove(str).commit());
    }
}
