package n5;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.shaded.protobuf.q;
import g5.o;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import t5.c0;
import t5.t;
import u5.k;
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f14302a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14303b;

    public d(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f14303b = str;
        Context applicationContext = context.getApplicationContext();
        this.f14302a = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0);
    }

    private byte[] b() {
        try {
            String string = this.f14302a.getString(this.f14303b, null);
            if (string != null) {
                return k.a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.f14303b));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.f14303b));
        }
    }

    @Override // g5.o
    public t a() {
        return t.S(b(), q.b());
    }

    @Override // g5.o
    public c0 read() {
        return c0.X(b(), q.b());
    }
}
