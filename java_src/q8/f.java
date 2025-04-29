package q8;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final r8.k f16336a;

    /* renamed from: b  reason: collision with root package name */
    private b f16337b;

    /* renamed from: c  reason: collision with root package name */
    public final k.c f16338c;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        @Override // r8.k.c
        public void I(r8.j jVar, k.d dVar) {
            if (f.this.f16337b == null) {
                return;
            }
            String str = jVar.f16777a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.c();
                return;
            }
            JSONObject jSONObject = (JSONObject) jVar.b();
            try {
                dVar.a(f.this.f16337b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e10) {
                dVar.b("error", e10.getMessage(), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        String a(String str, String str2);
    }

    public f(e8.a aVar) {
        a aVar2 = new a();
        this.f16338c = aVar2;
        r8.k kVar = new r8.k(aVar, "flutter/localization", r8.g.f16776a);
        this.f16336a = kVar;
        kVar.e(aVar2);
    }

    public void b(List<Locale> list) {
        d8.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            d8.b.f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.f16336a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f16337b = bVar;
    }
}
