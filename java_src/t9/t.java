package t9;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t extends s {
    public static <T> void k(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.l.e(list, "<this>");
        kotlin.jvm.internal.l.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
