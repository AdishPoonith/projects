package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    private static final h f1764b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    private final j f1765a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private h(j jVar) {
        this.f1765a = jVar;
    }

    public static h a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? d(a.a(localeArr)) : new h(new i(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static h d(LocaleList localeList) {
        return new h(new k(localeList));
    }

    public Locale c(int i10) {
        return this.f1765a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && this.f1765a.equals(((h) obj).f1765a);
    }

    public int hashCode() {
        return this.f1765a.hashCode();
    }

    public String toString() {
        return this.f1765a.toString();
    }
}
