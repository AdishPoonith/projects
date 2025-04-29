package c3;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import c3.a;
import f2.l;
import f2.p;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import o3.j0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p3.n0;
import s1.n1;
import s1.u2;
import w1.m;
/* loaded from: classes.dex */
public class b implements j0.a<c3.a> {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f3219a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f3220a;

        /* renamed from: b  reason: collision with root package name */
        private final String f3221b;

        /* renamed from: c  reason: collision with root package name */
        private final a f3222c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Pair<String, Object>> f3223d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f3222c = aVar;
            this.f3220a = str;
            this.f3221b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        protected void a(Object obj) {
        }

        protected abstract Object b();

        protected final Object c(String str) {
            for (int i10 = 0; i10 < this.f3223d.size(); i10++) {
                Pair<String, Object> pair = this.f3223d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f3222c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        protected boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f3221b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e10 = e(this, name, this.f3220a);
                            if (e10 == null) {
                                i10 = 1;
                            } else {
                                a(e10.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        protected final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        protected void h(XmlPullParser xmlPullParser) {
        }

        protected final int i(XmlPullParser xmlPullParser, String str, int i10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e10) {
                    throw u2.c(null, e10);
                }
            }
            return i10;
        }

        protected final long j(XmlPullParser xmlPullParser, String str, long j10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e10) {
                    throw u2.c(null, e10);
                }
            }
            return j10;
        }

        protected final int k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e10) {
                    throw u2.c(null, e10);
                }
            }
            throw new C0075b(str);
        }

        protected final long l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e10) {
                    throw u2.c(null, e10);
                }
            }
            throw new C0075b(str);
        }

        protected final String m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0075b(str);
        }

        protected abstract void n(XmlPullParser xmlPullParser);

        protected void o(XmlPullParser xmlPullParser) {
        }

        protected final void p(String str, Object obj) {
            this.f3223d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: c3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0075b extends u2 {
        public C0075b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends a {

        /* renamed from: e  reason: collision with root package name */
        private boolean f3224e;

        /* renamed from: f  reason: collision with root package name */
        private UUID f3225f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f3226g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        private static p[] q(byte[] bArr) {
            return new p[]{new p(true, null, 8, r(bArr), 0, 0, null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb.append((char) bArr[i10]);
            }
            String sb2 = sb.toString();
            byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        private static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        private static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // c3.b.a
        public Object b() {
            UUID uuid = this.f3225f;
            return new a.C0074a(uuid, l.a(uuid, this.f3226g), q(this.f3226g));
        }

        @Override // c3.b.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // c3.b.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f3224e = false;
            }
        }

        @Override // c3.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f3224e = true;
                this.f3225f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // c3.b.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f3224e) {
                this.f3226g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends a {

        /* renamed from: e  reason: collision with root package name */
        private n1 f3227e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        private static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] J = n0.J(str);
                byte[][] i10 = p3.e.i(J);
                if (i10 == null) {
                    arrayList.add(J);
                } else {
                    Collections.addAll(arrayList, i10);
                }
            }
            return arrayList;
        }

        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // c3.b.a
        public Object b() {
            return this.f3227e;
        }

        @Override // c3.b.a
        public void n(XmlPullParser xmlPullParser) {
            n1.b bVar = new n1.b();
            String r10 = r(m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                bVar.M("video/mp4").n0(k(xmlPullParser, "MaxWidth")).S(k(xmlPullParser, "MaxHeight")).V(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r10 == null) {
                    r10 = "audio/mp4a-latm";
                }
                int k10 = k(xmlPullParser, "Channels");
                int k11 = k(xmlPullParser, "SamplingRate");
                List<byte[]> q10 = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (q10.isEmpty() && "audio/mp4a-latm".equals(r10)) {
                    q10 = Collections.singletonList(u1.a.a(k11, k10));
                }
                bVar.M("audio/mp4").J(k10).h0(k11).V(q10);
            } else if (intValue == 3) {
                int i10 = 0;
                String str = (String) c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i10 = 64;
                    } else if (str.equals("DESC")) {
                        i10 = 1024;
                    }
                }
                bVar.M("application/mp4").e0(i10);
            } else {
                bVar.M("application/mp4");
            }
            this.f3227e = bVar.U(xmlPullParser.getAttributeValue(null, "Index")).W((String) c("Name")).g0(r10).I(k(xmlPullParser, "Bitrate")).X((String) c("Language")).G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends a {

        /* renamed from: e  reason: collision with root package name */
        private final List<a.b> f3228e;

        /* renamed from: f  reason: collision with root package name */
        private int f3229f;

        /* renamed from: g  reason: collision with root package name */
        private int f3230g;

        /* renamed from: h  reason: collision with root package name */
        private long f3231h;

        /* renamed from: i  reason: collision with root package name */
        private long f3232i;

        /* renamed from: j  reason: collision with root package name */
        private long f3233j;

        /* renamed from: k  reason: collision with root package name */
        private int f3234k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f3235l;

        /* renamed from: m  reason: collision with root package name */
        private a.C0074a f3236m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f3234k = -1;
            this.f3236m = null;
            this.f3228e = new LinkedList();
        }

        @Override // c3.b.a
        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f3228e.add((a.b) obj);
            } else if (obj instanceof a.C0074a) {
                p3.a.f(this.f3236m == null);
                this.f3236m = (a.C0074a) obj;
            }
        }

        @Override // c3.b.a
        public Object b() {
            int size = this.f3228e.size();
            a.b[] bVarArr = new a.b[size];
            this.f3228e.toArray(bVarArr);
            if (this.f3236m != null) {
                a.C0074a c0074a = this.f3236m;
                m mVar = new m(new m.b(c0074a.f3200a, "video/mp4", c0074a.f3201b));
                for (int i10 = 0; i10 < size; i10++) {
                    a.b bVar = bVarArr[i10];
                    int i11 = bVar.f3203a;
                    if (i11 == 2 || i11 == 1) {
                        n1[] n1VarArr = bVar.f3212j;
                        for (int i12 = 0; i12 < n1VarArr.length; i12++) {
                            n1VarArr[i12] = n1VarArr[i12].b().O(mVar).G();
                        }
                    }
                }
            }
            return new c3.a(this.f3229f, this.f3230g, this.f3231h, this.f3232i, this.f3233j, this.f3234k, this.f3235l, this.f3236m, bVarArr);
        }

        @Override // c3.b.a
        public void n(XmlPullParser xmlPullParser) {
            this.f3229f = k(xmlPullParser, "MajorVersion");
            this.f3230g = k(xmlPullParser, "MinorVersion");
            this.f3231h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f3232i = l(xmlPullParser, "Duration");
            this.f3233j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f3234k = i(xmlPullParser, "LookaheadCount", -1);
            this.f3235l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f3231h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends a {

        /* renamed from: e  reason: collision with root package name */
        private final String f3237e;

        /* renamed from: f  reason: collision with root package name */
        private final List<n1> f3238f;

        /* renamed from: g  reason: collision with root package name */
        private int f3239g;

        /* renamed from: h  reason: collision with root package name */
        private String f3240h;

        /* renamed from: i  reason: collision with root package name */
        private long f3241i;

        /* renamed from: j  reason: collision with root package name */
        private String f3242j;

        /* renamed from: k  reason: collision with root package name */
        private String f3243k;

        /* renamed from: l  reason: collision with root package name */
        private int f3244l;

        /* renamed from: m  reason: collision with root package name */
        private int f3245m;

        /* renamed from: n  reason: collision with root package name */
        private int f3246n;

        /* renamed from: o  reason: collision with root package name */
        private int f3247o;

        /* renamed from: p  reason: collision with root package name */
        private String f3248p;

        /* renamed from: q  reason: collision with root package name */
        private ArrayList<Long> f3249q;

        /* renamed from: r  reason: collision with root package name */
        private long f3250r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f3237e = str;
            this.f3238f = new LinkedList();
        }

        private void q(XmlPullParser xmlPullParser) {
            int s10 = s(xmlPullParser);
            this.f3239g = s10;
            p("Type", Integer.valueOf(s10));
            this.f3240h = this.f3239g == 3 ? m(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            p("Subtype", this.f3240h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f3242j = attributeValue;
            p("Name", attributeValue);
            this.f3243k = m(xmlPullParser, "Url");
            this.f3244l = i(xmlPullParser, "MaxWidth", -1);
            this.f3245m = i(xmlPullParser, "MaxHeight", -1);
            this.f3246n = i(xmlPullParser, "DisplayWidth", -1);
            this.f3247o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f3248p = attributeValue2;
            p("Language", attributeValue2);
            long i10 = i(xmlPullParser, "TimeScale", -1);
            this.f3241i = i10;
            if (i10 == -1) {
                this.f3241i = ((Long) c("TimeScale")).longValue();
            }
            this.f3249q = new ArrayList<>();
        }

        private void r(XmlPullParser xmlPullParser) {
            int size = this.f3249q.size();
            long j10 = j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (j10 == -9223372036854775807L) {
                if (size == 0) {
                    j10 = 0;
                } else if (this.f3250r == -1) {
                    throw u2.c("Unable to infer start time", null);
                } else {
                    j10 = this.f3249q.get(size - 1).longValue() + this.f3250r;
                }
            }
            this.f3249q.add(Long.valueOf(j10));
            this.f3250r = j(xmlPullParser, "d", -9223372036854775807L);
            long j11 = j(xmlPullParser, "r", 1L);
            if (j11 > 1 && this.f3250r == -9223372036854775807L) {
                throw u2.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j12 = i10;
                if (j12 >= j11) {
                    return;
                }
                this.f3249q.add(Long.valueOf((this.f3250r * j12) + j10));
                i10++;
            }
        }

        private int s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if ("audio".equalsIgnoreCase(attributeValue)) {
                    return 1;
                }
                if ("video".equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                throw u2.c("Invalid key value[" + attributeValue + "]", null);
            }
            throw new C0075b("Type");
        }

        @Override // c3.b.a
        public void a(Object obj) {
            if (obj instanceof n1) {
                this.f3238f.add((n1) obj);
            }
        }

        @Override // c3.b.a
        public Object b() {
            n1[] n1VarArr = new n1[this.f3238f.size()];
            this.f3238f.toArray(n1VarArr);
            return new a.b(this.f3237e, this.f3243k, this.f3239g, this.f3240h, this.f3241i, this.f3242j, this.f3244l, this.f3245m, this.f3246n, this.f3247o, this.f3248p, n1VarArr, this.f3249q, this.f3250r);
        }

        @Override // c3.b.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // c3.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public b() {
        try {
            this.f3219a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // o3.j0.a
    /* renamed from: b */
    public c3.a a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f3219a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (c3.a) new e(null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e10) {
            throw u2.c(null, e10);
        }
    }
}
