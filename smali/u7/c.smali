.class public final Lu7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x60

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lu7/c;->a:[I

    return-void

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        0x24
        -0x1
        -0x1
        -0x1
        0x25
        0x26
        -0x1
        -0x1
        -0x1
        -0x1
        0x27
        0x28
        -0x1
        0x29
        0x2a
        0x2b
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0x2c
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x14
        0x15
        0x16
        0x17
        0x18
        0x19
        0x1a
        0x1b
        0x1c
        0x1d
        0x1e
        0x1f
        0x20
        0x21
        0x22
        0x23
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
    .end array-data
.end method

.method static a(Ljava/lang/String;Ll7/a;Ljava/lang/String;)V
    .locals 3

    :try_start_0
    invoke-virtual {p0, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    array-length p2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    aget-byte v1, p0, v0

    const/16 v2, 0x8

    invoke-virtual {p1, v1, v2}, Ll7/a;->d(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p0

    new-instance p1, Li7/h;

    invoke-direct {p1, p0}, Li7/h;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method static b(Ljava/lang/CharSequence;Ll7/a;)V
    .locals 5

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lu7/c;->p(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    add-int/lit8 v4, v1, 0x1

    if-ge v4, v0, :cond_1

    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lu7/c;->p(I)I

    move-result v4

    if-eq v4, v3, :cond_0

    mul-int/lit8 v2, v2, 0x2d

    add-int/2addr v2, v4

    const/16 v3, 0xb

    invoke-virtual {p1, v2, v3}, Ll7/a;->d(II)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    new-instance p0, Li7/h;

    invoke-direct {p0}, Li7/h;-><init>()V

    throw p0

    :cond_1
    const/4 v1, 0x6

    invoke-virtual {p1, v2, v1}, Ll7/a;->d(II)V

    move v1, v4

    goto :goto_0

    :cond_2
    new-instance p0, Li7/h;

    invoke-direct {p0}, Li7/h;-><init>()V

    throw p0

    :cond_3
    return-void
.end method

.method static c(Ljava/lang/String;Lt7/b;Ll7/a;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lu7/c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p3, 0x4

    if-ne v0, p3, :cond_0

    invoke-static {p0, p2}, Lu7/c;->e(Ljava/lang/String;Ll7/a;)V

    return-void

    :cond_0
    new-instance p0, Li7/h;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Invalid mode: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Li7/h;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p0, p2, p3}, Lu7/c;->a(Ljava/lang/String;Ll7/a;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {p0, p2}, Lu7/c;->b(Ljava/lang/CharSequence;Ll7/a;)V

    return-void

    :cond_3
    invoke-static {p0, p2}, Lu7/c;->h(Ljava/lang/CharSequence;Ll7/a;)V

    return-void
.end method

.method private static d(Ll7/c;Ll7/a;)V
    .locals 2

    sget-object v0, Lt7/b;->q:Lt7/b;

    invoke-virtual {v0}, Lt7/b;->b()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Ll7/a;->d(II)V

    invoke-virtual {p0}, Ll7/c;->g()I

    move-result p0

    const/16 v0, 0x8

    invoke-virtual {p1, p0, v0}, Ll7/a;->d(II)V

    return-void
.end method

.method static e(Ljava/lang/String;Ll7/a;)V
    .locals 6

    :try_start_0
    const-string v0, "Shift_JIS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, p0, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v2, v3

    const v3, 0x8140

    const/4 v4, -0x1

    if-lt v2, v3, :cond_0

    const v5, 0x9ffc

    if-gt v2, v5, :cond_0

    :goto_1
    sub-int/2addr v2, v3

    goto :goto_2

    :cond_0
    const v3, 0xe040

    if-lt v2, v3, :cond_1

    const v3, 0xebbf

    if-gt v2, v3, :cond_1

    const v3, 0xc140

    goto :goto_1

    :cond_1
    const/4 v2, -0x1

    :goto_2
    if-eq v2, v4, :cond_2

    shr-int/lit8 v3, v2, 0x8

    mul-int/lit16 v3, v3, 0xc0

    and-int/lit16 v2, v2, 0xff

    add-int/2addr v3, v2

    const/16 v2, 0xd

    invoke-virtual {p1, v3, v2}, Ll7/a;->d(II)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_2
    new-instance p0, Li7/h;

    const-string p1, "Invalid byte sequence"

    invoke-direct {p0, p1}, Li7/h;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    return-void

    :catch_0
    move-exception p0

    new-instance p1, Li7/h;

    invoke-direct {p1, p0}, Li7/h;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method static f(ILt7/c;Lt7/b;Ll7/a;)V
    .locals 1

    invoke-virtual {p2, p1}, Lt7/b;->g(Lt7/c;)I

    move-result p1

    const/4 p2, 0x1

    shl-int v0, p2, p1

    if-ge p0, v0, :cond_0

    invoke-virtual {p3, p0, p1}, Ll7/a;->d(II)V

    return-void

    :cond_0
    new-instance p1, Li7/h;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " is bigger than "

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-int/2addr v0, p2

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Li7/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static g(Lt7/b;Ll7/a;)V
    .locals 1

    invoke-virtual {p0}, Lt7/b;->b()I

    move-result p0

    const/4 v0, 0x4

    invoke-virtual {p1, p0, v0}, Ll7/a;->d(II)V

    return-void
.end method

.method static h(Ljava/lang/CharSequence;Ll7/a;)V
    .locals 6

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    add-int/lit8 v2, v2, -0x30

    add-int/lit8 v3, v1, 0x2

    if-ge v3, v0, :cond_0

    add-int/lit8 v4, v1, 0x1

    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    add-int/lit8 v4, v4, -0x30

    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    add-int/lit8 v3, v3, -0x30

    mul-int/lit8 v2, v2, 0x64

    const/16 v5, 0xa

    mul-int/lit8 v4, v4, 0xa

    add-int/2addr v2, v4

    add-int/2addr v2, v3

    invoke-virtual {p1, v2, v5}, Ll7/a;->d(II)V

    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    if-ge v1, v0, :cond_1

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    add-int/lit8 v1, v1, -0x30

    mul-int/lit8 v2, v2, 0xa

    add-int/2addr v2, v1

    const/4 v1, 0x7

    invoke-virtual {p1, v2, v1}, Ll7/a;->d(II)V

    move v1, v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x4

    invoke-virtual {p1, v2, v3}, Ll7/a;->d(II)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static i(Lt7/b;Ll7/a;Ll7/a;Lt7/c;)I
    .locals 0

    invoke-virtual {p1}, Ll7/a;->i()I

    move-result p1

    invoke-virtual {p0, p3}, Lt7/b;->g(Lt7/c;)I

    move-result p0

    add-int/2addr p1, p0

    invoke-virtual {p2}, Ll7/a;->i()I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method private static j(Lu7/b;)I
    .locals 2

    invoke-static {p0}, Lu7/d;->a(Lu7/b;)I

    move-result v0

    invoke-static {p0}, Lu7/d;->c(Lu7/b;)I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p0}, Lu7/d;->d(Lu7/b;)I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p0}, Lu7/d;->e(Lu7/b;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method private static k(Ll7/a;Lt7/a;Lt7/c;Lu7/b;)I
    .locals 4

    const v0, 0x7fffffff

    const/4 v1, -0x1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    if-ge v2, v3, :cond_1

    invoke-static {p0, p1, p2, v2, p3}, Lu7/e;->a(Ll7/a;Lt7/a;Lt7/c;ILu7/b;)V

    invoke-static {p3}, Lu7/c;->j(Lu7/b;)I

    move-result v3

    if-ge v3, v0, :cond_0

    move v1, v2

    move v0, v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private static l(Ljava/lang/String;Ljava/lang/String;)Lt7/b;
    .locals 5

    const-string v0, "Shift_JIS"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lu7/c;->s(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p0, Lt7/b;->r:Lt7/b;

    return-object p0

    :cond_0
    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge p1, v2, :cond_3

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    const/4 v4, 0x1

    if-lt v2, v3, :cond_1

    const/16 v3, 0x39

    if-gt v2, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lu7/c;->p(I)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    const/4 v0, 0x1

    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    sget-object p0, Lt7/b;->p:Lt7/b;

    return-object p0

    :cond_3
    if-eqz v0, :cond_4

    sget-object p0, Lt7/b;->n:Lt7/b;

    return-object p0

    :cond_4
    if-eqz v1, :cond_5

    sget-object p0, Lt7/b;->m:Lt7/b;

    return-object p0

    :cond_5
    sget-object p0, Lt7/b;->p:Lt7/b;

    return-object p0
.end method

.method private static m(ILt7/a;)Lt7/c;
    .locals 3

    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x28

    if-gt v0, v1, :cond_1

    invoke-static {v0}, Lt7/c;->e(I)Lt7/c;

    move-result-object v1

    invoke-static {p0, v1, p1}, Lu7/c;->v(ILt7/c;Lt7/a;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Li7/h;

    const-string p1, "Data too big"

    invoke-direct {p0, p1}, Li7/h;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(Ljava/lang/String;Lt7/a;Ljava/util/Map;)Lu7/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt7/a;",
            "Ljava/util/Map<",
            "Li7/c;",
            "*>;)",
            "Lu7/f;"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    sget-object v2, Li7/c;->k:Li7/c;

    invoke-interface {p2, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    sget-object v3, Li7/c;->k:Li7/c;

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    const-string v3, "ISO-8859-1"

    :goto_1
    invoke-static {p0, v3}, Lu7/c;->l(Ljava/lang/String;Ljava/lang/String;)Lt7/b;

    move-result-object v4

    new-instance v5, Ll7/a;

    invoke-direct {v5}, Ll7/a;-><init>()V

    sget-object v6, Lt7/b;->p:Lt7/b;

    if-ne v4, v6, :cond_2

    if-eqz v2, :cond_2

    invoke-static {v3}, Ll7/c;->b(Ljava/lang/String;)Ll7/c;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2, v5}, Lu7/c;->d(Ll7/c;Ll7/a;)V

    :cond_2
    if-eqz p2, :cond_3

    sget-object v2, Li7/c;->u:Li7/c;

    invoke-interface {p2, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_4

    sget-object v0, Li7/c;->u:Li7/c;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lt7/b;->s:Lt7/b;

    invoke-static {v0, v5}, Lu7/c;->g(Lt7/b;Ll7/a;)V

    :cond_4
    invoke-static {v4, v5}, Lu7/c;->g(Lt7/b;Ll7/a;)V

    new-instance v0, Ll7/a;

    invoke-direct {v0}, Ll7/a;-><init>()V

    invoke-static {p0, v4, v0, v3}, Lu7/c;->c(Ljava/lang/String;Lt7/b;Ll7/a;Ljava/lang/String;)V

    if-eqz p2, :cond_6

    sget-object v1, Li7/c;->t:Li7/c;

    invoke-interface {p2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-static {p2}, Lt7/c;->e(I)Lt7/c;

    move-result-object p2

    invoke-static {v4, v5, v0, p2}, Lu7/c;->i(Lt7/b;Ll7/a;Ll7/a;Lt7/c;)I

    move-result v1

    invoke-static {v1, p2, p1}, Lu7/c;->v(ILt7/c;Lt7/a;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    new-instance p0, Li7/h;

    const-string p1, "Data too big for requested version"

    invoke-direct {p0, p1}, Li7/h;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-static {p1, v4, v5, v0}, Lu7/c;->t(Lt7/a;Lt7/b;Ll7/a;Ll7/a;)Lt7/c;

    move-result-object p2

    :goto_3
    new-instance v1, Ll7/a;

    invoke-direct {v1}, Ll7/a;-><init>()V

    invoke-virtual {v1, v5}, Ll7/a;->c(Ll7/a;)V

    if-ne v4, v6, :cond_7

    invoke-virtual {v0}, Ll7/a;->j()I

    move-result p0

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    :goto_4
    invoke-static {p0, p2, v4, v1}, Lu7/c;->f(ILt7/c;Lt7/b;Ll7/a;)V

    invoke-virtual {v1, v0}, Ll7/a;->c(Ll7/a;)V

    invoke-virtual {p2, p1}, Lt7/c;->c(Lt7/a;)Lt7/c$b;

    move-result-object p0

    invoke-virtual {p2}, Lt7/c;->d()I

    move-result v0

    invoke-virtual {p0}, Lt7/c$b;->d()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v0, v1}, Lu7/c;->u(ILl7/a;)V

    invoke-virtual {p2}, Lt7/c;->d()I

    move-result v2

    invoke-virtual {p0}, Lt7/c$b;->c()I

    move-result p0

    invoke-static {v1, v2, v0, p0}, Lu7/c;->r(Ll7/a;III)Ll7/a;

    move-result-object p0

    new-instance v0, Lu7/f;

    invoke-direct {v0}, Lu7/f;-><init>()V

    invoke-virtual {v0, p1}, Lu7/f;->c(Lt7/a;)V

    invoke-virtual {v0, v4}, Lu7/f;->f(Lt7/b;)V

    invoke-virtual {v0, p2}, Lu7/f;->g(Lt7/c;)V

    invoke-virtual {p2}, Lt7/c;->b()I

    move-result v1

    new-instance v2, Lu7/b;

    invoke-direct {v2, v1, v1}, Lu7/b;-><init>(II)V

    invoke-static {p0, p1, p2, v2}, Lu7/c;->k(Ll7/a;Lt7/a;Lt7/c;Lu7/b;)I

    move-result v1

    invoke-virtual {v0, v1}, Lu7/f;->d(I)V

    invoke-static {p0, p1, p2, v1, v2}, Lu7/e;->a(Ll7/a;Lt7/a;Lt7/c;ILu7/b;)V

    invoke-virtual {v0, v2}, Lu7/f;->e(Lu7/b;)V

    return-object v0
.end method

.method static o([BI)[B
    .locals 5

    array-length v0, p0

    add-int v1, v0, p1

    new-array v1, v1, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    aget-byte v4, p0, v3

    and-int/lit16 v4, v4, 0xff

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Lm7/c;

    sget-object v3, Lm7/a;->l:Lm7/a;

    invoke-direct {p0, v3}, Lm7/c;-><init>(Lm7/a;)V

    invoke-virtual {p0, v1, p1}, Lm7/c;->b([II)V

    new-array p0, p1, [B

    :goto_1
    if-ge v2, p1, :cond_1

    add-int v3, v0, v2

    aget v3, v1, v3

    int-to-byte v3, v3

    aput-byte v3, p0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object p0
.end method

.method static p(I)I
    .locals 2

    sget-object v0, Lu7/c;->a:[I

    array-length v1, v0

    if-ge p0, v1, :cond_0

    aget p0, v0, p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method static q(IIII[I[I)V
    .locals 6

    if-ge p3, p2, :cond_4

    rem-int v0, p0, p2

    sub-int v1, p2, v0

    div-int v2, p0, p2

    add-int/lit8 v3, v2, 0x1

    div-int/2addr p1, p2

    add-int/lit8 v4, p1, 0x1

    sub-int/2addr v2, p1

    sub-int/2addr v3, v4

    if-ne v2, v3, :cond_3

    add-int v5, v1, v0

    if-ne p2, v5, :cond_2

    add-int p2, p1, v2

    mul-int p2, p2, v1

    add-int v5, v4, v3

    mul-int v5, v5, v0

    add-int/2addr p2, v5

    if-ne p0, p2, :cond_1

    const/4 p0, 0x0

    if-ge p3, v1, :cond_0

    aput p1, p4, p0

    aput v2, p5, p0

    return-void

    :cond_0
    aput v4, p4, p0

    aput v3, p5, p0

    return-void

    :cond_1
    new-instance p0, Li7/h;

    const-string p1, "Total bytes mismatch"

    invoke-direct {p0, p1}, Li7/h;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Li7/h;

    const-string p1, "RS blocks mismatch"

    invoke-direct {p0, p1}, Li7/h;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Li7/h;

    const-string p1, "EC bytes mismatch"

    invoke-direct {p0, p1}, Li7/h;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Li7/h;

    const-string p1, "Block ID too large"

    invoke-direct {p0, p1}, Li7/h;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static r(Ll7/a;III)Ll7/a;
    .locals 17

    move/from16 v6, p1

    move/from16 v7, p2

    move/from16 v8, p3

    invoke-virtual/range {p0 .. p0}, Ll7/a;->j()I

    move-result v0

    if-ne v0, v7, :cond_9

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_0
    if-ge v11, v8, :cond_0

    const/4 v0, 0x1

    new-array v15, v0, [I

    new-array v5, v0, [I

    move/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    move v3, v11

    move-object v4, v15

    move-object/from16 v16, v5

    invoke-static/range {v0 .. v5}, Lu7/c;->q(IIII[I[I)V

    aget v0, v15, v10

    new-array v1, v0, [B

    shl-int/lit8 v2, v12, 0x3

    move-object/from16 v3, p0

    invoke-virtual {v3, v2, v1, v10, v0}, Ll7/a;->o(I[BII)V

    aget v2, v16, v10

    invoke-static {v1, v2}, Lu7/c;->o([BI)[B

    move-result-object v2

    new-instance v4, Lu7/a;

    invoke-direct {v4, v1, v2}, Lu7/a;-><init>([B[B)V

    invoke-interface {v9, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-static {v13, v0}, Ljava/lang/Math;->max(II)I

    move-result v13

    array-length v0, v2

    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    move-result v14

    aget v0, v15, v10

    add-int/2addr v12, v0

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_0
    if-ne v7, v12, :cond_8

    new-instance v0, Ll7/a;

    invoke-direct {v0}, Ll7/a;-><init>()V

    const/4 v1, 0x0

    :goto_1
    const/16 v2, 0x8

    if-ge v1, v13, :cond_3

    invoke-interface {v9}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu7/a;

    invoke-virtual {v4}, Lu7/a;->a()[B

    move-result-object v4

    array-length v5, v4

    if-ge v1, v5, :cond_1

    aget-byte v4, v4, v1

    invoke-virtual {v0, v4, v2}, Ll7/a;->d(II)V

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    :goto_3
    if-ge v10, v14, :cond_6

    invoke-interface {v9}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu7/a;

    invoke-virtual {v3}, Lu7/a;->b()[B

    move-result-object v3

    array-length v4, v3

    if-ge v10, v4, :cond_4

    aget-byte v3, v3, v10

    invoke-virtual {v0, v3, v2}, Ll7/a;->d(II)V

    goto :goto_4

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, Ll7/a;->j()I

    move-result v1

    if-ne v6, v1, :cond_7

    return-object v0

    :cond_7
    new-instance v1, Li7/h;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Interleaving error: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " and "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll7/a;->j()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " differ."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Li7/h;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    new-instance v0, Li7/h;

    const-string v1, "Data bytes does not match offset"

    invoke-direct {v0, v1}, Li7/h;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Li7/h;

    const-string v1, "Number of bits and data bytes does not match"

    invoke-direct {v0, v1}, Li7/h;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static s(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "Shift_JIS"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    array-length v1, p0

    rem-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_0

    return v0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    const/16 v4, 0x81

    if-lt v3, v4, :cond_1

    const/16 v4, 0x9f

    if-le v3, v4, :cond_2

    :cond_1
    const/16 v4, 0xe0

    if-lt v3, v4, :cond_3

    const/16 v4, 0xeb

    if-le v3, v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_3
    :goto_1
    return v0

    :cond_4
    const/4 p0, 0x1

    return p0

    :catch_0
    return v0
.end method

.method private static t(Lt7/a;Lt7/b;Ll7/a;Ll7/a;)Lt7/c;
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lt7/c;->e(I)Lt7/c;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lu7/c;->i(Lt7/b;Ll7/a;Ll7/a;Lt7/c;)I

    move-result v0

    invoke-static {v0, p0}, Lu7/c;->m(ILt7/a;)Lt7/c;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lu7/c;->i(Lt7/b;Ll7/a;Ll7/a;Lt7/c;)I

    move-result p1

    invoke-static {p1, p0}, Lu7/c;->m(ILt7/a;)Lt7/c;

    move-result-object p0

    return-object p0
.end method

.method static u(ILl7/a;)V
    .locals 4

    shl-int/lit8 v0, p0, 0x3

    invoke-virtual {p1}, Ll7/a;->i()I

    move-result v1

    if-gt v1, v0, :cond_5

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x4

    if-ge v2, v3, :cond_0

    invoke-virtual {p1}, Ll7/a;->i()I

    move-result v3

    if-ge v3, v0, :cond_0

    invoke-virtual {p1, v1}, Ll7/a;->a(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ll7/a;->i()I

    move-result v2

    and-int/lit8 v2, v2, 0x7

    const/16 v3, 0x8

    if-lez v2, :cond_1

    :goto_1
    if-ge v2, v3, :cond_1

    invoke-virtual {p1, v1}, Ll7/a;->a(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ll7/a;->j()I

    move-result v2

    sub-int/2addr p0, v2

    :goto_2
    if-ge v1, p0, :cond_3

    and-int/lit8 v2, v1, 0x1

    if-nez v2, :cond_2

    const/16 v2, 0xec

    goto :goto_3

    :cond_2
    const/16 v2, 0x11

    :goto_3
    invoke-virtual {p1, v2, v3}, Ll7/a;->d(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ll7/a;->i()I

    move-result p0

    if-ne p0, v0, :cond_4

    return-void

    :cond_4
    new-instance p0, Li7/h;

    const-string p1, "Bits size does not equal capacity"

    invoke-direct {p0, p1}, Li7/h;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Li7/h;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "data bits cannot fit in the QR Code"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll7/a;->i()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " > "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Li7/h;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static v(ILt7/c;Lt7/a;)Z
    .locals 1

    invoke-virtual {p1}, Lt7/c;->d()I

    move-result v0

    invoke-virtual {p1, p2}, Lt7/c;->c(Lt7/a;)Lt7/c$b;

    move-result-object p1

    invoke-virtual {p1}, Lt7/c$b;->d()I

    move-result p1

    sub-int/2addr v0, p1

    add-int/lit8 p0, p0, 0x7

    div-int/lit8 p0, p0, 0x8

    if-lt v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
