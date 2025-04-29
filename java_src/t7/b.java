package t7;
/* loaded from: classes.dex */
public enum b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: j  reason: collision with root package name */
    private final int[] f18347j;

    /* renamed from: k  reason: collision with root package name */
    private final int f18348k;

    b(int[] iArr, int i10) {
        this.f18347j = iArr;
        this.f18348k = i10;
    }

    public int b() {
        return this.f18348k;
    }

    public int g(c cVar) {
        int f10 = cVar.f();
        return this.f18347j[f10 <= 9 ? (char) 0 : f10 <= 26 ? (char) 1 : (char) 2];
    }
}
