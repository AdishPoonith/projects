package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import g5.k;
import g5.l;
import g5.m;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import n5.a;
/* loaded from: classes.dex */
public final class a implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f2684a;

    /* renamed from: b  reason: collision with root package name */
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f2685b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final String f2686c;

    /* renamed from: d  reason: collision with root package name */
    final String f2687d;

    /* renamed from: e  reason: collision with root package name */
    final g5.a f2688e;

    /* renamed from: f  reason: collision with root package name */
    final g5.d f2689f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.security.crypto.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0048a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2690a;

        static {
            int[] iArr = new int[c.values().length];
            f2690a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2690a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2690a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2690a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2690a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2690a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements SharedPreferences.Editor {

        /* renamed from: a  reason: collision with root package name */
        private final a f2691a;

        /* renamed from: b  reason: collision with root package name */
        private final SharedPreferences.Editor f2692b;

        /* renamed from: d  reason: collision with root package name */
        private AtomicBoolean f2694d = new AtomicBoolean(false);

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f2693c = new CopyOnWriteArrayList();

        b(a aVar, SharedPreferences.Editor editor) {
            this.f2691a = aVar;
            this.f2692b = editor;
        }

        private void a() {
            if (this.f2694d.getAndSet(false)) {
                for (String str : this.f2691a.getAll().keySet()) {
                    if (!this.f2693c.contains(str) && !this.f2691a.g(str)) {
                        this.f2692b.remove(this.f2691a.d(str));
                    }
                }
            }
        }

        private void b() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f2691a.f2685b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                for (String str : this.f2693c) {
                    next.onSharedPreferenceChanged(this.f2691a, str);
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (this.f2691a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f2693c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair<String, String> e10 = this.f2691a.e(str, bArr);
                this.f2692b.putString((String) e10.first, (String) e10.second);
            } catch (GeneralSecurityException e11) {
                throw new SecurityException("Could not encrypt data: " + e11.getMessage(), e11);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f2692b.apply();
            b();
            this.f2693c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f2694d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f2692b.commit();
            } finally {
                b();
                this.f2693c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.h());
            allocate.put(z10 ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.h());
            allocate.putFloat(f10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.h());
            allocate.putInt(i10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.h());
            allocate.putLong(j10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.h());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new s.b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            for (String str2 : set) {
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.h());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f2691a.g(str)) {
                this.f2692b.remove(this.f2691a.d(str));
                this.f2693c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        

        /* renamed from: j  reason: collision with root package name */
        private final int f2702j;

        c(int i10) {
            this.f2702j = i10;
        }

        public static c g(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    return null;
                                }
                                return BOOLEAN;
                            }
                            return FLOAT;
                        }
                        return LONG;
                    }
                    return INT;
                }
                return STRING_SET;
            }
            return STRING;
        }

        public int h() {
            return this.f2702j;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        AES256_SIV("AES256_SIV");
        

        /* renamed from: j  reason: collision with root package name */
        private final String f2705j;

        d(String str) {
            this.f2705j = str;
        }

        k g() {
            return l.a(this.f2705j);
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        AES256_GCM("AES256_GCM");
        

        /* renamed from: j  reason: collision with root package name */
        private final String f2708j;

        e(String str) {
            this.f2708j = str;
        }

        k g() {
            return l.a(this.f2708j);
        }
    }

    a(String str, String str2, SharedPreferences sharedPreferences, g5.a aVar, g5.d dVar) {
        this.f2686c = str;
        this.f2684a = sharedPreferences;
        this.f2687d = str2;
        this.f2688e = aVar;
        this.f2689f = dVar;
    }

    public static SharedPreferences a(Context context, String str, androidx.security.crypto.b bVar, d dVar, e eVar) {
        return b(str, bVar.a(), context, dVar, eVar);
    }

    @Deprecated
    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        m5.b.a();
        h5.a.b();
        Context applicationContext = context.getApplicationContext();
        a.b j10 = new a.b().h(dVar.g()).j(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        m c10 = j10.i("android-keystore://" + str2).d().c();
        a.b j11 = new a.b().h(eVar.g()).j(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        m c11 = j11.i("android-keystore://" + str2).d().c();
        g5.d dVar2 = (g5.d) c10.h(g5.d.class);
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), (g5.a) c11.h(g5.a.class), dVar2);
    }

    private Object f(String str) {
        if (g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String d10 = d(str);
            String string = this.f2684a.getString(d10, null);
            if (string == null) {
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(this.f2688e.b(u5.e.a(string, 0), d10.getBytes(StandardCharsets.UTF_8)));
            wrap.position(0);
            int i10 = wrap.getInt();
            c g10 = c.g(i10);
            if (g10 == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
            }
            switch (C0048a.f2690a[g10.ordinal()]) {
                case 1:
                    int i11 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i11);
                    String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                    if (charBuffer.equals("__NULL__")) {
                        return null;
                    }
                    return charBuffer;
                case 2:
                    return Integer.valueOf(wrap.getInt());
                case 3:
                    return Long.valueOf(wrap.getLong());
                case 4:
                    return Float.valueOf(wrap.getFloat());
                case 5:
                    return Boolean.valueOf(wrap.get() != 0);
                case 6:
                    s.b bVar = new s.b();
                    while (wrap.hasRemaining()) {
                        int i12 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i12);
                        wrap.position(wrap.position() + i12);
                        bVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (bVar.size() == 1 && "__NULL__".equals(bVar.r(0))) {
                        return null;
                    }
                    return bVar;
                default:
                    throw new SecurityException("Unhandled type for encrypted pref value: " + g10);
            }
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
        }
    }

    String c(String str) {
        try {
            String str2 = new String(this.f2689f.b(u5.e.a(str, 0), this.f2686c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.f2684a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return u5.e.d(this.f2689f.a(str.getBytes(StandardCharsets.UTF_8), this.f2686c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    Pair<String, String> e(String str, byte[] bArr) {
        String d10 = d(str);
        return new Pair<>(d10, u5.e.d(this.f2688e.a(bArr, d10.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f2684a.edit());
    }

    boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f2684a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String c10 = c(entry.getKey());
                hashMap.put(c10, f(c10));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) {
        Object f10 = f(str);
        return (f10 == null || !(f10 instanceof Boolean)) ? z10 : ((Boolean) f10).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) {
        Object f11 = f(str);
        return (f11 == null || !(f11 instanceof Float)) ? f10 : ((Float) f11).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) {
        Object f10 = f(str);
        return (f10 == null || !(f10 instanceof Integer)) ? i10 : ((Integer) f10).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) {
        Object f10 = f(str);
        return (f10 == null || !(f10 instanceof Long)) ? j10 : ((Long) f10).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object f10 = f(str);
        return (f10 == null || !(f10 instanceof String)) ? str2 : (String) f10;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Object f10 = f(str);
        Set<String> bVar = f10 instanceof Set ? (Set) f10 : new s.b<>();
        return bVar.size() > 0 ? bVar : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f2685b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f2685b.remove(onSharedPreferenceChangeListener);
    }
}
