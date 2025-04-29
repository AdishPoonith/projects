package l9;

import java.io.IOException;
/* loaded from: classes.dex */
public enum i {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: j  reason: collision with root package name */
    private final String f13560j;

    i(String str) {
        this.f13560j = str;
    }

    public static i b(String str) {
        i iVar = HTTP_1_0;
        if (str.equals(iVar.f13560j)) {
            return iVar;
        }
        i iVar2 = HTTP_1_1;
        if (str.equals(iVar2.f13560j)) {
            return iVar2;
        }
        i iVar3 = HTTP_2;
        if (str.equals(iVar3.f13560j)) {
            return iVar3;
        }
        i iVar4 = SPDY_3;
        if (str.equals(iVar4.f13560j)) {
            return iVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f13560j;
    }
}
