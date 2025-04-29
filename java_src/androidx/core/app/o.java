package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f1613a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f1614b;

    /* renamed from: c  reason: collision with root package name */
    String f1615c;

    /* renamed from: d  reason: collision with root package name */
    String f1616d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1617e;

    /* renamed from: f  reason: collision with root package name */
    boolean f1618f;

    /* loaded from: classes.dex */
    static class a {
        static o a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.a(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(o oVar) {
            return new Person.Builder().setName(oVar.c()).setIcon(oVar.a() != null ? oVar.a().o() : null).setUri(oVar.d()).setKey(oVar.b()).setBot(oVar.e()).setImportant(oVar.f()).build();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        CharSequence f1619a;

        /* renamed from: b  reason: collision with root package name */
        IconCompat f1620b;

        /* renamed from: c  reason: collision with root package name */
        String f1621c;

        /* renamed from: d  reason: collision with root package name */
        String f1622d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1623e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1624f;

        public o a() {
            return new o(this);
        }

        public b b(boolean z10) {
            this.f1623e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f1620b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f1624f = z10;
            return this;
        }

        public b e(String str) {
            this.f1622d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f1619a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f1621c = str;
            return this;
        }
    }

    o(b bVar) {
        this.f1613a = bVar.f1619a;
        this.f1614b = bVar.f1620b;
        this.f1615c = bVar.f1621c;
        this.f1616d = bVar.f1622d;
        this.f1617e = bVar.f1623e;
        this.f1618f = bVar.f1624f;
    }

    public IconCompat a() {
        return this.f1614b;
    }

    public String b() {
        return this.f1616d;
    }

    public CharSequence c() {
        return this.f1613a;
    }

    public String d() {
        return this.f1615c;
    }

    public boolean e() {
        return this.f1617e;
    }

    public boolean f() {
        return this.f1618f;
    }

    public String g() {
        String str = this.f1615c;
        if (str != null) {
            return str;
        }
        if (this.f1613a != null) {
            return "name:" + ((Object) this.f1613a);
        }
        return "";
    }

    public Person h() {
        return a.b(this);
    }
}
