package q8;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public final r8.k f16458a;

    /* renamed from: b  reason: collision with root package name */
    private f f16459b;

    /* renamed from: c  reason: collision with root package name */
    final k.c f16460c;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        @Override // r8.k.c
        public void I(r8.j jVar, k.d dVar) {
            String message;
            Bundle bundle;
            if (p.this.f16459b == null) {
                return;
            }
            String str = jVar.f16777a;
            Object obj = jVar.f16778b;
            d8.b.f("TextInputChannel", "Received '" + str + "' message.");
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1779068172:
                    if (str.equals("TextInput.setPlatformViewClient")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1015421462:
                    if (str.equals("TextInput.setEditingState")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -37561188:
                    if (str.equals("TextInput.setClient")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 270476819:
                    if (str.equals("TextInput.hide")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 270803918:
                    if (str.equals("TextInput.show")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 649192816:
                    if (str.equals("TextInput.sendAppPrivateCommand")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1204752139:
                    if (str.equals("TextInput.setEditableSizeAndTransform")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1727570905:
                    if (str.equals("TextInput.finishAutofillContext")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1904427655:
                    if (str.equals("TextInput.clearClient")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 2113369584:
                    if (str.equals("TextInput.requestAutofill")) {
                        c10 = '\t';
                        break;
                    }
                    break;
            }
            try {
                switch (c10) {
                    case 0:
                        JSONObject jSONObject = (JSONObject) obj;
                        p.this.f16459b.d(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.a(null);
                        return;
                    case 1:
                        p.this.f16459b.f(e.a((JSONObject) obj));
                        dVar.a(null);
                        return;
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            p.this.f16459b.h(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                            dVar.a(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e10) {
                            message = e10.getMessage();
                            dVar.b("error", message, null);
                            return;
                        }
                    case 3:
                        p.this.f16459b.j();
                        break;
                    case 4:
                        p.this.f16459b.a();
                        break;
                    case 5:
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        p.this.f16459b.c(string, bundle);
                        dVar.a(null);
                        return;
                    case 6:
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d10 = jSONObject3.getDouble("width");
                        double d11 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i10 = 0; i10 < 16; i10++) {
                            dArr[i10] = jSONArray2.getDouble(i10);
                        }
                        p.this.f16459b.e(d10, d11, dArr);
                        dVar.a(null);
                        return;
                    case 7:
                        p.this.f16459b.i(((Boolean) obj).booleanValue());
                        break;
                    case '\b':
                        p.this.f16459b.b();
                        break;
                    case '\t':
                        p.this.f16459b.g();
                        break;
                    default:
                        dVar.c();
                        return;
                }
                dVar.a(null);
            } catch (JSONException e11) {
                message = e11.getMessage();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16462a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16463b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16464c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f16465d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f16466e;

        /* renamed from: f  reason: collision with root package name */
        public final d f16467f;

        /* renamed from: g  reason: collision with root package name */
        public final c f16468g;

        /* renamed from: h  reason: collision with root package name */
        public final Integer f16469h;

        /* renamed from: i  reason: collision with root package name */
        public final String f16470i;

        /* renamed from: j  reason: collision with root package name */
        public final a f16471j;

        /* renamed from: k  reason: collision with root package name */
        public final String[] f16472k;

        /* renamed from: l  reason: collision with root package name */
        public final b[] f16473l;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f16474a;

            /* renamed from: b  reason: collision with root package name */
            public final String[] f16475b;

            /* renamed from: c  reason: collision with root package name */
            public final e f16476c;

            /* renamed from: d  reason: collision with root package name */
            public final String f16477d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f16474a = str;
                this.f16475b = strArr;
                this.f16477d = str2;
                this.f16476c = eVar;
            }

            public static a a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = b(jSONArray.getString(i10));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
                if (r16.equals("familyName") == false) goto L7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String b(java.lang.String r16) {
                /*
                    Method dump skipped, instructions count: 802
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: q8.p.b.a.b(java.lang.String):java.lang.String");
            }
        }

        public b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.f16462a = z10;
            this.f16463b = z11;
            this.f16464c = z12;
            this.f16465d = z13;
            this.f16466e = z14;
            this.f16467f = dVar;
            this.f16468g = cVar;
            this.f16469h = num;
            this.f16470i = str;
            this.f16471j = aVar;
            this.f16472k = strArr;
            this.f16473l = bVarArr;
        }

        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            String string = jSONObject.getString("inputAction");
            if (string != null) {
                if (jSONObject.isNull("fields")) {
                    bVarArr = null;
                } else {
                    JSONArray jSONArray = jSONObject.getJSONArray("fields");
                    int length = jSONArray.length();
                    b[] bVarArr2 = new b[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        bVarArr2[i10] = a(jSONArray.getJSONObject(i10));
                    }
                    bVarArr = bVarArr2;
                }
                Integer b10 = b(string);
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
                if (jSONArray2 != null) {
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        arrayList.add(jSONArray2.optString(i11));
                    }
                }
                return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.b(jSONObject.getString("textCapitalization")), c.a(jSONObject.getJSONObject("inputType")), b10, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.a(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L3;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.Integer b(java.lang.String r12) {
            /*
                r12.hashCode()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L75;
                    case -737377923: goto L6c;
                    case -737089298: goto L61;
                    case -737080013: goto L56;
                    case -736940669: goto L4b;
                    case 469250275: goto L40;
                    case 1241689507: goto L35;
                    case 1539450297: goto L2a;
                    case 2110497650: goto L1e;
                    default: goto L1b;
                }
            L1b:
                r7 = -1
                goto L7f
            L1e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L27
                goto L1b
            L27:
                r7 = 8
                goto L7f
            L2a:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L33
                goto L1b
            L33:
                r7 = 7
                goto L7f
            L35:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L3e
                goto L1b
            L3e:
                r7 = 6
                goto L7f
            L40:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L49
                goto L1b
            L49:
                r7 = 5
                goto L7f
            L4b:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L54
                goto L1b
            L54:
                r7 = 4
                goto L7f
            L56:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L5f
                goto L1b
            L5f:
                r7 = 3
                goto L7f
            L61:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L6a
                goto L1b
            L6a:
                r7 = 2
                goto L7f
            L6c:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L7f
                goto L1b
            L75:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L7e
                goto L1b
            L7e:
                r7 = 0
            L7f:
                switch(r7) {
                    case 0: goto La3;
                    case 1: goto L9e;
                    case 2: goto L99;
                    case 3: goto L98;
                    case 4: goto L93;
                    case 5: goto L8e;
                    case 6: goto L89;
                    case 7: goto L88;
                    case 8: goto L83;
                    default: goto L82;
                }
            L82:
                return r10
            L83:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L88:
                return r8
            L89:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L8e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L93:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L98:
                return r8
            L99:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L9e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            La3:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: q8.p.b.b(java.lang.String):java.lang.Integer");
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f16478a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16479b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16480c;

        public c(g gVar, boolean z10, boolean z11) {
            this.f16478a = gVar;
            this.f16479b = z10;
            this.f16480c = z11;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.b(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        

        /* renamed from: j  reason: collision with root package name */
        private final String f16486j;

        d(String str) {
            this.f16486j = str;
        }

        static d b(String str) {
            d[] values;
            for (d dVar : values()) {
                if (dVar.f16486j.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f16487a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16488b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16489c;

        /* renamed from: d  reason: collision with root package name */
        public final int f16490d;

        /* renamed from: e  reason: collision with root package name */
        public final int f16491e;

        public e(String str, int i10, int i11, int i12, int i13) {
            if (!(i10 == -1 && i11 == -1) && (i10 < 0 || i11 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i10) + ", " + String.valueOf(i11) + ")");
            } else if (!(i12 == -1 && i13 == -1) && (i12 < 0 || i12 > i13)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i12) + ", " + String.valueOf(i13) + ")");
            } else if (i13 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i12));
            } else if (i10 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i10));
            } else if (i11 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i11));
            } else {
                this.f16487a = str;
                this.f16488b = i10;
                this.f16489c = i11;
                this.f16490d = i12;
                this.f16491e = i13;
            }
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i10 = this.f16490d;
            return i10 >= 0 && this.f16491e > i10;
        }

        public boolean c() {
            return this.f16488b >= 0;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();

        void c(String str, Bundle bundle);

        void d(int i10, boolean z10);

        void e(double d10, double d11, double[] dArr);

        void f(e eVar);

        void g();

        void h(int i10, b bVar);

        void i(boolean z10);

        void j();
    }

    /* loaded from: classes.dex */
    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");
        

        /* renamed from: j  reason: collision with root package name */
        private final String f16504j;

        g(String str) {
            this.f16504j = str;
        }

        static g b(String str) {
            g[] values;
            for (g gVar : values()) {
                if (gVar.f16504j.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public p(e8.a aVar) {
        a aVar2 = new a();
        this.f16460c = aVar2;
        r8.k kVar = new r8.k(aVar, "flutter/textinput", r8.g.f16776a);
        this.f16458a = kVar;
        kVar.e(aVar2);
    }

    private static HashMap<Object, Object> c(ArrayList<io.flutter.plugin.editing.e> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<io.flutter.plugin.editing.e> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    private static HashMap<Object, Object> d(String str, int i10, int i11, int i12, int i13) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i10));
        hashMap.put("selectionExtent", Integer.valueOf(i11));
        hashMap.put("composingBase", Integer.valueOf(i12));
        hashMap.put("composingExtent", Integer.valueOf(i13));
        return hashMap;
    }

    public void b(int i10, Map<String, Object> map) {
        d8.b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.f16458a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.commitContent", map));
    }

    public void e(int i10) {
        d8.b.f("TextInputChannel", "Sending 'done' message.");
        this.f16458a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.done"));
    }

    public void f(int i10) {
        d8.b.f("TextInputChannel", "Sending 'go' message.");
        this.f16458a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.go"));
    }

    public void g(int i10) {
        d8.b.f("TextInputChannel", "Sending 'newline' message.");
        this.f16458a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.newline"));
    }

    public void h(int i10) {
        d8.b.f("TextInputChannel", "Sending 'next' message.");
        this.f16458a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.next"));
    }

    public void i(int i10, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f16458a.c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i10), hashMap));
    }

    public void j(int i10) {
        d8.b.f("TextInputChannel", "Sending 'previous' message.");
        this.f16458a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.previous"));
    }

    public void k() {
        this.f16458a.c("TextInputClient.requestExistingInputState", null);
    }

    public void l(int i10) {
        d8.b.f("TextInputChannel", "Sending 'search' message.");
        this.f16458a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.search"));
    }

    public void m(int i10) {
        d8.b.f("TextInputChannel", "Sending 'send' message.");
        this.f16458a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.send"));
    }

    public void n(f fVar) {
        this.f16459b = fVar;
    }

    public void o(int i10) {
        d8.b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.f16458a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.unspecified"));
    }

    public void p(int i10, String str, int i11, int i12, int i13, int i14) {
        d8.b.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i11 + "\nSelection end: " + i12 + "\nComposing start: " + i13 + "\nComposing end: " + i14);
        this.f16458a.c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i10), d(str, i11, i12, i13, i14)));
    }

    public void q(int i10, ArrayList<io.flutter.plugin.editing.e> arrayList) {
        d8.b.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.f16458a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i10), c(arrayList)));
    }

    public void r(int i10, HashMap<String, e> hashMap) {
        d8.b.f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, e> entry : hashMap.entrySet()) {
            e value = entry.getValue();
            hashMap2.put(entry.getKey(), d(value.f16487a, value.f16488b, value.f16489c, -1, -1));
        }
        this.f16458a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i10), hashMap2));
    }
}
