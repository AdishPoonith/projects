package m6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class u extends e<u> {

    /* renamed from: k  reason: collision with root package name */
    public static final u f13841k = new u(Collections.emptyList());

    private u(List<String> list) {
        super(list);
    }

    public static u u(List<String> list) {
        return list.isEmpty() ? f13841k : new u(list);
    }

    public static u v(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException("Invalid path (" + str + "). Paths must not contain // in them.");
        }
        String[] split = str.split("/");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new u(arrayList);
    }

    @Override // m6.e
    public String h() {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < this.f13798j.size(); i10++) {
            if (i10 > 0) {
                sb.append("/");
            }
            sb.append(this.f13798j.get(i10));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // m6.e
    /* renamed from: t */
    public u k(List<String> list) {
        return new u(list);
    }
}
