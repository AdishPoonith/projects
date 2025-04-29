package q8;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q8.d;
import r8.a;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final r8.a<Object> f16332a;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final KeyEvent f16333a;

        /* renamed from: b  reason: collision with root package name */
        public final Character f16334b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f16333a = keyEvent;
            this.f16334b = ch;
        }
    }

    public d(r8.c cVar) {
        this.f16332a = new r8.a<>(cVar, "flutter/keyevent", r8.f.f16775a);
    }

    private static a.e<Object> b(final a aVar) {
        return new a.e() { // from class: q8.c
            @Override // r8.a.e
            public final void a(Object obj) {
                d.d(d.a.this, obj);
            }
        };
    }

    private Map<String, Object> c(b bVar, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z10 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f16333a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f16333a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f16333a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f16333a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f16333a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f16333a.getMetaState()));
        Character ch = bVar.f16334b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f16333a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f16333a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f16333a.getRepeatCount()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(a aVar, Object obj) {
        boolean z10 = false;
        if (obj != null) {
            try {
                z10 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e10) {
                d8.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e10);
            }
        }
        aVar.a(z10);
    }

    public void e(b bVar, boolean z10, a aVar) {
        this.f16332a.d(c(bVar, z10), b(aVar));
    }
}
