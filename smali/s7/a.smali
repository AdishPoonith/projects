.class public final Ls7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(Lu7/f;III)Ll7/b;
    .locals 9

    invoke-virtual {p0}, Lu7/f;->a()Lu7/b;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lu7/b;->e()I

    move-result v0

    invoke-virtual {p0}, Lu7/b;->d()I

    move-result v1

    const/4 v2, 0x1

    shl-int/2addr p3, v2

    add-int v3, v0, p3

    add-int/2addr p3, v1

    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    move-result p2

    div-int v3, p1, v3

    div-int p3, p2, p3

    invoke-static {v3, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    mul-int v3, v0, p3

    sub-int v3, p1, v3

    div-int/lit8 v3, v3, 0x2

    mul-int v4, v1, p3

    sub-int v4, p2, v4

    div-int/lit8 v4, v4, 0x2

    new-instance v5, Ll7/b;

    invoke-direct {v5, p1, p2}, Ll7/b;-><init>(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    :goto_0
    if-ge p2, v1, :cond_2

    move v7, v3

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v0, :cond_1

    invoke-virtual {p0, v6, p2}, Lu7/b;->b(II)B

    move-result v8

    if-ne v8, v2, :cond_0

    invoke-virtual {v5, v7, v4, p3, p3}, Ll7/b;->j(IIII)V

    :cond_0
    add-int/lit8 v6, v6, 0x1

    add-int/2addr v7, p3

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    add-int/2addr v4, p3

    goto :goto_0

    :cond_2
    return-object v5

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Li7/a;IILjava/util/Map;)Ll7/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Li7/a;",
            "II",
            "Ljava/util/Map<",
            "Li7/c;",
            "*>;)",
            "Ll7/b;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Li7/a;->u:Li7/a;

    if-ne p2, v0, :cond_3

    if-ltz p3, :cond_2

    if-ltz p4, :cond_2

    sget-object p2, Lt7/a;->k:Lt7/a;

    const/4 v0, 0x4

    if-eqz p5, :cond_1

    sget-object v1, Li7/c;->j:Li7/c;

    invoke-interface {p5, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lt7/a;->valueOf(Ljava/lang/String;)Lt7/a;

    move-result-object p2

    :cond_0
    sget-object v1, Li7/c;->o:Li7/c;

    invoke-interface {p5, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    :cond_1
    invoke-static {p1, p2, p5}, Lu7/c;->n(Ljava/lang/String;Lt7/a;Ljava/util/Map;)Lu7/f;

    move-result-object p1

    invoke-static {p1, p3, p4, v0}, Ls7/a;->b(Lu7/f;III)Ll7/b;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p5, "Requested dimensions are too small: "

    invoke-direct {p2, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p3, 0x78

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Can only encode QR_CODE, but got "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Found empty contents"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
