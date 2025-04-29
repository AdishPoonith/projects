package q8;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public final r8.a<Object> f16446a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final r8.a<Object> f16447a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, Object> f16448b = new HashMap();

        a(r8.a<Object> aVar) {
            this.f16447a = aVar;
        }

        public void a() {
            d8.b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f16448b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f16448b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f16448b.get("platformBrightness"));
            this.f16447a.c(this.f16448b);
        }

        public a b(boolean z10) {
            this.f16448b.put("brieflyShowPassword", Boolean.valueOf(z10));
            return this;
        }

        public a c(boolean z10) {
            this.f16448b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z10));
            return this;
        }

        public a d(b bVar) {
            this.f16448b.put("platformBrightness", bVar.f16452j);
            return this;
        }

        public a e(float f10) {
            this.f16448b.put("textScaleFactor", Float.valueOf(f10));
            return this;
        }

        public a f(boolean z10) {
            this.f16448b.put("alwaysUse24HourFormat", Boolean.valueOf(z10));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        light("light"),
        dark("dark");
        

        /* renamed from: j  reason: collision with root package name */
        public String f16452j;

        b(String str) {
            this.f16452j = str;
        }
    }

    public m(e8.a aVar) {
        this.f16446a = new r8.a<>(aVar, "flutter/settings", r8.f.f16775a);
    }

    public a a() {
        return new a(this.f16446a);
    }
}
