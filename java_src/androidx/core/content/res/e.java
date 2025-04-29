package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final d[] f1655a;

        public c(d[] dVarArr) {
            this.f1655a = dVarArr;
        }

        public d[] a() {
            return this.f1655a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f1656a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1657b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f1658c;

        /* renamed from: d  reason: collision with root package name */
        private final String f1659d;

        /* renamed from: e  reason: collision with root package name */
        private final int f1660e;

        /* renamed from: f  reason: collision with root package name */
        private final int f1661f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f1656a = str;
            this.f1657b = i10;
            this.f1658c = z10;
            this.f1659d = str2;
            this.f1660e = i11;
            this.f1661f = i12;
        }

        public String a() {
            return this.f1656a;
        }

        public int b() {
            return this.f1661f;
        }

        public int c() {
            return this.f1660e;
        }

        public String d() {
            return this.f1659d;
        }

        public int e() {
            return this.f1657b;
        }

        public boolean f() {
            return this.f1658c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0023e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.core.provider.e f1662a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1663b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1664c;

        /* renamed from: d  reason: collision with root package name */
        private final String f1665d;

        public C0023e(androidx.core.provider.e eVar, int i10, int i11, String str) {
            this.f1662a = eVar;
            this.f1664c = i10;
            this.f1663b = i11;
            this.f1665d = str;
        }

        public int a() {
            return this.f1664c;
        }

        public androidx.core.provider.e b() {
            return this.f1662a;
        }

        public String c() {
            return this.f1665d;
        }

        public int d() {
            return this.f1663b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), t.c.f17886h);
        String string = obtainAttributes.getString(t.c.f17887i);
        String string2 = obtainAttributes.getString(t.c.f17891m);
        String string3 = obtainAttributes.getString(t.c.f17892n);
        int resourceId = obtainAttributes.getResourceId(t.c.f17888j, 0);
        int integer = obtainAttributes.getInteger(t.c.f17889k, 1);
        int integer2 = obtainAttributes.getInteger(t.c.f17890l, 500);
        String string4 = obtainAttributes.getString(t.c.f17893o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0023e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), t.c.f17894p);
        int i10 = t.c.f17903y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = t.c.f17896r;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = t.c.f17901w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = t.c.f17897s;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = t.c.f17904z;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = t.c.f17898t;
        }
        int i14 = t.c.f17902x;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = t.c.f17899u;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = t.c.f17900v;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = t.c.f17895q;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
