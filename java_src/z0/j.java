package z0;

import android.text.TextUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.f0;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f20674a = new j();

    private j() {
    }

    public static final File a() {
        if (k1.a.d(j.class)) {
            return null;
        }
        try {
            f0 f0Var = f0.f14852a;
            File file = new File(f0.l().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            k1.a.b(th, j.class);
            return null;
        }
    }

    public static final Map<String, a> c(File file) {
        Map<String, a> map;
        Map<String, a> map2 = null;
        if (k1.a.d(j.class)) {
            return null;
        }
        try {
            l.e(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i10 = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i11 = wrap.getInt();
                int i12 = i11 + 4;
                if (available < i12) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i11, ka.d.f12805b));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                int i13 = length - 1;
                if (i13 >= 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        strArr[i14] = names.getString(i14);
                        if (i15 > i13) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                t9.j.h(strArr);
                HashMap hashMap = new HashMap();
                int i16 = 0;
                while (i16 < length) {
                    String str = strArr[i16];
                    i16++;
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i17 = length2 - 1;
                        int i18 = 1;
                        if (i17 >= 0) {
                            while (true) {
                                int i19 = i10 + 1;
                                try {
                                    iArr[i10] = jSONArray.getInt(i10);
                                    i18 *= iArr[i10];
                                    if (i19 > i17) {
                                        break;
                                    }
                                    i10 = i19;
                                } catch (Exception unused) {
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    map = null;
                                    k1.a.b(th, j.class);
                                    return map;
                                }
                            }
                        }
                        int i20 = i18 * 4;
                        int i21 = i12 + i20;
                        if (i21 > available) {
                            return null;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i12, i20);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        a aVar = new a(iArr);
                        wrap2.asFloatBuffer().get(aVar.a(), 0, i18);
                        hashMap.put(str, aVar);
                        i12 = i21;
                        map2 = null;
                        i10 = 0;
                    }
                }
                return hashMap;
            } catch (Exception unused2) {
                return map2;
            }
        } catch (Throwable th2) {
            th = th2;
            map = map2;
        }
    }

    public final String b(String str) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            l.e(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = l.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            Object[] array = new ka.f("\\s+").c(str.subSequence(i10, length + 1).toString(), 0).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                l.d(join, "join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public final int[] d(String texts, int i10) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            l.e(texts, "texts");
            int[] iArr = new int[i10];
            String b10 = b(texts);
            Charset forName = Charset.forName("UTF-8");
            l.d(forName, "forName(\"UTF-8\")");
            if (b10 != null) {
                byte[] bytes = b10.getBytes(forName);
                l.d(bytes, "(this as java.lang.String).getBytes(charset)");
                if (i10 > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        if (i11 < bytes.length) {
                            iArr[i11] = bytes[i11] & 255;
                        } else {
                            iArr[i11] = 0;
                        }
                        if (i12 >= i10) {
                            break;
                        }
                        i11 = i12;
                    }
                }
                return iArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }
}
