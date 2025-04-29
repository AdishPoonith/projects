package w7;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Map;
/* loaded from: classes.dex */
public class m {

    /* renamed from: e  reason: collision with root package name */
    private static final d f20030e = d.RSA_ECB_PKCS1Padding;

    /* renamed from: f  reason: collision with root package name */
    private static final l f20031f = l.AES_CBC_PKCS7Padding;

    /* renamed from: a  reason: collision with root package name */
    private final d f20032a;

    /* renamed from: b  reason: collision with root package name */
    private final l f20033b;

    /* renamed from: c  reason: collision with root package name */
    private final d f20034c;

    /* renamed from: d  reason: collision with root package name */
    private final l f20035d;

    public m(SharedPreferences sharedPreferences, Map<String, Object> map) {
        d dVar = f20030e;
        this.f20032a = d.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmKey", dVar.name()));
        l lVar = f20031f;
        this.f20033b = l.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmStorage", lVar.name()));
        d valueOf = d.valueOf(b(map, "keyCipherAlgorithm", dVar.name()));
        int i10 = valueOf.f20017k;
        int i11 = Build.VERSION.SDK_INT;
        this.f20034c = i10 <= i11 ? valueOf : dVar;
        l valueOf2 = l.valueOf(b(map, "storageCipherAlgorithm", lVar.name()));
        this.f20035d = valueOf2.f20029k <= i11 ? valueOf2 : lVar;
    }

    private String b(Map<String, Object> map, String str, String str2) {
        Object obj = map.get(str);
        return obj != null ? obj.toString() : str2;
    }

    public i a(Context context) {
        return this.f20035d.f20028j.a(context, this.f20034c.f20016j.a(context));
    }

    public i c(Context context) {
        return this.f20033b.f20028j.a(context, this.f20032a.f20016j.a(context));
    }

    public void d(SharedPreferences.Editor editor) {
        editor.remove("FlutterSecureSAlgorithmKey");
        editor.remove("FlutterSecureSAlgorithmStorage");
    }

    public boolean e() {
        return (this.f20032a == this.f20034c && this.f20033b == this.f20035d) ? false : true;
    }

    public void f(SharedPreferences.Editor editor) {
        editor.putString("FlutterSecureSAlgorithmKey", this.f20034c.name());
        editor.putString("FlutterSecureSAlgorithmStorage", this.f20035d.name());
    }
}
